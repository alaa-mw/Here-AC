package AST.Component;

import AST.CustomStringBuilder;

public class SelectorArg implements ComponentArguments {
    private String selector;
    private String stringLiteral;

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
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
        sb.appendTabOpenScope("SelectorArg {\n");

        if (selector != null) {
            sb.appendTab("selector = ").append(selector).append("\n");
        }
        if (stringLiteral != null) {
            sb.appendTab("stringLiteral = ").append(stringLiteral).append("\n");
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
