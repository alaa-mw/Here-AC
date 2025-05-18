package AST.Method;

import AST.CommonStatement;
import AST.CustomStringBuilder;
import AST.ReturnStatement;
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
            sb.append(returnStatement);
        }
        if (commonStatement != null) {
            sb.append(commonStatement);
        }
        if (methodBodyProperty != null) {
            sb.append(methodBodyProperty);
        }
        if (propertyCall != null) {
            sb.append(propertyCall);
        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
