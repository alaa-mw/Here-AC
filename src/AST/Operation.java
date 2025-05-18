package AST;

public class Operation {
    private String operator;

    public Operation() {}

    public Operation(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("{");

        if (operator != null) {
            sb.append("operator = ' ").append(operator);
        }

        sb.appendCloseScope("}\n");
        return sb.toString();
    }


}
