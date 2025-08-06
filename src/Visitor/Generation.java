package Visitor;

import AST.CSS.*;
import AST.Class.ClassBody;
import AST.Class.ClassDeclaration;
import AST.Class.ClassHeritage;
import AST.Class.ClassPropertyDeclaration;
import AST.Component.*;
import AST.Constructor.ConstructorDeclaration;
import AST.Expression.BinaryExpression;
import AST.Expression.Expression;
import AST.Expression.LiteralOrReferenceExpression;
import AST.Expression.ParentExpression;
import AST.HTML.*;
import AST.Interface.InterfaceDeclaration;
import AST.LiteralValueClasses.LiteralExpr;
import AST.LiteralValueClasses.LiteralValue;
import AST.Method.MethodDeclaration;
import AST.MethodCall;
import AST.Operation;
import AST.Program;
import AST.PropertyValueClasses.BinaryOperationPropertyValueExpr;
import AST.PropertyValueClasses.BracketedPropertyValueExpr;
import AST.PropertyValueClasses.PropertyValue;
import AST.PropertyValueClasses.ShortIfExpr;
import AST.PropertyValueObjects.*;
import AST.Service.ServiceBlock;
import AST.Statement;
import AST.propertyCallClasses.PropertyWithMethodCall;
import AST.propertyCallClasses.SimplePropertyCall;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Generation {
    private FileWriter index_fw;
    private FileWriter styles_fw;
    private FileWriter js_fw;
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
            js_fw = new FileWriter("src\\codeGeneration\\script.js");
            generateHeader();
            generateBody(program);
            generateScriptSection(program);
            generateFooter();

            index_fw.flush();
            index_fw.close();
            styles_fw.flush();
            styles_fw.close();
            js_fw.flush();
            js_fw.close();

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
//        js_fw.write("\n<script>\n");

        for (Statement statement : program.getStatements()) {
            if (statement instanceof ClassDeclaration) {
                generate((ClassDeclaration) statement);
            } else if (statement instanceof ServiceBlock) {
                generate((ServiceBlock) statement);
            } else if (statement instanceof InterfaceDeclaration) {
                generate((InterfaceDeclaration) statement);
            }
        }

//        js_fw.write("</script>\n");
    }

    private void generateFooter() throws IOException {
        index_fw.write("\n</body>\n");
        index_fw.write("<script src=\"script.js\"></script>4");
        index_fw.write("</html>\n");
    }
    // ======================= our code gen =============================
    private void generate(ComponentBlock componentBlock) throws IOException {
        index_fw.write(currentSpace + "<div class=\"component\">\n");
        generate(componentBlock.getComponentDeclaration());

//        js_fw.write(currentSpace + "<script>\n");
        for (ClassDeclaration classDeclaration : componentBlock.getClassDeclarations()) {
            generate(classDeclaration);
        }
//        js_fw.write(currentSpace + "</script>\n");
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
//        index_fw.write("<span id=\"");
        index_fw.write("<span id= \" ");
        PropertyValue propertyValueObjects = objectExpression.getPropertyValue();
        // new line
        if (propertyValueObjects instanceof ObjectValue){
            index_fw.write(((ObjectValue) propertyValueObjects).getIdentifier());
        }

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
        // Optional export
//        if (cls.getExport() != null) {
//            index_fw.write(cls.getExport() + " ");
//        }

        // Optional abstract
//        if (cls.getAbstract_() != null) {
//            index_fw.write(cls.getAbstract_() + " ");
//        }

        // 'class' keyword (always present)
        js_fw.write(cls.getClass_() + " ");

        // Class name (identifier)
        js_fw.write(cls.getIdentifier() + " ");

//        // Optional heritage (extends)
        if (cls.getClassHeritage() != null) {
            generate(cls.getClassHeritage()); // e.g., "extends MyBaseClass"
            js_fw.write(" ");
        }
//
//        // Optional implementation (implements)
//        if (cls.getClassImplement() != null) {
//            generate(cls.getClassImplement()); // e.g., "implements OnInit, OnDestroy"
//            index_fw.write(" ");
//        }

        // Open class block
        js_fw.write("{\n");

        // Generate class body
        for (ClassBody body : cls.getClassBody()) {
            generate(body); // You need a generate(ClassBody) method
            js_fw.write("\n");
        }

        // Close class block
        js_fw.write("}\n");
    }

    private void generate(ClassHeritage heritage) throws IOException {
        if (heritage.getSuperClassName() != null) {
            js_fw.write("extends " + heritage.getSuperClassName() + " ");
        }
    }

    private void generate(ClassBody body) throws IOException {
        if (body instanceof ClassPropertyDeclaration) {
            generate((ClassPropertyDeclaration) body);
        }
        else if (body instanceof ConstructorDeclaration) {
            //generate((ConstructorDeclaration) body); fix
        } else if (body instanceof MethodDeclaration) {
            //generate((MethodDeclaration) body); fix
        }
    }

    private void generate(ClassPropertyDeclaration prop) throws IOException {
        StringBuilder line = new StringBuilder("    ");

        // Access modifier (optional — JS doesn't use it, but you may include it for clarity)
//        if (prop.getAccessModifiers() != null) {
//            line.append(prop.getAccessModifiers().getModifier()).append(" ");
//        }

        // static
        if (prop.getStatic_() != null) {
            line.append("static ").append(" ");
        }

        // readonly — JS doesn't support directly, so can skip or leave a comment
        if (prop.getReadonly() != null) {
            // optional: simulate or comment
            // line.append("// readonly ");
        }

        // Property name
        if (prop.getIdentifier()!=null){
            line.append(prop.getIdentifier());
//            js_fw.write("localStorage.setItem(\""+prop.getIdentifier()+"\", JSON.stringify("+prop.getIdentifier()+"));");
            //localStorage.setItem("products", JSON.stringify(products));
        }

//         Assignment
        if (prop.getAssigment() != null) {
            line.append(" = ");
//            line.append(prop.getAssigment().getValue()); // assuming getValue() returns a JS expression as string
            line.append(generate(prop.getAssigment().getPropertyValue()));
        }

        // End with semicolon
        line.append(";");

        // Write to file
        js_fw.write(line.toString() + "\n");
    }

    private String generate(PropertyValue value) throws IOException {
        if (value == null) return "";

        if (value instanceof BinaryOperationPropertyValueExpr) {
           // return generate((BinaryOperationPropertyValueExpr) value); fix
        } else if (value instanceof BracketedPropertyValueExpr) {
            //return generate((BracketedPropertyValueExpr) value); fix
        } else if (value instanceof ShortIfExpr) {
            //return generate((ShortIfExpr) value);  fix
        }
        //  PropertyValueObjects interface extends from PropertyValueObjectExpr interface and there are 11 classes implement from PropertyValueObjects
        else if (value instanceof PropertyValueObjects) {
            return generate((PropertyValueObjects) value);
        }

        return "/* unsupported value */";
    }

    private String generate(PropertyValueObjects propertyValueObjects) throws IOException {
        //Method Call

        //LitrealValue // extends ✔

        //propertyCall extends // 1  -> propertyWithMethodCall ✔
        //   -> SimplePropertyCall ✔

        //ArrowFunction
        //IndexAccessValue
        //LIst ✔
        //ObjectValue //2
        //PostFix
        //PreFix
        // NewExpression
        //SpreadElementExpr


        if (propertyValueObjects instanceof PropertyWithMethodCall){
           return generate((PropertyWithMethodCall) propertyValueObjects);
        }
        if (propertyValueObjects instanceof SimplePropertyCall){
           return generate((SimplePropertyCall) propertyValueObjects);
        }
        if (propertyValueObjects instanceof MethodCall){
           return generate((MethodCall) propertyValueObjects);
        }
        // Literal values
        if (propertyValueObjects instanceof LiteralValue) {
            return generate((LiteralValue) propertyValueObjects);
        }
        if (propertyValueObjects instanceof ObjectValue) {
            return generate((ObjectValue) propertyValueObjects);
        }
        if (propertyValueObjects instanceof LIst) {
            return generate((LIst) propertyValueObjects);
        }
        return " ";
    }

    private String generate(LiteralValue literalValue) throws IOException{ // ✔
        if (literalValue == null || literalValue.getValue() == null) {
            return "";
        }
        return literalValue.getValue();
    }

    private String generate(PropertyWithMethodCall propertyWithMethodCall) throws IOException{ //✔
        StringBuilder sb = new StringBuilder();

        // Start with "this" if present
        if (propertyWithMethodCall.getThis_() != null) {
            sb.append(propertyWithMethodCall.getThis_());
        }

        // Append property identifiers (dot-separated)
        List<String> identifiers = propertyWithMethodCall.getIdentifiers();
        if (identifiers != null && !identifiers.isEmpty()) {
            for (String id : identifiers) {
                if (sb.length() > 0) {
                    sb.append(".");
                }
                sb.append(id);
            }
        }

        // Append method calls
        List<MethodCall> methodCalls = propertyWithMethodCall.getMethodCalls();
        if (methodCalls != null && !methodCalls.isEmpty()) {
            for (MethodCall methodCall : methodCalls) {
                sb.append(generate(methodCall)); // returns e.g. `.getName()`
            }
        }

        return sb.toString();
    }

    public String generate(SimplePropertyCall simplePropertyCall) throws IOException { //✔
        StringBuilder sb = new StringBuilder();

        // Start with "this" if present
        if (simplePropertyCall.getThis_() != null) {
            sb.append("this");
        }

        // Append each identifier as a property access
        for (String identifier : simplePropertyCall.getIdentifiers()) {
            sb.append(".").append(identifier);
        }

        // Write the line (ending with semicolon only if you're generating a statement)
        sb.append(";\n");

        return sb.toString();
    }

    public String generate(MethodCall methodCall) throws IOException { //✔
        StringBuilder sb = new StringBuilder();

        // Start with the method name
        sb.append(methodCall.getMethodCalledName());
        sb.append("(");

        // Generate arguments (if any)
        List<Expression> expressions = methodCall.getExpressions();
        for (int i = 0; i < expressions.size(); i++) {
            sb.append(generate(expressions.get(i))); // generate(Expression)
            if (i < expressions.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");

        List<String> chained = methodCall.getIdentifiers(); // from (DOT IDENTIFIER)*
        for (String id : chained) {
            sb.append(".").append(id);
        }
        return sb.toString();
    }

    private String generate(Expression expression) throws IOException {
        if (expression instanceof ParentExpression) {
            return generate((ParentExpression) expression);
        }
        if (expression instanceof LiteralOrReferenceExpression) {
            return generate((LiteralOrReferenceExpression) expression);
        }
        if (expression instanceof BinaryExpression) {
            return generate((BinaryExpression) expression);
        }
        return "";
    }

    private String generate(ParentExpression expr) throws IOException{
        return "(" + generate(expr.getInnerExpression()) + ")";
    }

    private String generate(LiteralOrReferenceExpression expr) throws IOException {
        if (expr.getPropertyValue() != null) {
            return generate(expr.getPropertyValue());
        }
        return "";
    }

    private String generate(BinaryExpression expr) throws IOException {
        List<Expression> expressions = expr.getExpressions();
        List<Operation> operations = expr.getOperations();

        if (expressions == null || expressions.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(generate(expressions.get(0))); // First expression

        for (int i = 1; i < expressions.size(); i++) {
            if (i - 1 < operations.size()) {
                sb.append(" ").append(generate(operations.get(i - 1))).append(" ");
            }
            sb.append(generate(expressions.get(i)));
        }

        return sb.toString();
    }

    private String generate(Operation operation) throws IOException {
        if (operation.getOperator() != null) {
            return operation.getOperator();
        }
        return "";
    }

    private String generate(ObjectValue objectValue) throws IOException{
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        List<ObjectProperty> properties = objectValue.getProperties();
        for (int i = 0; i < properties.size(); i++) {
            ObjectProperty prop = properties.get(i);

            if (prop instanceof SpreadObjectProperty) { // fix
                SpreadObjectProperty spreadProp = (SpreadObjectProperty) prop;
                SpreadElementExpr spreadElement = spreadProp.getSpreadElement();

                if (spreadElement != null) {
                    sb.append("...");
                    if (spreadElement.getIdentifier() != null) {
                        sb.append(spreadElement.getIdentifier());
                    } else if (spreadElement.getPropertyCall() != null) {
                        sb.append(generate(spreadElement.getPropertyCall())); // Assume it returns a string
                    }
                }
            } else if (prop instanceof NormalObjectProperty) {
                NormalObjectProperty normalObjectProperty = (NormalObjectProperty) prop;
                String key = normalObjectProperty.getIdentifier();
                PropertyValue value = normalObjectProperty.getValue();

                if (key != null && value != null) {
                    sb.append(key).append(": ");
                    sb.append(generate(value)); //  generate(PropertyValue)
                }
            }

            if (i < properties.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append("}");
        return sb.toString();
    }

    private String generate(LIst lIst) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        List<String> parts = new ArrayList<>();

        // Add regular elements
        for (PropertyValue element : lIst.getElements()) {
            parts.add(generate(element)); // assume you have generate(PropertyValue)
        }

        // Add spread elements
        for (SpreadElementExpr spread : lIst.getSpreadElements()) {
            parts.add("..." + generate(spread)); // assume you have generate(SpreadElementExpr)
        }

        sb.append(String.join(", ", parts));
        sb.append("]");
        return sb.toString();
    }

    // ServiceBlock Section
    private void generate(ServiceBlock service) throws IOException {
        js_fw.write(currentSpace + "<!-- Service Block -->\n");
    }

    private void generate(InterfaceDeclaration iface) throws IOException {
        js_fw.write(currentSpace + "<!-- Interface Declaration: " + iface.getIdentifier() + " -->\n");
    }
}