package AST.HTML;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class SelfClosingTag {
    private String identifier;
    private ArrayList<HtmlAttribute> htmlAttributes = new ArrayList<HtmlAttribute>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ArrayList<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(ArrayList<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("SelfClosingTag{").append("\n")
                .appendTab("identifier=").append(identifier).append("\n");

        if (htmlAttributes != null && !htmlAttributes.isEmpty()) {
            sb.append(htmlAttributes);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }


}
