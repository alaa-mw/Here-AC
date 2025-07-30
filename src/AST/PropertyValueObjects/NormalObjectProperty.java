package AST.PropertyValueObjects;

import AST.CustomStringBuilder;
import AST.PropertyValueClasses.PropertyValue;

public class NormalObjectProperty implements ObjectProperty{
    private String identifier;
    private PropertyValue propValue;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public PropertyValue getValue() {
        return propValue;
    }

    public void setValue(PropertyValue value) {
        this.propValue = value;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ObjectProperty {\n");

        if (identifier != null) {
            sb.appendTab("identifier = ").append(identifier).append("\n");
        }

        if (propValue != null) {
            sb.append(propValue);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
