package AST.PropertyValueObjects;

import AST.CustomStringBuilder;
import AST.PropertyValueClasses.PropertyValue;

public class IndexAccessValue implements PropertyValueObjects {
    private String identifier;
    private PropertyValue propertyValue;

    // Getters and Setters
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public PropertyValue getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(PropertyValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("IndexAccessValue {\n");

        if (identifier != null) {
            sb.appendTab("identifier = ").append(identifier).append("\n");
        }
        if (propertyValue != null) {
            sb.append(propertyValue);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
