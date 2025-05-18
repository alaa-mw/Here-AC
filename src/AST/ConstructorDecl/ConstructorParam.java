package AST.ConstructorDecl;

import AST.ClassBody.AccessModifiers;
import AST.CustomStringBuilder;
import AST.DataType.DataType;

public class ConstructorParam {
    private AccessModifiers accessModifiers ;
    private DataType dataType ;
    private String constructorParamName ;

    public AccessModifiers getAccessModifiers() {
        return accessModifiers;
    }

    public void setAccessModifiers(AccessModifiers accessModifiers) {
        this.accessModifiers = accessModifiers;
    }

    public String getConstructorParamName() {
        return constructorParamName;
    }

    public void setConstructorParamName(String constructorParamName) {
        this.constructorParamName = constructorParamName;
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
        sb.appendOpenScope("ConstructorParam{ ").append("\n");
        if (accessModifiers != null) {
            sb.appendTab("accessModifier = ").append(accessModifiers).append("\n");
        }
        sb.append("constructorParamName = ").append(constructorParamName).append(" , dataType ").append(dataType);
        sb.append("}").append("\n");
        return sb.toString();
    }
}
