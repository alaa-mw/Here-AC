package AST;

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
        sb.append("\n").appendTabOpenScope("ClassImplement {");

        if (implements_ != null) {
            sb.appendTab("implements: '").append(implements_).append("'\n");
        }

        if (interfaceNames != null && !interfaceNames.isEmpty()) {
            sb.appendTab("interfaces: [");
            for (int i = 0; i < interfaceNames.size(); i++) {
                String name = interfaceNames.get(i);
                if (name != null) {
                    sb.append("'").append(name).append("'");
                    if (i < interfaceNames.size() - 1) {
                        sb.append(", ");
                    }
                }
            }
            sb.append("]\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }


//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("ClassImplement {");
//
//            sb.append(" implements: '").append(implements_).append("'");
//
//        if (interfaceNames != null && !interfaceNames.isEmpty()) {
//            sb.append("interfaces: [");
//
//            for (int i = 0; i < interfaceNames.size(); i++) {
//                String name = interfaceNames.get(i);
//                if (name != null) {
//                    sb.append("'").append(name).append("'");
//                    if (i < interfaceNames.size() - 1) {
//                        sb.append(", ");
//                    }
//                }
//            }
//
//            sb.append("]");
//        }
//
//        sb.append(" }");
//        return sb.toString();
//    }


}
