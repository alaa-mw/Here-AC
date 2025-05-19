package AST.WhileStmt;

import AST.Block;
import AST.CommonStatement;
import AST.CustomStringBuilder;
import AST.Expression.Expression;

public class DoWhileStatement implements CommonStatement {
    private String do_KeyWord;
    private String While_KeyWord ;
    private Expression expression ;
    private Block block ;

    public String getDo_KeyWord() {
        return do_KeyWord;
    }

    public void setDo_KeyWord(String do_KeyWord) {
        this.do_KeyWord = do_KeyWord;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getWhile_KeyWord() {
        return While_KeyWord;
    }

    public void setWhile_KeyWord(String while_KeyWord) {
        While_KeyWord = while_KeyWord;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("DoWhileStatement {\n");

        if (do_KeyWord != null) {
            sb.appendTab("do_KeyWord = ").append(do_KeyWord).append("\n");
        }

        if (block != null) {
            sb.append(block);
        }

        if (While_KeyWord != null) {
            sb.appendTab("While_KeyWord = ").append(While_KeyWord).append("\n");
        }

        if (expression != null) {
            sb.append(expression);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
