package AST.HTML;

import AST.CustomStringBuilder;
import AST.PropertyValueClasses.PropertyValue;
import AST.PropertyValueObjects.PropertyValueObjects;

public class ObjectExpression {
//    private ObjectExpressionValue objectExpressionValue;
//
//    public ObjectExpressionValue getObjectExpressionValue() {
//        return objectExpressionValue;
//    }
//
//    public void setObjectExpressionValue(ObjectExpressionValue objectExpressionValue) {
//        this.objectExpressionValue = objectExpressionValue;
//    }
//
//    @Override
//    public String toString() {
//        CustomStringBuilder sb = new CustomStringBuilder();
//        sb.appendTabOpenScope("objectExpression{").append("\n")
//                .append(objectExpressionValue)
//                .appendTabCloseScope("}").append("\n");
//        return sb.toString();
//    }

    private PropertyValue propertyValue;

    public PropertyValue getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(PropertyValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("PropertyValue {").append("\n")
                .append(propertyValue)
                .appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
