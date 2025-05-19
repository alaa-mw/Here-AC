package AST.ForStmt;

import AST.Block;
import AST.CustomStringBuilder;
import AST.Expression.Expression;

import java.util.List;

public class TraditionalFor implements ForStatement{
    private String for_KeyWord ;
    private DeclareVarsKeyWord declareVarsKeyWord ;
    private ForInitializer forInitializer ;
    private Expression conditionExpression;
    private Expression updateExpression;
    private Block block ;

    public DeclareVarsKeyWord getDeclareVarsKeyWord() {
        return declareVarsKeyWord;
    }

    public void setDeclareVarsKeyWord(DeclareVarsKeyWord declareVarsKeyWord) {
        this.declareVarsKeyWord = declareVarsKeyWord;
    }

    public String getFor_KeyWord() {
        return for_KeyWord;
    }

    public void setFor_KeyWord(String for_KeyWord) {
        this.for_KeyWord = for_KeyWord;
    }

    public ForInitializer getForInitializer() {
        return forInitializer;
    }

    public void setForInitializer(ForInitializer forInitializer) {
        this.forInitializer = forInitializer;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Expression getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(Expression conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public Expression getUpdateExpression() {
        return updateExpression;
    }

    public void setUpdateExpression(Expression updateExpression) {
        this.updateExpression = updateExpression;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("TraditionalFor{ ").append('\n');
        if (for_KeyWord != null) {
            sb.appendTab("for_KeyWord = ").append(for_KeyWord).append("\n");
        }
        if(declareVarsKeyWord != null) {
            sb.append(declareVarsKeyWord);
        }
        if(forInitializer != null) {
            sb.append(forInitializer);
        }
        if (conditionExpression != null) {
            sb.append(conditionExpression);
        }
        if (updateExpression != null) {
            sb.append(updateExpression);
        }
        if(block != null) {
            sb.append(block);
        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();

    }
}
