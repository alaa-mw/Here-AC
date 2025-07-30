package AST.CSS;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class CssSelector {
    private List<String> selectors = new ArrayList<>();
    private List<AttributeSelector> attributeSelectorList = new ArrayList<>();

    public List<AttributeSelector> getAttributeSelectorList() {
        return attributeSelectorList;
    }

    public void setAttributeSelectorList(List<AttributeSelector> attributeSelectorList) {
        this.attributeSelectorList = attributeSelectorList;
    }

    public List<String> getSelectors() {
        return selectors;
    }

    public void setSelectors(List<String> selectors) {
        this.selectors = selectors;
    }


    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("CssSelector{\n");
        if (selectors != null && !selectors.isEmpty()) {
            sb.appendTab("cssSelectors=").append(selectors).append("\n");
        }

        if (attributeSelectorList != null && !attributeSelectorList.isEmpty()) {;
            sb.append(attributeSelectorList);

        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
