package AST;

import java.util.ArrayList;

public class Program {
    private Statement statement;

    public Program() {}

    public Program(Statement statement) {
        this.statement = statement;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("Program {\n");

        if (statement != null) {
            sb.append(statement);

        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
