package AST.Routing;

import AST.CustomStringBuilder;
import AST.ForStmt.DeclareVarsKeyWord;
import AST.Statement;

import java.util.ArrayList;
import java.util.List;

public class RoutesDeclaration implements Statement {
    private String export;
    private DeclareVarsKeyWord declareVarsKeyWord ;
    private List<String> identifier = new ArrayList<>();
    private RouteArray routeArray ;

    public DeclareVarsKeyWord getDeclareVarsKeyWord() {
        return declareVarsKeyWord;
    }

    public void setDeclareVarsKeyWord(DeclareVarsKeyWord declareVarsKeyWord) {
        this.declareVarsKeyWord = declareVarsKeyWord;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public RouteArray getRouteArray() {
        return routeArray;
    }

    public void setRouteArray(RouteArray routeArray) {
        this.routeArray = routeArray;
    }

    public List<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<String> identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("RoutesDeclaration {").append("\n");
        if (export != null) {
            sb.appendTab("exportKeyword=").append(export).append("\n");
        }
        if (declareVarsKeyWord != null) {
            sb.append(declareVarsKeyWord);
        }
        if (identifier != null && !identifier.isEmpty()) {
            sb.appendTab(identifier).append("\n");
        }
        if (routeArray != null) {
            sb.append(routeArray);
        }
        sb.appendTabCloseScope("}").append("\n");

        return sb.toString();
    }
}
