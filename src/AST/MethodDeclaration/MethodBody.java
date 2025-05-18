package AST.MethodDeclaration;

import AST.CommonStatement;
import AST.CustomStringBuilder;
import AST.propertyCallClasses.PropertyCall;

public class MethodBody {
   private ReturnStatement returnStatement;
   private CommonStatement commonStatement;
   private MethodBodyProperty methodBodyProperty;
   private PropertyCall propertyCall;

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public CommonStatement getCommonStatement() {
        return commonStatement;
    }

    public void setCommonStatement(CommonStatement commonStatement) {
        this.commonStatement = commonStatement;
    }

    public MethodBodyProperty getMethodBodyProperty() {
        return methodBodyProperty;
    }

    public void setMethodBodyProperty(MethodBodyProperty methodBodyProperty) {
        this.methodBodyProperty = methodBodyProperty;
    }

    public PropertyCall getPropertyCall() {
        return propertyCall;
    }

    public void setPropertyCall(PropertyCall propertyCall) {
        this.propertyCall = propertyCall;
    }


    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("MethodBody {\n");
        if (returnStatement != null) {
            sb.appendTab(returnStatement).append("\n");
        }
        if (commonStatement != null) {
            sb.appendTab(commonStatement).append("\n");
        }
        if (methodBodyProperty != null) {
            sb.appendTab(methodBodyProperty).append("\n");
        }
        if (propertyCall != null) {
            sb.appendTab(propertyCall).append("\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
