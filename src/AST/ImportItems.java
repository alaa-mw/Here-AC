package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportItems {
    List<String> identifier=new ArrayList<>();

    public List<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<String> identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ImportItems {\n");

        if (identifier != null && !identifier.isEmpty()) {
//            for (String id : identifier) {
//                sb.appendTab(id).append("\n");
//            }
            sb.appendTab("identifier= ").append(identifier).append("\n");
        }

        sb.appendTabCloseScope("}");
        return sb.toString();
    }


}
