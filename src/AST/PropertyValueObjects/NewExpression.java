package AST.PropertyValueObjects;

import AST.CustomStringBuilder;
import AST.DataType.TypeArguments;
import AST.Expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class NewExpression implements PropertyValueObjects{
    private String NewKeyWord ;
    private String identifier ;
    private TypeArguments typeArgument ;
    private List<Expression> expressions = new ArrayList<>();

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public TypeArguments getTypeArgument() {
        return typeArgument;
    }

    public void setTypeArgument(TypeArguments typeArgument) {
        this.typeArgument = typeArgument;
    }

    public String getNewKeyWord() {
        return NewKeyWord;
    }

    public void setNewKeyWord(String newKeyWord) {
        NewKeyWord = newKeyWord;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getValue() {
        return "";
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("newExpression {\n");

        sb.appendTab("newKeyWord = ").append(NewKeyWord).append("\n");
        sb.appendTab("identifier = ").append(identifier).append("\n");

        if(typeArgument != null){
            sb.append(typeArgument).append("\n");
        }

        if(expressions != null && !expressions.isEmpty()){
            sb.append(expressions).append("\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
