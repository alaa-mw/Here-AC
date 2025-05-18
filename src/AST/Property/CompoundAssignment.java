package AST.Property;

import AST.CustomStringBuilder;
import AST.PropertyValueClasses.PropertyValue;

public class CompoundAssignment {
    private String plusEq;
    private String minusEq;
    private String starEq;
    private String slashEq;
    private String eq;
    private PropertyValue propertyValue;

    public String getPlusEq() {
        return plusEq;
    }

    public void setPlusEq(String plusEq) {
        this.plusEq = plusEq;
    }

    public String getMinusEq() {
        return minusEq;
    }

    public void setMinusEq(String minusEq) {
        this.minusEq = minusEq;
    }

    public String getStarEq() {
        return starEq;
    }

    public void setStarEq(String starEq) {
        this.starEq = starEq;
    }

    public String getSlashEq() {
        return slashEq;
    }

    public PropertyValue getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(PropertyValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    public void setSlashEq(String slashEq) {
        this.slashEq = slashEq;
    }

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }
    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("CompoundAssignment {\n");
        if (plusEq != null)
            sb.appendTab("plusEq= ' ").append(plusEq).append(" '\n");
        if (minusEq != null)
            sb.appendTab("minusEq= ' ").append(minusEq).append(" '\n");
        if (starEq != null)
            sb.appendTab("starEq= ' ").append(starEq).append(" '\n");
        if (slashEq != null)
            sb.appendTab("slashEq= ' ").append(slashEq).append(" '\n");
        if (eq != null)
            sb.appendTab("eq= ' ").append(eq).append(" '\n");
        if (propertyValue != null)
            sb.append(propertyValue);

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
