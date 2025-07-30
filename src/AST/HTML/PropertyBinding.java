package AST.HTML;

import AST.CustomStringBuilder;

public class PropertyBinding implements HtmlBinding{
    private String propertyName ;
    private String propertyValue ;

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("PropertyBinding{\n");
        if (propertyName != null ) {
            sb.append("propertyName :").append(propertyName).append("\n");

        }
        if (propertyValue != null ) {
            sb.append("propertyValue :").append(propertyValue).append("\n");

        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
