package AST;

import AST.LiteralValueClasses.LiteralValue;
import AST.propertyCallClasses.PropertyCall;

public class PropertyValueObjects {

    private LiteralValue literalValue;
    private ObjectValue objectValue;
    private LIst list;
    private IndexAccessValue indexAccessValue ;
    private PropertyCall propertyCall ;
    private MethodCall methodCall;
    private ArrowFunction arrowFunction;
    private PostFix postFix;
    private PreFix preFix;

    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }

    public ObjectValue getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(ObjectValue objectValue) {
        this.objectValue = objectValue;
    }

    public LIst getList() {
        return list;
    }

    public void setList(LIst list) {
        this.list = list;
    }

    public IndexAccessValue getIndexAccessValue() {
        return indexAccessValue;
    }

    public void setIndexAccessValue(IndexAccessValue indexAccessValue) {
        this.indexAccessValue = indexAccessValue;
    }

    public PropertyCall getPropertyCall() {
        return propertyCall;
    }

    public void setPropertyCall(PropertyCall propertyCall) {
        this.propertyCall = propertyCall;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }

    public void setMethodCall(MethodCall methodCall) {
        this.methodCall = methodCall;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public PostFix getPostFix() {
        return postFix;
    }

    public void setPostFix(PostFix postFix) {
        this.postFix = postFix;
    }

    public PreFix getPreFix() {
        return preFix;
    }

    public void setPreFix(PreFix preFix) {
        this.preFix = preFix;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope(" PropertyValueObjects {\n");

        if (literalValue != null) {
            sb.appendTab(literalValue).append("\n");
        }
        if (objectValue != null) {
            sb.appendTab(objectValue).append("\n");
        }
        if (list != null) {
            sb.appendTab(list).append("\n");
        }
        if (indexAccessValue != null) {
            sb.appendTab(indexAccessValue).append("\n");
        }
        if (propertyCall != null) {
            sb.appendTab(propertyCall).append("\n");
        }
        if (methodCall != null) {
            sb.appendTab(methodCall).append("\n");
        }
        if (arrowFunction != null) {
            sb.appendTab(arrowFunction).append("\n");
        }
        if (postFix != null) {
            sb.appendTab(postFix).append("\n");
        }
        if (preFix != null) {
            sb.appendTab(preFix).append("\n");
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
