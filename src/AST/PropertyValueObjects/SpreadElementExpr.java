package AST.PropertyValueObjects;

import AST.CustomStringBuilder;
import AST.propertyCallClasses.PropertyCall;

public class SpreadElementExpr implements PropertyValueObjects{
    private String spreadKey ;
    private PropertyCall propertyCall ;
    private String identifier ;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public PropertyCall getPropertyCall() {
        return propertyCall;
    }

    public void setPropertyCall(PropertyCall propertyCall) {
        this.propertyCall = propertyCall;
    }

    public String getSpreadKey() {
        return spreadKey;
    }

    public void setSpreadKey(String spreadKey) {
        this.spreadKey = spreadKey;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("SpreadElement {\n");

        sb.appendTab("spreadkey = ").append(spreadKey).append("\n");
        sb.appendTab("identifier = ").append(identifier).append("\n");

        if(propertyCall != null){
            sb.append(propertyCall).append("\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

    @Override
    public String getValue() {
        return "";
    }
}
