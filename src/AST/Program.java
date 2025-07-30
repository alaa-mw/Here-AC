package AST;

import java.util.ArrayList;

public class Program {
    private ArrayList<Statement> statement = new ArrayList<>();

    public Program() {}

    public ArrayList<Statement> getStatement() {
        return statement;
    }

    public void setStatement(ArrayList<Statement> statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("Program {\n");

        if (statement != null && !statement.isEmpty()) {
            sb.append(statement);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
