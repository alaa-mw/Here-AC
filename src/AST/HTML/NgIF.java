package AST.HTML;

import AST.CustomStringBuilder;

public class NgIF implements HtmlAttribute {
    private String ngIf;
    private String stringLiteral;

    public String getNgIf() {
        return ngIf;
    }

    public void setNgIf(String ngIf) {
        this.ngIf = ngIf;
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
        sb.appendTabOpenScope("NgIF {\n");

        if (ngIf != null) {
            sb.appendTab("ngIf = ").append(ngIf).append("\n");
        }

        if (stringLiteral != null) {
            sb.appendTab("stringLiteral = '").append(stringLiteral).append("'\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }


}
