package AST.SwitchStmt;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class DefaultBlock {

    private String default_KeyWord ;
    private List<CaseStatement> caseStatementList = new ArrayList<>();
    private String break_KeyWord ;

    public String getBreak_KeyWord() {
        return break_KeyWord;
    }

    public void setBreak_KeyWord(String break_KeyWord) {
        this.break_KeyWord = break_KeyWord;
    }

    public String getDefault_KeyWord() {
        return default_KeyWord;
    }

    public void setDefault_KeyWord(String default_KeyWord) {
        this.default_KeyWord = default_KeyWord;
    }

    public List<CaseStatement> getCaseStatementList() {
        return caseStatementList;
    }

    public void setCaseStatementList(List<CaseStatement> caseStatementList) {
        this.caseStatementList = caseStatementList;
    }

    @Override
        public String toString() {
            CustomStringBuilder sb = new CustomStringBuilder();
            sb.appendTabOpenScope("DefaultBlock {\n");

            if (caseStatementList != null && !caseStatementList.isEmpty()) {
                sb.append(caseStatementList);
            }
            sb.appendTab("break_KeyWord=").append(break_KeyWord).append("\n");

            sb.appendTabCloseScope("}\n");
            return sb.toString();
        }

}
