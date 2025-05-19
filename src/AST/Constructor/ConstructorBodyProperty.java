package AST.Constructor;

import AST.CustomStringBuilder;
import AST.Method.MethodBodyProperty;
import AST.Property.ParameterPropertyAssignment;

/*
public class ConstructorBodyProperty implements ConstructorBody {
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
        sb.appendTabOpenScope("ConstructorBodyProperty {").append("\n");
        if (parameterPropertyAssignment != null) {
            sb.append(parameterPropertyAssignment);
        }
        if ( methodBodyProperty != null) {
            sb.append(methodBodyProperty);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
*/
public interface ConstructorBodyProperty {

}
