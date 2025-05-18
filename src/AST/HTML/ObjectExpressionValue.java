package AST.HTML;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class ObjectExpressionValue {
    private ArrayList<String> htmlObjectValue= new ArrayList<String>();

    public ArrayList<String> getIdentifiers() {
        return htmlObjectValue;
    }

    public void setIdentifiers(ArrayList<String> identifiers) {
        this.htmlObjectValue = identifiers;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.append("{\n")
                .appendTab("htmlObjectValue = ").append(htmlObjectValue).append("\n")
                .appendTabCloseScope("}").append("\n");
        return sb.toString();
    }


}
