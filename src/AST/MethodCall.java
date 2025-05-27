package AST;

import AST.Expression.Expression;
import AST.PropertyValueObjects.PropertyValueObjects;
import AST.SwitchStmt.CaseStatement;

import java.util.*;

public class MethodCall implements PropertyValueObjects, CaseStatement
{
    private String methodCalledName ;
    private List<String> identifiers = new ArrayList<>();
    private List<Expression> expressions = new ArrayList<>();

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public void addToIdentifiers(String id) {
        this.identifiers.add(id);
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void addToExpressions(Expression expression) {
        this.expressions.add(expression);
    }
    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public String getMethodCalledName() {
        return methodCalledName;
    }

    public void setMethodCalledName(String methodCalledName) {
        this.methodCalledName = methodCalledName;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("MethodCall {\n");

        if (identifiers != null && !identifiers.isEmpty()) {
            sb.appendTab("methodCalledName = ").append(identifiers.get(0)).append("\n");
            for (int i =  1 ; i < identifiers.size(); i++) {
                sb.appendTab("identifiers = ").append(identifiers.get(i)).append("\n");
            }
        }

        if (expressions != null && !expressions.isEmpty()) {
            sb.append(expressions);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

    @Override
    public String getValue() {
        return null;
    }
}
