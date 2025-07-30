package AST.Routing;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class RouteObject {
    private List<RouteProperty> routePropertyList = new ArrayList<>();

    public List<RouteProperty> getRoutePropertyList() {
        return routePropertyList;
    }

    public void setRoutePropertyList(List<RouteProperty> routePropertyList) {
        this.routePropertyList = routePropertyList;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("RouteObject {\n");

        if ( routePropertyList != null && !routePropertyList.isEmpty()) {
            sb.append(routePropertyList);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
