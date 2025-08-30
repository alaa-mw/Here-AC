package SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissedHTMLSymbolTable {
    private Map<String, MissedHTMLSymbolTable> children = new HashMap<>();

    private Map<String, List<String>> children2 = new HashMap<>();
    private String type; // e.g., "string", "number", or "object"


    public MissedHTMLSymbolTable(String type) {
        this.type = type;
    }

    public MissedHTMLSymbolTable() {

    }

    // Add a child property
//    public void addChild(String name, MissedHTMLSymbolTable child) {
//        children.put(name, child);
//    }
    public void addChild(String name, MissedHTMLSymbolTable child) {
        if (!children.containsKey(name)) {
            children.put(name, child);
        }
    }

    public void addChildto2(String name, String s) {
        // Get the list for this key, or create it if it doesn't exist
        List<String> list = children2.get(name);
        if (list == null) {
            list = new ArrayList<>();
            children2.put(name, list);
        }
        list.add(s);
    }

    public List<String> getListFromKey(String key) {
        return children2.get(key);
    }
    public void addKey(String name) {
        children2.put(name, new ArrayList<>());
    }

    public void addListToKey(String key, List<String> newList) {

        children2.computeIfAbsent(key, k -> new ArrayList<>()).addAll(newList);
    }
    public Map<String, List<String>> getChildren2() {
        return children2;
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
//        int j=0;
//
//        if (path.size()>1){
//            j=1;
////            current=current.getChild2(path.get(0));
//        }
//        for ( ; j <path.size() ; j++) {
//
//            current=current.getChild2(path.get(j-1));
//            if (current == null) {
////                System.out.println("i:"+i+"\n\n\n\n\n\n");
//                return path.get(j);
//            }
//        }
//        return " ";
        System.out.println("\n\n\n\n\n\n");
//            printMap();
//        System.out.println("list");
//        System.out.println(path);
        System.out.println("\n\n\n\n\n\n");

        for (String identifier : path) {
            current = current.getChild2(identifier);
            if (current == null) {
//                System.out.println("i:"+i+"\n\n\n\n\n\n");
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

    // Print children map as key -> type
    public void printMap() {
        for (Map.Entry<String, MissedHTMLSymbolTable> entry : children.entrySet()) {
            String key = entry.getKey();
            String typeInfo = entry.getValue().getType() != null
                    ? entry.getValue().getType()
                    : "null";
            System.out.println(key + " -> " + typeInfo);
        }
    }
    public void printChildren2() {
        for (Map.Entry<String, List<String>> entry : children2.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println(key + " -> " + values);
        }
    }


}