package AST.Service;

import AST.Class.ClassDeclaration;
import AST.CustomStringBuilder;
import AST.Service.ServiceDeclaration;
import AST.Statement;

public class ServiceBlock implements Statement
{
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
        sb.appendTabOpenScope("ServiceBlock {\n");

        if (serviceDeclaration != null) {
            sb.append(serviceDeclaration);
        }

        if (classDeclaration != null) {
            sb.append(classDeclaration);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
