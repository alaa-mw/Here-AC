package AST;

import AST.ConditionStmt.ConditionalStatement;
import AST.ForStmt.ForStatement;
import AST.SwitchStmt.SwitchStatement;
import AST.WhileStmt.DoWhileStatement;
import AST.WhileStmt.WhileStatement;

public class CommonStatement {
    private PrintStatement printStatement ;
    private ConditionalStatement conditionStatement;
    private SwitchStatement switchStatement;
    private ForStatement forStatement;
    private WhileStatement whileStatement;
    private DoWhileStatement doWhileStatement;

    public ConditionalStatement getConditionStatement() {
        return conditionStatement;
    }

    public void setConditionStatement(ConditionalStatement conditionStatement) {
        this.conditionStatement = conditionStatement;
    }

    public DoWhileStatement getDoWhileStatement() {
        return doWhileStatement;
    }

    public void setDoWhileStatement(DoWhileStatement doWhileStatement) {
        this.doWhileStatement = doWhileStatement;
    }

    public PrintStatement getPrintStatement() {
        return printStatement;
    }

    public void setPrintStatement(PrintStatement printStatement) {
        this.printStatement = printStatement;
    }

    public ForStatement getForStatement() {
        return forStatement;
    }

    public void setForStatement(ForStatement forStatement) {
        this.forStatement = forStatement;
    }

    public SwitchStatement getSwitchStatement() {
        return switchStatement;
    }

    public void setSwitchStatement(SwitchStatement switchStatement) {
        this.switchStatement = switchStatement;
    }

    public WhileStatement getWhileStatement() {
        return whileStatement;
    }

    public void setWhileStatement(WhileStatement whileStatement) {
        this.whileStatement = whileStatement;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("CommonStatement {").append('\n');
        if (printStatement != null) {
            sb.append(printStatement);
        }
        else if (conditionStatement != null) {
            sb.append(conditionStatement);
        }
        else if (switchStatement != null) {
            sb.append(switchStatement);
        }
        else if (forStatement != null) {
            sb.append(forStatement);
        }
        else if (whileStatement != null) {
            sb.append(whileStatement);
        }
        else if (doWhileStatement != null) {
            sb.append(doWhileStatement);
        }
        sb.appendTabCloseScope('}').append('\n');
        return sb.toString();
    }
}
