package AST.ForStmt;

import AST.Block;
import AST.CustomStringBuilder;
import AST.Expression.Expression;

public class ForOfLoop extends ForStatement{
    private String for_KeyWord ;
    private DeclareVarsKeyWord declareVarsKeyWord ;
    private String for_Identifier ;
    private String of_KeyWord ;
    private Expression expression ;
    private Block block ;

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public DeclareVarsKeyWord getDeclareVarsKeyWord() {
        return declareVarsKeyWord;
    }

    public void setDeclareVarsKeyWord(DeclareVarsKeyWord declareVarsKeyWord) {
        this.declareVarsKeyWord = declareVarsKeyWord;
    }

    public String getFor_Identifier() {
        return for_Identifier;
    }

    public void setFor_Identifier(String for_Identifier) {
        this.for_Identifier = for_Identifier;
    }

    public String getFor_KeyWord() {
        return for_KeyWord;
    }

    public void setFor_KeyWord(String for_KeyWord) {
        this.for_KeyWord = for_KeyWord;
    }

    public String getOf_KeyWord() {
        return of_KeyWord;
    }

    public void setOf_KeyWord(String of_KeyWord) {
        this.of_KeyWord = of_KeyWord;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ForOfLoop { ").append('\n');

        if(declareVarsKeyWord != null)
            sb.append(declareVarsKeyWord);

        if(for_Identifier != null)
            sb.appendTab("For Identifier= ").append(for_Identifier).append("\n");

        if(of_KeyWord != null)
            sb.appendTab("of_KeyWord= ").append(of_KeyWord).append("\n");

        if(expression != null)
            sb.append(expression);

        if(block != null)
            sb.append(block);

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();

    }
}
