package AST.Component_Declaration;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class ImportArg {
    private String imports;
    List<String> identifier = new ArrayList<>();

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
        sb.append("\n")
                .appendTab("imports=").append(imports).append("\n");
        if (identifier != null) {
            sb.appendTab("identifier=").append(identifier).append("\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
