package SemanticCheck;
import SymbolTable.*;
import SymbolTable.InterfaceMissing.Scope;
import SymbolTable.InterfaceMissing.Symbol;
import SymbolTable.InterfaceMissing.SymbolTable;

//import SymbolTable.ImportST;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SemanticError {

    public static Set<String> Errors = new LinkedHashSet<>();

    private SymbolTable symbolTable;

    public SemanticError() {
    }

    public SemanticError(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    //============================================== ReadPropertiesError

    //==============================================

    //============================================== interfaceMissing
    private final Set<String> visitedScopes = new HashSet<>();

    public void checkScope(Scope scope, int line) {
        if (visitedScopes.contains(scope.getName())) return;
        visitedScopes.add(scope.getName());

        Symbol implementsSymbol = scope.getSymbols().get("__implements__");
        if (implementsSymbol != null) {
            String[] interfaces = implementsSymbol.getValue().split(",");
            for (String interfaceName : interfaces) {
                Scope interfaceScope = findScopeByName(symbolTable.getGlobalScope(), interfaceName.trim());
                if (interfaceScope != null) {
                    for (Symbol member : interfaceScope.getSymbols().values()) {
                        if (member.isOptional()) continue;
                        if (!scope.getSymbols().containsKey(member.getName())) {
                            String errorMsg = String.format(
                                    "Class '%s' is missing member '%s' from interface '%s' at line %d",
                                    scope.getName(), member.getName(), interfaceName.trim(), line
                            );
                            Errors.add(errorMsg);
                        }
                    }
                }
            }
        }
    }
    private Scope findScopeByName(Scope scope, String name) {
        if (scope.getName().equals(name)) return scope;
        for (Scope child : scope.getChildren()) {
            Scope found = findScopeByName(child, name);
            if (found != null) return found;
        }
        return null;
    }

    //============================================== MissingImport

    MissingImportST importST = MissingImportST.getInstance();

    public  void missingComponentImports(int line){
        if (!(importST.containsSymbol("Component"))) {
            Errors.add("Error at line " + line + " : " + "Missed Component Import ");
        }
    }

    public  void missingServiceImports(int line){
        if (!(importST.containsSymbol("Injectable"))) {
            Errors.add("Error at line " + line + " : " + "Missed Service Import ");
        }
    }


    public void classImportNotFound() {
        List<Symbol> symbolTable = importST.getSymbolTable();
        Map<String, Integer> importArgClasses = new HashMap<>();
        Map<String, Integer> firstLineOccurrence = new HashMap<>();

        for (Symbol symbol : symbolTable) {
            if ("importArgClass".equals(symbol.getType())) {
                importArgClasses.put(symbol.getName(), 0);
                firstLineOccurrence.put(symbol.getName(), symbol.getLine());
            }
        }
        for (Symbol symbol : symbolTable) {
            String name = symbol.getName();
            if (importArgClasses.containsKey(name)) {
                importArgClasses.put(name, importArgClasses.get(name) + 1);

            }
        }
        for (Map.Entry<String, Integer> entry : importArgClasses.entrySet()) {
            if (entry.getValue() == 1) {
                int line = firstLineOccurrence.get(entry.getKey());
                Errors.add("Error at line " + line + " : " + "Missing Class (" + entry.getKey() + ") in imports Component Args");
            }
        }
    }

    public void checkHtmlBindingErrors(List<List<String>> htmlBindingsToValidate, MissedHTMLSymbolTable globalMissedHTMLSymbolTable) {
        for (List<String> identifiers : htmlBindingsToValidate) {
            String invalidBinding = globalMissedHTMLSymbolTable.isValidPath2(identifiers);
            if (!" ".equals(invalidBinding)) {
                Errors.add("Invalid HTML binding: " + invalidBinding);
//                System.out.println("🟥 Invalid HTML binding: " + invalidBinding);
            }
        }
    }

    public void checkClassBodyAttributes(String message){
        Errors.add(message);
    }

    public void errorResult() {
        try {
            FileWriter test = new FileWriter("src/result/semantic.txt");

            test.append("Semantic Check :\n");

            if (Errors.isEmpty()) {
                test.append("No Error Added\n");
            } else {
                for (String error : Errors) {
                    test.append(error).append("\n");
                }
            }

            test.flush();
            test.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}