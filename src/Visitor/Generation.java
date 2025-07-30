package Visitor;

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

    public void generate(Program program) {
        String Space = "\t\t";

        File dir = new File("src/codeGeneration");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        try {
            FileWriter fw = new FileWriter("src\\codeGeneration\\GeneratedCode.html");

            generate("<!DOCTYPE html>", fw);
            generate("\n<html>", fw);
            generate("\n<head>", fw);
            generate("\n<title>Angular Compiler Output</title>", fw);
            generate("\n<link rel=\"stylesheet\" href=\"generate.css\"/>", fw);
            generate("\n</head>", fw);

            generate("\n<body>\n", fw);

            for (Statement statement : program.getStatements()) {
                if (statement instanceof ComponentBlock) {
                    generate((ComponentBlock) statement, Space, fw);
                }
            }

            // JavaScript Section
            generate("\n<script>\n", fw);
            for (Statement statement : program.getStatements()) {
                if (statement instanceof ClassDeclaration) {
                    generate((ClassDeclaration) statement, Space, fw);
                } else if (statement instanceof ServiceBlock) {
                    generate((ServiceBlock) statement, Space, fw);
                } else if (statement instanceof InterfaceDeclaration) {
                    generate((InterfaceDeclaration) statement, Space, fw);
                }
            }
            generate("</script>\n", fw);

            generate("\n</body>", fw);
            generate("\n</html>", fw);

            fw.flush();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generate(String s, FileWriter fw) {
        try {
            fw.append(s);
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    private void generate(ComponentBlock componentBlock, String space, FileWriter fw) {
        generate(space + "<div class=\"component\">\n", fw);
        generate(componentBlock.getComponentDeclaration(), space, fw);

        generate(space + "<script>\n", fw);
        for (ClassDeclaration classDeclaration : componentBlock.getClassDeclarations()) {
            generate(classDeclaration, space, fw);
        }
        generate(space + "</script>\n", fw);
        generate(space + "</div>\n", fw);
    }

    private void generate(ComponentDeclaration componentDeclaration, String space, FileWriter fw) {
        for (ComponentArguments componentArguments : componentDeclaration.getComponentArguments()) {
            if (componentArguments instanceof Template)
                generate((Template) componentArguments, space, fw);
            if (componentArguments instanceof Styles)
                generate((Styles) componentArguments, space, fw);
        }
    }

    // ************************ HTML **************************
    private void generate(Template template, String space, FileWriter fw) {
        generate(template.getHtmlDocument(), space, fw);
    }

    private void generate(HtmlDocument htmlDocument, String space, FileWriter fw) {
        for (HtmlElement htmlElement : htmlDocument.getHtmlElement()) {
            generate(htmlElement, space, fw);
        }
    }

    private void generate(HtmlElement htmlElement, String space, FileWriter fw) {
        if (htmlElement.getSelfClosingTag() != null) {
            generate(htmlElement.getSelfClosingTag(), space, fw);
        }
        else {
            generate(htmlElement.getOpenTag(), space, fw);
            generate("\n", fw);

            if (htmlElement.getHtmlContentBody() != null) {
                for (HtmlContentBody htmlContentBody : htmlElement.getHtmlContentBody()) {
                    generate(htmlContentBody, space + "\t", fw);
                   // generate("\n", fw);
                }
            }
            generate(htmlElement.getCloseTag(), space, fw);
            generate("\n", fw);
        }
    }

    private void generate(SelfClosingTag selfClosingTag, String space, FileWriter fw) {
        generate("<" + selfClosingTag.getIdentifier(), fw);

        for (HtmlAttribute htmlAttribute : selfClosingTag.getHtmlAttributes()) {
            if (htmlAttribute instanceof BasicAttribute)
                generate((BasicAttribute) htmlAttribute, space, fw);
//            if (htmlAttribute instanceof NgFor)
//                generate((NgFor)htmlAttribute ,space,fw);
//            if (htmlAttribute instanceof NgIF)
//                generate((NgIF)htmlAttribute ,space,fw);
            if (htmlAttribute instanceof ImageAttribute)
                generate((ImageAttribute) htmlAttribute, space, fw);
            if (htmlAttribute instanceof ActionAttribute)
                generate((ActionAttribute) htmlAttribute, space, fw);
        }

        generate(" />\n", fw);
    }

    private void generate(BasicAttribute basicAttribute, String space, FileWriter fw) {
        String key = "";
        if (basicAttribute.getIdentifier() != null) {
            key = basicAttribute.getIdentifier();
        }
        else if (basicAttribute.getC_lass() != null) {
            key = basicAttribute.getC_lass();
        }
        String value = basicAttribute.getStringLiteral();
        generate(" " + key + "=" + value, fw);
    }

//    private void generate(NgFor ngFor , String space, FileWriter fw){
//        String value = ngFor.getStringLiteral();
//        generate(" *ngFor=" + value, fw);
//    }

//    private void generate(NgIF ngIF , String space, FileWriter fw){
//        String value = ngIF.getStringLiteral();
//        generate(" *ngIf=" + value, fw);
//    }

    private void generate(ImageAttribute imageAttribute, String space, FileWriter fw) {
        String value = imageAttribute.getStringLiteral();
        generate(space + "src=" + value, fw);
        if (imageAttribute.getBasicAttribute() != null) {
            for (BasicAttribute basicAttribute : imageAttribute.getBasicAttribute()) {
                generate(" ", fw);
                generate(basicAttribute, space, fw);
            }
        }
    }

    private void generate(ActionAttribute actionAttribute, String space, FileWriter fw) {
        String value = actionAttribute.getStringLiteral();
        generate(" " + "onclick=" + value, fw);
    }

    private void generate(OpenTag openTag, String space, FileWriter fw) {
        String tagName = openTag.getIdentifier();
        generate( "<" + tagName, fw);

        if (openTag.getHtmlAttributeArray() != null) {
            for (HtmlAttribute htmlAttribute : openTag.getHtmlAttributeArray()) {
                if (htmlAttribute instanceof BasicAttribute)
                    generate((BasicAttribute) htmlAttribute, space, fw);
//                if (htmlAttribute instanceof NgFor)
//                    generate((NgFor)htmlAttribute ,space,fw);
//                if (htmlAttribute instanceof NgIF)
//                    generate((NgIF)htmlAttribute ,space,fw);
                if (htmlAttribute instanceof ImageAttribute)
                    generate((ImageAttribute) htmlAttribute, space, fw);
                if (htmlAttribute instanceof ActionAttribute)
                    generate((ActionAttribute) htmlAttribute, space, fw);
            }
        }
        generate(">", fw);
    }

    private void generate(HtmlContentBody htmlContentBody, String space, FileWriter fw) {

         if (htmlContentBody.getHtmlIdentifier() != null) {
            generate( htmlContentBody.getHtmlIdentifier(), fw);

        }
        else if (htmlContentBody.getHtmlElement() != null) {
            generate(htmlContentBody.getHtmlElement(), space, fw);

        }

        else if (htmlContentBody.getObjectExpression() != null) {
            generate(htmlContentBody.getObjectExpression(), space, fw);
        }
    }

    private void generate(CloseTag closeTag, String space, FileWriter fw) {
        String tagName = closeTag.getCloseTagName();
        generate( "</" + tagName + ">", fw);
    }

    private void generate(ObjectExpression objectExpression, String space, FileWriter fw) {
        generate( "<span id=\"", fw);
        PropertyValue propertyValueObjects =objectExpression.getPropertyValue(); // interface
//        if (propertyValueObjects instanceof LiteralExpr) {
//            generate((LiteralExpr) propertyValueObjects, space, fw);
//        }
//       else if (propertyValueObjects instanceof ObjectValue) {
//            generate((ObjectValue) propertyValueObjects, space, fw);
//        }
        generate("\"></span>", fw);
    }

    private void generate(LiteralExpr literalExpr, String space, FileWriter fw) {
        String value= literalExpr.getValue();
        generate(value,fw);
    }

    private void generate(ObjectValue objectValue, String space, FileWriter fw) {
        if(objectValue.getIdentifier()!=null){
        generate(objectValue.getIdentifier(),fw);}
    }

    // *************************** CSS ******************************
    private void generate(Styles t, String indent, FileWriter fw) {

    }

    // *************************** JS ********************************
    private void generate(ClassDeclaration cls, String indent, FileWriter fw) {

    }

    private void generate(ServiceBlock service, String indent, FileWriter fw) {
        generate(indent + "<!-- Service Block -->\n", fw);
    }

    private void generate(InterfaceDeclaration iface, String indent, FileWriter fw) {
        generate(indent + "<!-- Interface Declaration: " + iface.getIdentifier() + " -->\n", fw);
    }
}
