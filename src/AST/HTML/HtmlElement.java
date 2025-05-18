package AST.HTML;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class HtmlElement {
    private ArrayList<HtmlContentBody> htmlContentBody = new ArrayList<HtmlContentBody>();
    private OpenTag openTag;
    private CloseTag closeTag ;
    private SelfClosingTag selfClosingTag;

    public ArrayList<HtmlContentBody> getHtmlContentBody() {
        return htmlContentBody;
    }

    public void setHtmlContentBody(ArrayList<HtmlContentBody> htmlContentBody) {
        this.htmlContentBody = htmlContentBody;
    }

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    public OpenTag getOpenTag() {
        return openTag;
    }

    public void setOpenTag(OpenTag openTag) {
        this.openTag = openTag;
    }

    public CloseTag getCloseTag() {
        return closeTag;
    }

    public void setCloseTag(CloseTag closeTag) {
        this.closeTag = closeTag;
    }


    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("HtmlElement{ ").append('\n');

        if (openTag != null) {
            sb.append(openTag);
        }
        if (htmlContentBody != null && !htmlContentBody.isEmpty()) {
            sb.append(htmlContentBody);
        }
        if (closeTag != null) {
            sb.append(closeTag);
        }
        if (selfClosingTag != null) {
            sb.append(selfClosingTag);
        }
        sb.appendTabCloseScope("}").append('\n');
        return sb.toString();
    }

}
