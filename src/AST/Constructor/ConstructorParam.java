package AST.Constructor;

import AST.AccessModifiers;
import AST.CustomStringBuilder;
import AST.DataType.DataType;

public class ConstructorParam {
    private AccessModifiers accessModifiers ;
    private String constructorParamName ;
    private DataType dataType ;

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
        sb.appendTabOpenScope("ConstructorParam{ ").append("\n");

        if (accessModifiers != null) {
            sb.append(accessModifiers);
        }
        sb.appendTab("constructorParamName = ").append(constructorParamName).append("\n");
        sb.append(dataType);

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
