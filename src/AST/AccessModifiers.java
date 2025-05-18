package AST;

import AST.CustomStringBuilder;

public class AccessModifiers {
    private String modifier; // "public", "private", or "protected"

    public AccessModifiers(String modifier) {
        this.modifier = modifier;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("accessModifier= " + modifier).append("\n");
        return sb.toString();
    }
}