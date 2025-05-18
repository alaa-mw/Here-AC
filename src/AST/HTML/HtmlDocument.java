package AST.HTML;

import AST.CustomStringBuilder;


import java.util.ArrayList;

public class HtmlDocument {
    private ArrayList<HtmlElement> htmlElement = new ArrayList<>();

    public ArrayList<HtmlElement> getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(ArrayList<HtmlElement> htmlElement) {
        this.htmlElement = htmlElement;
    }
    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("HtmlDocument {\n");

        if (htmlElement != null && !htmlElement.isEmpty()) {
            sb.append(htmlElement);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }



}
