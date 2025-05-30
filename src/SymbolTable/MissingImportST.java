package SymbolTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingImportST {

    List<Symbol> SymbolTable = new ArrayList<>();
    private static MissingImportST instance; // النسخة الوحيدة

    public List<Symbol> getSymbolTable() {
        return SymbolTable;
    }

    public void setSymbolTable(List<Symbol> symbolTable) {
        SymbolTable = symbolTable;
    }

    public static MissingImportST getInstance() {
        if (instance == null) {
            instance = new MissingImportST();
        }
        return instance;
    }

    public void addSymbol(String name, String type, String value,int line) {
        Symbol symbol = new Symbol();
        symbol.setName(name);
        symbol.setType(type);
        symbol.setValue(value);
        symbol.setLine(line);
        SymbolTable.add(symbol);
    }

    public boolean containsSymbol(String name) {
        for (Symbol symbol : SymbolTable) {
            if (symbol.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkType(String name, String expectedType) {
        for (Symbol symbol : SymbolTable) {
            if (symbol.getName().equals(name)) {
                return expectedType.equals(symbol.getType());
            }
        }
        return false;
    }

    public Symbol getSymbol(String name) {
        for (Symbol symbol : SymbolTable) {
            if (symbol.getName().equals(name)) {
                return symbol;
            }
        }
        System.out.println("Symbol '" + name + "' not found in symbol table.");
        return null;
    }

}
