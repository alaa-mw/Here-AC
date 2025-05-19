package AST.Constructor;

import AST.Class.ClassBody;
import AST.CustomStringBuilder;

import java.util.ArrayList;

public class ConstructorDeclaration implements ClassBody {
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
        sb.appendTabOpenScope("ConstructorDeclaration{ ").append("\n")
                .appendTab("constructor=").append(constructor).append("\n");

        if (constructorParams != null) {
            sb.append(constructorParams);
        }
        if (constructorBody != null && !constructorBody.isEmpty()) {
            sb.append(constructorBody);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
