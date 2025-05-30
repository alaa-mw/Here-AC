package AST.HTML;

import AST.CustomStringBuilder;
import AST.Operation;

public  class HtmlContentBody {

    private String htmlIdentifier;
    private HtmlElement htmlElement;
//    private Operation htmlContentOperation ;
    private ObjectExpression objectExpression;


    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public ObjectExpression getObjectExpression() {
        return objectExpression;
    }

    public void setObjectExpression(ObjectExpression objectExpression) {
        this.objectExpression = objectExpression;
    }

    public String getHtmlIdentifier() {
        return htmlIdentifier;
    }

    public void setHtmlIdentifier(String htmlIdentifier) {
        this.htmlIdentifier = htmlIdentifier;
    }



    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("HtmlContentBody { ").append('\n');
        if (htmlIdentifier != null) {
            sb.appendTab("htmlIdentifier=").append(htmlIdentifier).append("\n");
        }
//        if (htmlContentOperation != null) {
//            sb.append(htmlContentOperation);
//        }
        if (htmlElement != null) {
            sb.append(htmlElement);
        }
        if (objectExpression != null) {
            sb.append(objectExpression);
        }
        sb.appendTabCloseScope("}").append('\n');
        return sb.toString();
    }
}
