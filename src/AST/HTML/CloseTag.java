package AST.HTML;

import AST.CustomStringBuilder;

public class CloseTag {

    private String closeTagName ;

    public String getCloseTagName() {
        return closeTagName;
    }

    public void setCloseTagName(String closeTagName) {
        this.closeTagName = closeTagName;
    }

    @Override
    public String toString() {

        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("closeTage{");
        if (closeTagName != null) {
            sb.append("Name=").append(closeTagName);
        }
        sb.appendCloseScope("}").append("\n");
        return sb.toString();
    }
}
