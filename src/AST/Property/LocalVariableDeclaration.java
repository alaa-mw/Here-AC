package AST.Property;

import AST.CustomStringBuilder;
import AST.Method.MethodBodyProperty;

public class LocalVariableDeclaration implements MethodBodyProperty,BlockProperty {

    private String let;
    private String const_;
    private String identifier;
    private AssignDataType assignDataType;
    private Assigment assigment;

    public String getLet() {
        return let;
    }

    public void setLet(String let) {
        this.let = let;
    }

    public String getConst_() {
        return const_;
    }

    public void setConst_(String const_) {
        this.const_ = const_;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public AssignDataType getAssignDataType() {
        return assignDataType;
    }

    public void setAssignDataType(AssignDataType assignDataType) {
        this.assignDataType = assignDataType;
    }

    public Assigment getAssigment() {
        return assigment;
    }

    public void setAssigment(Assigment assigment) {
        this.assigment = assigment;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("LocalVariableDeclaration {\n");

        if (let != null) {
            sb.appendTab("let=").append(let).append("\n");
        }
        if (const_ != null) {
            sb.appendTab("const_=").append(const_).append("\n");
        }
        if (identifier != null) {
            sb.appendTab("identifier=").append(identifier).append("\n");
        }
        if (assignDataType != null) {
            sb.append(assignDataType);
        }
        if (assigment != null) {
            sb.append(assigment);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
