package AST.PropertyValueClasses;

import AST.CustomStringBuilder;

public class BracketedPropertyValueExpr implements PropertyValue{

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
        sb.appendTabOpenScope("BracketedPropertyValueExpr {\n");

        if (propertyValue != null) {
            sb.append(propertyValue);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

    @Override
    public String getValue() {
        return null;
    }
}
