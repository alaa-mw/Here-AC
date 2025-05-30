package AST.HTML;

import AST.CustomStringBuilder;
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

    private PropertyValueObjects propertyValueObjects;

    public PropertyValueObjects getPropertyValueObjects() {
        return propertyValueObjects;
    }

    public void setPropertyValueObjects(PropertyValueObjects propertyValueObjects) {
        this.propertyValueObjects = propertyValueObjects;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("propertyValueObjects{").append("\n")
                .append(propertyValueObjects)
                .appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
