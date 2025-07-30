package AST.HTML;

import AST.CustomStringBuilder;

public class BooleanAttribute implements HtmlBinding{
    private String identifier ;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("BooleanAttribute{ ").append('\n');
        if (identifier != null) {
            sb.appendTab("identifier=").append(identifier).append("\n");
        }
        sb.appendTabCloseScope("}").append('\n');
        return sb.toString();
    }
}
