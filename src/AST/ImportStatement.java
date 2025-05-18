package AST;

public class ImportStatement {
    private String import_;
    private ImportItems importItems;
    private String from;
    private String stringLiteral;

    public String getImport_() {
        return import_;
    }

    public void setImport_(String import_) {
        this.import_ = import_;
    }

    public ImportItems getImportItems() {
        return importItems;
    }

    public void setImportItems(ImportItems importItems) {
        this.importItems = importItems;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ImportStatement {\n");

        if (import_ != null) {
            sb.appendTab("keyword= ").append(import_).append(",\n");
        }

        if (importItems != null) {
            sb.appendTab(importItems).append(",\n");
        }

        if (from != null) {
            sb.appendTab("from= ").append(from).append(",\n");
        }

        if (stringLiteral != null) {
            sb.appendTab("stringLiteral= '").append(stringLiteral).append("'\n");
        }

        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}

