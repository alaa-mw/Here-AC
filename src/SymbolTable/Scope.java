package SymbolTable;
import java.util.*;

public class Scope {
    private String name;
    private String type;
    private Map<String, Symbol> symbols = new LinkedHashMap<>();
    private List<Scope> children = new ArrayList<>();

    public Scope(String name) {
        this.name = name;
    }

    public void addSymbol(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public void addChild(Scope child) {
        children.add(child);
    }

    public String getName() {
        return name;
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }

    public List<Scope> getChildren() {
        return children;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toFormattedString(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append(type).append(name).append(" symbols: ").append(symbols.values()).append("{\n");
        for (Scope child : children) {
            sb.append(child.toFormattedString(indent + "  "));
        }
        sb.append(indent).append("}\n");
        return sb.toString();
    }
}
