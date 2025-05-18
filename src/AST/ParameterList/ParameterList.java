package AST.ParameterList;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class ParameterList {
    private ArrayList<Parameter> parameters = new ArrayList<>();
    private ArrayList<String> identifiers = new ArrayList<>();

    public ArrayList<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Parameter> parameters) {
        this.parameters = parameters;
    }

    public ArrayList<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(ArrayList<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
        public String toString() {
            CustomStringBuilder sb = new CustomStringBuilder();
            sb.appendTabOpenScope("ParameterList {\n");

            if ( parameters != null && !parameters.isEmpty()) {
                sb.append(parameters);
            }

            if ( identifiers != null && !identifiers.isEmpty()) {
                sb.appendTab("").append(identifiers).appendTab("\n");
            }

            sb.appendTabCloseScope("}").append("\n");
            return sb.toString();
        }
}
