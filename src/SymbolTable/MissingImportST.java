package SymbolTable;
import java.util.HashMap;
import java.util.Map;

public class MissingImportST {

    Map<String,Symbol>  SymbolTable = new HashMap<>();
    private static MissingImportST instance; // النسخة الوحيدة

    public Map<String, Symbol> getTable() {
        return SymbolTable;
    }

    public static MissingImportST getInstance() {
        if (instance == null) {
            instance = new MissingImportST();
        }
        return instance;
    }

    public void addSymbol(String name, String type, String value) {
     Symbol symbol = new Symbol();
     symbol.setType(type);
     symbol.setValue(value);
     SymbolTable.put(name, symbol);
    }

    public boolean containsSymbol(String name) {
     return SymbolTable.containsKey(name);
    }

    public boolean checkType(String name, String expectedType) {
     Symbol symbol = SymbolTable.get(name);
     if (symbol == null) {
      return false;
     }
     return symbol.getType().equals(expectedType);
    }

    public Symbol getSymbol(String name) {
     if (!SymbolTable.containsKey(name)) {
      System.out.println("Warning: Key " + name + "' not found in symbol table.");
      return null;
     }
     return SymbolTable.get(name);
    }

}
