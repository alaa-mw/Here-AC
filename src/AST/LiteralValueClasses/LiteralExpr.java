package AST.LiteralValueClasses;

import AST.CustomStringBuilder;
import AST.PropertyValueObjects.ObjectValue;

public class LiteralExpr extends ObjectValue implements LiteralValue {
    private String value;

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("LiteralExpr {\n")
                .appendTab("value=").append(value).append("\n")
                .appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
