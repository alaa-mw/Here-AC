package AST.Component;

import AST.CustomStringBuilder;
import AST.HTML.HtmlDocument;

public class Template implements TemplateArg{
    private  String template;
    private HtmlDocument htmlDocument;

    @Override
    public String getNameAttribute(){
        return "template";
    };


    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public HtmlDocument getHtmlDocument() {
        return htmlDocument;
    }

    public void setHtmlDocument(HtmlDocument htmlDocument) {
        this.htmlDocument = htmlDocument;
    }
    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("Template {\n");

        if (template != null) {
            sb.appendTab("template = ").append(template).append("\n");
        }

        if (htmlDocument != null) {
            sb.append(htmlDocument);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
