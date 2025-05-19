package AST.HTML;

import AST.CustomStringBuilder;

public class ActionAttribute implements HtmlAttribute {
    private String click;
    private String stringLiteral;

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
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
        sb.appendTabOpenScope("ActionAttribute {\n");

        if (click != null) {
            sb.appendTab("click = ").append(click).append("\n");
        }

        if (stringLiteral != null) {
            sb.appendTab("stringLiteral = '").append(stringLiteral).append("'\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }


}
