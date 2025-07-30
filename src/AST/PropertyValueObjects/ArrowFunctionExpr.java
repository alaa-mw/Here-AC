package AST.PropertyValueObjects;

import AST.CustomStringBuilder;
import AST.Expression.Expression;

public class ArrowFunctionExpr implements ArrowFunction{
private String identifier ;
private String arrowKey ;
private Expression expression ;

    public String getArrowKey() {
        return arrowKey;
    }

    public void setArrowKey(String arrowKey) {
        this.arrowKey = arrowKey;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ArrowFunctionExpr {\n");

        if (identifier != null) {
            sb.appendTab("identifier = ").append(identifier).append("\n");
        }
        if (arrowKey != null) {
            sb.appendTab("ARROW = ").append(arrowKey).append("\n");
        }
        if (expression != null) {
            sb.append(expression);
        }


        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

    @Override
    public String getValue() {
        return "";
    }
}
