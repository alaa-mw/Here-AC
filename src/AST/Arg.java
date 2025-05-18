package AST;

public class Arg {
    private String  providedIn;
    private  String stringLiteral;

    public String getProvidedIn() {
        return providedIn;
    }

    public void setProvidedIn(String providedIn) {
        this.providedIn = providedIn;
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
        sb.appendTabOpenScope("Arg {\n");

        if (providedIn != null) {
            sb.appendTab("providedIn = ").append(providedIn).append(",\n");
        }

        if (stringLiteral != null) {
            sb.appendTab("stringLiteral = '").append(stringLiteral).append("'\n");
        }

        sb.appendTabCloseScope("}");
        return sb.toString();
    }

}
