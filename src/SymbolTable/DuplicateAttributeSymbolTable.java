package SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class DuplicateAttributeSymbolTable {
    private Map<String, Map<String, Symbol>> table = new HashMap<>();

    public boolean declare(String scope, String name, Symbol symbol) {
        table.putIfAbsent(scope, new HashMap<>());
        Map<String, Symbol> scopeSymbols = table.get(scope);
        if (scopeSymbols.containsKey(name)) {
            return false;
        }
        scopeSymbols.put(name, symbol);
        return true;
    }

    public Map<String, Symbol> getScope(String scope) {
        return table.get(scope);
    }
    /*
    public void printTable() {
        for (var scope : table.entrySet()) {
            System.out.println("MissedHTMLSymbolTable: " + scope.getKey());
            for (var entry : scope.getValue().entrySet()) {
                System.out.println("  " + entry.getValue());
            }
        }
    }*/
    public void printTable() {
        System.out.println("====================================================================");
        System.out.printf("| %-15s | %-15s | %-10s | %-15s |\n", "Name", "Type", "Value", "MissedHTMLSymbolTable");
        System.out.println("====================================================================");

        for (var scope : table.entrySet()) {
            String scopeName = scope.getKey();
            for (var entry : scope.getValue().entrySet()) {
                Symbol symbol = entry.getValue();
                String name = symbol.getName();
                String type = symbol.getType();
                String value = symbol.getValue() != null ? symbol.getValue() : "null";
                String scopeLabel = scopeName != null ? scopeName : "null";

                System.out.printf("| %-15s | %-15s | %-10s | %-15s |\n", name, type, value, scopeLabel);
            }
        }

        System.out.println("====================================================================");
    }

}

