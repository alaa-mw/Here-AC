package AST.CSS;

import AST.CustomStringBuilder;

public class AttributeSelector {
    private String attributeSelectorName ;
    private String attributeSelectorValue ;

    public String getAttributeSelectorName() {
        return attributeSelectorName;
    }

    public void setAttributeSelectorName(String attributeSelectorName) {
        this.attributeSelectorName = attributeSelectorName;
    }

    public String getAttributeSelectorValue() {
        return attributeSelectorValue;
    }

    public void setAttributeSelectorValue(String attributeSelectorValue) {
        this.attributeSelectorValue = attributeSelectorValue;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("AttributeSelector{\n");
        if (attributeSelectorName != null) {
            sb.appendTab("name=").append(attributeSelectorName).append("\n");
        }

        if (attributeSelectorValue != null ) {
            sb.appendTab("value=").append(attributeSelectorValue).append("\n");
        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
