package AST;

import AST.PropertyValueClasses.PropertyValue;

import java.util.*;

public class LIst {
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
            sb.appendTab(elements).append("\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
