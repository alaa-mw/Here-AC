package AST.Expression;

import AST.CustomStringBuilder;

public class ParentExpression extends Expression{
    private Expression innerExpression;

    public Expression getInnerExpression() {
        return innerExpression;
    }

    public void setInnerExpression(Expression innerExpression) {
        this.innerExpression = innerExpression;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ParentExpression {\n");

        if (innerExpression != null)
            sb.append(innerExpression);

        sb.appendTabCloseScope("} \n");
        return sb.toString();
    }
}
