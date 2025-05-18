package AST.HTML;

import AST.CustomStringBuilder;

public class NgFor {
    private String ngFor;
    private String stringLiteral;

    public String getNgFor() {
        return ngFor;
    }

    public void setNgFor(String ngFor) {
        this.ngFor = ngFor;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("NgFor {\n");

        if (ngFor != null) {
            sb.appendTab("ngFor = ").append(ngFor).append("\n");
        }

        if (stringLiteral != null) {
            sb.appendTab("stringLiteral = '").append(stringLiteral).append("'\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }


}
