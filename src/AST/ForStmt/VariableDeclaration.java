package AST.ForStmt;

import AST.CustomStringBuilder;
import AST.DataType.DataType;
import AST.Expression.Expression;

public class VariableDeclaration {
    private String variableName ;
    private DataType dataType ;
    private Expression expression ;

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("MethodCall {\n");

        if (variableName != null ) {
            sb.appendTab("variableName = ").append(variableName).append("\n");
        }
        if (dataType != null ) {
            sb.append(dataType);
        }
        if (expression != null ) {
            sb.append(expression);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
