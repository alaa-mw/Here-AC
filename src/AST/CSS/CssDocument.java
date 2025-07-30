package AST.CSS;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class CssDocument {
    private ArrayList<CssSelector> cssSelector = new ArrayList<>();// +
    private ArrayList<CssRule> cssRules = new ArrayList<>(); // *


    public ArrayList<CssSelector> getCssSelector() {
        return cssSelector;
    }

    public void setCssSelector(ArrayList<CssSelector> cssSelector) {
        this.cssSelector = cssSelector;
    }

    public ArrayList<CssRule> getCssRules() {
        return cssRules;
    }

    public void setCssRules(ArrayList<CssRule> cssRules) {
        this.cssRules = cssRules;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("CssDocument{\n");
        if (cssSelector != null && !cssSelector.isEmpty()) {
            sb.append(cssSelector);
        }
        if (cssRules != null && !cssRules.isEmpty()) {;
            sb.append(cssRules).append("\n");

        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}

