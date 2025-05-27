package AST.PropertyValueObjects;

import AST.CustomStringBuilder;
import AST.PropertyValueClasses.PropertyValue;

import java.util.*;

public class LIst implements PropertyValueObjects {
    private java.util.List<PropertyValue> elements = new ArrayList<>();

    public java.util.List<PropertyValue> getElements() {
        return elements;
    }

    public void setElements(java.util.List<PropertyValue> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("List {\n");

        if (elements != null && !elements.isEmpty()) {
            sb.append(elements);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

    @Override
    public String getValue() {
        return null;
    }
}
