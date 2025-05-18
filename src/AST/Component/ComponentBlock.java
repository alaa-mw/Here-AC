package AST.Component;


import AST.Class.ClassDeclaration;
import AST.Component.ComponentDeclaration;
import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class ComponentBlock {
    private ComponentDeclaration componentDeclaration;
    private List<ClassDeclaration> classDeclarations = new ArrayList<>();

    public ComponentDeclaration getComponentDeclaration() {
        return componentDeclaration;
    }

    public void setComponentDeclaration(ComponentDeclaration componentDeclaration) {
        this.componentDeclaration = componentDeclaration;
    }

    public List<ClassDeclaration> getClassDeclarations() {
        return classDeclarations;
    }

    public void setClassDeclarations(List<ClassDeclaration> classDeclarations) {
        this.classDeclarations = classDeclarations;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ComponentBlock: {\n");

        if (componentDeclaration != null) {
            sb.append(componentDeclaration);
        }

        if (classDeclarations != null && !classDeclarations.isEmpty()) {
            sb.append(classDeclarations);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
