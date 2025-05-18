package AST.Component;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Styles extends StyleArg{
    private List<InlineStyle> inlineStyles=new ArrayList<>();

    public List<InlineStyle> getInlineStyles() {
        return inlineStyles;
    }

    public void setInlineStyles(List<InlineStyle> inlineStyles) {
        this.inlineStyles = inlineStyles;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("Styles {\n");

        if (inlineStyles != null && !inlineStyles.isEmpty()) {
            sb.append(inlineStyles);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
