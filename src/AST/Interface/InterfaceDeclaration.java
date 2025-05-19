package AST.Interface;

import AST.CustomStringBuilder;
import AST.Interface.InterfaceBody;
import AST.Statement;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDeclaration implements Statement {
    private String export;
    private String interface_;
    private String identifier ;
    ArrayList<InterfaceBody> interfaceBody = new ArrayList<InterfaceBody>();

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public String getInterface_() {
        return interface_;
    }

    public void setInterface_(String interface_) {
        this.interface_ = interface_;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ArrayList<InterfaceBody> getInterfaceBody() {
        return interfaceBody;
    }

    public void setInterfaceBody(ArrayList<InterfaceBody> interfaceBody) {
        this.interfaceBody = interfaceBody;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("InterfaceDeclaration {\n");

        if (export != null) {
            sb.appendTab("exportKeyword=").append(export).append("\n");
        }

        sb.appendTab("interfaceKeyword=").append(interface_).append("\n")
                .appendTab("identifierName=").append(identifier).append("\n");

        if (interfaceBody != null && !interfaceBody.isEmpty()) {
            sb.append(interfaceBody);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
