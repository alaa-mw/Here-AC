package AST.DataType;

import AST.CustomStringBuilder;

public class PrimitiveType implements Type{
    private String type;
    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.append("type=").append(type).append("\n");

        return sb.toString();
    }


}
