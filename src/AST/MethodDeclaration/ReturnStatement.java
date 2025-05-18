package AST.MethodDeclaration;

import AST.CustomStringBuilder;
import AST.Expression.Expression;

public class ReturnStatement {
     private String return_;
     private Expression expression;

    public String getReturn_() {
        return return_;
    }

    public void setReturn_(String return_) {
        this.return_ = return_;
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
        sb.appendTabOpenScope("ReturnStatement { \n")
                .appendTab("return=").append(return_).append("\n");

        if (expression != null) {
            sb.appendTab(expression).append("\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
