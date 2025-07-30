package AST.Routing;

import AST.CustomStringBuilder;

public class RouteProperty {
    private String path ;
    private String pathValue ;
    private String componentKeyWord ;
    private String componentClassName ;

    public String getComponentClassName() {
        return componentClassName;
    }

    public void setComponentClassName(String componentClassName) {
        this.componentClassName = componentClassName;
    }

    public String getComponentKeyWord() {
        return componentKeyWord;
    }

    public void setComponentKeyWord(String componentKeyWord) {
        this.componentKeyWord = componentKeyWord;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPathValue() {
        return pathValue;
    }

    public void setPathValue(String pathValue) {
        this.pathValue = pathValue;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("RouteProperty {").append("\n");
        if (path != null) {
            sb.appendTab("pathKeyWord=").append(path).append(" ");
        }
        if (pathValue != null) {
            sb.append("pathValue=").append(pathValue).append("\n");
        }
        if (componentKeyWord != null) {
            sb.appendTab("componentKeyWord=").append(componentKeyWord).append(" ");
        }
        if (componentClassName != null) {
            sb.append("componentClassName=").append(componentClassName).append("\n");
        }

        sb.appendTabCloseScope("}").append("\n");

        return sb.toString();
    }
}
