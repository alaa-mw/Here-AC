package Generation;

import AST.*;
import AST.CSS.*;
import AST.Class.ClassBody;
import AST.Class.ClassDeclaration;
import AST.Class.ClassHeritage;
import AST.Class.ClassPropertyDeclaration;
import AST.Component.*;
import AST.ConditionStmt.ConditionalStatement;
import AST.ConditionStmt.ElseIfStatement;
import AST.ConditionStmt.ElseStatement;
import AST.Constructor.*;
import AST.Expression.BinaryExpression;
import AST.Expression.Expression;
import AST.Expression.LiteralOrReferenceExpression;
import AST.Expression.ParentExpression;
import AST.HTML.*;
import AST.Interface.InterfaceDeclaration;
import AST.LiteralValueClasses.LiteralValue;
import AST.Method.MethodBody;
import AST.Method.MethodBodyProperty;
import AST.Method.MethodDeclaration;
import AST.ParameterList.Parameter;
import AST.ParameterList.ParameterList;
import AST.Property.LocalVariableDeclaration;
import AST.Property.ParameterPropertyAssignment;
import AST.Property.PropertyAssignment;
import AST.PropertyValueClasses.BinaryOperationPropertyValueExpr;
import AST.PropertyValueClasses.BracketedPropertyValueExpr;
import AST.PropertyValueClasses.PropertyValue;
import AST.PropertyValueClasses.ShortIfExpr;
import AST.PropertyValueObjects.*;
import AST.Service.ServiceBlock;
import AST.propertyCallClasses.PropertyCall;
import AST.propertyCallClasses.PropertyWithMethodCall;
import AST.propertyCallClasses.SimplePropertyCall;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static Generation.GenerationHelper.*;

public class Generation {
    private FileWriter index_fw;
    private FileWriter styles_fw;
    private FileWriter js_fw;
    private String currentSpace = "";

    /*
        شرح مهم:
       -componentMap:
           سيتم اعتمادها كبنية للتخزين.
           يمكن اضافة اي تابع في   ComponentModel class اذا احتجت.
           اذا كانت مهمتك التخزين خزن فيها حصرا.

            من الممكن احتياج شيء مخزن مسبقا لتكمل المعالجة لذا انشأت :
        -componentTempMap:
            تحوي النتيجة النهائية للتخزين.
            للقراءة فقط.
            سيتم حذفها عند تجميع الكود.

        -currentComponent:
           احتجت اليها عندما اردت التخزين.
           تعيين قيمتها مهمة من يمر على classDeclaration
     */

    private Map<String, ComponentModel> componentMap = new HashMap<>(); // for store

    Map<String, ComponentModel> componentTempMap = TempFiller.getComponentModels();

