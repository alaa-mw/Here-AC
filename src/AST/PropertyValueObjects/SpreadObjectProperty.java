package AST.PropertyValueObjects;

import AST.CustomStringBuilder;

public class SpreadObjectProperty implements ObjectProperty{
    private SpreadElementExpr spreadElement ;

    public SpreadElementExpr getSpreadElement() {
        return spreadElement;
    }

    public void setSpreadElement(SpreadElementExpr spreadElement) {
        this.spreadElement = spreadElement;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("SpreadObjectProperty {\n");

        sb.append(spreadElement);

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
