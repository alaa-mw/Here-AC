package AST.Interface;

import AST.DataType.DataType;
import AST.CustomStringBuilder;
import AST.ParameterList.ParameterList;

public class FunctionInterface implements InterfaceBody {
    private String readonly ;
    private String question;
    private String identifier ;
    private ParameterList parameterList ;
    private DataType dataType ;

    public String getReadonly() {
        return readonly;
    }

    public void setReadonly(String readonly) {
        this.readonly = readonly;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
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
        sb.appendTabOpenScope("FunctionInterface {\n");

        if (readonly != null) {
            sb.appendTab("readonlyKeyword=").append(readonly).append("\n");
        }

        if (question != null) {
            sb.appendTab("questionKeyword=").append(question).append("\n");
        }

        sb.appendTab("identifierName=").append(identifier).append("\n");

        if (parameterList != null) {
            sb.append(parameterList);
        }

        if (dataType != null) {
            sb.append(dataType);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
