package AST.SwitchStmt;

import AST.CustomStringBuilder;

public class CaseValue {
    private String stringCaseValue ;
    private int numericValue ;
    private String caseValue ;

    public String getCaseValue() {
        return caseValue;
    }

    public void setCaseValue(String caseValue) {
        this.caseValue = caseValue;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(int numericValue) {
        this.numericValue = numericValue;
    }

    public String getStringCaseValue() {
        return stringCaseValue;
    }

    public void setStringCaseValue(String stringCaseValue) {
        this.stringCaseValue = stringCaseValue;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("caseValue{");
        if(stringCaseValue != null){
            sb.append(stringCaseValue);
        } else if (caseValue != null ) {
            sb.append(caseValue);
        }else {
            sb.append(numericValue);
        }
        sb.append("}\n");
        return sb.toString();
    }
}
