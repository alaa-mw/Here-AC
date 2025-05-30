package SymbolTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissedHTMLSymbolTable {
    private Map<String, MissedHTMLSymbolTable> children = new HashMap<>();
    private String type; // e.g., "string", "number", or "object"


    public MissedHTMLSymbolTable(String type) {
        this.type = type;
    }

    public MissedHTMLSymbolTable() {

    }

    // Add a child property
    public void addChild(String name, MissedHTMLSymbolTable child) {
        children.put(name, child);
    }

    // Get a child property
    public MissedHTMLSymbolTable getChild(String name) {
        return children.get(name);
    }

    // Check if a property exists
    public boolean hasChild(String name) {
        return children.containsKey(name);
    }

    // Get the type (string, number, object, etc.)
    public String getType() {
        return type;
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }

    // Traverse path: e.g., "product.pro1.pro2.name1"
    public boolean isValidPath(String path) {
        String[] parts = path.split("\\.");
        MissedHTMLSymbolTable current = this;

        for (String part : parts) {
            if (!current.hasChild(part)) {
                return false;
            }
            current = current.getChild(part);
        }

        return true;
    }

    public String  isValidPath2(List<String> path) {
        MissedHTMLSymbolTable current = this;
        for (String identifier : path) {
            current = current.getChild2(identifier);
            if (current == null) {
                return identifier;
            }
        }
        return " ";
    }


    public MissedHTMLSymbolTable getChild2(String name) {
        return children.get(name); // assuming you have Map<String, MissedHTMLSymbolTable> children;
    }



    // Optional: get final MissedHTMLSymbolTable for a given path
    public MissedHTMLSymbolTable resolve(String path) {
        String[] parts = path.split("\\.");
        MissedHTMLSymbolTable current = this;

        for (String part : parts) {
            if (!current.hasChild(part)) return null;
            current = current.getChild(part);
        }

        return current;
    }

    public void print(String prefix) {
        for (Map.Entry<String, MissedHTMLSymbolTable> entry : children.entrySet()) {
            String name = entry.getKey();
            MissedHTMLSymbolTable child = entry.getValue();
            String typeInfo = child.getType() != null ? " (type: " + child.getType() + ")" : "";
            System.out.println(prefix + "- " + name + typeInfo);
            child.print(prefix + "  ");
        }
    }

}