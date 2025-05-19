package AST.Constructor;

import AST.CommonStatement;
import AST.CustomStringBuilder;
/*
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
        sb.appendTabOpenScope("ConstructorBody {").append("\n");
        if (constructorBodyProperty != null) {
            sb.append(constructorBodyProperty);
        }
        if ( commonStatement != null) {
            sb.append(commonStatement);
            
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
*/
public interface ConstructorBody {
}