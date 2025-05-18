package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List<Row> rows =new ArrayList<Row>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    // Method to print the symbol table with vertical lines between columns
    public void print() {
        int rowNumWidth = "RowNum".length(); // عرض عمود "RowNum"
        int nameWidth = "Name".length();
        int typeWidth = "Type".length();
        int scopeWidth = "Scope".length(); // عرض عمود "Scope"
        int valueWidth = "Value".length();

        // حساب العرض الأقصى لكل عمود بناءً على البيانات
        for (int i = 0; i < rows.size(); i++) {
            rowNumWidth = Math.max(rowNumWidth, Integer.toString(i + 1).length()); // عرض الرقم في العمود RowNum
            nameWidth = Math.max(nameWidth, rows.get(i).getName().length());
            typeWidth = Math.max(typeWidth, rows.get(i).getType().length());
            scopeWidth = Math.max(scopeWidth, (rows.get(i).getScope() != null ? rows.get(i).getScope().length() : 0)); // عرض القيمة في Scope
            valueWidth = Math.max(valueWidth, rows.get(i).getValue().length());
        }

        // طباعة الرأس مع العمود الجديد Scope
        System.out.printf("| %-"+(rowNumWidth)+"s | %-"+(nameWidth)+"s | %-"+(typeWidth)+"s | %-"+(scopeWidth)+"s | %-"+(valueWidth)+"s |%n", "RowNum", "Name", "Type", "Scope", "Value");

        // طباعة خط فاصل
        System.out.println("+" + "-".repeat(rowNumWidth + 2) + "+" + "-".repeat(nameWidth + 2) + "+" + "-".repeat(typeWidth + 2) + "+" + "-".repeat(scopeWidth + 2) + "+" + "-".repeat(valueWidth + 2) + "+");

        // طباعة الصفوف مع العمود الجديد Scope
        for (int i = 0; i < rows.size(); i++) {
            Row row = rows.get(i);
            System.out.printf("| %-"+(rowNumWidth)+"d | %-"+(nameWidth)+"s | %-"+(typeWidth)+"s | %-"+(scopeWidth)+"s | %-"+(valueWidth)+"s |%n",
                    i + 1,
                    row.getName(),
                    row.getType(),
                    (row.getScope() != null ? row.getScope() : ""), // استخدام القيمة إذا كانت موجودة، وإلا تركها فارغة
                    row.getValue()
            );
        }
    }


}





