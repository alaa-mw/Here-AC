package AST.Routing;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class RouteObject {
    private RouteProperty routeProperty ;

    public RouteProperty getRouteProperty() {
        return routeProperty;
    }

    public void setRouteProperty(RouteProperty routeProperty) {
        this.routeProperty = routeProperty;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("RouteObject {\n");

        if ( routeProperty != null) {
            sb.append(routeProperty);
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
