package AST.Method;

import AST.CustomStringBuilder;
import AST.DataType.DataType;

public class ReturnType {
    private DataType dataType;

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ReturnType {\n ")
                .append(dataType);
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
