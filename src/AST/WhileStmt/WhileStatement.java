package AST.WhileStmt;

import AST.*;
import AST.Expression.Expression;

public class WhileStatement {
    private String While_KeyWord ;
    private Expression expression ;
    private Block block ;

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
        sb.appendTabOpenScope("WhileStatement {\n");

        if (While_KeyWord != null) {
            sb.appendTab("While_KeyWord = ").append(While_KeyWord).append("\n");
        }

        if (expression != null) {
            sb.append(expression);
        }

        if (block != null) {
            sb.append(block);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }


}
