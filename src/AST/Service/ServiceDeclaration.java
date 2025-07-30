package AST.Service;

import AST.CustomStringBuilder;

public class ServiceDeclaration {
    private String injectable;
    private ServiceArguments serviceArguments;

    public String getInjectable() {
        return injectable;
    }

    public void setInjectable(String injectable) {
        this.injectable = injectable;
    }

    public ServiceArguments getServiceArguments() {
        return serviceArguments;
    }

    public void setServiceArguments(ServiceArguments serviceArguments) {
        this.serviceArguments = serviceArguments;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ServiceDeclaration {\n");

        if (injectable != null) {
            sb.appendTab("injectable = ").append(injectable).append("\n");
        }

        if (serviceArguments != null) {
            sb.append(serviceArguments);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
