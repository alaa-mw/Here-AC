package AST.SwitchStmt;

import AST.CustomStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class CaseBlock {
    private String case_KeyWord ;
    private CaseValue caseValue ;
    private List<CaseStatement> caseStatementList = new ArrayList<>();
    private String break_KeyWord ;

    public String getBreak_KeyWord() {
        return break_KeyWord;
    }

    public void setBreak_KeyWord(String break_KeyWord) {
        this.break_KeyWord = break_KeyWord;
    }

    public List<CaseStatement> getCaseStatementList() {
        return caseStatementList;
    }

    public void setCaseStatementList(List<CaseStatement> caseStatementList) {
        this.caseStatementList = caseStatementList;
    }

    public String getCase_KeyWord() {
        return case_KeyWord;
    }

    public void setCase_KeyWord(String case_KeyWord) {
        this.case_KeyWord = case_KeyWord;
    }

    public CaseValue getCaseValue() {
        return caseValue;
    }

    public void setCaseValue(CaseValue caseValue) {
        this.caseValue = caseValue;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("CaseBlock {").append("\n")
                        .appendTab("case_Keyword=").append(case_KeyWord).append("\n")
                        .append(caseValue);

        if (caseStatementList != null && !caseStatementList.isEmpty()) {
            sb.append(caseStatementList);
        }
        sb.appendTab("break_Keyword=").append(break_KeyWord).append("\n");
        sb.appendTabCloseScope("}");

        return sb.toString();
    }
}
