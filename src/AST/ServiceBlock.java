package AST;

import AST.Class.ClassDeclaration;

public class ServiceBlock {
    private ServiceDeclaration serviceDeclaration;
    private ClassDeclaration classDeclaration;

    public ServiceBlock() {}

    public ServiceBlock(ServiceDeclaration serviceDeclaration, ClassDeclaration classDeclaration) {
        this.serviceDeclaration = serviceDeclaration;
        this.classDeclaration = classDeclaration;
    }

    public ServiceDeclaration getServiceDeclaration() {
        return serviceDeclaration;
    }

    public void setServiceDeclaration(ServiceDeclaration serviceDeclaration) {
        this.serviceDeclaration = serviceDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTab("ServiceBlock {\n");

        if (serviceDeclaration != null) {
            sb.appendTab(serviceDeclaration).append("\n");
        }

        if (classDeclaration != null) {
            sb.appendTab(classDeclaration).append("\n");
        }

        sb.appendTabCloseScope("}");
        return sb.toString();
    }

}
