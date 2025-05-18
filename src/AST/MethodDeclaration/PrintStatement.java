package AST.MethodDeclaration;

import AST.CustomStringBuilder;
import AST.Expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class PrintStatement {
    private String console;
    private String log;
    private List<Expression> expression=  new ArrayList<>();

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("PrintStatement { \n")
                .appendTab("console=").append(console).append("\n")
                .appendTab("log=").append(log).append("\n");

        if (expression != null && ! expression.isEmpty()) {
            sb.appendTab(expression).append("\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
