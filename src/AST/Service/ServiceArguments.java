package AST.Service;

import AST.CustomStringBuilder;

import java.util.*;

public class ServiceArguments {
    private List<Arg> arguments = new ArrayList<>();

    public List<Arg> getArguments() {
        return arguments;
    }

    public void setArguments(List<Arg> arguments) {
        this.arguments = arguments;
    }

    public void addArgument(Arg argument) {
        this.arguments.add(argument);
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ServiceArguments {\n");

        if (arguments != null && !arguments.isEmpty()) {
            sb.append(arguments);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
