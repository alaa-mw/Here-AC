package AST.ClassBody;

import AST.CustomStringBuilder;

public class ClassPropertyDeclaration extends ClassBody{

    private AccessModifiers accessModifiers;
    private String static_;
    private String readonly;
    private String identifier;
    private AssignDataType assignDataType;
    private Assigment assigment;

    public Assigment getAssigment() {
        return assigment;
    }

    public void setAssigment(Assigment assigment) {
        this.assigment = assigment;
    }

    public String getStatic_() {
        return static_;
    }

    public void setStatic_(String static_) {
        this.static_ = static_;
    }

    public String getReadonly() {
        return readonly;
    }

    public void setReadonly(String readonly) {
        this.readonly = readonly;
    }

    public AssignDataType getAssignDataType() {
        return assignDataType;
    }

    public void setAssignDataType(AssignDataType assignDataType) {
        this.assignDataType = assignDataType;
    }

    public AccessModifiers getAccessModifiers() {
        return accessModifiers;
    }

    public void setAccessModifiers(AccessModifiers accessModifiers) {
        this.accessModifiers = accessModifiers;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();

        sb.appendTabOpenScope("ClassPropertyDeclaration {\n");

        if (accessModifiers != null) {
            sb.appendTab(accessModifiers).append("\n");
        }

        if (static_ != null) {
            sb.appendTab("static= ").append(static_).append("\n");
        }

        if (readonly != null) {
            sb.appendTab("readonly= ").append(readonly).append("\n");
        }

        if (identifier != null) {
            sb.appendTab("identifier= ").append(identifier).append("\n");
        }

        if (assignDataType != null) {
            sb.appendTab(assignDataType).append("\n");
        }

        if (assigment != null) {
            sb.appendTab(assigment).append("\n");
        }

        sb.appendTabCloseScope("}\n");

        return sb.toString();
    }

}
