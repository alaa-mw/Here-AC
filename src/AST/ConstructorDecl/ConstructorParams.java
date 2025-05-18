package AST.ConstructorDecl;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class ConstructorParams {
    private ArrayList<ConstructorParam> constructorParamlist = new ArrayList<>();

    public ArrayList<ConstructorParam> getConstructorParamlist() {
        return constructorParamlist;
    }

    public void setConstructorParamlist(ArrayList<ConstructorParam> constructorParamlist) {
        this.constructorParamlist = constructorParamlist;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendOpenScope(" ");
        if (constructorParamlist != null && !constructorParamlist.isEmpty()) {
            sb.appendTabOpenScope(", ").append(constructorParamlist);
        }
        //sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
