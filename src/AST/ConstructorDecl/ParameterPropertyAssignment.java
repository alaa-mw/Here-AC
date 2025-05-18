package AST.ConstructorDecl;

import AST.ClassBody.AccessModifiers;
import AST.ClassBody.Assigment;
import AST.CustomStringBuilder;

public class ParameterPropertyAssignment {
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
        sb.appendOpenScope("ParameterPropertyAssignment{ ").append('\n');
        if(accessModifiers != null) {
            sb.appendTab(accessModifiers);
        }
        if(readOnly != null) {
            sb.appendTab(readOnly);
        }
        sb.appendTab(identifier);
        if(assignment != null) {
            sb.appendTab(assignment);
        }
        sb.appendTabCloseScope("}=").append(identifier).append("\n");
        return sb.toString();
    }
}
