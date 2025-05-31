package SymbolTable.InterfaceMissing;

public class Symbol {
    private String name;
    private String value;
    private String type;
    private boolean isOptional;

    private Object info;         // optional metadata (e.g., scope or symbol owner)
    private int line;            // code line number

    public Symbol(){

    }
    public Symbol(String name, String value, String type ,boolean isOptional) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.isOptional=isOptional;
    }

    // Secondary constructor for common use without info or isOptional
    public Symbol(String name, String type, String value, int line) {
//        this(name, type, value, null, line, false);
        this.name=name;
        this.type=type;
        this.line=line;
        this.value=value;
    }

    // Another constructor variant (like the one from Duplicate_attribute)
    public Symbol(String name, String type, String value, Object info, int line) {
//        this(name, type, value, info, line, false);
        this.name=name;
        this.type=type;
        this.line=line;
        this.value=value;
        this.info=info;
    }

    public boolean isOptional() {
        return isOptional;
    }

    public void setOptional(boolean optional) {
        isOptional = optional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    // Getters + toString()
    @Override
    public String toString() {
        return "{name='" + name + "', value='" + value + "', type='" + type + "'}";
    }
}