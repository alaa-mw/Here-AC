package AST;

import AST.Class.ClassDeclaration;
import AST.Component.ComponentBlock;
import AST.Import.ImportStatement;
import AST.Interface.InterfaceDeclaration;
import AST.Service.ServiceBlock;

import java.util.*;

/*public class Statement {
    private List<ImportStatement> importStatements;
    private List<ServiceBlock> serviceBlocks;
    private List<InterfaceDeclaration> interfaceDeclarations;
    private List<ClassDeclaration> classDeclarations;
    private List<PrintStatement> printStatements;
    private List<ComponentBlock> componentBlocks;

    public Statement() {
        this.importStatements = new ArrayList<>();
        this.serviceBlocks = new ArrayList<>();
        this.interfaceDeclarations = new ArrayList<>();
        this.classDeclarations = new ArrayList<>();
        this.printStatements = new ArrayList<>();
        this.componentBlocks = new ArrayList<>();
    }

    // Getters and Setters
    public List<ImportStatement> getImportStatements() {
        return importStatements;
    }

    public void setImportStatements(List<ImportStatement> importStatements) {
        this.importStatements = importStatements;
    }

    public List<ServiceBlock> getServiceBlocks() {
        return serviceBlocks;
    }

    public void setServiceBlocks(List<ServiceBlock> serviceBlocks) {
        this.serviceBlocks = serviceBlocks;
    }

    public List<InterfaceDeclaration> getInterfaceDeclarations() {
        return interfaceDeclarations;
    }

    public void setInterfaceDeclarations(List<InterfaceDeclaration> interfaceDeclarations) {
        this.interfaceDeclarations = interfaceDeclarations;
    }

    public List<ClassDeclaration> getClassDeclarations() {
        return classDeclarations;
    }

    public void setClassDeclarations(List<ClassDeclaration> classDeclarations) {
        this.classDeclarations = classDeclarations;
    }

    public List<PrintStatement> getPrintStatements() {
        return printStatements;
    }

    public void setPrintStatements(List<PrintStatement> printStatements) {
        this.printStatements = printStatements;
    }

    public List<ComponentBlock> getComponentBlocks() {
        return componentBlocks;
    }

    public void setComponentBlocks(List<ComponentBlock> componentBlocks) {
        this.componentBlocks = componentBlocks;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("Statement {\n");

        if (!importStatements.isEmpty()) {
            sb.append(importStatements).append("\n");
        }

        if (!serviceBlocks.isEmpty()) {
            sb.append(serviceBlocks).append("\n");
        }

        if (!interfaceDeclarations.isEmpty()) {
            sb.append(interfaceDeclarations).append("\n");
        }

        if (!classDeclarations.isEmpty()) {
            sb.append(classDeclarations).append("\n");
        }

        if (!printStatements.isEmpty()) {
            sb.append(printStatements).append("\n");
        }

        if (!componentBlocks.isEmpty()) {
            sb.append(componentBlocks).append("\n");
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}*/
public interface Statement{}


