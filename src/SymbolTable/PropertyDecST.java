package SymbolTable;

import AST.CustomStringBuilder;

public class PropertyDecST {
    // accessModifiers? STATIC? READONLY? IDENTIFIER (DOT_DOT assignDataType)?  assigment SEMICOLON?
    String type;
    String value;


    public String getType() {
        return type;
    }

    public void setType(String type) {
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
