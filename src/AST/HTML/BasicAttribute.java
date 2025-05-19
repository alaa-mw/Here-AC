package AST.HTML;

import AST.CustomStringBuilder;

public class BasicAttribute implements HtmlAttribute {
    private String identifier;
    private String c_lass;
    private String stringLiteral;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getC_lass() {
        return c_lass;
    }

    public void setC_lass(String c_lass) {
        this.c_lass = c_lass;
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
        sb.appendTabOpenScope("BasicAttribute{ ").append('\n');
        if (identifier != null) {
            sb.appendTab("attribute=").append(identifier).append("\n")
                    .appendTab("attributeValue=").append(stringLiteral).append("\n");
        } if (c_lass != null) {
            sb.appendTab("classKeyword=").append(c_lass).append("\n")
                    .appendTab("className=").append(stringLiteral).append("\n");
        }
        sb.appendTabCloseScope("}").append('\n');
        return sb.toString();
    }

}
