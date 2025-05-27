package AST.PropertyValueClasses;

import AST.CustomStringBuilder;
import AST.Operation;

public class BinaryOperationPropertyValueExpr implements PropertyValue {
    private PropertyValue left;
    private Operation operation;
    private PropertyValue right;

    public PropertyValue getLeft() {
        return left;
    }

    public void setLeft(PropertyValue left) {
        this.left = left;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public PropertyValue getRight() {
        return right;
    }

    public void setRight(PropertyValue right) {
        this.right = right;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();

        sb.appendTabOpenScope("BinaryOperationPropertyValueExpr {\n");

        sb.appendTab("left =\n ").append(left);

        sb.appendTab(", operation = ").append(operation).append("\n");

        sb.appendTab(", right = \n ").append(right);

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

    @Override
    public String getValue() {
        return null;
    }
}
