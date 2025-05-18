package AST.Component_Declaration;

import AST.CustomStringBuilder;

public class TemplateUrl extends TemplateArg{
    private String templateUrl;
    private String stringLiteral;

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
        sb.append("\n")
                .appendTab("templateUrl=").append(templateUrl).append("\n")
                .appendTab("stringLiteral=").append(stringLiteral).append("\n");;
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
