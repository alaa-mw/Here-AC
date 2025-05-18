package AST.PropertyValueObjects;

import AST.CustomStringBuilder;
import AST.Expression.Expression;
import AST.ParameterList.ParameterList;

public class ArrowFunction {
    private ParameterList parameterList;
    private Expression expression;

    private String ARROW;

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

    public String getARROW() {
        return ARROW;
    }

    public void setARROW(String ARROW) {
        this.ARROW = ARROW;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ArrowFunction {\n");

        if (parameterList != null) {
            sb.append(parameterList);
        }
        if (expression != null) {
            sb.append(expression);
        }
        if (ARROW != null) {
            sb.appendTab("ARROW = ").append(ARROW).append("\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
