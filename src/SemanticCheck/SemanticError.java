package SemanticCheck;
import SymbolTable.*;

//import SymbolTable.ImportST;

import SymbolTable.PropertyDecST;
import SymbolTable.SymbolTable;

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

    static Map<String, PropertyDecST> PropertyDecSTHashMap = new HashMap<>();

    public Map<String, PropertyDecST> getPropertyDecSTHashMap() {
        return PropertyDecSTHashMap;
    }

    public void setPropertyDecSTHashMap(Map<String, PropertyDecST> propertyDecSTHashMap) {
        PropertyDecSTHashMap = propertyDecSTHashMap;
    }

    public void ReadProperties(String identifierCalled, int line) {

        // البحث عن المعرف الحالي في PropertyDecSTHashMap
        PropertyDecST propertyDec = PropertyDecSTHashMap.get(identifierCalled);

        // إذا وجدنا تعريف للخاصية وكان نوعها any
            if (propertyDec != null && propertyDec.getType().contains("any")) {
                // التحقق من قيمة null أو undefined
                String value = propertyDec.getValue() == null ? "undefined" :
                        ("null".equals(propertyDec.getValue()) ? "null" : propertyDec.getValue());

                if (value.contains("null") || value.contains("undefined")) {
                    String errorMsg = String.format(
                            "Cannot read properties of %s (reading '%s') at line %s. " ,
                            value ,identifierCalled, line
                    );
                    Errors.add(errorMsg);

                }
            }
    }
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
    //==============================================

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