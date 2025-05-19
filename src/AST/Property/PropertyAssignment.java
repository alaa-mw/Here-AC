package AST.Property;

import AST.CustomStringBuilder;
import AST.Method.MethodBodyProperty;
import AST.propertyCallClasses.PropertyCall;

public class PropertyAssignment implements MethodBodyProperty,BlockProperty {

    private PropertyCall propertyCall;
    private CompoundAssignment compoundAssignment;

    public PropertyCall getPropertyCall() {
        return propertyCall;
    }

    public void setPropertyCall(PropertyCall propertyCall) {
        this.propertyCall = propertyCall;
    }

    public CompoundAssignment getCompoundAssignment() {
        return compoundAssignment;
    }

    public void setCompoundAssignment(CompoundAssignment compoundAssignment) {
        this.compoundAssignment = compoundAssignment;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("PropertyAssignment {\n")
                .append(propertyCall)
                .append(compoundAssignment);

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
