package AST.Component;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class StyleUrls implements StyleArg{
    private String stylesUrls;
    private List<String> stringLiteral =new ArrayList<>();

    @Override
    public String getNameAttribute(){
        return "styleUrls";
    };
    public String getStylesUrls() {
        return stylesUrls;
    }

    public void setStylesUrls(String stylesUrls) {
        this.stylesUrls = stylesUrls;
    }

    public List<String> getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(List<String> stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("StyleUrls {\n");

        if (stylesUrls != null) {
            sb.appendTab("stylesUrls = ").append(stylesUrls).append("\n");
        }

        if (stringLiteral != null && !stringLiteral.isEmpty()) {
            sb.appendTab("stringLiteral = ").append(stringLiteral).append("\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
