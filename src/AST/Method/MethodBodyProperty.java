package AST.Method;

import AST.CustomStringBuilder;
import AST.Property.LocalVariableDeclaration;
import AST.Property.PropertyAssignment;

public class MethodBodyProperty {
   private LocalVariableDeclaration localVariableDeclaration ;
   private PropertyAssignment propertyAssignment;

    public LocalVariableDeclaration getLocalVariableDeclaration() {
        return localVariableDeclaration;
    }

    public void setLocalVariableDeclaration(LocalVariableDeclaration localVariableDeclaration) {
        this.localVariableDeclaration = localVariableDeclaration;
    }

    public PropertyAssignment getPropertyAssignment() {
        return propertyAssignment;
    }

    public void setPropertyAssignment(PropertyAssignment propertyAssignment) {
        this.propertyAssignment = propertyAssignment;
    }

    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("MethodBodyProperty {\n");
        if (localVariableDeclaration != null) {
            sb.append(localVariableDeclaration);
        }
        if (propertyAssignment != null) {
            sb.append(propertyAssignment);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
