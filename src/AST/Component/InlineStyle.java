package AST.Component;

import AST.CSS.CssDocument;
import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class InlineStyle {
    private List<CssDocument> cssDocument = new ArrayList<>();

    public List<CssDocument> getCssDocument() {
        return cssDocument;
    }

    public void setCssDocument(List<CssDocument> cssDocument) {
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
