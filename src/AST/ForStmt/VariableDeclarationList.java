package AST.ForStmt;

import AST.CustomStringBuilder;

import java.util.List;

public class VariableDeclarationList {
    List<VariableDeclaration> variableDeclaration ;

    public List<VariableDeclaration> getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(List<VariableDeclaration> variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("VariableDeclarationList {\n");
        if (variableDeclaration != null && !variableDeclaration.isEmpty()) {
            sb.append(variableDeclaration);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
