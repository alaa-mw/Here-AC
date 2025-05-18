package AST.CSS;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class CssDocument {
    private ArrayList<String> identifier = new ArrayList<>();// +
    private ArrayList<CssRule> cssRules = new ArrayList<>(); // *

    public ArrayList<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ArrayList<String> identifier) {
        this.identifier = identifier;
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
        if (identifier != null && !identifier.isEmpty()) {
            sb.appendTab("css selectors=").append(identifier).append("\n");
        }

        if (cssRules != null && !cssRules.isEmpty()) {;
            sb.append(cssRules).append("\n");

        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}

