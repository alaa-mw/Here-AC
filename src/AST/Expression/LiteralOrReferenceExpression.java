package AST.Expression;
import AST.CustomStringBuilder;
import AST.PropertyValueClasses.PropertyValue;

public class LiteralOrReferenceExpression implements Expression{
    private PropertyValue propertyValue  ;

    public PropertyValue getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(PropertyValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("LiteralOrReferenceExpression {\n");
        if (propertyValue != null) {
            sb.append(propertyValue);
        }
        sb.appendTabCloseScope("} \n");
        return sb.toString();
    }
}
