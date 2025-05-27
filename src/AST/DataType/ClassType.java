package AST.DataType;

import AST.CustomStringBuilder;

public class ClassType implements Type {
    private String identifier;

    @Override
    public String getType() {
        return identifier;
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
        sb.append("ClassType {").append("identifier=").append(identifier).append("}").append("\n");
        return sb.toString();
    }


}
