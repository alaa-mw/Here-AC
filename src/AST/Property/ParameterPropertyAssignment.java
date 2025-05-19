package AST.Property;

import AST.AccessModifiers;
import AST.Constructor.ConstructorBodyProperty;
import AST.CustomStringBuilder;

public class ParameterPropertyAssignment implements ConstructorBodyProperty {
    private AccessModifiers accessModifiers ;
    private String readOnly ;
    private String identifier ;
    private Assigment assignment ;

    public AccessModifiers getAccessModifiers() {
        return accessModifiers;
    }

    public void setAccessModifiers(AccessModifiers accessModifiers) {
        this.accessModifiers = accessModifiers;
    }

    public Assigment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assigment assignment) {
        this.assignment = assignment;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ParameterPropertyAssignment { ").append('\n');
        if(accessModifiers != null) {
            sb.append(accessModifiers);
        }
        if(readOnly != null) {
            sb.appendTab("readOnly= ").append(readOnly).append("\n");
        }
            sb.appendTab("identifier= ").append(identifier).append("\n");

        if(assignment != null) {
            sb.append(assignment);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
