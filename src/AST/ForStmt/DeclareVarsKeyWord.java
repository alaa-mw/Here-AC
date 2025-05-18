package AST.ForStmt;

import AST.CustomStringBuilder;

public class DeclareVarsKeyWord {
    private String var_KeyWord ;
    private String let_KeyWord ;
    private String const_KeyWord ;

    public String getConst_KeyWord() {
        return const_KeyWord;
    }

    public void setConst_KeyWord(String const_KeyWord) {
        this.const_KeyWord = const_KeyWord;
    }

    public String getVar_KeyWord() {
        return var_KeyWord;
    }

    public void setVar_KeyWord(String var_KeyWord) {
        this.var_KeyWord = var_KeyWord;
    }

    public String getLet_KeyWord() {
        return let_KeyWord;
    }

    public void setLet_KeyWord(String let_KeyWord) {
        this.let_KeyWord = let_KeyWord;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("DeclareVarsKeyWord {\n");

        if (var_KeyWord != null) {
            sb.appendTab("var_KeyWord = ").append(var_KeyWord).append("\n");
        }

        if (let_KeyWord != null) {
            sb.appendTab("let_KeyWord = ").append(let_KeyWord).append("\n");
        }

        if (const_KeyWord != null) {
            sb.appendTab("const_KeyWord = ").append(const_KeyWord).append("\n");
        }

        sb.appendCloseScope("}\n");
        return sb.toString();
    }

}
