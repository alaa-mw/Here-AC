package AST.PropertyValueObjects;

import AST.CustomStringBuilder;

public class PostFix implements PropertyValueObjects{
    private String identifier;
    private String operator;


    // Getters and Setters
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
        sb.appendTabOpenScope("PostFix {\n");

        sb.appendTab("identifier = ").append(identifier).append("\n");
        sb.appendTab("operator = ").append(operator).append("\n");

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
