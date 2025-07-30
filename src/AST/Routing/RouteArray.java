package AST.Routing;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class RouteArray {
private List<RouteObject> routeObjectList = new ArrayList<>();

    public List<RouteObject> getRouteObjectList() {
        return routeObjectList;
    }

    public void setRouteObjectList(List<RouteObject> routeObjectList) {
        this.routeObjectList = routeObjectList;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("RouteArray {\n");

        if ( routeObjectList != null && !routeObjectList.isEmpty()) {
            sb.append(routeObjectList);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
