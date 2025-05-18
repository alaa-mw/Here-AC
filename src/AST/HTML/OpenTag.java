package AST.HTML;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class OpenTag {
    private String openTagName;
    private ArrayList<HtmlAttribute> htmlAttributeArray = new ArrayList<>();

    public String getIdentifier() {
        return openTagName;
    }

    public void setIdentifier(String identifier) {
        this.openTagName = identifier;
    }


    public ArrayList<HtmlAttribute> getHtmlAttributeArray() {
        return htmlAttributeArray;
    }

    public void setHtmlAttributeArray(ArrayList<HtmlAttribute> htmlAttributeArray) {
        this.htmlAttributeArray = htmlAttributeArray;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("OpenTag{").append("\n");
        if (openTagName != null) {
            sb.appendTab("tagElement= ").append(openTagName).append("\n");
        }
        if (htmlAttributeArray != null && !htmlAttributeArray.isEmpty()) {
            sb.append(htmlAttributeArray);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
