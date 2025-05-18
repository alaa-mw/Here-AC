package AST.PropertyValueObjects;

import AST.CustomStringBuilder;
import AST.PropertyValueClasses.PropertyValue;

public class ObjectProperty {

    private String identifier;
    private PropertyValue value;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public PropertyValue getValue() {
        return value;
    }

    public void setValue(PropertyValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ObjectProperty {\n");

        if (identifier != null) {
            sb.appendTab("identifier = ").append(identifier).append("\n");
        }

        if (value != null) {
            sb.append(value);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
