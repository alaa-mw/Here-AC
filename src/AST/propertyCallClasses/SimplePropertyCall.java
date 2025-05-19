package AST.propertyCallClasses;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.*;

public class SimplePropertyCall implements PropertyCall{

    private String this_;
    private List<String>identifiers =new ArrayList<>();

    public String getThis_() {
        return this_;
    }

    public void setThis_(String this_) {
        this.this_ = this_;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public void addToIdentifiers(String prop) {
        this.identifiers.add(prop);
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("SimplePropertyCall {\n");

        if (this_ != null) {
            sb.appendTab("this_ = ").append(this_).append("\n");
        }

        if (identifiers != null && !identifiers.isEmpty()) {
            sb.appendTab("identifiers = [");
            for (String identifier : identifiers) {
                sb.append(identifier).append(", ");
            }
            sb.append("]\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }

}
