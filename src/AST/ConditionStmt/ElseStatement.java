package AST.ConditionStmt;

import AST.Block;
import AST.CustomStringBuilder;

public class ElseStatement {

    private String else_;
    private Block block;

    public String getElse_() {
        return else_;
    }

    public void setElse_(String else_) {
        this.else_ = else_;
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
        sb.appendTabOpenScope("ElseStatement {").append("\n");
        sb.appendTab("elsekeyword = ").append(else_).append("\n");
        sb.append(block);
        sb.appendTabCloseScope("}");
        return sb.toString();
    }
}
