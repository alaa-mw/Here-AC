package AST.DataType;

import AST.CustomStringBuilder;

public class ListSuffix {
    private String list;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTab("{ listSuffix=").append(list).append(" }\n");

        return sb.toString();
    }
}
