package AST.Component_Declaration;

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


    public List<ComponentArguments> getComponentArguments(ComponentArguments componentArguments) {
        return this.componentArguments;
    }

    public void setComponentArguments(List<ComponentArguments> componentArguments) {
        this.componentArguments = componentArguments;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.append("\n")
                .appendTab("component=").append(component).append("\n");

        if (componentArguments != null) {
            sb.appendTab("componentArguments=").append(componentArguments).append("\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
