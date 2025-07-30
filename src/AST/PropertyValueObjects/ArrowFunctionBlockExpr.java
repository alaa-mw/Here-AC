package AST.PropertyValueObjects;

import AST.Block;
import AST.CustomStringBuilder;

public class ArrowFunctionBlockExpr implements ArrowFunction{
    private String identifier ;
    private String arrowKey ;
    private Block block ;

    public String getArrowKey() {
        return arrowKey;
    }

    public void setArrowKey(String arrowKey) {
        this.arrowKey = arrowKey;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ArrowFunctionBlockExpr {\n");

        if (identifier != null) {
            sb.appendTab("identifier = ").append(identifier).append("\n");
        }
        if (arrowKey != null) {
            sb.appendTab("ARROW = ").append(arrowKey).append("\n");
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
