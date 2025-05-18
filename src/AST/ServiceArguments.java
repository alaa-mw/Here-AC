package AST;

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
//            for (Arg arg : arguments) {
//                sb.appendTab(arg).append("\n");
//            }
            sb.appendTab(arguments).append("\n");
        }

        sb.appendTabCloseScope("}");
        return sb.toString();
    }

}
