package AST.Class;

import AST.Constructor.ConstructorDeclaration;
import AST.CustomStringBuilder;
import AST.Method.MethodDeclaration;

public class ClassBody {
    private ClassPropertyDeclaration classPropertyDeclaration;
    private MethodDeclaration methodDeclaration;
    private ConstructorDeclaration constructorDeclaration;

    public ClassPropertyDeclaration getClassPropertyDeclaration() {
        return classPropertyDeclaration;
    }

    public void setClassPropertyDeclaration(ClassPropertyDeclaration classPropertyDeclaration) {
        this.classPropertyDeclaration = classPropertyDeclaration;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration = constructorDeclaration;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ClassBody {\n");

        if (classPropertyDeclaration != null) {
            sb.append(classPropertyDeclaration);
        }

        if (methodDeclaration != null) {
            sb.append(methodDeclaration);
        }

        if (constructorDeclaration != null) {
            sb.append(constructorDeclaration);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }



}
