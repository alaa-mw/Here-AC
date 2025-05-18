package AST.CSS;

import AST.CustomStringBuilder;

public class RuleValue {
    String identifier;
    private String numericLiteralPx;
    private String numericLiteralPrecentage;
    private String color;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getNumericLiteralPx() {
        return numericLiteralPx;
    }

    public void setNumericLiteralPx(String numericLiteralPx) {
        this.numericLiteralPx = numericLiteralPx;
    }

    public String getNumericLiteralPrecentage() {
        return numericLiteralPrecentage;
    }

    public void setNumericLiteralPrecentage(String numericLiteralPrecentage) {
        this.numericLiteralPrecentage = numericLiteralPrecentage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();

        if (identifier != null) {
            sb.append("value= ").append(identifier);
        } else if (numericLiteralPx != null) {
            sb.append("value= ").append(numericLiteralPx).append("px");
        } else if (numericLiteralPrecentage != null) {
            sb.append("value= ").append(numericLiteralPrecentage).append(" percentage");
        } else if (color != null) {
            sb.append("colorValue= ").append(color);
        } else {
            return " ";
        }

        return sb.toString();
    }

}
