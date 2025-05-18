package AST.ConstructorDecl;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class ConstructorDeclaration {
    private String constructor ;
    private ConstructorParams constructorParams ;
    private ArrayList<ConstructorBody> constructorBody = new ArrayList<>() ;

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public ConstructorParams getConstructorParams() {
        return constructorParams;
    }

    public void setConstructorParams(ConstructorParams constructorParams) {
        this.constructorParams = constructorParams;
    }

    public ArrayList<ConstructorBody> getConstructorBody() {
        return constructorBody;
    }

    public void setConstructorBody(ArrayList<ConstructorBody> constructorBody) {
        this.constructorBody = constructorBody;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendOpenScope("ConstructorDeclaration{ ").append("\n");
        if (constructorParams != null) {
            sb.append("constructorParams = ").append(constructor).append("\n");
        }
        if (constructorBody != null && !constructorBody.isEmpty()) {
            sb.appendTabOpenScope(", constructorBody =").append(constructorBody);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
