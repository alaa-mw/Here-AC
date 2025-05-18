package AST.ConstructorDecl;

import AST.CustomStringBuilder;
import AST.MethodDeclaration.MethodBodyProperty;

public class ConstructorBodyProperty {
    private ParameterPropertyAssignment parameterPropertyAssignment ;
    private MethodBodyProperty methodBodyProperty ;

    public MethodBodyProperty getMethodBodyProperty() {
        return methodBodyProperty;
    }

    public void setMethodBodyProperty(MethodBodyProperty methodBodyProperty) {
        this.methodBodyProperty = methodBodyProperty;
    }

    public ParameterPropertyAssignment getParameterPropertyAssignment() {
        return parameterPropertyAssignment;
    }

    public void setParameterPropertyAssignment(ParameterPropertyAssignment parameterPropertyAssignment) {
        this.parameterPropertyAssignment = parameterPropertyAssignment;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendOpenScope("ConstructorBodyProperty{").append("\n");
        if (parameterPropertyAssignment != null) {
            sb.appendOpenScope("parameterPropertyAssignment = ").append(parameterPropertyAssignment).append("\n");
        } else if ( methodBodyProperty != null) {
            sb.appendOpenScope("methodBodyProperty = ").append(methodBodyProperty).append("\n");

        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}

