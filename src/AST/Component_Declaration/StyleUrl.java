package AST.Component_Declaration;

import AST.CustomStringBuilder;

public class StyleUrl extends StyleArg {
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
        sb.append("\n")
                .appendTab("stylesUrl=").append(stylesUrl).append("\n")
                .appendTab("stringLiteral=").append(stringLiteral).append("\n");
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
