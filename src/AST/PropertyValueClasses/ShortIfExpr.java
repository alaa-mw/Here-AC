package AST.PropertyValueClasses;

import AST.CustomStringBuilder;

public class ShortIfExpr implements PropertyValue {
    private PropertyValue condition;
    private PropertyValue trueBranch;
    private PropertyValue falseBranch;

    private String questionToken;
    private String dotDotToken;

    public PropertyValue getCondition() {
        return condition;
    }

    public void setCondition(PropertyValue condition) {
        this.condition = condition;
    }

    public PropertyValue getTrueBranch() {
        return trueBranch;
    }

    public void setTrueBranch(PropertyValue trueBranch) {
        this.trueBranch = trueBranch;
    }

    public PropertyValue getFalseBranch() {
        return falseBranch;
    }

    public void setFalseBranch(PropertyValue falseBranch) {
        this.falseBranch = falseBranch;
    }

    public String getQuestionToken() {
        return questionToken;
    }

    public void setQuestionToken(String questionToken) {
        this.questionToken = questionToken;
    }

    public String getDotDotToken() {
        return dotDotToken;
    }

    public void setDotDotToken(String dotDotToken) {
        this.dotDotToken = dotDotToken;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();

        sb.appendTabOpenScope("ShortIfExpr {\n");

        if (condition != null) {
            sb.appendTab("condition = \n ").append(condition);
        }
        if (trueBranch != null) {
            sb.appendTab("trueBranch = \n ").append(trueBranch);
        }
        if (falseBranch != null) {
            sb.appendTab("falseBranch = \n ").append(falseBranch);
        }
        if (questionToken != null) {
            sb.appendTab("questionToken = ").append(questionToken).append("\n");
        }
        if (dotDotToken != null) {
            sb.appendTab("dotDotToken = ").append(dotDotToken).append("\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
