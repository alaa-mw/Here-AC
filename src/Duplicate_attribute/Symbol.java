package Duplicate_attribute;

//public class Symbol {
//    private String name;   // attribute name (e.g., selector, templateUrl)
//    private String type;   // "component_attribute"
//    private int line;
//
//    public Symbol(String name, String type, int line) {
//        this.name = name;
//        this.type = type;
//        this.line = line;
//    }
//
//    public String getName() { return name; }
//    public String getType() { return type; }
//    public int getLine() { return line; }
//}
//

public class Symbol {
    private String name;
    private String type;   // e.g., "attribute", "method", etc.
    private String value;
    private Object info;
    private int line;      // ⬅️ New field to store line number

    public Symbol(String name, String type, String value, Object info, int line) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.info = info;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return String.format("name=%s, type=%s, value=%s, info=%s, line=%d", name, type, value, info, line);
    }
}
