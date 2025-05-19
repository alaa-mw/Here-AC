package AST.Expression;

import AST.CustomStringBuilder;
import AST.Operation;
import java.util.ArrayList;
import java.util.List;

public class BinaryExpression implements Expression {
    private List<Operation> operations = new ArrayList<>();
    private List<Expression> expressions = new ArrayList<>();

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("BinaryExpression { \n");

        if( operations != null && !operations.isEmpty())
            sb.append(operations);

        if( expressions != null && !expressions.isEmpty())
            sb.append(expressions);

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
