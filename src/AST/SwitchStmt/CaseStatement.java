package AST.SwitchStmt;

import AST.*;
import AST.ConditionStmt.ConditionalStatement;
import AST.ReturnStatement;
import AST.Property.BlockProperty;
import AST.propertyCallClasses.PropertyCall;

public class CaseStatement {
    private BlockProperty blockProperty ;
    private MethodCall methodCall ;
    private ReturnStatement returnStatement ;
    private ConditionalStatement conditionStatement ;
    private PropertyCall propertyCall ;
    private SwitchStatement switchStatement ;

    public BlockProperty getBlockProperty() {
        return blockProperty;
    }

    public void setBlockProperty(BlockProperty blockProperty) {
        this.blockProperty = blockProperty;
    }

    public ConditionalStatement getConditionStatement() {
        return conditionStatement;
    }

    public void setConditionStatement(ConditionalStatement conditionStatement) {
        this.conditionStatement = conditionStatement;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }

    public void setMethodCall(MethodCall methodCall) {
        this.methodCall = methodCall;
    }

    public PropertyCall getPropertyCall() {
        return propertyCall;
    }

    public void setPropertyCall(PropertyCall propertyCall) {
        this.propertyCall = propertyCall;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public SwitchStatement getSwitchStatement() {
        return switchStatement;
    }

    public void setSwitchStatement(SwitchStatement switchStatement) {
        this.switchStatement = switchStatement;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("CaseStatement {").append("\n");
        if(blockProperty != null){
            sb.append(blockProperty);
        }
        else if(methodCall != null){
            sb.append(methodCall);
        }
        else if(returnStatement != null){
            sb.append(returnStatement);
        }
        else if(conditionStatement != null){
            sb.append(conditionStatement);
        }
        else if(propertyCall != null){
            sb.append(propertyCall);
        }
        else if(switchStatement != null){
            sb.append(switchStatement);
        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
