package AST.ClassBody;

import AST.CustomStringBuilder;
import AST.PropertyValueClasses.PropertyValue;

public class Assigment {
    private String eq; // The '=' symbol
    private PropertyValue propertyValue;

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
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
        sb.appendTabOpenScope("assignment: {\n ")
            .appendTab("eq= '").append(eq).append("'\n")
                .appendTab(propertyValue).append("\n");

        sb.appendTabCloseScope(" }\n");
        return sb.toString();
    }
}
