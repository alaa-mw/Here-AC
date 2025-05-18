package AST.Property;

import AST.CustomStringBuilder;
import AST.DataType.DataType;

import java.util.ArrayList;
import java.util.List;

public class AssignDataType {
    private List<DataType> dataTypes = new ArrayList<>();

    public List<DataType> getDataTypes() {
        return dataTypes;
    }

    public void setDataTypes(List<DataType> dataTypes) {
        this.dataTypes = dataTypes;
    }
    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("AssignDataType {").append("\n")
            .append(dataTypes)
            .appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
