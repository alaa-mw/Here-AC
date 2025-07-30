package AST.DataType;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class SingleDataType {
    private Type type;
    private ArrayList<TypeArguments> typeArguments = new ArrayList<>();
    private ArrayList<ListSuffix> listSuffix = new ArrayList<>();

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ArrayList<TypeArguments> getTypeArguments() {
        return typeArguments;
    }

    public void setTypeArguments(ArrayList<TypeArguments> typeArguments) {
        this.typeArguments = typeArguments;
    }

    public ArrayList<ListSuffix> getListSuffix() {
        return listSuffix;
    }

    public void setListSuffix(ArrayList<ListSuffix> listSuffix) {
        this.listSuffix = listSuffix;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("SingleDataType {")
                .append(type);

        if (typeArguments != null && !typeArguments.isEmpty()) {
            sb.append(typeArguments);
        }
        if (listSuffix != null && !listSuffix.isEmpty()) {
            sb.append(listSuffix);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
