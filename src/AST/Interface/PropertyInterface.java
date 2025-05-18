package AST.Interface;

import AST.DataType.DataType;
import AST.CustomStringBuilder;

public class PropertyInterface extends InterfaceBody {
    private String readonly;
    private String question;
    private String identifier ;
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

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("PropertyInterface {\n");

        if (readonly != null) {
            sb.appendTab("readonlyKeyword=").append(readonly).append("\n");
        }

        if (question != null) {
            sb.appendTab("questionKeyword=").append(question).append("\n");
        }
        if (identifier!=null){

            sb.appendTab("identifierName=").append(identifier).append("\n");
        }
        if (dataType!=null){
                sb.append(dataType);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
