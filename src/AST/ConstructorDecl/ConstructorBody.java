package AST.ConstructorDecl;

import AST.CommonStatement;
import AST.CustomStringBuilder;

public class ConstructorBody {
    private ConstructorBodyProperty constructorBodyProperty ;
    private CommonStatement commonStatement ;

    public ConstructorBodyProperty getConstructorBodyProperty() {
        return constructorBodyProperty;
    }

    public void setConstructorBodyProperty(ConstructorBodyProperty constructorBodyProperty) {
        this.constructorBodyProperty = constructorBodyProperty;
    }

    public CommonStatement getCommonStatement() {
        return commonStatement;
    }

    public void setCommonStatement(CommonStatement commonStatement) {
        this.commonStatement = commonStatement;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendOpenScope("ConstructorBody{").append("\n");
        if (constructorBodyProperty != null) {
            sb.appendTabOpenScope("constructorBodyProperty = ").append(constructorBodyProperty).append("\n");
        } else if ( commonStatement != null) {
            sb.appendTabOpenScope("commonStatement = ").append(commonStatement).append("\n");
            
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
