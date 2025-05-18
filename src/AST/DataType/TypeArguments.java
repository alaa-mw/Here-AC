package AST.DataType;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class TypeArguments {
    private ArrayList<DataType> dataTypes = new ArrayList<>();

    public ArrayList<DataType> getDataTypes() {
        return dataTypes;
    }

    public void setDataTypes(ArrayList<DataType> dataTypes) {
        this.dataTypes = dataTypes;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.append("TypeArguments {\n")
                .append(dataTypes).append("\n");

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
