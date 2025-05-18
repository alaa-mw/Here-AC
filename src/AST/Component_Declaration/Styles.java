package AST.Component_Declaration;

import AST.CustomStringBuilder;

import java.util.List;

public class Styles extends StyleArg{
    private List<InlineStyle> inlineStyles;

    public List<InlineStyle> getInlineStyles() {
        return inlineStyles;
    }

    public void setInlineStyles(List<InlineStyle> inlineStyles) {
        this.inlineStyles = inlineStyles;
    }
    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.append("\n")
                .appendTab("inlineStyles=").append(inlineStyles).append("\n");
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
