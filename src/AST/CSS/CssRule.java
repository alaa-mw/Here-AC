package AST.CSS;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class CssRule {
    private String identifier;
    private ArrayList<RuleValue> ruleValues = new ArrayList<>(); // *

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ArrayList<RuleValue> getRuleValues() {
        return ruleValues;
    }

    public void setRuleValues(ArrayList<RuleValue> ruleValues) {
        this.ruleValues = ruleValues;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("CssRule{ ")
           .append("cssProperty= ").append(identifier).append(", ");
        if (ruleValues != null && !ruleValues.isEmpty()) {
            sb.append(ruleValues);
        }
        sb.appendCloseScope(" }\n");
        return sb.toString();
    }

}
