package SymbolTable.ReadProperties;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class Property {
    // accessModifiers? STATIC? READONLY? IDENTIFIER (DOT_DOT assignDataType)?  assigment SEMICOLON?
    ArrayList<String> type = new ArrayList<>();
    String value;

    public Property(ArrayList<String> type, String value) {
        this.type = type;
        this.value = value;
    }

    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("PropertyDecST {\n")
                .appendTab("type ==== ").append(type).append("\n")
                .appendTab("value === ").append(value).append("\n")
                .appendTabCloseScope("}");
        return sb.toString();
    }
}
