package AST.Class;

import AST.CustomStringBuilder;

public class ClassHeritage {
    private String extends_;
    private String superClassName;

    public String getExtends_() {
        return extends_;
    }

    public void setExtends_(String extends_) {
        this.extends_ = extends_;
    }

    public String getSuperClassName() {
        return superClassName;
    }

    public void setSuperClassName(String superClassName) {
        this.superClassName = superClassName;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ClassHeritage {\n");

        if (extends_ != null) {
            sb.appendTab("extends: ").append(extends_).append("\n");
        }

        if (superClassName != null) {
            sb.appendTab("superClassName: ").append(superClassName).append("\n");
        }

        sb.appendTabCloseScope("}").append("\n");

        return sb.toString();
    }

}
