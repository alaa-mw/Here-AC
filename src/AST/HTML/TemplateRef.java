package AST.HTML;

public class TemplateRef implements HtmlBinding{
private String refValue ;

    public String getRefValue() {
        return refValue;
    }

    public void setRefValue(String refValue) {
        this.refValue = refValue;
    }

    @Override
    public String toString() {
        return "TemplateRef{" +
                "refValue='" + refValue + '\'' +
                '}';
    }
}
