package AST.Component;

import AST.CustomStringBuilder;

public class StyleUrl implements StyleArg {
    private String stylesUrl;
    private String stringLiteral;

    public String getStylesUrl() {
        return stylesUrl;
    }

    public void setStylesUrl(String stylesUrl) {
        this.stylesUrl = stylesUrl;
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
        sb.appendTabOpenScope("StyleUrl {\n");

        if (stylesUrl != null) {
            sb.appendTab("stylesUrl= ").append(stylesUrl).append("\n");
        }

        if (stringLiteral != null) {
            sb.appendTab("stringLiteral= ").append(stringLiteral).append("\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
