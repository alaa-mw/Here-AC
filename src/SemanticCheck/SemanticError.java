package SemanticCheck;

//import SymbolTable.ImportST;

import SymbolTable.PropertyDecST;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SemanticError {

    public static List<String> Errors = new ArrayList<>();

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
    public void errorResult() {
        try {
            FileWriter test = new FileWriter("src/SemanticCheck/SemanticCheckResult.txt");

            test.append("Semantic Check : \n");
            if(Errors.isEmpty()){
                test.append("No Error Added");
            }
            for (int i = 0; i < Errors.size(); i++) {
                test.append(Errors.get(i)).append("\n");
            }
            test.flush();
            test.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}