package AST.Component_Declaration;

import AST.CSS.CssDocument;
import AST.CustomStringBuilder;

public class InlineStyle {
    private CssDocument cssDocument;

    public CssDocument getCssDocument() {
        return cssDocument;
    }

    public void setCssDocument(CssDocument cssDocument) {
        this.cssDocument = cssDocument;
    }
    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.append("\n")
                .appendTab("cssDocument=").append(cssDocument).append("\n");
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
