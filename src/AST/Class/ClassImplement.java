package AST.Class;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class ClassImplement {
    private String implements_;
    private List<String> interfaceNames = new ArrayList<>();

    public String getImplements_() {
        return implements_;
    }

    public void setImplements_(String implements_) {
        this.implements_ = implements_;
    }

    public List<String> getInterfaceNames() {
        return interfaceNames;
    }

    public void setInterfaceNames(List<String> interfaceNames) {
        this.interfaceNames = interfaceNames;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ClassImplement {");

        if (implements_ != null) {
            sb.appendTab("implements=").append(implements_).append("'\n");
        }

        if (interfaceNames != null && !interfaceNames.isEmpty()) {
            sb.appendTab(interfaceNames).append("\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
