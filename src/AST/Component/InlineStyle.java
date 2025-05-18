package AST.Component;

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
        sb.appendTabOpenScope("{\n");

        if (cssDocument != null) {
            sb.append(cssDocument);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
