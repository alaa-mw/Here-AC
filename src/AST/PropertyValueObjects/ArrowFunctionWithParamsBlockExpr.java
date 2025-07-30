package AST.PropertyValueObjects;

import AST.Block;
import AST.CustomStringBuilder;
import AST.Expression.Expression;
import AST.ParameterList.ParameterList;

public class ArrowFunctionWithParamsBlockExpr implements ArrowFunction{
    private String arrowKey ;
    public ParameterList parameterList ;
    private Block block ;

    public String getArrowKey() {
        return arrowKey;
    }

    public void setArrowKey(String arrowKey) {
        this.arrowKey = arrowKey;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ArrowFunctionWithParamsBlockExpr {\n");

        if (arrowKey != null) {
            sb.appendTab("ARROW = ").append(arrowKey).append("\n");
        }
        if (parameterList != null) {
            sb.append(parameterList);
        }
        if (block != null) {
            sb.append(block);
        }


        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
    @Override
    public String getValue() {
        return "";
    }
}
