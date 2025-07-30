package AST.PropertyValueObjects;

import AST.CustomStringBuilder;
import AST.Expression.Expression;
import AST.ParameterList.ParameterList;

public class ArrowFunctionWithParamExpr implements ArrowFunction{
    private String arrowKey ;
    public ParameterList parameterList ;
    private Expression expression ;

    public String getArrowKey() {
        return arrowKey;
    }

    public void setArrowKey(String arrowKey) {
        this.arrowKey = arrowKey;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ArrowFunctionWithParamExpr {\n");

        if (arrowKey != null) {
            sb.appendTab("ARROW = ").append(arrowKey).append("\n");
        }
        if (parameterList != null) {
            sb.append(parameterList);
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
