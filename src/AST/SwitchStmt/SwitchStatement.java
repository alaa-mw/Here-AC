package AST.SwitchStmt;

import AST.CustomStringBuilder;
import AST.Expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatement {
    private String Switch_KeyWord ;
    private Expression expression ;
    private List<CaseBlock> caseBlocks = new ArrayList<>() ;
    private DefaultBlock defaultBlock ;

    public List<CaseBlock> getCaseBlocks() {
        return caseBlocks;
    }

    public void setCaseBlocks(List<CaseBlock> caseBlocks) {
        this.caseBlocks = caseBlocks;
    }

    public DefaultBlock getDefaultBlock() {
        return defaultBlock;
    }

    public void setDefaultBlock(DefaultBlock defaultBlock) {
        this.defaultBlock = defaultBlock;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getSwitch_KeyWord() {
        return Switch_KeyWord;
    }

    public void setSwitch_KeyWord(String switch_KeyWord) {
        Switch_KeyWord = switch_KeyWord;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("SwitchStatement {").append("\n");

        sb.appendTab("SwitchKeyword = ").append(Switch_KeyWord).append("\n");
        sb.append(expression);
        if(caseBlocks != null && !caseBlocks.isEmpty()) {
            sb.append(caseBlocks);
        }
        if (defaultBlock != null ) {
            sb.append(defaultBlock);
        }
        sb.appendTabCloseScope("}");
        return sb.toString();

    }
}
