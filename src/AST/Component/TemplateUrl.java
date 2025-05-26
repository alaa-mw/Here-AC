package AST.Component;

import AST.CustomStringBuilder;

public class TemplateUrl implements TemplateArg{
    private String templateUrl;
    private String stringLiteral;
    @Override
    public String getNameAttribute(){
        return "templateUrl";
    };

    public String getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }
    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("TemplateUrl {\n");

        if (templateUrl != null) {
            sb.appendTab("templateUrl = ").append(templateUrl).append("\n");
        }

        if (stringLiteral != null) {
            sb.appendTab("stringLiteral = ").append(stringLiteral).append("\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
