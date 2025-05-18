package AST.ParameterList;

import AST.CustomStringBuilder;
import AST.DataType.DataType;

import java.util.ArrayList;

public class Parameter {
    private String identifier;
    private String question;
    private String keyOf;
    private DataType dataType;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getKeyOf() {
        return keyOf;
    }

    public void setKeyOf(String keyOf) {
        this.keyOf = keyOf;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("Parameter { \n")
                .appendTab("identifier=").append(identifier).append("\n");

        if (question != null) {
            sb.appendTab("question=").append(question).append("\n");
        }
        if (keyOf != null) {
            sb.appendTab("keyOf=").append(keyOf).append("\n");
        }
        if (dataType != null) {
            sb.append(dataType);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
