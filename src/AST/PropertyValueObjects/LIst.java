package AST.PropertyValueObjects;

import AST.CustomStringBuilder;
import AST.PropertyValueClasses.PropertyValue;

import java.util.*;

public class LIst implements PropertyValueObjects {
    private java.util.List<PropertyValue> elements = new ArrayList<>();
    private List<SpreadElementExpr> spreadElements = new ArrayList<>();

    public java.util.List<PropertyValue> getElements() {
        return elements;
    }

    public void setElements(java.util.List<PropertyValue> elements) {
        this.elements = elements;
    }

    public List<SpreadElementExpr> getSpreadElements() {
        return spreadElements;
    }

    public void setSpreadElements(List<SpreadElementExpr> spreadElements) {
        this.spreadElements = spreadElements;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("List {\n");

        if (elements != null && !elements.isEmpty()) {
            sb.append(elements).append("\n");
        }
        if (spreadElements != null && !spreadElements.isEmpty()) {
            sb.append(spreadElements);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

    @Override
    public String getValue() {
        return null;
    }
}
