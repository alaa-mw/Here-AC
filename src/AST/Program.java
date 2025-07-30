package AST;

import java.util.ArrayList;

public class Program {
    private ArrayList<Statement> statements = new ArrayList<>();

    public Program() {}

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("Program {\n");

        if (statements != null && !statements.isEmpty()) {
            sb.append(statements);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
