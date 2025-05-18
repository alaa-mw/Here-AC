package AST.HTML;

import AST.CustomStringBuilder;

public class ObjectExpression {
    private ObjectExpressionValue objectExpressionValue;

    public ObjectExpressionValue getObjectExpressionValue() {
        return objectExpressionValue;
    }

    public void setObjectExpressionValue(ObjectExpressionValue objectExpressionValue) {
        this.objectExpressionValue = objectExpressionValue;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("objectExpression{").append("\n")
                .append(objectExpressionValue)
                .appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
