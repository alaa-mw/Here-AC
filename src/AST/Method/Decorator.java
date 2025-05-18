package AST.Method;

import AST.CustomStringBuilder;

public class Decorator {
    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("Decorator { \n")
                .appendTab("identifierName=").append(identifier).append("\n");
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
