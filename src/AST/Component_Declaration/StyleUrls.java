package AST.Component_Declaration;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class StyleUrls extends StyleArg{
    private String stylesUrls;
    private List<String> stringLiteral =new ArrayList<>();

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
        sb.append("\n")
                .appendTab("stylesUrls=").append(stylesUrls).append("\n");

        if (stringLiteral != null) {
            sb.appendTab("stringLiteral=").append(stringLiteral).append("\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