    String currentComponent = "ProductListComponent";
    public void generate(Program program) {
        System.out.println(componentTempMap);
        File dir = new File("src/Generation");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        try {
            index_fw = new FileWriter("src\\Generation\\output\\index.html");
            styles_fw = new FileWriter("src\\Generation\\output\\styles.css");
            js_fw = new FileWriter("src\\Generation\\output\\script.js");
            generateHeader();
            generateBody(program);
            generateScriptSection(program);
            generateFooter();

            index_fw.flush();
            index_fw.close();
            styles_fw.flush();
            styles_fw.close();
            js_fw.flush();
            js_fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generateHeader() throws IOException {
        index_fw.write("<!DOCTYPE html>\n");
        index_fw.write("<html>\n");
        index_fw.write("<head>\n");
        index_fw.write("<title>Angular Compiler Output</title>\n");
        index_fw.write("<link rel=\"stylesheet\" href=\"styles.css\"/>\n");
        index_fw.write("</head>\n");
    }

    private void generateBody(Program program) throws IOException {
        index_fw.write("<body>\n");

        currentSpace = "\t\t";
        for (Statement statement : program.getStatements()) {
            if (statement instanceof ComponentBlock) {
                generate((ComponentBlock) statement);
            }
        }
    }

    private void generateScriptSection(Program program) throws IOException {
//        js_fw.write("\n<script>\n");

        for (Statement statement : program.getStatements()) {
            if (statement instanceof ClassDeclaration) {
                generate((ClassDeclaration) statement);
            } else if (statement instanceof ServiceBlock) {
                generate((ServiceBlock) statement);
            } else if (statement instanceof InterfaceDeclaration) {
                generate((InterfaceDeclaration) statement);
            }
        }

//        js_fw.write("</script>\n");
    }

    private void generateFooter() throws IOException {
        index_fw.write("\n</body>\n");
        index_fw.write("<script src=\"script.js\"></script>4");
        index_fw.write("</html>\n");

        generateJsDomElements(); // alaa
    }

    // ======================= our code gen =============================
    private void generate(ComponentBlock componentBlock) throws IOException {
        generate(componentBlock.getComponentDeclaration()); // alaa

        for (ClassDeclaration classDeclaration : componentBlock.getClassDeclarations()) {
            generate(classDeclaration);
        }
    }

    private void generate(ComponentDeclaration componentDeclaration) throws IOException {
        for (ComponentArguments componentArguments : componentDeclaration.getComponentArguments()) {
            if (componentArguments instanceof Template) { // alaa
                generate((Template) componentArguments);
            }
            if (componentArguments instanceof Styles) {
                generate((Styles) componentArguments);
            }
        }
    }

    // HTML Generation Methods
    private void generate(Template template) throws IOException {
        generate(template.getHtmlDocument());
    }

    private void generate(HtmlDocument htmlDocument) throws IOException {
//        GenerationAnalysis gs = new GenerationAnalysis();
//        gs.analyzeTemplate(htmlDocument.getHtmlElement());
//        System.out.println("|||||||||||||||||||||||||\n" + gs.toString());
        for (HtmlElement htmlElement : htmlDocument.getHtmlElement()) {

            generate(htmlElement);
        }
    }

    private void generate(HtmlElement htmlElement) throws IOException {
        if (htmlElement.getSelfClosingTag() != null) {
            generate(htmlElement.getSelfClosingTag());
        } else {
             generate(htmlElement.getOpenTag());

            if(!hasNgFor(htmlElement)) {
                // توليد المحتوى الداخلي إذا لم يكن هناك ngFor
                if (htmlElement.getHtmlContentBody() != null) {
                    // Keep the same indentation for inner content
                    String savedSpace = currentSpace;
                    currentSpace += "\t";
                    for (HtmlContentBody htmlContentBody : htmlElement.getHtmlContentBody()) {
                        generate(htmlContentBody);
                    }
                    currentSpace = savedSpace;
                }
            }else{
                // هنا ترسل المحتوى إلى توليد جافاسكريبت (JS) بدلاً من توليد HTML
                generateJsInnerHtml(htmlElement);
            }
            generate(htmlElement.getCloseTag());
        }
    }

    // Generates an open tag, converting Angular attributes to standard HTML
    private void generate(OpenTag openTag) throws IOException {
        index_fw.write(currentSpace + "<" + openTag.getIdentifier());

        if (openTag.getHtmlAttributeArray() != null) {
            for (HtmlAttribute htmlAttribute : openTag.getHtmlAttributeArray()) {
                // Ignore Angular-specific directives like *ngFor and *ngIf
                if (htmlAttribute instanceof NgFor || htmlAttribute instanceof NgIF) {
                    // Do nothing, we handle dynamic content in JavaScript
                } else if (htmlAttribute instanceof BasicAttribute) {
                    generate((BasicAttribute) htmlAttribute);
                } else if (htmlAttribute instanceof ActionAttribute) {
                    // Convert Angular (click) to standard onclick
                    generate((ActionAttribute) htmlAttribute);
                } else if (htmlAttribute instanceof HtmlBinding) {
                    generate((HtmlBinding) htmlAttribute);
                } else {
                    // imageAttribute
                }
            }
        }
        index_fw.write(">\n");
    }

    // Generates a self-closing tag
    private void generate(SelfClosingTag selfClosingTag) throws IOException {
        index_fw.write(currentSpace + "<" + selfClosingTag.getIdentifier());

        for (HtmlAttribute htmlAttribute : selfClosingTag.getHtmlAttributes()) {
            if (htmlAttribute instanceof BasicAttribute) {
                generate((BasicAttribute) htmlAttribute);
            }
        }

        index_fw.write(" />\n");
    }

    // Generates a standard basic attribute
    private void generate(BasicAttribute basicAttribute) throws IOException {
        String key = basicAttribute.getIdentifier() != null ?
                basicAttribute.getIdentifier() :
                basicAttribute.getC_lass();
        String value= basicAttribute.getStringLiteral();
        String withoutQuotes = value.replace("\"", "");
        boolean ignore = false;
        switch(key) {
            case "routerLink":
                key = "href";
                value = withoutQuotes;
                break;
            case "routerLinkActive":
                ignore = true;
                break;
            default:
                value = withoutQuotes;
        }
        if(!ignore)
            index_fw.write(" " + key + "=\"" + value + "\"");

        // لو المفتاح id خزّن في idMap
        if ("id".equals(key)) {
            if(componentMap.get(currentComponent) == null)
                componentMap.put(currentComponent,new ComponentModel()); // note:  must be put before in class pass , delete later

            componentMap.get(currentComponent).getDomElements().add( // alaa - new
                    new DomElement(withoutQuotes.replaceAll("-", ""),withoutQuotes)
            );
        }

    }
    private void generate(ActionAttribute actionAttribute) throws IOException {
        //
    }
    // Generates a property binding like [src] or [routerLink]
    private void generate(HtmlBinding htmlBinding) throws IOException {

        if (htmlBinding instanceof PropertyBinding) {
            PropertyBinding binding = (PropertyBinding) htmlBinding;
            if ("src".equals(binding.getPropertyName())) {
            } else if ("routerLink".equals(binding.getPropertyName())) {
                index_fw.write(" href=\"#" + binding.getPropertyValue().replaceAll("'", "") + "\"");
            }
        } else if (htmlBinding instanceof EventBinding) {
            EventBinding binding = (EventBinding) htmlBinding;
            // Convert (click) to onclick and strip Angular's event object
            index_fw.write(" onclick=\"" + binding.getEventValue().replaceAll("\\$event, ", "") + "\"");
        } else if (htmlBinding instanceof TwoWayBinding) {
            TwoWayBinding binding = (TwoWayBinding) htmlBinding;
            index_fw.write(" value=\"" + binding.getValue().replaceAll("'", "") + "\"");
        }
    }

    // Generates a close tag
    private void generate(CloseTag closeTag) throws IOException {
        index_fw.write(currentSpace + "</" + closeTag.getCloseTagName() + ">\n");
    }

    // Generates the content inside an HTML tag
    private void generate(HtmlContentBody htmlContentBody) throws IOException {
        if (htmlContentBody.getHtmlIdentifier() != null) {
            index_fw.write( currentSpace + htmlContentBody.getHtmlIdentifier() );

        } else if (htmlContentBody.getHtmlElement() != null) {

            generate(htmlContentBody.getHtmlElement());

        } else if (htmlContentBody.getObjectExpression() != null) {
            // Correctly handle the {{ expression }} syntax
            generate(htmlContentBody.getObjectExpression());
        }
        index_fw.write("\n");
    }

    // Generates a template expression {{ expression }}
    private void generate(ObjectExpression objectExpression) throws IOException {
        PropertyValue propertyValueObjects = objectExpression.getPropertyValue();
        if (propertyValueObjects instanceof ObjectValue) {
            // Output the identifier as plain text
            index_fw.write(currentSpace+((ObjectValue) propertyValueObjects).getIdentifier());
        }
    }

    // ===================== CSS Generation Methods =====================
    private void generate(Styles styles) throws IOException {
        for (InlineStyle inlineStyle : styles.getInlineStyles()) {
            generate(inlineStyle);
        }
    }

    private void generate(InlineStyle inlineStyle) throws IOException {
        for (CssDocument cssDocument : inlineStyle.getCssDocument()) {
            generate(cssDocument);
        }
    }

    private void generate(CssDocument cssDocument) throws IOException {
        // Generate selectors
        for (int i = 0; i < cssDocument.getCssSelector().size(); i++) {
            generate(cssDocument.getCssSelector().get(i));
            if(i < cssDocument.getCssSelector().size()-1)
                styles_fw.write(", "); // if not last
        }
        // Generate rules block
        styles_fw.write(" {\n");
        for (CssRule rule : cssDocument.getCssRules()) {
            generate(rule);
        }
        styles_fw.write("}\n\n");

    }

    private void generate(CssSelector selector) throws IOException {
        for (int i = 0; i < selector.getSelectors().size(); i++) {
            int index = selector.getSymbol().indexOf(selector.getSelectors().get(i));
            String symbol = index > 0 ? selector.getSymbol().get(index-1) : "";
            if( symbol.equals(".") || symbol.equals(":") )
                styles_fw.write(symbol);
            else
                styles_fw.write(" ");
            styles_fw.write(selector.getSelectors().get(i));
        }
        // Generate attribute selectors
        for (AttributeSelector attrSel : selector.getAttributeSelectorList()) {
            generate(attrSel);
        }
    }

    private void generate(AttributeSelector attrSel) throws IOException {
        styles_fw.write("[" + attrSel.getAttributeSelectorName());
        if (attrSel.getAttributeSelectorValue() != null) {
            styles_fw.write("=" + attrSel.getAttributeSelectorValue());
        }
        styles_fw.write("]");
    }

    private void generate(CssRule rule) throws IOException {
        styles_fw.write("  " + rule.getIdentifier() + ": ");

        boolean firstValue = true;
        for (RuleValue value : rule.getRuleValues()) {
            if (!firstValue) {
                styles_fw.write(" ");
            }
            generate(value);
            firstValue = false;
        }

        styles_fw.write(";\n");
    }

    private void generate(RuleValue value) throws IOException {
        if (value.getIdentifier() != null) {
            styles_fw.write(value.getIdentifier());
        }
        else if (value.getNumericLiteralPx() != null) {
            styles_fw.write(value.getNumericLiteralPx() + "px");
        }
        else if (value.getNumericLiteralPrecentage() != null) {
            styles_fw.write(value.getNumericLiteralPrecentage() + "%");
        }
        else if (value.getColor() != null) {
            styles_fw.write(value.getColor());
        }
    }

    // ===================== JS Generation Methods =========================
    private void generate(ClassDeclaration cls) throws IOException {
        // Class declaration generation logic
        // Optional export
//        if (cls.getExport() != null) {
//            index_fw.write(cls.getExport() + " ");
//        }

        // Optional abstract
//        if (cls.getAbstract_() != null) {
//            index_fw.write(cls.getAbstract_() + " ");
//        }

        // 'class' keyword (always present)
        js_fw.write(cls.getClass_() + " ");

        // Class name (identifier)
        js_fw.write(cls.getIdentifier() + " ");

//        // Optional heritage (extends)
        if (cls.getClassHeritage() != null) {
            generate(cls.getClassHeritage()); // e.g., "extends MyBaseClass"
            js_fw.write(" ");
        }
//
//        // Optional implementation (implements)
//        if (cls.getClassImplement() != null) {
//            generate(cls.getClassImplement()); // e.g., "implements OnInit, OnDestroy"
//            index_fw.write(" ");
//        }

        // Open class block
        js_fw.write("{\n");

        // Generate class body
        for (ClassBody body : cls.getClassBody()) {
            generate(body); // You need a generate(ClassBody) method
            js_fw.write("\n");
        }

        // Close class block
        js_fw.write("}\n");
    }

    private void generate(ClassHeritage heritage) throws IOException {
        if (heritage.getSuperClassName() != null) {
            js_fw.write("extends " + heritage.getSuperClassName() + " ");
        }
    }

    private void generate(ClassBody body) throws IOException {
        if (body instanceof ClassPropertyDeclaration) {
            generate((ClassPropertyDeclaration) body);
        }
        else if (body instanceof ConstructorDeclaration) {
            generate((ConstructorDeclaration) body);
        } else if (body instanceof MethodDeclaration) {
            generate((MethodDeclaration) body);
        }
    }

    private void generate(ConstructorDeclaration cd) throws IOException {
        js_fw.write(cd.getConstructor() + "(");
        if(cd.getConstructorParams() != null){
            generate(cd.getConstructorParams());
        }
        js_fw.write( ") {");
        for (ConstructorBody cb : cd.getConstructorBody()){
            generate(cb);
        }
        js_fw.write( "}");
    }

    private void generate(ConstructorBody cb) throws IOException {
        if(cb instanceof ConstructorBodyProperty){
            generate((ConstructorBodyProperty) cb);
        }
        if(cb instanceof CommonStatement){
            generate((CommonStatement) cb);
        }

    }
    private void generate(ConstructorBodyProperty cp) throws IOException {
        if(cp instanceof ParameterPropertyAssignment){
            generate((ParameterPropertyAssignment) cp);
        }
        if(cp instanceof MethodBodyProperty){
            generate((MethodBodyProperty) cp);
        }
    }

    private void generate(ParameterPropertyAssignment ppa) throws IOException {

    }


    private void generate(ConstructorParams cp) throws IOException {
        List<ConstructorParam> parameters = cp.getConstructorParam();
        for (int i = 0; i < parameters.size(); i++) {
            js_fw.write(parameters.get(i).getConstructorParamName()); // your own method to generate a parameter
            if (i < parameters.size() - 1) {
                js_fw.write(","); // write comma between parameters
            }
        }
    }

    private void generate(ClassPropertyDeclaration prop) throws IOException {
        StringBuilder line = new StringBuilder("    ");

        // Access modifier (optional — JS doesn't use it, but you may include it for clarity)
//        if (prop.getAccessModifiers() != null) {
//            line.append(prop.getAccessModifiers().getModifier()).append(" ");
//        }

        // static
        if (prop.getStatic_() != null) {
            line.append("static ").append(" ");
        }

        // readonly — JS doesn't support directly, so can skip or leave a comment
        if (prop.getReadonly() != null) {
            // optional: simulate or comment
            // line.append("// readonly ");
        }

        // Property name
        if (prop.getIdentifier()!=null){
            line.append(prop.getIdentifier());
//            js_fw.write("localStorage.setItem(\""+prop.getIdentifier()+"\", JSON.stringify("+prop.getIdentifier()+"));");
            //localStorage.setItem("products", JSON.stringify(products));
        }

//         Assignment
        if (prop.getAssigment() != null) {
            line.append(" = ");
//            line.append(prop.getAssigment().getValue()); // assuming getValue() returns a JS expression as string
            line.append(generate(prop.getAssigment().getPropertyValue()));
        }

        // End with semicolon
        line.append(";");

        // Write to file
        js_fw.write(line.toString() + "\n");
    }

    private String generate(PropertyValue value) throws IOException {
        if (value == null) return "";

        if (value instanceof BinaryOperationPropertyValueExpr) {
           // return generate((BinaryOperationPropertyValueExpr) value); fix
        } else if (value instanceof BracketedPropertyValueExpr) {
            //return generate((BracketedPropertyValueExpr) value); fix
        } else if (value instanceof ShortIfExpr) {
            //return generate((ShortIfExpr) value);  fix
        }
        //  PropertyValueObjects interface extends from PropertyValueObjectExpr interface and there are 11 classes implement from PropertyValueObjects
        else if (value instanceof PropertyValueObjects) {
            return generate((PropertyValueObjects) value);
        }

        return "/* unsupported value */";
    }

    private String generate(PropertyValueObjects propertyValueObjects) throws IOException {
        //Method Call

        //LitrealValue // extends ✔

        //propertyCall extends // 1  -> propertyWithMethodCall ✔
        //   -> SimplePropertyCall ✔

        //ArrowFunction
        //IndexAccessValue
        //LIst ✔
        //ObjectValue //2
        //PostFix
        //PreFix
        // NewExpression
        //SpreadElementExpr


        if (propertyValueObjects instanceof PropertyWithMethodCall){
           return generate((PropertyWithMethodCall) propertyValueObjects);
        }
        if (propertyValueObjects instanceof SimplePropertyCall){
           return generate((SimplePropertyCall) propertyValueObjects);
        }
        if (propertyValueObjects instanceof MethodCall){
           return generate((MethodCall) propertyValueObjects);
        }
        // Literal values
        if (propertyValueObjects instanceof LiteralValue) {
            return generate((LiteralValue) propertyValueObjects);
        }
        if (propertyValueObjects instanceof ObjectValue) {
            return generate((ObjectValue) propertyValueObjects);
        }
        if (propertyValueObjects instanceof LIst) {
            return generate((LIst) propertyValueObjects);
        }
        return " ";
    }

    private String generate(LiteralValue literalValue) throws IOException{ // ✔
        if (literalValue == null || literalValue.getValue() == null) {
            return "";
        }
        return literalValue.getValue();
    }

    private String generate(PropertyWithMethodCall propertyWithMethodCall) throws IOException{ //✔
        StringBuilder sb = new StringBuilder();

        // Start with "this" if present
        if (propertyWithMethodCall.getThis_() != null) {
            sb.append(propertyWithMethodCall.getThis_());
        }

        // Append property identifiers (dot-separated)
        List<String> identifiers = propertyWithMethodCall.getIdentifiers();
        if (identifiers != null && !identifiers.isEmpty()) {
            for (String id : identifiers) {
                if (sb.length() > 0) {
                    sb.append(".");
                }
                sb.append(id);
            }
        }

        // Append method calls
        List<MethodCall> methodCalls = propertyWithMethodCall.getMethodCalls();
        if (methodCalls != null && !methodCalls.isEmpty()) {
            for (MethodCall methodCall : methodCalls) {
                sb.append(generate(methodCall)); // returns e.g. `.getName()`
            }
        }

        return sb.toString();
    }

    public String generate(SimplePropertyCall simplePropertyCall) throws IOException { //✔
        StringBuilder sb = new StringBuilder();

        // Start with "this" if present
        if (simplePropertyCall.getThis_() != null) {
            sb.append("this");
        }

        // Append each identifier as a property access
        for (String identifier : simplePropertyCall.getIdentifiers()) {
            sb.append(".").append(identifier);
        }

        // Write the line (ending with semicolon only if you're generating a statement)
        sb.append(";\n");

        return sb.toString();
    }

    public String generate(MethodCall methodCall) throws IOException { //✔
        StringBuilder sb = new StringBuilder();

        // Start with the method name
        sb.append(methodCall.getMethodCalledName());
        sb.append("(");

        // Generate arguments (if any)
        List<Expression> expressions = methodCall.getExpressions();
        for (int i = 0; i < expressions.size(); i++) {
            sb.append(generate(expressions.get(i))); // generate(Expression)
            if (i < expressions.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");

        List<String> chained = methodCall.getIdentifiers(); // from (DOT IDENTIFIER)*
        for (String id : chained) {
            sb.append(".").append(id);
        }
        return sb.toString();
    }

    private String generate(Expression expression) throws IOException {
        if (expression instanceof ParentExpression) {
            return generate((ParentExpression) expression);
        }
        if (expression instanceof LiteralOrReferenceExpression) {
            return generate((LiteralOrReferenceExpression) expression);
        }
        if (expression instanceof BinaryExpression) {
            return generate((BinaryExpression) expression);
        }
        return "";
    }

    private String generate(ParentExpression expr) throws IOException{
        return "(" + generate(expr.getInnerExpression()) + ")";
    }

    private String generate(LiteralOrReferenceExpression expr) throws IOException {
        if (expr.getPropertyValue() != null) {
            return generate(expr.getPropertyValue());
        }
        return "";
    }

    private String generate(BinaryExpression expr) throws IOException {
        List<Expression> expressions = expr.getExpressions();
        List<Operation> operations = expr.getOperations();

        if (expressions == null || expressions.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(generate(expressions.get(0))); // First expression

        for (int i = 1; i < expressions.size(); i++) {
            if (i - 1 < operations.size()) {
                sb.append(" ").append(generate(operations.get(i - 1))).append(" ");
            }
            sb.append(generate(expressions.get(i)));
        }

        return sb.toString();
    }

    private String generate(Operation operation) throws IOException {
        if (operation.getOperator() != null) {
            return operation.getOperator();
        }
        return "";
    }

    private String generate(ObjectValue objectValue) throws IOException{
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        List<ObjectProperty> properties = objectValue.getProperties();
        for (int i = 0; i < properties.size(); i++) {
            ObjectProperty prop = properties.get(i);

            if (prop instanceof SpreadObjectProperty) { // fix
                SpreadObjectProperty spreadProp = (SpreadObjectProperty) prop;
                SpreadElementExpr spreadElement = spreadProp.getSpreadElement();

                if (spreadElement != null) {
                    sb.append("...");
                    if (spreadElement.getIdentifier() != null) {
                        sb.append(spreadElement.getIdentifier());
                    } else if (spreadElement.getPropertyCall() != null) {
                        sb.append(generate((PropertyValueObjects) spreadElement.getPropertyCall())); // Assume it returns a string
                    }
                }
            } else if (prop instanceof NormalObjectProperty) {
                NormalObjectProperty normalObjectProperty = (NormalObjectProperty) prop;
                String key = normalObjectProperty.getIdentifier();
                PropertyValue value = normalObjectProperty.getValue();

                if (key != null && value != null) {
                    sb.append(key).append(": ");
                    sb.append(generate(value)); //  generate(PropertyValue)
                }
            }

            if (i < properties.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append("}");
        return sb.toString();
    }

    private String generate(LIst lIst) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        List<String> parts = new ArrayList<>();

        // Add regular elements
        for (PropertyValue element : lIst.getElements()) {
            parts.add(generate(element)); // assume you have generate(PropertyValue)
        }

        // Add spread elements
        for (SpreadElementExpr spread : lIst.getSpreadElements()) {
            parts.add("..." + generate(spread)); // assume you have generate(SpreadElementExpr)
        }

        sb.append(String.join(", ", parts));
        sb.append("]");
        return sb.toString();
    }

    // Method declaration
    private void generate(MethodDeclaration methodDeclaration) throws  IOException {
        if(methodDeclaration.getAsync() != null){
            js_fw.write(methodDeclaration.getAsync() + " ");
        }
        if(methodDeclaration.getStatic_() != null){
            js_fw.write(methodDeclaration.getStatic_() + " ");
        }
        js_fw.write(methodDeclaration.getIdentifier() );
        js_fw.write( "(");
        if(methodDeclaration.getParameterList() != null){
            generate(methodDeclaration.getParameterList());
        }
        js_fw.write(")");
        js_fw.write( "{");
        for(MethodBody methodBody : methodDeclaration.getMethodBody()){
            generate(methodBody);
        }
        js_fw.write("}");
    }

    private void  generate(ParameterList pl) throws IOException {
        // in Js there is no need for dataType so there is just identifier
        if (pl.getParameters() != null) {
            List<Parameter> parameters = pl.getParameters();
            for (int i = 0; i < parameters.size(); i++) {
                js_fw.write(parameters.get(i).getIdentifier()); // your own method to generate a parameter
                if (i < parameters.size() - 1) {
                    js_fw.write(","); // write comma between parameters
                }
            }
        }
        if (pl.getIdentifiers() != null) {
            List<String> identifiers = pl.getIdentifiers();
            for (int i = 0; i < identifiers.size(); i++) {
                js_fw.write(identifiers.get(i));
                if (i < identifiers.size() - 1) {
                    js_fw.write(",");
                }
            }
        } else {
            js_fw.write("");
            // Empty parameter list
        }


    }
    private void  generate(MethodBody mp) throws IOException {
        if (mp instanceof ReturnStatement) {
            generate((ReturnStatement) mp);
        }
        else if (mp instanceof CommonStatement) {
            generate((CommonStatement) mp);
        } else if (mp instanceof MethodBodyProperty) {
            generate((MethodBodyProperty) mp);
        } else if (mp instanceof PropertyCall) {
            generate(mp) ;
            js_fw.write(";");
        }
    }

    private void  generate(MethodBodyProperty methodP) throws IOException {
        if(methodP instanceof LocalVariableDeclaration){
            generate((LocalVariableDeclaration) methodP);
            js_fw.write(";");
        } else {
            generate((PropertyAssignment)methodP) ;
            js_fw.write(";");
        }
    }

    private void  generate(LocalVariableDeclaration lvd) throws IOException {
        String keyWord = "" ;
        if(lvd.getConst_() !=null){
            keyWord = lvd.getConst_();
        } else {
            keyWord = lvd.getLet();
        }
        js_fw.write(keyWord + lvd.getIdentifier());
        if (lvd.getAssigment() != null) {
            js_fw.write(" = ");
            js_fw.write(generate(lvd.getAssigment().getPropertyValue())+ ";");
        }

    }
    private void  generate(PropertyAssignment propertyAssignment) throws IOException {

    }

    private void  generate(ReturnStatement returnStatement) throws IOException {
        js_fw.write("return ");
        String exp = null;
        if(returnStatement.getExpression() != null){
            exp = generate(returnStatement.getExpression());
            js_fw.write(exp);
        }
        js_fw.write("; ");
    }
    private void  generate(CommonStatement cs) throws IOException {
//        : printStatement
//                | conditionalStatement
//                | switchStatement
//                | forStatement
//                | whileStatement
//                | doWhileStatement
//        ;
        if(cs instanceof ConditionalStatement){
            generate((ConditionalStatement) cs);
        }
    }
    private void  generate(ConditionalStatement conditionalS) throws IOException {
        js_fw.write("if (");
        generate(conditionalS.getExpression());
        js_fw.write(")");
        generate(conditionalS.getBlock());

        if(conditionalS.getElseIfStmt() != null){
            for(ElseIfStatement elseIfStatement : conditionalS.getElseIfStmt()){
                generate(elseIfStatement) ;
            }
        }
        if(conditionalS.getElseStatement() != null){
            generate(conditionalS.getElseStatement());
        }


    }
    private void  generate(Block block) throws IOException {

    }
    private void  generate(ElseIfStatement elseIfStatement) throws IOException {
        js_fw.write("else if (");
        generate(elseIfStatement.getExpression());
        js_fw.write(")");
        generate(elseIfStatement.getBlock());
    }
    private void  generate(ElseStatement elseStatement) throws IOException {
        js_fw.write("else ");
        generate(elseStatement.getBlock());
    }



    // ServiceBlock Section
    private void generate(ServiceBlock service) throws IOException {
        js_fw.write(currentSpace + "<!-- Service Block -->\n");
    }

    private void generate(InterfaceDeclaration iface) throws IOException {
        js_fw.write(currentSpace + "<!-- Interface Declaration: " + iface.getIdentifier() + " -->\n");
    }

    //=================== generate js (inner html) =========== // alaa
    private void generateJsInnerHtml(HtmlElement htmlElement) throws IOException {

        String idValue = getIdValueFromHtmlElement(htmlElement);
        String jsConst = componentMap.get(currentComponent).getConstFromId(idValue);
        String list = Objects.requireNonNull(splitNgFor(htmlElement))[3].replace("$","");
        String mapvar = "p";

        js_fw.write("function render"+idValue+"() {\n");
//        System.out.println("list= "+list);

        js_fw.write(jsConst+".innerHTML = state."+list+ ".map("+mapvar+"=>`\n"); // complete
        //gen inner html
        if (htmlElement.getHtmlContentBody() != null) {
            for (HtmlContentBody htmlContentBody : htmlElement.getHtmlContentBody()) {
                generateJs(htmlContentBody);
            }
        }
        //alaa
        js_fw.write("`).join('');\n");
        js_fw.write("}\n");
    }

    private void generateJs(HtmlElement htmlElement) throws IOException {
        js_fw.write("\n");
        if (htmlElement.getSelfClosingTag() != null) {
            generateJs(htmlElement.getSelfClosingTag()); //done
        } else {
            generateJs(htmlElement.getOpenTag());

            if (htmlElement.getHtmlContentBody() != null) {
                for (HtmlContentBody htmlContentBody : htmlElement.getHtmlContentBody()) {
                    generateJs(htmlContentBody);
                }
            }
            js_fw.write("\n");
            generateJs(htmlElement.getCloseTag());
        }
    }

    private void generateJs(OpenTag openTag) throws IOException {
        js_fw.write("<" + openTag.getIdentifier());

        if (openTag.getHtmlAttributeArray() != null) {
            for (HtmlAttribute htmlAttribute : openTag.getHtmlAttributeArray()) {
                if (htmlAttribute instanceof BasicAttribute ){
                    generateJs((BasicAttribute) htmlAttribute);
                } else if (htmlAttribute instanceof ObjectExpression ){
                    generateJs((ObjectExpression) htmlAttribute);
                } else if (htmlAttribute instanceof ActionAttribute) {
                  // no need
               }
            }
        }
        js_fw.write(">");
    }

    // Generates a self-closing tag
    private void generateJs(SelfClosingTag selfClosingTag) throws IOException {
        js_fw.write( "<" + selfClosingTag.getIdentifier());

        for (HtmlAttribute htmlAttribute : selfClosingTag.getHtmlAttributes()) {
           if (htmlAttribute instanceof ImageAttribute) {
                generateJs((ImageAttribute) htmlAttribute);
            }
        }

        js_fw.write(" />");
    }

    private void generateJs(ImageAttribute imageAttribute) throws IOException {
      js_fw.write(" " + imageAttribute.getImageSrc()+"="
                    +imageAttribute.getStringLiteral()); // stringLiteral need fix
    }

    // Generates a standard basic attribute
    private void generateJs(BasicAttribute basicAttribute) throws IOException {
        String key = basicAttribute.getIdentifier() != null ?
                basicAttribute.getIdentifier() :
                basicAttribute.getC_lass();
        String value= basicAttribute.getStringLiteral();
        String withoutQuotes = value.replace("\"", "");

        js_fw.write(" " + key + "=\"" + withoutQuotes + "\"");

    }
    private void generateJs(HtmlBinding htmlBinding) throws IOException {

    }

    // Generates a close tag
    private void generateJs(CloseTag closeTag) throws IOException {
        js_fw.write( "</" + closeTag.getCloseTagName() + ">");
    }
    private void generateJs(HtmlContentBody htmlContentBody) throws IOException {
        if (htmlContentBody.getHtmlIdentifier() != null) {
            js_fw.write( " " + htmlContentBody.getHtmlIdentifier() );

        } else if (htmlContentBody.getHtmlElement() != null) {
            generateJs(htmlContentBody.getHtmlElement());

        } else if (htmlContentBody.getObjectExpression() != null) {
            // Correctly handle the {{ expression }} syntax
            generateJs(htmlContentBody.getObjectExpression());
        }
    }

    private void generateJs(ObjectExpression objectExpression) throws IOException {
        PropertyValue propertyValue = objectExpression.getPropertyValue();
        if (propertyValue instanceof PropertyCall) {
            // Output the identifier as plain text
            js_fw.write("${");
            generateJs((PropertyCall)propertyValue);
            js_fw.write("}");
        }
    }
    private void generateJs(PropertyCall propertyCall) throws IOException {
        if (propertyCall instanceof SimplePropertyCall) {
            // handle "this" later
            for (String id: ((SimplePropertyCall) propertyCall).getIdentifiers()) {
                js_fw.write("."+id);
            }
        }else if(propertyCall instanceof MethodCall){
            // later
        }
    }
    private void generateJsDomElements() throws IOException {
        componentMap.forEach((key, component) -> { // alaa - new
            component.getDomElements().forEach(domElement -> {
                try {
                    js_fw.write("const " + domElement.getConstant() +
                            " = document.getElementById('" + domElement.getId() + "');\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            });
        });
    }

}