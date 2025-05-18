package AST.Component;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class AssigmentToNull {
    private String or;
    private ArrayList<String> null_ = new ArrayList<>();

    public String getOr() {
        return or;
    }

    public void setOr(String or) {
        this.or = or;
    }

    public ArrayList<String> getNull_() {
        return null_;
    }

    public void setNull_(ArrayList<String> null_) {
        this.null_ = null_;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("AssignmentToNull {\n")
                .appendTab("or=").append(or).append("\n")
                .appendTab("null=").append(null_).append("\n");
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
