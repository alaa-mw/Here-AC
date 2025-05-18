package AST.ClassBody;

import AST.Constructor.ConstructorDeclaration;
import AST.CustomStringBuilder;
import AST.MethodDeclaration.MethodDeclaration;

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
            sb.appendTab(classPropertyDeclaration.toString()).append("\n");
        }

        if (methodDeclaration != null) {
            sb.appendTab(methodDeclaration.toString()).append("\n");
        }

        if (constructorDeclaration != null) {
            sb.appendTab(constructorDeclaration.toString()).append("\n");
        }

        sb.appendTabCloseScope("}");
        return sb.toString();
    }



}
