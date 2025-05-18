package AST.Component;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class ComponentDeclaration
{
    private String component;
    private List<ComponentArguments> componentArguments=new ArrayList<>();

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }


    public List<ComponentArguments> getComponentArguments() {
        return this.componentArguments;
    }

    public void setComponentArguments(List<ComponentArguments> componentArguments) {
        this.componentArguments = componentArguments;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ComponentDeclaration {\n");

        if (component != null) {
            sb.appendTab("component = ").append(component).append("\n");
        }

        if (componentArguments != null && !componentArguments.isEmpty()) {
            sb.append(componentArguments);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
