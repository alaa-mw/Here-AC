package SymbolTable.ReadProperties;

import SymbolTable.InterfaceMissing.Scope;
import SymbolTable.InterfaceMissing.Symbol;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PropertySymbolTable {

    static Map<String, Property> propertyMap = new HashMap<>();

    public void newProperty(String name, ArrayList<String> type, String value) {
        Property newProperty = new Property(type,value);
        propertyMap.put(name,newProperty);
    }

    public static Map<String, Property> getPropertyMap() {
        return propertyMap;
    }

    public static void setPropertyMap(Map<String, Property> propertyMap) {
        PropertySymbolTable.propertyMap = propertyMap;
    }


    public void ReadProperties(String identifierCalled, int line) {

        // البحث عن المعرف الحالي في PropertyMap
        Property property = propertyMap.get(identifierCalled);

        // إذا وجدنا تعريف للخاصية وكان نوعها any
        if (property != null && property.getType().contains("any")) {
            // التحقق من قيمة null أو undefined
            String value = property.getValue() == null ? "undefined" :
                    ("null".equals(property.getValue()) ? "null" : property.getValue());

            if (value.contains("null") || value.contains("undefined")) {
                String errorMsg = String.format(
                        "Cannot read properties of %s (reading '%s') at line %s. ",
                        value, identifierCalled, line
                );
                throw new RuntimeException(errorMsg);

            }
        }
    }


    static public String print() {
        return "PropertySymbolTable{}"+ propertyMap;
    }
}
