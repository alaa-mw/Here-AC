package AST;

import AST.ClassBody.ClassBody;

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
        sb.append("\n");
        if (export != null) {
            sb.appendTab("exportKeyword=").append(export).append("\n");
        }
        if (abstract_ != null) {
                sb.appendTab("abstractKeyword=").append(abstract_).append("\n");
        }
                sb.appendTab(", classKeyword=").append(class_).append("\n")
                .appendTab(", className=").append(identifier).append("\n");

        if (classHeritage != null) {
            sb.appendTab(", classHeritage=").append(classHeritage).append("\n");
        }
        if (classImplement != null) {
            sb.appendTab(", classImplement=").append(classImplement).append("\n");
        }
        if (classBody != null && !classBody.isEmpty()) {
            sb.appendTabOpenScope(", classBody{").append(classBody).append("\n");
            for (int i = 0; i < classBody.size(); i++) {
                ClassBody classBody1 = classBody.get(i);
                if (classBody1 != null) {
                    sb.append("'").append(classBody1).append("'");
                    if (i < classBody.size() - 1) {
                        sb.append(", ");
                    }
                }
            }
        }
        sb.appendTabCloseScope("}").append("\n");

        return sb.toString();
    }
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("ClassDeclaration {\n");
//
//        if (export != null) {
//            sb.append("  export: ").append(export).append(",\n");
//        }
//        if (abstract_ != null) {
//            sb.append("  abstract: ").append(abstract_).append(",\n");
//        }
//        if (class_ != null) {
//            sb.append("  class: ").append(class_).append(",\n");
//        }
//        if (identifier != null) {
//            sb.append("  identifier: ").append(identifier).append(",\n");
//        }
//        if (classHeritage != null) {
//            sb.append("  classHeritage: ").append(classHeritage).append(",\n");
//        }
//        if (classImplement != null) {
//            sb.append("  classImplement: ").append(classImplement).append(",\n");
//        }
//        if (!classBody.isEmpty()) {
//            sb.append("  classBodies: [\n");
//            for (ClassBody body : classBody) {
//                sb.append("    ").append(body).append(",\n");
//            }
//            sb.append("  ]\n");
//        }
//
//        sb.append("}");
//        return sb.toString();
//    }

}
