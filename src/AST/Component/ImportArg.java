package AST.Component;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class ImportArg implements ComponentArguments {
    private String imports;
    List<String> identifier = new ArrayList<>();

    @Override
    public String getNameAttribute(){
        return "imports";
    };
    public String getImports() {
        return imports;
    }

    public void setImports(String imports) {
        this.imports = imports;
    }

    public List<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<String> identifier) {
        this.identifier = identifier;
    }
    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ImportArg {\n");

        if (imports != null) {
            sb.appendTab("imports = ").append(imports).append("\n");
        }

        if (identifier != null && !identifier.isEmpty()) {
            sb.appendTab("identifier = ").append(identifier).append("\n");
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
