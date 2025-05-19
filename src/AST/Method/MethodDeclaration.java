package AST.Method;

import AST.AccessModifiers;
import AST.Class.ClassBody;
import AST.Property.AssigmentToNull;
import AST.CustomStringBuilder;
import AST.ParameterList.ParameterList;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclaration implements ClassBody {
    private List<Decorator> decorator=new ArrayList<>();
    private List<AccessModifiers> accessModifiers=new ArrayList<>();
    private String async;
    private String static_;
    private String identifier;
    private ParameterList parameterList;
    private ReturnType returnType;
    private AssigmentToNull assigmentToNull;
    private ArrayList<MethodBody> methodBody = new ArrayList<>();

    public List<Decorator> getDecorator() {
        return decorator;
    }

    public void setDecorator(List<Decorator> decorator) {
        this.decorator = decorator;
    }

    public List<AccessModifiers> getAccessModifiers() {
        return accessModifiers;
    }

    public void setAccessModifiers(List<AccessModifiers> accessModifiers) {
        this.accessModifiers = accessModifiers;
    }

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public String getStatic_() {
        return static_;
    }

    public void setStatic_(String static_) {
        this.static_ = static_;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public ReturnType getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }

    public AssigmentToNull getAssigmentToNull() {
        return assigmentToNull;
    }

    public void setAssigmentToNull(AssigmentToNull assigmentToNull) {
        this.assigmentToNull = assigmentToNull;
    }

    public ArrayList<MethodBody> getMethodBody() {
        return methodBody;
    }

    public void setMethodBody(ArrayList<MethodBody> methodBody) {
        this.methodBody = methodBody;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("MethodDeclaration {").append("\n");

        if (decorator != null && !decorator.isEmpty()) {
            sb.append(decorator);
        }
        if (accessModifiers != null && !accessModifiers.isEmpty()) {
            sb.append(accessModifiers);
        }
        if (async != null) {
            sb.appendTab("async= ").append(async).append("\n");
        }
        if (static_ != null) {
            sb.appendTab("static_= ").append(static_).append("\n");
        }
        if (identifier != null) {
            sb.appendTab("identifier= ").append(identifier).append("\n");
        }
        if (parameterList != null ) {
            sb.append(parameterList);
        }
        if (returnType != null) {
            sb.append(returnType);
        }
        if (assigmentToNull != null) {
            sb.append(assigmentToNull);
        }
        if (methodBody != null && !methodBody.isEmpty()) {
            sb.append(methodBody);
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
