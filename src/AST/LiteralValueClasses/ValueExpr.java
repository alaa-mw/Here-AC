package AST.LiteralValueClasses;

import AST.CustomStringBuilder;

public class ValueExpr implements LiteralValue {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ValueExpr {\n")
                .appendTab("value = ").append(value).append("\n")
                .appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
