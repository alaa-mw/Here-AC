package AST.Constructor;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class ConstructorParams {
    private ArrayList<ConstructorParam> constructorParam = new ArrayList<>();

    public ArrayList<ConstructorParam> getConstructorParam() {
        return constructorParam;
    }

    public void setConstructorParam(ArrayList<ConstructorParam> constructorParam) {
        this.constructorParam = constructorParam;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ConstructorParams { \n ");
        if (constructorParam != null && !constructorParam.isEmpty()) {
            sb.append(constructorParam);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
