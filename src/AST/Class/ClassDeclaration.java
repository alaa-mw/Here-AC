package AST.Class;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration {
    private String export;
    private String abstract_;
    private String class_;
    private String identifier ;
    private ClassHeritage classHeritage;
    private ClassImplement classImplement;
    private List<ClassBody> classBody = new ArrayList<>();

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public String getAbstract_() {
        return abstract_;
    }

    public void setAbstract_(String abstract_) {
        this.abstract_ = abstract_;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public ClassHeritage getClassHeritage() {
        return classHeritage;
    }

    public void setClassHeritage(ClassHeritage classHeritage) {
        this.classHeritage = classHeritage;
    }

    public ClassImplement getClassImplement() {
        return classImplement;
    }

    public void setClassImplement(ClassImplement classImplement) {
        this.classImplement = classImplement;
    }

    public List<ClassBody> getClassBodies() {
        return classBody;
    }

    public void setClassBodies(List<ClassBody> classBodies) {
        this.classBody = classBodies;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ClassDeclaration {").append("\n");
        if (export != null) {
            sb.appendTab("exportKeyword=").append(export).append("\n");
        }
        if (abstract_ != null) {
                sb.appendTab("abstractKeyword=").append(abstract_).append("\n");
        }
                sb.appendTab(", classKeyword=").append(class_).append("\n")
                .appendTab(", className=").append(identifier).append("\n");

        if (classHeritage != null) {
            sb.append(classHeritage);
        }
        if (classImplement != null) {
            sb.append(classImplement);
        }
        if (classBody != null && !classBody.isEmpty()) {
            sb.append(classBody);
        }
        sb.appendTabCloseScope("}").append("\n");

        return sb.toString();
    }

}
