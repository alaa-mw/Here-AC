package AST.DataType;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class DataType {
    private List<SingleDataType> singleDataTypeList = new ArrayList<>();

    public List<SingleDataType> getSingleDataTypeList() {
        return singleDataTypeList;
    }

    public void setSingleDataTypeList(List<SingleDataType> singleDataTypeList) {
        this.singleDataTypeList = singleDataTypeList;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("DataType {\n");

        if (singleDataTypeList != null && !singleDataTypeList.isEmpty()) {
            sb.append(singleDataTypeList);
        }


        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }


}
