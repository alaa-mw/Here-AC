package SymbolTable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class SymbolTable {

    private Stack<Scope> scopeStack = new Stack<>();
    private Scope globalScope;

    public Scope getGlobalScope() {
        return globalScope;
    }

    public SymbolTable() {
        globalScope = new Scope("global-program");
//        globalScope.setType(global);
        scopeStack.push(globalScope);
    }

    public void enterScope(String name) {
        Scope newScope = new Scope(name);
        currentScope().addChild(newScope);
        scopeStack.push(newScope);
    }

    public void exitScope() {
        scopeStack.pop();
    }

    public void define(String name, String value, String type ,boolean isOptional) {
        currentScope().addSymbol(new Symbol(name, value, type,isOptional ));
    }

    public Scope currentScope() {
        return scopeStack.peek();
    }

    public void printToFile(String filePath) throws IOException {
        String output = "Symbol Table\n" + globalScope.toFormattedString("  ");
        Files.write(Paths.get(filePath), output.getBytes());
    }
}
