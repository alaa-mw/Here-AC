package Visitor;

import AST.CSS.*;
import AST.Class.ClassDeclaration;
import AST.Component.*;
import AST.HTML.*;
import AST.Interface.InterfaceDeclaration;
import AST.LiteralValueClasses.LiteralExpr;
import AST.LiteralValueClasses.LiteralValue;
import AST.Program;
import AST.PropertyValueClasses.PropertyValue;
import AST.PropertyValueObjects.ObjectValue;
import AST.PropertyValueObjects.PropertyValueObjects;
import AST.Service.ServiceBlock;
import AST.Statement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Generation {
    private FileWriter index_fw;
    private FileWriter styles_fw;
    private String currentSpace = "";

    private static final String[] CSS_ELEMENT_SELECTORS = {"nav", "a", "h1", "div", "p", "span","button"};
    public void generate(Program program) {
        File dir = new File("src/codeGeneration");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        try {
            index_fw = new FileWriter("src\\codeGeneration\\index.html");
            styles_fw = new FileWriter("src\\codeGeneration\\styles.css");

            generateHeader();
            generateBody(program);
            generateScriptSection(program);
            generateFooter();

            index_fw.flush();
            index_fw.close();
            styles_fw.flush();
            styles_fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generateHeader() throws IOException {
        index_fw.write("<!DOCTYPE html>\n");
        index_fw.write("<html>\n");
        index_fw.write("<head>\n");
        index_fw.write("<title>Angular Compiler Output</title>\n");
        index_fw.write("<link rel=\"stylesheet\" href=\"styles.css\"/>\n");
        index_fw.write("</head>\n");
    }

    private void generateBody(Program program) throws IOException {
        index_fw.write("<body>\n");

        currentSpace = "\t\t";
        for (Statement statement : program.getStatements()) {
            if (statement instanceof ComponentBlock) {
                generate((ComponentBlock) statement);
            }
        }
    }

    private void generateScriptSection(Program program) throws IOException {
        index_fw.write("\n<script>\n");

        for (Statement statement : program.getStatements()) {
            if (statement instanceof ClassDeclaration) {
                generate((ClassDeclaration) statement);
            } else if (statement instanceof ServiceBlock) {
                generate((ServiceBlock) statement);
            } else if (statement instanceof InterfaceDeclaration) {
                generate((InterfaceDeclaration) statement);
            }
        }

        index_fw.write("</script>\n");
    }

    private void generateFooter() throws IOException {
        index_fw.write("\n</body>\n");
        index_fw.write("</html>\n");
    }
    // ======================= our code gen =============================
    private void generate(ComponentBlock componentBlock) throws IOException {
        index_fw.write(currentSpace + "<div class=\"component\">\n");
        generate(componentBlock.getComponentDeclaration());

        index_fw.write(currentSpace + "<script>\n");
        for (ClassDeclaration classDeclaration : componentBlock.getClassDeclarations()) {
            generate(classDeclaration);
        }
        index_fw.write(currentSpace + "</script>\n");
        index_fw.write(currentSpace + "</div>\n");
    }

    private void generate(ComponentDeclaration componentDeclaration) throws IOException {
        for (ComponentArguments componentArguments : componentDeclaration.getComponentArguments()) {
            if (componentArguments instanceof Template) {
                generate((Template) componentArguments);
            }
            if (componentArguments instanceof Styles) {
                generate((Styles) componentArguments);
            }
        }
    }

    // HTML Generation Methods
    private void generate(Template template) throws IOException {
        generate(template.getHtmlDocument());
    }

    private void generate(HtmlDocument htmlDocument) throws IOException {
        for (HtmlElement htmlElement : htmlDocument.getHtmlElement()) {
            generate(htmlElement);
        }
    }

    private void generate(HtmlElement htmlElement) throws IOException {
        if (htmlElement.getSelfClosingTag() != null) {
            generate(htmlElement.getSelfClosingTag());
        } else {
            generate(htmlElement.getOpenTag());
            index_fw.write("\n");

            if (htmlElement.getHtmlContentBody() != null) {
                String savedSpace = currentSpace;
                currentSpace += "\t";
                for (HtmlContentBody htmlContentBody : htmlElement.getHtmlContentBody()) {
                    generate(htmlContentBody);
                }
                currentSpace = savedSpace;
            }
            generate(htmlElement.getCloseTag());
            index_fw.write("\n");
        }
    }

    private void generate(SelfClosingTag selfClosingTag) throws IOException {
        index_fw.write("<" + selfClosingTag.getIdentifier());

        for (HtmlAttribute htmlAttribute : selfClosingTag.getHtmlAttributes()) {
            if (htmlAttribute instanceof BasicAttribute) {
                generate((BasicAttribute) htmlAttribute);
            }
            if (htmlAttribute instanceof ImageAttribute) {
                generate((ImageAttribute) htmlAttribute);
            }
            if (htmlAttribute instanceof ActionAttribute) {
                generate((ActionAttribute) htmlAttribute);
            }
        }

        index_fw.write(" />\n");
    }

    private void generate(BasicAttribute basicAttribute) throws IOException {
        String key = basicAttribute.getIdentifier() != null ?
                basicAttribute.getIdentifier() :
                basicAttribute.getC_lass();
        String value = basicAttribute.getStringLiteral();
        index_fw.write(" " + key + "=" + value);
    }

    private void generate(ImageAttribute imageAttribute) throws IOException {
        String value = imageAttribute.getStringLiteral();
        index_fw.write(currentSpace + "src=" + value);
        if (imageAttribute.getBasicAttribute() != null) {
            for (BasicAttribute basicAttribute : imageAttribute.getBasicAttribute()) {
                index_fw.write(" ");
                generate(basicAttribute);
            }
        }
    }

    private void generate(ActionAttribute actionAttribute) throws IOException {
        String value = actionAttribute.getStringLiteral();
        index_fw.write(" " + "onclick=" + value);
    }

    private void generate(OpenTag openTag) throws IOException {
        index_fw.write("<" + openTag.getIdentifier());

        if (openTag.getHtmlAttributeArray() != null) {
            for (HtmlAttribute htmlAttribute : openTag.getHtmlAttributeArray()) {
                if (htmlAttribute instanceof BasicAttribute) {
                    generate((BasicAttribute) htmlAttribute);
                }
                if (htmlAttribute instanceof ImageAttribute) {
                    generate((ImageAttribute) htmlAttribute);
                }
                if (htmlAttribute instanceof ActionAttribute) {
                    generate((ActionAttribute) htmlAttribute);
                }
            }
        }
        index_fw.write(">");
    }

    private void generate(HtmlContentBody htmlContentBody) throws IOException {
        if (htmlContentBody.getHtmlIdentifier() != null) {
            index_fw.write(htmlContentBody.getHtmlIdentifier());
        } else if (htmlContentBody.getHtmlElement() != null) {
            generate(htmlContentBody.getHtmlElement());
        } else if (htmlContentBody.getObjectExpression() != null) {
            generate(htmlContentBody.getObjectExpression());
        }
    }

    private void generate(CloseTag closeTag) throws IOException {
        index_fw.write("</" + closeTag.getCloseTagName() + ">");
    }

    private void generate(ObjectExpression objectExpression) throws IOException {
        index_fw.write("<span id=\"");
        PropertyValue propertyValueObjects = objectExpression.getPropertyValue();
        index_fw.write("\"></span>");
    }

    // ===================== CSS Generation Methods =====================
    private void generate(Styles styles) throws IOException {
        for (InlineStyle inlineStyle : styles.getInlineStyles()) {
            generate(inlineStyle);
        }
    }

    private void generate(InlineStyle inlineStyle) throws IOException {
        for (CssDocument cssDocument : inlineStyle.getCssDocument()) {
            generate(cssDocument);
        }
    }

    private void generate(CssDocument cssDocument) throws IOException {
        // Generate selectors
        for (int i = 0; i < cssDocument.getCssSelector().size(); i++) {
            generate(cssDocument.getCssSelector().get(i));
            if(i < cssDocument.getCssSelector().size()-1)
                styles_fw.write(", "); // if not last
        }
        // Generate rules block
        styles_fw.write(" {\n");
        for (CssRule rule : cssDocument.getCssRules()) {
            generate(rule);
        }
        styles_fw.write("}\n\n");

    }

    private void generate(CssSelector selector) throws IOException {
        boolean first = true;

        for (int i = 0; i < selector.getSelectors().size(); i++) {
            styles_fw.write(selector.getSymbol().get(i));
            styles_fw.write(selector.getSelectors().get(i));
            first = false;
        }

        // Generate attribute selectors
        for (AttributeSelector attrSel : selector.getAttributeSelectorList()) {
            generate(attrSel);
        }
    }

    private void generate(AttributeSelector attrSel) throws IOException {
        styles_fw.write("[" + attrSel.getAttributeSelectorName());
        if (attrSel.getAttributeSelectorValue() != null) {
            styles_fw.write("=" + attrSel.getAttributeSelectorValue());
        }
        styles_fw.write("]");
    }

    private void generate(CssRule rule) throws IOException {
        styles_fw.write("  " + rule.getIdentifier() + ": ");

        boolean firstValue = true;
        for (RuleValue value : rule.getRuleValues()) {
            if (!firstValue) {
                styles_fw.write(" ");
            }
            generate(value);
            firstValue = false;
        }

        styles_fw.write(";\n");
    }

    private void generate(RuleValue value) throws IOException {
        if (value.getIdentifier() != null) {
            styles_fw.write(value.getIdentifier());
        }
        else if (value.getNumericLiteralPx() != null) {
            styles_fw.write(value.getNumericLiteralPx() + "px");
        }
        else if (value.getNumericLiteralPrecentage() != null) {
            styles_fw.write(value.getNumericLiteralPrecentage() + "%");
        }
        else if (value.getColor() != null) {
            styles_fw.write(value.getColor());
        }
    }

    // ===================== JS Generation Methods =========================
    private void generate(ClassDeclaration cls) throws IOException {
        // Class declaration generation logic
    }

    private void generate(ServiceBlock service) throws IOException {
        index_fw.write(currentSpace + "<!-- Service Block -->\n");
    }

    private void generate(InterfaceDeclaration iface) throws IOException {
        index_fw.write(currentSpace + "<!-- Interface Declaration: " + iface.getIdentifier() + " -->\n");
    }
}