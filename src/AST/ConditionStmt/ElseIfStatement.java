package AST.ConditionStmt;

import AST.Block;
import AST.CustomStringBuilder;
import AST.Expression.Expression;

public class ElseIfStatement {
    private String else_;
    private String if_;
    private Expression expression;
    private Block block;

    public String getElse_() {
        return else_;
    }

    public void setElse_(String else_) {
        this.else_ = else_;
    }

    public String getIf_() {
        return if_;
    }

    public void setIf_(String if_) {
        this.if_ = if_;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ElseIfStatement {").append("\n");

        sb.appendTab("elseifKeyword = ").append(else_).append(if_).append("\n");
        sb.append(expression);
        sb.append(block);

        sb.appendTabCloseScope("}");
        return sb.toString();

    }
}
