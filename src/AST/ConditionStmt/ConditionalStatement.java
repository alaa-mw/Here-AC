package AST.ConditionStmt;

import AST.*;
import AST.Expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class ConditionalStatement {
    private String if_KeyWord ;
    private Expression expression ;
    private Block block ;
    private List<ElseIfStatement> elseIfStmt = new ArrayList<>();
    private ElseStatement elseStatement ;

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public List<ElseIfStatement> getElseIfStmt() {
        return elseIfStmt;
    }

    public void setElseIfStmt(List<ElseIfStatement> elseIfStmt) {
        this.elseIfStmt = elseIfStmt;
    }

    public ElseStatement getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(ElseStatement elseStatement) {
        this.elseStatement = elseStatement;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getIf_KeyWord() {
        return if_KeyWord;
    }

    public void setIf_KeyWord(String if_KeyWord) {
        this.if_KeyWord = if_KeyWord;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ConditionalStatement {").append("\n");

        sb.appendTab("ifKeyword = ").append(if_KeyWord).append("\n");
        sb.append(expression);
        sb.append(block);

        if (elseIfStmt != null && !elseIfStmt.isEmpty()) {
            sb.append(elseIfStmt);
        }
        if (elseStatement != null) {
            sb.append(elseStatement);

        }
        sb.appendTabCloseScope("} \n");
        return sb.toString();

    }
}
