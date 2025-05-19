package AST.PropertyValueClasses;

import AST.CustomStringBuilder;
import AST.PropertyValueObjects.PropertyValueObjects;

public class PropertyValueObjectExpr implements PropertyValue{
    private PropertyValueObjects propertyValueObjects;

    public PropertyValueObjects getPropertyValue() {
        return propertyValueObjects;
    }

    public void setPropertyValueObjects(PropertyValueObjects propertyValueObjects) {
        this.propertyValueObjects = propertyValueObjects;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("PropertyValueObjectExpr {\n");

        if (propertyValueObjects != null) {
            sb.append(propertyValueObjects);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
