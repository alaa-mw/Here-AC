package AST;


import AST.Class.ClassDeclaration;
import AST.Component.ComponentDeclaration;

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
        sb.append("\n").appendTabOpenScope("ComponentBlock: {");

        if (componentDeclaration != null) {
            sb.appendTab("componentDeclaration: ").append(componentDeclaration).append("\n");
        }

        if (!classDeclarations.isEmpty()) {
            sb.appendTab("classDeclarations: [\n");
            for (ClassDeclaration decl : classDeclarations) {
                sb.appendTab(decl).append("\n");
            }
            sb.appendTab("]\n");
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
