package AST.ForStmt;


import AST.CustomStringBuilder;
import AST.Property.BlockProperty;

public class ForInitializer {
   private VariableDeclarationList variableDeclarationList;
   private BlockProperty blockProperty ;

    public BlockProperty getBlockProperty() {
        return blockProperty;
    }

    public void setBlockProperty(BlockProperty blockProperty) {
        this.blockProperty = blockProperty;
    }

    public VariableDeclarationList getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(VariableDeclarationList variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ForInitializer {").append("\n");
        if(variableDeclarationList != null){
            sb.append(variableDeclarationList);
        }
        if (blockProperty != null) {
            sb.append(blockProperty);
        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
