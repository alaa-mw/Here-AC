package AST;

public class CustomStringBuilder {
    private StringBuilder sb;

    private static int indentLevel = 0;

    public CustomStringBuilder() {
        sb = new StringBuilder();
    }
    public <T> CustomStringBuilder append(T content) {
        sb.append(content);
        return this;
    }
    public <T> CustomStringBuilder appendTab(T content) {

        for (int i = 0; i < indentLevel; i++) {
            sb.append("\t");
        }
        sb.append(content);
        return this;
    }

    public <T> CustomStringBuilder appendTabOpenScope(T content) {

        for (int i = 0; i < indentLevel; i++) {
            sb.append("\t");
        }
        sb.append(content);
        indentLevel++;
        return this;
    }

//    public <T> CustomStringBuilder appendOpenScope(T content) {
//        sb.append(content);
//        indentLevel++;
//        return this;
//    }

    public <T> CustomStringBuilder appendTabCloseScope(T content) {
        indentLevel--;
        for (int i = 0; i < indentLevel; i++) {
            sb.append("\t");
        }
        sb.append(content);
        return this;
    }
    public <T> CustomStringBuilder appendCloseScope(T content) {
        sb.append(content);
        indentLevel--;
        return this;
    }

    @Override
    public String toString() {
        return sb.toString();
    }

}
