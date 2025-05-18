package AST;

import java.util.*;

public class ObjectValue {
    private String identifier;
    private List<ObjectProperty> properties = new ArrayList<>();


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<ObjectProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ObjectProperty> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ObjectValue {\n");

        if (identifier != null) {
            sb.appendTab("identifier = ").append(identifier).append("\n");
        }

        if (properties != null && !properties.isEmpty()) {
            sb.appendTab("[\n")
                .appendTab(properties).append("]\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
