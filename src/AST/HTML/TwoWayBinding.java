package AST.HTML;

import AST.CustomStringBuilder;

public class TwoWayBinding implements HtmlBinding{
    private String Name ;
    private String Value ;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("TwoWayBinding{\n");
        if (Name != null ) {
            sb.appendTab("Name :").append(Name).append("\n");

        }
        if (Value != null ) {
            sb.appendTab("Value :").append(Value).append("\n");

        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
