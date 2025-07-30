package Visitor;

import AST.*;
import AST.CSS.*;
import AST.Class.*;
import AST.Component.*;
import AST.ConditionStmt.ConditionalStatement;
import AST.ConditionStmt.ElseIfStatement;
import AST.ConditionStmt.ElseStatement;
import AST.Constructor.*;
import AST.Expression.BinaryExpression;
import AST.Expression.Expression;
import AST.Expression.LiteralOrReferenceExpression;
import AST.Expression.ParentExpression;
import AST.ForStmt.*;
import AST.HTML.*;
import AST.Import.ImportItems;
import AST.Import.ImportStatement;
import AST.LiteralValueClasses.LiteralExpr;
import AST.LiteralValueClasses.SymbolExpr;
import AST.LiteralValueClasses.ValueExpr;
import AST.Method.MethodBody;
import AST.PrintStatement;
import AST.PropertyValueObjects.*;
import AST.ReturnStatement;
import AST.Method.ReturnType;
import AST.ParameterList.Parameter;
import AST.PropertyValueClasses.*;
import AST.Interface.*;
import AST.DataType.*;
import AST.ParameterList.*;
import AST.Property.*;
import AST.Method.*;
import AST.PropertyValueClasses.PropertyValue;
import AST.Routing.RouteArray;
import AST.Routing.RouteObject;
import AST.Routing.RouteProperty;
import AST.Routing.RoutesDeclaration;
import AST.Service.Arg;
import AST.Service.ServiceArguments;
import AST.Service.ServiceBlock;
import AST.Service.ServiceDeclaration;
import AST.SwitchStmt.*;
import AST.WhileStmt.DoWhileStatement;
import AST.WhileStmt.WhileStatement;
import AST.propertyCallClasses.PropertyCall;
import AST.propertyCallClasses.PropertyWithMethodCall;
import AST.propertyCallClasses.SimplePropertyCall;
import Grammer.AngularParser;
import SemanticCheck.SemanticError;
import SymbolTable.*;
import SymbolTable.InterfaceMissing.Symbol;
import SymbolTable.MissingImportST ;
import SymbolTable.DuplicateAttributeSymbolTable ;
import SymbolTable.ReadProperties.PropertySymbolTable;
import SymbolTable.InterfaceMissing.SymbolTable;
import Grammer.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends AngularParserBaseVisitor {


    private SymbolTable symbolTable = new SymbolTable();
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    PropertySymbolTable propertySymbolTable = new PropertySymbolTable();
    MissingImportST missingImportST = MissingImportST.getInstance();
    SemanticError semanticError = new SemanticError(symbolTable);

    public List<List<String>> htmlBindingsToValidate = new ArrayList<>();
    private MissedHTMLSymbolTable symbolTable2=new MissedHTMLSymbolTable();
    MissedHTMLSymbolTable globalMissedHTMLSymbolTable = new MissedHTMLSymbolTable("global");

    private DuplicateAttributeSymbolTable duplicateAttributeSymbolTable = new DuplicateAttributeSymbolTable();
    public DuplicateAttributeSymbolTable getSymbolTable2() {
        return duplicateAttributeSymbolTable;
    }

    public Program visitProgram(AngularParser.ProgramContext ctx) {
        Program program = new Program();

        // Visit all statements
        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            program.getStatements().add((Statement)visit(stmtCtx));
        }

        semanticError.classImportNotFound();
        return program;
    }

//    @Override
//    public Statement visitStatement(AngularParser.StatementContext ctx) {
//        Statement statement = new Statement();
//
//        // Handle importStatement+
//        for (AngularParser.ImportStatementContext importCtx : ctx.importStatement()) {
//            statement.getImportStatements().add(visitImportStatement(importCtx));
//        }
//
//        // Handle serviceBlock*
//        if (ctx.serviceBlock()!=null){
//            for (AngularParser.ServiceBlockContext serviceCtx : ctx.serviceBlock()) {
//                statement.getServiceBlocks().add(visitServiceBlock(serviceCtx));
//            }
//        }
//
//
//        // Handle interfaceDeclaration*
//        if (ctx.interfaceDeclaration()!=null){
//            for (AngularParser.InterfaceDeclarationContext interfaceCtx : ctx.interfaceDeclaration()) {
//                statement.getInterfaceDeclarations().add(visitInterfaceDeclaration(interfaceCtx));
//            }
//        }
//
//
//        // Handle classDeclaration*
//        if (ctx.classDeclaration()!=null){
//            for (AngularParser.ClassDeclarationContext classCtx : ctx.classDeclaration()) {
//                statement.getClassDeclarations().add(visitClassDeclaration(classCtx));
//            }
//        }
//
//
//        // Handle printStatement*
//        if (ctx.printStatement()!=null){
//            for (AngularParser.PrintStatementContext printCtx : ctx.printStatement()) {
//                statement.getPrintStatements().add(visitPrintStatement(printCtx));
//            }
//        }
//
//
//        // Handle componentBlock*
//        if (ctx.componentBlock()!=null){
//            for (AngularParser.ComponentBlockContext compCtx : ctx.componentBlock()) {
//
//                statement.getComponentBlocks().add(visitComponentBlock(compCtx));
//            }
//        }
//
//        return statement;
//    }


    @Override
    public ImportStatement visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        if (ctx.IMPORT() != null) {
            importStatement.setImport_(ctx.IMPORT().getText());
        }
        if (ctx.importItems() != null) {
            importStatement.setImportItems(visitImportItems(ctx.importItems()));
        }
        if (ctx.FROM() != null) {
            importStatement.setFrom(ctx.FROM().getText());
        }
        if (ctx.STRING_LITERAL() != null) {
            importStatement.setStringLiteral(ctx.STRING_LITERAL().getText());
        }
        return importStatement ;
    }

    @Override
    public ImportItems visitImportItems(AngularParser.ImportItemsContext ctx) {
        ImportItems importItems = new ImportItems();
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            if (ctx.IDENTIFIER(i) != null) {
                importItems.getIdentifier().add(ctx.IDENTIFIER(i).getText());
                missingImportST.addSymbol(ctx.IDENTIFIER(i).getText(),"ImportClassName",null,ctx.IDENTIFIER(i).getSymbol().getLine());
            }
        }
        return importItems;
    }

    @Override
    public ServiceBlock visitServiceBlock(AngularParser.ServiceBlockContext ctx) {
        ServiceBlock serviceBlock=new ServiceBlock();

        // Visit ServiceBlock
        serviceBlock.setServiceDeclaration(visitServiceDeclaration(ctx.serviceDeclaration()));

        // Visit classDeclaration (optional)
        if (ctx.classDeclaration() != null) {
            serviceBlock.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        }
        return serviceBlock;
    }

    @Override
    public ServiceDeclaration visitServiceDeclaration(AngularParser.ServiceDeclarationContext ctx) {
        ServiceDeclaration serviceDeclaration = new ServiceDeclaration();

        serviceDeclaration.setInjectable(ctx.INJECTABLE().getText());
        semanticError.missingServiceImports(ctx.INJECTABLE().getSymbol().getLine());
        serviceDeclaration.setServiceArguments(visitServiceArguments(ctx.serviceArguments()));

        return serviceDeclaration;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();

        String className = ctx.IDENTIFIER().getText();
        symbolTable.enterScope(className);
        symbolTable.currentScope().setType("class ");

        if (ctx.EXPORT() != null) {
            classDeclaration.setExport(ctx.EXPORT().getText());
        }

        if (ctx.ABSTRACT() != null) {
            classDeclaration.setAbstract_(ctx.ABSTRACT().getText());
        }

        if (ctx.CLASS() != null) {
            classDeclaration.setClass_(ctx.CLASS().getText());
        }

        if (ctx.IDENTIFIER() != null) {
            classDeclaration.setIdentifier(ctx.IDENTIFIER().getText());
            missingImportST.addSymbol(ctx.IDENTIFIER().getText(),"Class",null,ctx.IDENTIFIER().getSymbol().getLine());
        }

        if (ctx.classHeritage() != null) {
            classDeclaration.setClassHeritage(visitClassHeritage(ctx.classHeritage()));
        }

        if (ctx.classImplement() != null) {
            classDeclaration.setClassImplement(visitClassImplement(ctx.classImplement()));
            String implementsText = ctx.classImplement().getText();
            symbolTable.define("__implements__", implementsText.replace("implements", "").trim(), "implements",false);
        }

        java.util.List<ClassBody> bodyList = new ArrayList<>();
        for (AngularParser.ClassBodyContext bodyCtx : ctx.classBody()) {
            ClassBody body= (ClassBody) visit(bodyCtx);
            if(body!=null){
                bodyList.add(body);
            }
            if (body instanceof ClassPropertyDeclaration){
                // String name = bodyCtx.getText();
                String name =((ClassPropertyDeclaration) body).getIdentifier();
                int line = bodyCtx.getStart().getLine();
                Symbol symbol = new Symbol(name,  "property", "", className, line);
                boolean ok = duplicateAttributeSymbolTable.declare(className, name, symbol);
                globalMissedHTMLSymbolTable.addChild(name,new MissedHTMLSymbolTable(className));

                if (!ok) {
//                    SemanticLogger.log("Duplicate property '" + name + "' in class " + className + " at line " + line);
                    semanticError.checkClassBodyAttributes("Duplicate property '" + name + "' in class " + className + " at line " + line);
                }

                /////////Missed HTML

                String propName = ((ClassPropertyDeclaration) body).getIdentifier();
                Assigment assigment=((ClassPropertyDeclaration) body).getAssigment();
                PropertyValue value =null;
                if (assigment!=null){
                    value =assigment.getPropertyValue();
                }

                if (value instanceof ObjectValue) {
                    MissedHTMLSymbolTable propMissedHTMLSymbolTable = buildScopeFromObjectValue((ObjectValue) value);
                    globalMissedHTMLSymbolTable.addChild(propName, propMissedHTMLSymbolTable);
//                    globalMissedHTMLSymbolTable.print(" ");

                }
                if (value instanceof LiteralExpr) {
                    globalMissedHTMLSymbolTable.addChild(propName, new MissedHTMLSymbolTable(propName));
                }

            }else if (body instanceof MethodDeclaration) {
                MethodDeclaration method = (MethodDeclaration) visitMethodDeclaration(bodyCtx.methodDeclaration());
                String name = method.getIdentifier();
                int line = bodyCtx.getStart().getLine();
                Symbol symbol = new Symbol(name, "method", "", className, line);
                boolean ok = duplicateAttributeSymbolTable.declare(className, name, symbol);
                if (!ok) {
                    semanticError.checkClassBodyAttributes("Duplicate method '" + name + "' in class " + className + " at line " + line);
//                    SemanticLogger.log("Duplicate method '" + name + "' in class " + className + " at line " + line);
                }
            } else if (body instanceof ConstructorDeclaration) {
                int line = bodyCtx.getStart().getLine();
                Symbol symbol = new Symbol("constructor", "constructor", "", className, line);
                boolean ok = duplicateAttributeSymbolTable.declare(className, "constructor", symbol);

                if (!ok) {
                    semanticError.checkClassBodyAttributes("Duplicate constructor in class " + className + " at line " + line);
//                    SemanticLogger.log("Duplicate constructor in class " + className + " at line " + line);
                }
            }
        }
        classDeclaration.setClassBodies(bodyList);


        semanticError.checkScope(symbolTable.currentScope(),ctx.start.getLine());
        semanticError.checkHtmlBindingErrors(htmlBindingsToValidate, globalMissedHTMLSymbolTable);

        symbolTable.exitScope();

//        System.out.println("htmlBindingsToValidate "+htmlBindingsToValidate);

//        for (List<String> identifiers : htmlBindingsToValidate) {
//            String invalidBinding= globalMissedHTMLSymbolTable.isValidPath2(identifiers);
//            if (invalidBinding!= " ") {
////                SemanticLogger.log(" Invalid HTML binding: " + invalidBinding);
//                System.out.println("🟥 Invalid HTML binding: " + invalidBinding);
//            } else {
//                //System.out.println("✔️ Valid HTML binding: " + String.join(".", identifiers));
//            }
//        }
        return classDeclaration;
    }

//    private MissedHTMLSymbolTable buildScopeFromObjectValue(ObjectValue objVal) {
//        MissedHTMLSymbolTable missedHTMLSymbolTable = new MissedHTMLSymbolTable("object");
//
//        for (ObjectProperty property : objVal.getProperties()) {
//            String propName = property.getIdentifier();
//            PropertyValue value = property.getValue();
//
//            if (value instanceof LiteralExpr) {
//                missedHTMLSymbolTable.addChild(propName, new MissedHTMLSymbolTable("string")); // Or "number", etc.
//            } else if (value instanceof ObjectValue) {
//                MissedHTMLSymbolTable childMissedHTMLSymbolTable = buildScopeFromObjectValue((ObjectValue) value);
//                missedHTMLSymbolTable.addChild(propName, childMissedHTMLSymbolTable);
//            }
//
//        }
//
//        return missedHTMLSymbolTable;
//    }

    // new added editing
    private MissedHTMLSymbolTable buildScopeFromObjectValue(ObjectValue objVal) {
        MissedHTMLSymbolTable missedHTMLSymbolTable = new MissedHTMLSymbolTable("object");

        for (ObjectProperty property : objVal.getProperties()) {
            if (property instanceof NormalObjectProperty normalProp) {
                String propName = normalProp.getIdentifier();
                PropertyValue value = normalProp.getValue();

                if (value instanceof LiteralExpr) {
                    missedHTMLSymbolTable.addChild(propName, new MissedHTMLSymbolTable("string")); // Or "number", etc.
                } else if (value instanceof ObjectValue) {
                    MissedHTMLSymbolTable childMissedHTMLSymbolTable = buildScopeFromObjectValue((ObjectValue) value);
                    missedHTMLSymbolTable.addChild(propName, childMissedHTMLSymbolTable);
                }

            } else if (property instanceof SpreadObjectProperty) {
                System.out.println("تم تجاهل SpreadObjectProperty داخل object");
            }
        }

        return missedHTMLSymbolTable;
    }


    @Override
    public ClassHeritage visitClassHeritage(AngularParser.ClassHeritageContext ctx) {
        ClassHeritage classHeritage=new ClassHeritage();

        if(ctx.EXTENDS()!=null)
            classHeritage.setExtends_(ctx.EXTENDS().getText());
        if(ctx.IDENTIFIER()!=null)
            classHeritage.setSuperClassName(ctx.IDENTIFIER().getText());

        return classHeritage;
    }

    @Override
    public ClassImplement visitClassImplement(AngularParser.ClassImplementContext ctx) {
        ClassImplement classImplement = new ClassImplement();

        if(ctx.IMPLEMENTS()!=null)
            classImplement.setImplements_(ctx.IMPLEMENTS().getText());

        java.util.List<String> interfaces = new ArrayList<>();

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            classImplement.getInterfaceNames().add(ctx.IDENTIFIER(i).getText());
//            interfaces.add(ctx.IDENTIFIER(i).getText());
        }
//        for (TerminalNode id : ctx.IDENTIFIER()) {
//            classImplement.getInterfaceNames().add(id.getText());
//        }

//        classImplement.setInterfaceNames(interfaces);

        return classImplement;
    }

//    @Override
//    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
//        ClassBody body = new ClassBody();
//
//        if (ctx.classPropertyDeclaration() != null) {
//            body.setClassPropertyDeclaration(visitClassPropertyDeclaration(ctx.classPropertyDeclaration()));
//        } else if (ctx.methodDeclaration() != null) {
//            body.setMethodDeclaration(visitMethodDeclaration(ctx.methodDeclaration()));
//        } else if (ctx.constructorDeclaration() != null) {
//            body.setConstructorDeclaration(visitConstructorDeclaration(ctx.constructorDeclaration()));
//        }
//
//        return body;
//    }

    @Override // alaa
    public ClassPropertyDeclaration visitClassPropertyDeclaration(AngularParser.ClassPropertyDeclarationContext ctx) {
        ClassPropertyDeclaration property = new ClassPropertyDeclaration();

        ArrayList<String> typeList = new ArrayList<>();
        String valueStr=null;

        // Access modifier
        if (ctx.accessModifiers() != null) {
            property.setAccessModifiers((visitAccessModifiers(ctx.accessModifiers())));
        }

        // static?
        if (ctx.STATIC() != null) {
            property.setStatic_(ctx.STATIC().getText());
        }

        // readonly?
        if (ctx.READONLY() != null) {
            property.setReadonly(ctx.READONLY().getText());
        }

        // identifier
        if (ctx.IDENTIFIER() != null) {
            property.setIdentifier(ctx.IDENTIFIER().getText());
        }

        // assignDataType
        if (ctx.assignDataType() != null) { // new added
            property.setAssignDataType(visitAssignDataType(ctx.assignDataType()));
            for (AngularParser.DataTypeContext typeCtx : ctx.assignDataType().dataType()) {
                for (AngularParser.SingleDataTypeContext singleCtx : typeCtx.singleDataType()) {
                    SingleDataType single = visitSingleDataType(singleCtx);
                    Type type = single.getType();
                    if (type != null) {
                        typeList.add(type.getType()); // alaa-check
                    }
                }
            }
        }

        // assignment

        if (ctx.assigment() != null) {
            property.setAssigment(visitAssigment(ctx.assigment()));

            PropertyValue propertyValue=( (PropertyValue) visit(ctx.assigment().propertyValue()));
            valueStr = propertyValue.getValue();
        }

        propertySymbolTable.newProperty(ctx.IDENTIFIER().getText(),typeList,valueStr);
        symbolTable.define(ctx.IDENTIFIER().getText(), valueStr, !typeList.isEmpty() ? typeList.get(0): null ,false);

        return property;
    }

    @Override
    public AccessModifiers visitAccessModifiers(AngularParser.AccessModifiersContext ctx) {
        String modifier = null;

        if (ctx.PRIVATE() != null) {
            modifier = ctx.PRIVATE().getText();
        } else if (ctx.PUBLIC() != null) {
            modifier = ctx.PUBLIC().getText();
        } else if (ctx.PROTECTED() != null) {
            modifier = ctx.PROTECTED().getText();
        }

        return new AccessModifiers(modifier);
    }

    @Override
    public AssignDataType visitAssignDataType(AngularParser.AssignDataTypeContext ctx) {
        AssignDataType assignDataType=new AssignDataType();
        if(ctx.dataType()!=null && !ctx.dataType().isEmpty()){
            for (AngularParser.DataTypeContext dataTypeCtx : ctx.dataType()) {
                assignDataType.getDataTypes().add(visitDataType(dataTypeCtx));
            }
        }
        return assignDataType;
    }

    @Override
    public Assigment visitAssigment(AngularParser.AssigmentContext ctx) {
        Assigment assigment=new Assigment();
        if (ctx.EQ() != null) {
            assigment.setEq(ctx.EQ().getText());
        }
        if (ctx.propertyValue() != null) {
            assigment.setPropertyValue((PropertyValue)visit(ctx.propertyValue()));
        }
        return assigment;
    }



    @Override
    public ServiceArguments visitServiceArguments(AngularParser.ServiceArgumentsContext ctx) {

        ServiceArguments serviceArguments = new ServiceArguments();

        for (AngularParser.ArgContext argCtx : ctx.arg()) {
            serviceArguments.addArgument(visitArg(argCtx));
        }
        return serviceArguments;
    }

    @Override
    public Arg visitArg(AngularParser.ArgContext ctx) {
        Arg arg = new Arg();
        if(ctx.PROVIDED_IN()!=null){
            arg.setProvidedIn(ctx.PROVIDED_IN().getText());
        }
        if(ctx.STRING_LITERAL()!=null){
            arg.setStringLiteral(ctx.STRING_LITERAL().getText());
        }
        return arg;
    }

    @Override
    public PrintStatement visitPrintStatement(AngularParser.PrintStatementContext ctx) {
        PrintStatement printStatement = new PrintStatement();

        if (ctx.CONSOLE()!=null){
            printStatement.setConsole(ctx.CONSOLE().getText());
        }

        if (ctx.LOG()!=null){
            printStatement.setLog(ctx.LOG().getText());
        }

        if (ctx.expression() != null) {
            for (AngularParser.ExpressionContext exprCtx : ctx.expression()) {
                printStatement.getExpression().add((Expression)visit(exprCtx)); // label
            }
        }

        return printStatement;
    }

    @Override
    public ComponentBlock visitComponentBlock(AngularParser.ComponentBlockContext ctx) {
        ComponentBlock componentBlock=new ComponentBlock();
        if(ctx.componentDeclaration() != null){
            componentBlock.setComponentDeclaration(visitComponentDeclaration(ctx.componentDeclaration()));
        }
        if(ctx.classDeclaration() != null && !ctx.classDeclaration().isEmpty()){
            for (AngularParser.ClassDeclarationContext classCtx : ctx.classDeclaration()) {
                componentBlock.getClassDeclarations().add(visitClassDeclaration(classCtx));
            }
        }
        return componentBlock;
    }

    /***********           Expression Start ************************************/
    /***********           Expression Start ************************************/


    @Override
    public ParentExpression visitParentExpression(AngularParser.ParentExpressionContext ctx) {
        ParentExpression parentExpression=new ParentExpression();

        parentExpression.setInnerExpression((Expression) visit(ctx.expression()));

        return parentExpression;
    }

    @Override
    public BinaryExpression visitBinaryExpression(AngularParser.BinaryExpressionContext ctx) {
        BinaryExpression binaryExpression=new BinaryExpression();

        if (ctx.expression()!=null){
            for (int i=0;i<ctx.expression().size();i++){
                binaryExpression.getExpressions().add((Expression) visit(ctx.expression(i)));
            }
        }
        if (ctx.operation()!=null){
            for (int i=0;i<ctx.operation().size();i++){
                binaryExpression.getOperations().add(visitOperation(ctx.operation(i)));
            }
        }

        return binaryExpression;
    }
    @Override
    public Operation visitOperation(AngularParser.OperationContext ctx) {
        Operation operation = new Operation();

        if (ctx.ANDAND() != null) {
            operation.setOperator(ctx.ANDAND().getText());
        } else if (ctx.OROR() != null) {
            operation.setOperator(ctx.OROR().getText());
        } else if (ctx.LT() != null) {
            operation.setOperator(ctx.LT().getText());
        } else if (ctx.LE() != null) {
            operation.setOperator(ctx.LE().getText());
        } else if (ctx.GT() != null) {
            operation.setOperator(ctx.GT().getText());
        } else if (ctx.GE() != null) {
            operation.setOperator(ctx.GE().getText());
        } else if (ctx.EQEQ() != null) {
            operation.setOperator(ctx.EQEQ().getText());
        } else if (ctx.NOTEQ() != null) {
            operation.setOperator(ctx.NOTEQ().getText());
        } else if (ctx.PLUS() != null) {
            operation.setOperator(ctx.PLUS().getText());
        } else if (ctx.STRICT_NE() != null) {
            operation.setOperator(ctx.STRICT_NE().getText());
        } else if (ctx.STRICT_E() != null) {
            operation.setOperator(ctx.STRICT_E().getText());
        } else if (ctx.MINUS() != null) {
            operation.setOperator(ctx.MINUS().getText());
        } else if (ctx.STAR() != null) {
            operation.setOperator(ctx.STAR().getText());
        } else if (ctx.SLASH() != null) {
            operation.setOperator(ctx.SLASH().getText());
        }

        return operation;
    }




    @Override
    public LiteralOrReferenceExpression visitLiteralOrReferenceExpression(AngularParser.LiteralOrReferenceExpressionContext ctx) {
        LiteralOrReferenceExpression literalOrReferenceExpression=new LiteralOrReferenceExpression();

        literalOrReferenceExpression.setPropertyValue( (PropertyValue) visit(ctx.propertyValue()));

        return literalOrReferenceExpression;
    }
    /***********           Expression END ************************************/
    /***********           Expression END ************************************/



    /***********           PropertyValue Start ************************************/
    /***********           PropertyValue Start ************************************/

//    @Override
//    public PropertyValueObjectExpr visitPropertyValueObjectExpr(AngularParser.PropertyValueObjectExprContext ctx) {
//        PropertyValueObjectExpr propertyValueObjectExpr=new PropertyValueObjectExpr();
//
//        propertyValueObjectExpr.setPropertyValueObjects( (PropertyValueObjects) visit(ctx.propertyValueObjects())); /* */
//
//        return propertyValueObjectExpr;
//    }

    @Override
    public BracketedPropertyValueExpr visitBracketedPropertyValueExpr(AngularParser.BracketedPropertyValueExprContext ctx) {
        BracketedPropertyValueExpr bracketedPropertyValueExpr=new BracketedPropertyValueExpr();

        bracketedPropertyValueExpr.setPropertyValue((PropertyValue)visit(ctx.propertyValue()));
        return bracketedPropertyValueExpr;
    }

    @Override
    public BinaryOperationPropertyValueExpr visitBinaryOperationPropertyValueExpr(AngularParser.BinaryOperationPropertyValueExprContext ctx) {
        BinaryOperationPropertyValueExpr binaryOperationPropertyValueExpr=new BinaryOperationPropertyValueExpr();

        binaryOperationPropertyValueExpr.setLeft((PropertyValue) visit(ctx.propertyValue(0)));
        binaryOperationPropertyValueExpr.setOperation(visitOperation(ctx.operation()));
        binaryOperationPropertyValueExpr.setRight((PropertyValue) visit(ctx.propertyValue(1)));

        return binaryOperationPropertyValueExpr;
    }

    @Override
    public ShortIfExpr visitShortIfExpr(AngularParser.ShortIfExprContext ctx) {
        ShortIfExpr shortIfExpr = new ShortIfExpr();

        shortIfExpr.setCondition((PropertyValue) visit(ctx.propertyValue(0)));
        shortIfExpr.setTrueBranch((PropertyValue) visit(ctx.propertyValue(1)));
        shortIfExpr.setFalseBranch((PropertyValue) visit(ctx.propertyValue(2)));

        // Store the actual tokens
        shortIfExpr.setQuestionToken(ctx.QUESTION().getText());
        shortIfExpr.setDotDotToken(ctx.DOT_DOT().getText());

        return shortIfExpr;
    }


//    @Override
//    public PropertyValueObjects visitPropertyValueObjects(AngularParser.PropertyValueObjectsContext ctx) {
//        PropertyValueObjects propertyValueObjects=new PropertyValueObjects();
//
//
//        if (ctx.literalValue() != null) {
//            propertyValueObjects.setLiteralValue((LiteralValue) visit(ctx.literalValue())); /*****/
//        }
//        else if (ctx.objectValue() != null) {
//            propertyValueObjects.setObjectValue(visitObjectValue(ctx.objectValue()));
//        }
//        else if (ctx.list() != null) {
//            propertyValueObjects.setList(visitList(ctx.list()));
//        }
//        else if (ctx.indexAccessValue() != null) {
//            propertyValueObjects.setIndexAccessValue(visitIndexAccessValue(ctx.indexAccessValue()));
//        }
//        else if (ctx.propertyCall() != null) { /* Label  **/
//            propertyValueObjects.setPropertyCall((PropertyCall) visit(ctx.propertyCall()));
//        }
//        else if (ctx.methodCall() != null) {
//            propertyValueObjects.setMethodCall(visitMethodCall(ctx.methodCall()));
//        } else if (ctx.arrowFunction() != null) {
//            propertyValueObjects.setArrowFunction(visitArrowFunction(ctx.arrowFunction()));
//        } else if (ctx.postFix() != null) {
//            propertyValueObjects.setPostFix(visitPostFix(ctx.postFix()));
//        } else if (ctx.preFix() != null) {
//            propertyValueObjects.setPreFix(visitPreFix(ctx.preFix()));
//        }
//
//        return propertyValueObjects;
//    }

    /***********           PropertyValue END ************************************/
    /***********           PropertyValue END ************************************/

    /**********************Bilal V2*********************************************/


    @Override
    public ObjectValue visitObjectValue(AngularParser.ObjectValueContext ctx) {
        ObjectValue objectValue=new ObjectValue();

        if (ctx.IDENTIFIER() != null) {
            objectValue.setIdentifier(ctx.IDENTIFIER().getText());
        } else {
            for (AngularParser.ObjectPropertyContext propCtx : ctx.objectProperty()) {
                objectValue.getProperties().add((ObjectProperty) visit(propCtx));
            }
        }
        return objectValue;
    }

//    @Override
//    public ObjectProperty visitObjectProperty(AngularParser.ObjectPropertyContext ctx) {
//        ObjectProperty objectProperty=new ObjectProperty();
//
//        objectProperty.setIdentifier(ctx.IDENTIFIER().getText());
//
//        if (ctx.propertyValue() != null) {
//            objectProperty.setValue((PropertyValue) visit(ctx.propertyValue()));
//        }
//
//        return objectProperty;
//    }


    @Override
    public NormalObjectProperty visitNormalObjectProperty(AngularParser.NormalObjectPropertyContext ctx) {
        NormalObjectProperty normalObjectProperty = new NormalObjectProperty();

        if(ctx.IDENTIFIER() != null) {
            normalObjectProperty.setIdentifier(ctx.IDENTIFIER().getText());
        }
        if (ctx.propertyValue() != null) {
            normalObjectProperty.setValue((PropertyValue) visit(ctx.propertyValue()));
        }

        return normalObjectProperty;
    }

    @Override
    public SpreadObjectProperty visitSpreadObjectProperty(AngularParser.SpreadObjectPropertyContext ctx) {
        SpreadObjectProperty spreadObjectProperty = new SpreadObjectProperty();
        if(ctx.spreadElement() != null){
            spreadObjectProperty.setSpreadElement((SpreadElementExpr) visit(ctx.spreadElement()));
        }
        return spreadObjectProperty ;
    }

    @Override
    public SpreadElementExpr visitSpreadElementExpr(AngularParser.SpreadElementExprContext ctx) {
        SpreadElementExpr spreadElementExpr = new SpreadElementExpr();
        if(ctx.IDENTIFIER() != null){
            spreadElementExpr.setIdentifier(ctx.IDENTIFIER().getText());
        }
        if(ctx.SPREAD() != null){
            spreadElementExpr.setSpreadKey(ctx.SPREAD().getText());
        }

        if(ctx.propertyCall() != null){
            spreadElementExpr.setPropertyCall((PropertyCall) visit(ctx.propertyCall()));
        }
        return  spreadElementExpr ;
    }

    @Override
    public LIst visitList(AngularParser.ListContext ctx) {
        LIst lIst =new LIst();

        for (AngularParser.PropertyValueContext propertyValueContext : ctx.propertyValue()) {
            lIst.getElements().add((PropertyValue) visit(propertyValueContext));
        }

        for (AngularParser.SpreadElementContext spreadElementContext : ctx.spreadElement()) {
            lIst.getSpreadElements().add((SpreadElementExpr) visit(spreadElementContext));
        }

        return lIst;
    }

    @Override
    public IndexAccessValue visitIndexAccessValue(AngularParser.IndexAccessValueContext ctx) {
        IndexAccessValue indexAccessValue=new IndexAccessValue();

        indexAccessValue.setIdentifier(ctx.IDENTIFIER().getText());

        indexAccessValue.setPropertyValue((PropertyValue) visit(ctx.propertyValue()));
        return indexAccessValue;
    }

    @Override
    public ArrowFunctionExpr visitArrowFunctionExpr(AngularParser.ArrowFunctionExprContext ctx) {
        ArrowFunctionExpr arrowFunctionExpr = new ArrowFunctionExpr();

        if(ctx.IDENTIFIER() != null){
            arrowFunctionExpr.setIdentifier(ctx.IDENTIFIER().getText());
        }

        if(ctx.ARROW() != null){
            arrowFunctionExpr.setArrowKey(ctx.ARROW().getText());
        }

        if(ctx.expression() != null){
            arrowFunctionExpr.setExpression((Expression) visit(ctx.expression()));
        }

        return arrowFunctionExpr ;
    }

    @Override
    public ArrowFunctionBlockExpr visitArrowFunctionBlockExpr(AngularParser.ArrowFunctionBlockExprContext ctx) {
        ArrowFunctionBlockExpr arrowFunctionBlockExpr = new ArrowFunctionBlockExpr();
        if(ctx.IDENTIFIER() != null){
            arrowFunctionBlockExpr.setIdentifier(ctx.IDENTIFIER().getText());
        }

        if(ctx.ARROW() != null){
            arrowFunctionBlockExpr.setArrowKey(ctx.ARROW().getText());
        }

        if(ctx.block() != null){
            arrowFunctionBlockExpr.setBlock(visitBlock(ctx.block()));
        }
        return arrowFunctionBlockExpr ;
    }

    @Override
    public ArrowFunctionWithParamsBlockExpr visitArrowFunctionWithParamsBlockExpr(AngularParser.ArrowFunctionWithParamsBlockExprContext ctx) {
        ArrowFunctionWithParamsBlockExpr af = new ArrowFunctionWithParamsBlockExpr();
        if(ctx.ARROW() != null){
            af.setArrowKey(ctx.ARROW().getText());
        }

        if(ctx.block() != null){
            af.setBlock(visitBlock(ctx.block()));
        }

        if(ctx.parameterList() != null ){
            af.setParameterList(visitParameterList(ctx.parameterList()));
        }
        return af ;

    }

    @Override
    public ArrowFunctionWithParamExpr  visitArrowFunctionWithParamsExpr(AngularParser.ArrowFunctionWithParamsExprContext ctx) {
        ArrowFunctionWithParamExpr afp = new ArrowFunctionWithParamExpr();
        if(ctx.ARROW() != null){
            afp.setArrowKey(ctx.ARROW().getText());
        }

        if(ctx.expression() != null){
            afp.setExpression((Expression) visit(ctx.expression()));
        }

        if(ctx.parameterList() != null ){
            afp.setParameterList(visitParameterList(ctx.parameterList()));
        }
        return  afp ;
    }
    //    @Override
//    public ArrowFunction visitArrowFunction(AngularParser.ArrowFunctionContext ctx) {
//        ArrowFunction arrowFunction =new ArrowFunction();
//
//        arrowFunction.setParameterList(visitParameterList(ctx.parameterList()));
//        arrowFunction.setARROW(ctx.ARROW().getText());
//        arrowFunction.setExpression((Expression) visit(ctx.expression()));
//
//        return arrowFunction;
//    }

    @Override
    public PostFix visitPostFix(AngularParser.PostFixContext ctx) {
        PostFix postFix=new PostFix();

        if (ctx.PP()!=null){
            postFix.setOperator(ctx.PP().getText());
        }
        else if (ctx.MM()!=null){
            postFix.setOperator(ctx.MM().getText());
        }
        if (ctx.IDENTIFIER()!=null){
            postFix.setIdentifier(ctx.IDENTIFIER().getText());
        }

        return postFix;
    }

    @Override
    public PreFix visitPreFix(AngularParser.PreFixContext ctx) {
        PreFix preFix =new PreFix();
        if (ctx.PP()!=null){
            preFix.setOperator(ctx.PP().getText());
        }
        else if (ctx.MM()!=null){
            preFix.setOperator(ctx.MM().getText());
        }
        if (ctx.IDENTIFIER()!=null){
            preFix.setIdentifier(ctx.IDENTIFIER().getText());
        }
        return preFix;
    }

    @Override
    public NewExpression visitNewExpression(AngularParser.NewExpressionContext ctx) {
        NewExpression newExpression = new NewExpression();

        if(ctx.NEW() != null){
            newExpression.setNewKeyWord(ctx.NEW().getText());
        }
        if(ctx.IDENTIFIER() != null){
            newExpression.setIdentifier(ctx.IDENTIFIER().getText());
        }
        if(ctx.typeArguments() != null){
            newExpression.setTypeArgument(visitTypeArguments(ctx.typeArguments()));
        }
        if(ctx.expression() != null && !ctx.expression().isEmpty()){
            if (ctx.expression()!=null) {
                for (AngularParser.ExpressionContext expCtx : ctx.expression()) {
                    newExpression.getExpressions().add((Expression) visit(expCtx));
                }
            }
        }

        return newExpression;
    }

//    @Override
//    public SpreadElementExpr visitSpreadListElement(AngularParser.SpreadListElementContext ctx) {
//        SpreadElementExpr spreadElement = new SpreadElementExpr();
//
//        if(ctx.IDENTIFIER() != null){
//            spreadElement.setIdentifier(ctx.IDENTIFIER().getText());
//        }
//        if(ctx.SPREAD() != null){
//            spreadElement.setSpreadKey(ctx.SPREAD().getText());
//        }
//
//        if(ctx.propertyCall() != null){
//            spreadElement.setPropertyCall((PropertyCall) visit(ctx.propertyCall()));
//        }
//        return spreadElement ;
//    }

    /***********           PropertyCall Start ************************************/
    @Override //alaa
    public SimplePropertyCall visitSimplePropertyCall(AngularParser.SimplePropertyCallContext ctx) {//****wait Bilal
        SimplePropertyCall simplePropertyCall = new SimplePropertyCall();

        if (ctx.THIS() != null) {
            simplePropertyCall.setThis_(ctx.THIS().getText());
        }
        if (ctx.IDENTIFIER() != null && !ctx.IDENTIFIER().isEmpty()) {
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                simplePropertyCall.addToIdentifiers(ctx.IDENTIFIER(i).getText());
                if (i < ctx.IDENTIFIER().size() - 1) {
                    String msg = propertySymbolTable.ReadProperties(ctx.IDENTIFIER(i).getText(), ctx.start.getLine());
                    if (msg != null) {
                        SemanticError.Errors.add(msg);
                    }
                }
                ;// alaa-check
            }
        }
        return simplePropertyCall;
    }


    @Override
    public PropertyWithMethodCall visitPropertyWithMethodCall(AngularParser.PropertyWithMethodCallContext ctx) {
        PropertyWithMethodCall propertyWithMethodCall=new PropertyWithMethodCall();

        if (ctx.THIS() != null) {
            propertyWithMethodCall.setThis_(ctx.THIS().getText());
        }

        if (ctx.IDENTIFIER()!=null && !ctx.IDENTIFIER().isEmpty()){

            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                propertyWithMethodCall.addToIdentifiers(ctx.IDENTIFIER(i).getText());
            }
        }
        if (ctx.methodCall()!=null && !ctx.methodCall().isEmpty()) {

            for (AngularParser.MethodCallContext methodCtx : ctx.methodCall()) {
                propertyWithMethodCall.getMethodCalls().add(visitMethodCall(methodCtx));
            }
        }
        return propertyWithMethodCall;
    }

    /***********           PropertyCall END ************************************/

    @Override
    public MethodCall visitMethodCall(AngularParser.MethodCallContext ctx) {
        MethodCall methodCall=new MethodCall();

        if (ctx.IDENTIFIER()!=null && !ctx.IDENTIFIER().isEmpty()){
            methodCall.setMethodCalledName(ctx.IDENTIFIER().get(0).getText());
        }

        if (ctx.IDENTIFIER()!=null && !ctx.IDENTIFIER().isEmpty()){
            for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
                methodCall.addToIdentifiers(ctx.IDENTIFIER(i).getText());
            }
        }

        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
            for (AngularParser.ExpressionContext exprCtx : ctx.expression()) {
                methodCall.addToExpressions((Expression) visit(exprCtx));
            }
        }

        return methodCall;
    }

    /***********           literalValue start ************************************/
    @Override
    public LiteralExpr visitLiteralExpr(AngularParser.LiteralExprContext ctx) {
        LiteralExpr literalExpr=new LiteralExpr();

        if (ctx.STRING_LITERAL() != null) {
            literalExpr.setValue(ctx.STRING_LITERAL().getText());
        } else if (ctx.NUMERIC_LITERAL() != null) {
            literalExpr.setValue( ctx.NUMERIC_LITERAL().getText());
        } else if (ctx.BIGINT_LITERAL() != null) {
            literalExpr.setValue( ctx.BIGINT_LITERAL().getText());
        }

        return literalExpr;
    }

    @Override
    public ValueExpr visitValueExpr(AngularParser.ValueExprContext ctx) {
        ValueExpr valueExpr=new ValueExpr();

        if (ctx.BOOL() != null) {
            valueExpr.setValue( ctx.BOOL().getText());
        } else if (ctx.LIST() != null) {
            valueExpr.setValue(ctx.LIST().getText());
        } else if (ctx.NULL() != null) {
            valueExpr.setValue( ctx.NULL().getText());
        } else if (ctx.UNDEFINED() != null) {
            valueExpr.setValue(ctx.UNDEFINED().getText());
        }
        return valueExpr;
    }

    @Override
    public SymbolExpr visitSymbolExpr(AngularParser.SymbolExprContext ctx) {
        SymbolExpr symbolExpr=new SymbolExpr();

        if (ctx.SYMBOL_LITERAL()!=null){
            symbolExpr.setValue(ctx.SYMBOL_LITERAL().getText());
        }
        return symbolExpr;
    }

    /***********           literalValue END ************************************/

    /*************************** Bilal V2 END***********************************/

    //======================================ALAA=========================================
    @Override
    public InterfaceDeclaration visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx) {
        InterfaceDeclaration interfaceDeclaration = new InterfaceDeclaration();
        String interfaceName =  null;
        symbolTable.enterScope( ctx.IDENTIFIER().getText());
        symbolTable.currentScope().setType("interface ");

        if (ctx.EXPORT() != null) {
            interfaceDeclaration.setExport(ctx.EXPORT().getText());
        }
        if (ctx.INTERFACE() != null) {
            interfaceDeclaration.setInterface_(ctx.INTERFACE().getText());
        }
        if (ctx.IDENTIFIER() != null) {
            interfaceDeclaration.setIdentifier(ctx.IDENTIFIER().getText());
            interfaceName= "Interface@ "+ctx.IDENTIFIER().getText();
        }
        if (ctx.interfaceBody() != null) {
            for (AngularParser.InterfaceBodyContext bodyContext : ctx.interfaceBody()){
                if (!bodyContext.isEmpty())
                    interfaceDeclaration.getInterfaceBody().add((InterfaceBody) visit(bodyContext));
            }

        }
        symbolTable.exitScope();
        if (ctx.interfaceBody()!=null){
            for (AngularParser.InterfaceBodyContext bodyCtx : ctx.interfaceBody()) {
                String attrName = null;
                String Type=null;
                int line = bodyCtx.start.getLine();

                if (bodyCtx instanceof AngularParser.PropertyInterfaceContext propCtx) {
                    attrName = propCtx.IDENTIFIER().getText();
                    Type="Property";
                } else if (bodyCtx instanceof AngularParser.FunctionInterfaceContext funcCtx) {
                    attrName = funcCtx.IDENTIFIER().getText();
                    Type="Method";
                } else if (bodyCtx instanceof AngularParser.ArrowFunctionInterfaceContext arrowCtx) {
                    attrName = arrowCtx.IDENTIFIER().getText();
                    Type="ArrowFunction";
                }

                if (attrName != null) {
                    Symbol symbol = new Symbol(attrName, "interface attribute", "", "interfaceBody", line);
                    boolean success = duplicateAttributeSymbolTable.declare(interfaceName, attrName, symbol);
                    if (!success) {
                        semanticError.checkClassBodyAttributes("Duplicate "+Type+ " '" + attrName + "' in " + interfaceName + " at line " + line);
                    }
                }
            }
        }

        return interfaceDeclaration;
    }


    @Override
    public PropertyInterface visitPropertyInterface(AngularParser.PropertyInterfaceContext ctx) {
        PropertyInterface propertyInterface = new PropertyInterface();
        boolean isOptional=false;

        if (ctx.READONLY() != null) {
            propertyInterface.setReadonly(ctx.READONLY().getText());
        }
        if (ctx.IDENTIFIER() != null) {
            propertyInterface.setIdentifier(ctx.IDENTIFIER().getText());
        }
        if (ctx.QUESTION() != null) {
            propertyInterface.setQuestion(ctx.QUESTION().getText());
            isOptional=true;
        }
        if (ctx.dataType() != null) {
            propertyInterface.setDataType((DataType) visitDataType(ctx.dataType()));

        }
        symbolTable.define(ctx.IDENTIFIER().getText(), "null",ctx.dataType().getText(),isOptional);

        return propertyInterface;
    }

    @Override
    public FunctionInterface visitFunctionInterface(AngularParser.FunctionInterfaceContext ctx) {
        FunctionInterface functionInterface = new FunctionInterface();
        boolean isOptional=false;
//        if (ctx.READONLY() != null) {
//            functionInterface.setReadonly(ctx.READONLY().getText());
//        }
        if (ctx.IDENTIFIER() != null) {
            functionInterface.setIdentifier(ctx.IDENTIFIER().getText());
        }
        if (ctx.parameterList() != null) {
            functionInterface.setParameterList(visitParameterList(ctx.parameterList()));
        }
        if (ctx.dataType() != null) {
            functionInterface.setDataType(visitDataType(ctx.dataType()));
        }
        symbolTable.define(ctx.IDENTIFIER().getText(), "null","method :"+ctx.dataType().getText(),isOptional);

        return functionInterface;
    }

    @Override
    public ArrowFunctionInterface visitArrowFunctionInterface(AngularParser.ArrowFunctionInterfaceContext ctx) {
        ArrowFunctionInterface arrowFunctionInterface = new ArrowFunctionInterface();
        boolean isOptional=false;
        if (ctx.READONLY() != null) {
            arrowFunctionInterface.setReadonly(ctx.READONLY().getText());
        }
        if (ctx.IDENTIFIER() != null) {
            arrowFunctionInterface.setIdentifier(ctx.IDENTIFIER().getText());
        }
        if (ctx.QUESTION() != null) {
            arrowFunctionInterface.setQuestion(ctx.QUESTION().getText());
            isOptional=true;
        }
        if (ctx.parameterList() != null) {
            arrowFunctionInterface.setParameterList(visitParameterList(ctx.parameterList()));
        }
        if (ctx.dataType() != null) {
            arrowFunctionInterface.setDataType(visitDataType(ctx.dataType()));
        }
        symbolTable.define(ctx.IDENTIFIER().getText(), "null","method :"+ctx.dataType().getText(),isOptional);
        return arrowFunctionInterface;
    }

    @Override
    public ParameterList visitParameterList(AngularParser.ParameterListContext ctx) {
        ParameterList parameterList = new ParameterList();
        if (ctx.parameter() != null && !ctx.parameter().isEmpty()) {
            for (AngularParser.ParameterContext parameterCtx : ctx.parameter())
                parameterList.getParameters().add(visitParameter(parameterCtx));
        }
        if (ctx.IDENTIFIER() != null && !ctx.IDENTIFIER().isEmpty()) {
            for (TerminalNode identifier : ctx.IDENTIFIER())
                parameterList.getIdentifiers().add(identifier.getText());
        }
        return parameterList;
    }

    @Override
    public Parameter visitParameter(AngularParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        if (ctx.IDENTIFIER() != null) {
            parameter.setIdentifier(ctx.IDENTIFIER().getText());
        }
        if (ctx.dataType() != null) {
            parameter.setDataType(visitDataType(ctx.dataType()));
        }
        return parameter;
    }

    @Override
    public DataType visitDataType(AngularParser.DataTypeContext ctx) {
        DataType dataType = new DataType();

        if (ctx.singleDataType() != null && !ctx.singleDataType().isEmpty()) {
            for (AngularParser.SingleDataTypeContext typeArg : ctx.singleDataType()) {
                dataType.getSingleDataTypeList().add(visitSingleDataType(typeArg));
            }
        }
        return dataType;
    }

    @Override
    public SingleDataType visitSingleDataType(AngularParser.SingleDataTypeContext ctx) {
        SingleDataType singleDataType = new SingleDataType();
        if (ctx.type() != null) {
            singleDataType.setType((Type) visit(ctx.type()));
        }
        if (ctx.typeArguments() != null && !ctx.typeArguments().isEmpty()) {
            for (AngularParser.TypeArgumentsContext typeArg : ctx.typeArguments()) {
                singleDataType.getTypeArguments().add(visitTypeArguments(typeArg));
            }
        }
        if (ctx.listSuffix() != null && !ctx.listSuffix().isEmpty()) {
            for (AngularParser.ListSuffixContext listSuffixCtx : ctx.listSuffix()) {
                singleDataType.getListSuffix().add(visitListSuffix(listSuffixCtx));
            }
        }
        return singleDataType ;
    }

    @Override
    public PrimitiveType visitPrimitiveType(AngularParser.PrimitiveTypeContext ctx) {
        PrimitiveType primitiveType = new PrimitiveType();
        // Get the text of whichever terminal node was matched
        primitiveType.setType(ctx.getText());
        return primitiveType;
    }

    @Override
    public ClassType visitClassType(AngularParser.ClassTypeContext ctx) {
        ClassType classType = new ClassType();
        classType.setIdentifier(ctx.IDENTIFIER().getText());
        return classType;
    }

    @Override
    public TypeArguments visitTypeArguments(AngularParser.TypeArgumentsContext ctx) {
        TypeArguments typeArguments = new TypeArguments();
        if (ctx.dataType() != null && !ctx.dataType().isEmpty()) {
            for (AngularParser.DataTypeContext dataTypeCtx : ctx.dataType()) {
                typeArguments.getDataTypes().add(visitDataType(dataTypeCtx));
            }
        }
        return typeArguments;
    }

    @Override
    public ListSuffix visitListSuffix(AngularParser.ListSuffixContext ctx) {
        ListSuffix listSuffix = new ListSuffix();
        if (ctx.LIST() != null)
            listSuffix.setList(ctx.LIST().getText());
        return listSuffix;
    }

//    @Override
//    public BlockProperty visitBlockProperty(AngularParser.BlockPropertyContext ctx) {
//        BlockProperty blockProperty = new BlockProperty();
//        if (ctx.localVariableDeclaration() != null)
//            blockProperty.setLocalVariableDeclaration(visitLocalVariableDeclaration(ctx.localVariableDeclaration()));
//        if (ctx.propertyAssignment() != null)
//            blockProperty.setPropertyAssignment(visitPropertyAssignment(ctx.propertyAssignment()));
//        return blockProperty;
//    }

    @Override
    public ParameterPropertyAssignment visitParameterPropertyAssignment(AngularParser.ParameterPropertyAssignmentContext ctx) {
        ParameterPropertyAssignment parameterPropertyAssignment =new ParameterPropertyAssignment();
        if(ctx.accessModifiers() != null)
            parameterPropertyAssignment.setAccessModifiers((visitAccessModifiers(ctx.accessModifiers())));
        if(ctx.READONLY() != null)
            parameterPropertyAssignment.setReadOnly(ctx.READONLY().getText());
        if(ctx.IDENTIFIER() != null)
            parameterPropertyAssignment.setIdentifier(ctx.IDENTIFIER().getText());
        if(ctx.assigment() != null)
            parameterPropertyAssignment.setAssignment(visitAssigment(ctx.assigment()));
        return  parameterPropertyAssignment;
    }

    @Override
    public LocalVariableDeclaration visitLocalVariableDeclaration(AngularParser.LocalVariableDeclarationContext ctx) {
        LocalVariableDeclaration localVariableDeclaration = new LocalVariableDeclaration();
        String nameLocalVar="";
        String value="";
        String type="";

        if(ctx.LET() != null)
            localVariableDeclaration.setLet(ctx.LET().getText());
        if(ctx.CONST() != null)
            localVariableDeclaration.setConst_(ctx.CONST().getText());
        if(ctx.IDENTIFIER() != null)
        {localVariableDeclaration.setIdentifier(ctx.IDENTIFIER().getText());
            nameLocalVar=ctx.IDENTIFIER().getText();
        }
        if(ctx.assignDataType() != null)
        {localVariableDeclaration.setAssignDataType(visitAssignDataType(ctx.assignDataType()));
            type=ctx.assignDataType().getText();}
        if(ctx.assigment() != null)
        {localVariableDeclaration.setAssigment(visitAssigment(ctx.assigment()));
            value=ctx.assigment().getText();
        }
        symbolTable.define(nameLocalVar, value, type,false);

        return localVariableDeclaration;
    }

    @Override
    public PropertyAssignment visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx) {
        PropertyAssignment propertyAssignment = new PropertyAssignment();
        if(ctx.propertyCall() != null)
            propertyAssignment.setPropertyCall((PropertyCall) visit(ctx.propertyCall()));
        if(ctx.compoundAssignment() != null)
            propertyAssignment.setCompoundAssignment(visitCompoundAssignment(ctx.compoundAssignment()));
        return propertyAssignment;
    }

    @Override
    public CompoundAssignment visitCompoundAssignment(AngularParser.CompoundAssignmentContext ctx) {
        CompoundAssignment compoundAssignment = new CompoundAssignment();

        if (ctx.PLUSEQ() != null) {
            compoundAssignment.setPlusEq(ctx.PLUSEQ().getText());
        } else if (ctx.MINUSEQ() != null) {
            compoundAssignment.setMinusEq(ctx.MINUSEQ().getText());
        } else if (ctx.STAREQ() != null) {
            compoundAssignment.setStarEq(ctx.STAREQ().getText());
        } else if (ctx.SLASHEQ() != null) {
            compoundAssignment.setSlashEq(ctx.SLASHEQ().getText());
        } else if (ctx.EQ() != null) {
            compoundAssignment.setEq(ctx.EQ().getText());
        }
        if (ctx.propertyValue() != null) {
            compoundAssignment.setPropertyValue((PropertyValue)visit(ctx.propertyValue()));
        }
        return compoundAssignment;
    }
    //======================================ALAA=========================================

    //======================================OULA=========================================
    //******************* start Component ********************
    //ComponentDeclaration

    @Override
    public ComponentDeclaration visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        if (ctx.COMPONENT() != null) {
            componentDeclaration.setComponent(ctx.COMPONENT().getText());
            semanticError.missingComponentImports(ctx.COMPONENT().getSymbol().getLine());
        }
        if (ctx.componentArguments() != null && !ctx.componentArguments().isEmpty()) {
            for (int i = 0; i < ctx.componentArguments().size(); i++) {
                if (ctx.componentArguments(i) != null) {
                    componentDeclaration.getComponentArguments().add( (ComponentArguments) visit(ctx.componentArguments(i))); /* */
                }
            }
        }
        return componentDeclaration;

    }

    //ComponentArguments
//    @Override
//    public ComponentArguments visitComponentArguments(AngularParser.ComponentArgumentsContext ctx) {
//        ComponentArguments componentArguments = new ComponentArguments();
//        if (ctx.importArg() != null) {
//            componentArguments.setImportArg(visitImportArg(ctx.importArg()));
//        }if (ctx.templateArg() != null) {
//            componentArguments.setTemplateArg((TemplateArg) visit(ctx.templateArg()));
//        }if (ctx.styleArg() != null) {
//            componentArguments.setStyleArg((StyleArg) visit(ctx.styleArg()));
//        }if (ctx.selectorArg() != null) {
//            componentArguments.setSelectorArg(visitSelectorArg(ctx.selectorArg()));
//        }if (ctx.standAloneArg() != null) {
//            componentArguments.setStandAloneArg(visitStandAloneArg(ctx.standAloneArg()));
//        }
//        return componentArguments;
//    }
    // SelectorArg
    @Override
    public SelectorArg visitSelectorArg(AngularParser.SelectorArgContext ctx) {
        SelectorArg selectorArg = new SelectorArg();
        if (ctx.SELECTOR() != null){
            selectorArg.setSelector(ctx.SELECTOR().getText());
        }
        if(ctx.STRING_LITERAL() != null){
            selectorArg.setStringLiteral(ctx.STRING_LITERAL().getText());
        }
        return selectorArg;
    }

    //StandAloneArg
    public StandAloneArg visitStandAloneArg(AngularParser.StandAloneArgContext ctx) {
        StandAloneArg standAloneArg = new StandAloneArg();
        if(ctx.STANDALONE() != null){
            standAloneArg.setStandAlone(ctx.STANDALONE().getText());
        }
        if(ctx.BOOL() != null){
            standAloneArg.setBool(ctx.BOOL().getText());
        }
        return standAloneArg;
    }
    //ImportArg
    @Override
    public ImportArg visitImportArg(AngularParser.ImportArgContext ctx) {
        ImportArg importArg = new ImportArg();
        if(ctx.IMPORTS() != null){
            importArg.setImports(ctx.IMPORTS().getText());
        }
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            if(ctx.IDENTIFIER() != null){
                importArg.getIdentifier().add((String) ctx.IDENTIFIER().toString());
                missingImportST.addSymbol(ctx.IDENTIFIER(i).getText(),"importArgClass",null,ctx.IDENTIFIER(i).getSymbol().getLine());
            }
        }
        return importArg;
    }

    @Override
    public Template visitTemplate(AngularParser.TemplateContext ctx) {
        Template template=new Template();

        if (ctx.TEMPLATE() != null) {
            template.setTemplate(ctx.TEMPLATE().getText());
        }

        if (ctx.htmlDocument() != null) {
            HtmlDocument htmlDocument = visitHtmlDocument(ctx.htmlDocument());
            template.setHtmlDocument(htmlDocument);
        }

        return template;
    }

    @Override
    public Styles visitStyles(AngularParser.StylesContext ctx) {
        Styles styles=new Styles();

        if (ctx.inlineStyle()!=null && !ctx.inlineStyle().isEmpty()){
            for (AngularParser.InlineStyleContext styleCtx : ctx.inlineStyle()) {
                styles.getInlineStyles().add(visitInlineStyle(styleCtx));
            }
        }

        return styles;
    }

    @Override
    public StyleUrl visitStyleUrl(AngularParser.StyleUrlContext ctx) {
        StyleUrl styleUrl=new StyleUrl();

        if (ctx.STYLES_URL()!=null){
            styleUrl.setStylesUrl(ctx.STYLES_URL().getText());
        }
        if (ctx.STRING_LITERAL()!=null){
            styleUrl.setStringLiteral(ctx.STRING_LITERAL().getText());
        }

        return styleUrl;
    }

    @Override
    public StyleUrls visitStyleUrls(AngularParser.StyleUrlsContext ctx) {
        StyleUrls styleUrls=new StyleUrls();

        if (ctx.STYLES_URLS()!=null){
            styleUrls.setStylesUrls(ctx.STYLES_URLS().getText());
        }

        if (ctx.STRING_LITERAL()!=null && !ctx.STRING_LITERAL().isEmpty()){
            for (int i=0;i<ctx.STRING_LITERAL().size();i++){
                styleUrls.getStringLiteral().add(ctx.STRING_LITERAL(i).getText());
            }
        }

        return styleUrls;
    }

    @Override
    public TemplateUrl visitTemplateUrl(AngularParser.TemplateUrlContext ctx) {
        TemplateUrl templateUrl=new TemplateUrl();

        if (ctx.TEMPLATE_URL()!=null){
            templateUrl.setTemplateUrl(ctx.TEMPLATE_URL().getText());
        }
        if (ctx.STRING_LITERAL()!=null){
            templateUrl.setStringLiteral(ctx.STRING_LITERAL().getText());
        }

        return templateUrl;
    }


//***************************** add templateArg && styleArg ************************************

    // InlineStyle
    @Override
    public InlineStyle visitInlineStyle(AngularParser.InlineStyleContext ctx) {
        InlineStyle inlineStyle = new InlineStyle();
        if(ctx.cssDocument() != null && !ctx.cssDocument().isEmpty()){

            for (AngularParser.CssDocumentContext inlineStyleCtx : ctx.cssDocument()) {
                inlineStyle.getCssDocument().add(visitCssDocument(inlineStyleCtx));
            }
        }
        return inlineStyle;
    }

//******************* end Component ********************


//******************* Start Method ********************

    @Override
    public MethodDeclaration visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
        MethodDeclaration methodDeclaration = new MethodDeclaration();

        symbolTable.enterScope( ctx.IDENTIFIER().getText());
        symbolTable.currentScope().setType("method ");

        if (ctx.decorator() != null && !ctx.decorator().isEmpty()) {
            for (int i = 0; i < ctx.decorator().size(); i++) {
                if (ctx.decorator(i) != null) {
                    methodDeclaration.getDecorator().add(visitDecorator(ctx.decorator(i)));
                }
            }
        }
        if (ctx.accessModifiers() != null && !ctx.accessModifiers().isEmpty()) {
            java.util.List<AccessModifiers> modifiers = new ArrayList<>();
            for (AngularParser.AccessModifiersContext amCtx : ctx.accessModifiers()) {
                if (amCtx != null) {
                    modifiers.add(visitAccessModifiers(amCtx));
                }
            }
            methodDeclaration.setAccessModifiers(modifiers);
        }

        if (ctx.ASYNC() != null) {
            methodDeclaration.setAsync(ctx.ASYNC().getText());}

        if (ctx.STATIC() != null) {
            methodDeclaration.setStatic_(ctx.STATIC().getText());}

        if (ctx.IDENTIFIER() != null) {
            methodDeclaration.setIdentifier(ctx.IDENTIFIER().getText());}

        if (ctx.parameterList() != null) {
            methodDeclaration.setParameterList(visitParameterList(ctx.parameterList()));
        }

        if (ctx.returnType() != null) {
            methodDeclaration.setReturnType(visitReturnType(ctx.returnType()));
        }
        if (ctx.assigmentToNull() != null) {
            methodDeclaration.setAssigmentToNull(visitAssigmentToNull(ctx.assigmentToNull()));
        }
        if (ctx.methodBody() != null && !ctx.methodBody().isEmpty()) {
            for (int i = 0; i < ctx.methodBody().size(); i++) {
                if (ctx.methodBody(i) != null) {
                    methodDeclaration.getMethodBody().add( (MethodBody) visit(ctx.methodBody(i))); /* */
                }
            }
        }
        symbolTable.exitScope();
        return methodDeclaration;

    }

    @Override
    public Decorator visitDecorator(AngularParser.DecoratorContext ctx) {
        Decorator decorator = new Decorator();
        if (ctx.IDENTIFIER() != null) {
            decorator.setIdentifier(ctx.IDENTIFIER().getText());
        }
        return decorator;

    }

    @Override
    public ReturnType visitReturnType(AngularParser.ReturnTypeContext ctx) {
        ReturnType returnType = new ReturnType();
        if (ctx.dataType() != null) {
            returnType.setDataType(visitDataType(ctx.dataType()));
        }
        return returnType;

    }

    //    @Override
//    public MethodBody visitMethodBody(AngularParser.MethodBodyContext ctx) {
//        MethodBody methodBody = new MethodBody();
//        if (ctx.returnStatement() != null) {
//            methodBody.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
//        }
//        if (ctx.commonStatement() != null) {
//            methodBody.setCommonStatement(visitCommonStatement(ctx.commonStatement()));
//        }
//        if (ctx.methodBodyProperty() != null) {
//            methodBody.setMethodBodyProperty(visitMethodBodyProperty(ctx.methodBodyProperty()));
//        }
//        if (ctx.propertyCall() != null) {
//            methodBody.setPropertyCall((PropertyCall) visit(ctx.propertyCall()));
//        }
//
//        return methodBody;
//
//    }
    @Override
    public ReturnStatement visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        ReturnStatement returnStatement = new ReturnStatement();
        if (ctx.RETURN() != null) {
            returnStatement.setReturn_(ctx.RETURN().getText());}
        if (ctx.expression() != null) {
            returnStatement.setExpression((Expression)visit(ctx.expression()));
        }
        return returnStatement;
    }

//    @Override
//    public MethodBodyProperty visitMethodBodyProperty(AngularParser.MethodBodyPropertyContext ctx) {
//        MethodBodyProperty methodBodyProperty = new MethodBodyProperty();
//        if (ctx.localVariableDeclaration() != null) {
//            methodBodyProperty.setLocalVariableDeclaration(visitLocalVariableDeclaration(ctx.localVariableDeclaration()));
//        }
//        if (ctx.propertyAssignment() != null) {
//            methodBodyProperty.setPropertyAssignment(visitPropertyAssignment(ctx.propertyAssignment()));
//        }
//        return methodBodyProperty;
//    }

    @Override
    public AssigmentToNull visitAssigmentToNull(AngularParser.AssigmentToNullContext ctx) {
        AssigmentToNull assigmentToNull = new AssigmentToNull();
        if (ctx.OR() != null) {
            assigmentToNull.setOr(ctx.OR().getText());
        }
        for (int i = 0; i < ctx.NULL().size(); i++) {
            if (ctx.NULL(i) != null) {
                assigmentToNull.getNull_().add(ctx.NULL(i).getText());
            }
        }
        return assigmentToNull;

    }
    //======================================OULA=========================================


    //*************************************SARA****************************************//



    //=========== HTML =====================

    @Override
    public HtmlDocument visitHtmlDocument(AngularParser.HtmlDocumentContext ctx) {
        HtmlDocument htmlDocument = new HtmlDocument();
        for (int i=0 ; i< ctx.htmlElement().size(); i++){
            if(ctx.htmlElement() != null){
                htmlDocument.getHtmlElement().add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        return htmlDocument;
    }


    @Override
    public HtmlElement visitHtmlElement(AngularParser.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();

        if (ctx.openTag() != null){
            htmlElement.setOpenTag(visitOpenTag(ctx.openTag()));
        }
        for (int i=0 ; i< ctx.htmlContentBody().size(); i++) {
            if (ctx.htmlContentBody(i) != null){ //hereeee
                htmlElement.getHtmlContentBody().add((HtmlContentBody) visit(ctx.htmlContentBody(i)));
            }
        }
        if (ctx.closeTag() != null){
            htmlElement.setCloseTag(visitCloseTag(ctx.closeTag()));
        }
        if(ctx.selfClosingTag() != null){
            htmlElement.setSelfClosingTag(visitSelfClosingTag(ctx.selfClosingTag()));
        }

        return htmlElement;
    }

    @Override
    public OpenTag visitOpenTag(AngularParser.OpenTagContext ctx) {
        OpenTag openTag = new OpenTag();
        if (ctx.IDENTIFIER() != null){
            openTag.setIdentifier(ctx.IDENTIFIER().getText());
        }
        for (int i=0 ; i< ctx.htmlAttribute().size(); i++) {
            if (ctx.htmlAttribute(i) != null){
                openTag.getHtmlAttributeArray().add( (HtmlAttribute) visit(ctx.htmlAttribute(i))); /* */
            }
        }
        return openTag;
    }

    @Override
    public CloseTag visitCloseTag(AngularParser.CloseTagContext ctx){
        CloseTag closeTag = new CloseTag();
        if(ctx.IDENTIFIER() != null){
            closeTag.setCloseTagName(ctx.IDENTIFIER().getText());
        }
        return closeTag ;
    }

    @Override
    public SelfClosingTag visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx){
        SelfClosingTag selfClosingTag = new SelfClosingTag();
        if(ctx.IDENTIFIER() != null ){
            selfClosingTag.setIdentifier(ctx.IDENTIFIER().getText());
        }
        for (int i=0 ; i< ctx.htmlAttribute().size(); i++) {
            if (ctx.htmlAttribute(i) != null){
                selfClosingTag.getHtmlAttributes().add( (HtmlAttribute) visit(ctx.htmlAttribute(i))); /* */
            }
        }
        return selfClosingTag ;
    }

//    @Override
//    public HtmlAttribute visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) {
//        HtmlAttribute htmlAttribute = new HtmlAttribute();
//        if(ctx.basicAttribute() != null)
//            htmlAttribute.setBasicAttribute(visitBasicAttribute(ctx.basicAttribute()));
//        if (ctx.ngFor() != null)
//            htmlAttribute.setNgFor(visitNgFor(ctx.ngFor()));
//
//        if (ctx.ngIF() != null)
//            htmlAttribute.setNgIf(visitNgIF(ctx.ngIF()));
//
//        if (ctx.imageAttribute() != null)
//            htmlAttribute.setImageAttribute( visitImageAttribute(ctx.imageAttribute()));
//
//        if (ctx.actionAttribute() != null)
//            htmlAttribute.setActionAttribute( visitActionAttribute(ctx.actionAttribute()));
//
//        return htmlAttribute;
//    }

    @Override
    public BasicAttribute visitBasicAttribute(AngularParser.BasicAttributeContext ctx) {
        BasicAttribute basicAttribute = new BasicAttribute();
        if(ctx.IDENTIFIER() != null){
            basicAttribute.setIdentifier(ctx.IDENTIFIER().getText());
        }
        if(ctx.CLASS() != null){
            basicAttribute.setC_lass(ctx.CLASS().getText());
        }
        if(ctx.STRING_LITERAL() != null){
            basicAttribute.setStringLiteral(ctx.STRING_LITERAL().getText());
        }
        return basicAttribute;
    }

    @Override
    public NgFor visitNgFor(AngularParser.NgForContext ctx) {
        NgFor ngFor = new NgFor();
        if(ctx.NG_FOR() != null){
            ngFor.setNgFor(ctx.NG_FOR().getText());
        }
        if(ctx.STRING_LITERAL() !=null){
            ngFor.setStringLiteral(ctx.STRING_LITERAL().getText());
        }
        return ngFor;
    }

    @Override
    public NgIF visitNgIF(AngularParser.NgIFContext ctx) {
        NgIF ngIF = new NgIF();
        if(ctx.NG_IF() != null){
            ngIF.setNgIf(ctx.NG_IF().getText());
        }
        if(ctx.STRING_LITERAL() != null){
            ngIF.setStringLiteral(ctx.STRING_LITERAL().getText());
        }
        return ngIF;
    }

    @Override
    public ImageAttribute visitImageAttribute(AngularParser.ImageAttributeContext ctx) {
        ImageAttribute imageAttribute=new ImageAttribute();
        if(ctx.IMAGE_SRC()!=null){
            imageAttribute.setImageSrc(ctx.IMAGE_SRC().getText());
        }
        if(ctx.STRING_LITERAL()!=null){
            imageAttribute.setStringLiteral(ctx.STRING_LITERAL().getText());
        }
        if(ctx.basicAttribute()!=null && !ctx.basicAttribute().isEmpty()){
            for (int i = 0; i < ctx.basicAttribute().size(); i++) {
                if (ctx.basicAttribute(i) != null){
                    imageAttribute.getBasicAttribute().add(visitBasicAttribute(ctx.basicAttribute(i)));
                }
            }
        }
        return imageAttribute;
    }


    @Override
    public ActionAttribute visitActionAttribute(AngularParser.ActionAttributeContext ctx) {
        ActionAttribute actionAttribute=new ActionAttribute();
        if(ctx.CLICK()!=null){
            actionAttribute.setClick(ctx.CLICK().getText());
        }
        if(ctx.STRING_LITERAL()!=null){
            actionAttribute.setStringLiteral(ctx.STRING_LITERAL().getText());
        }
        return actionAttribute;
    }

    @Override
    public TemplateRef visitTemplateRef(AngularParser.TemplateRefContext ctx) {
        TemplateRef templateRef = new TemplateRef();

        if(ctx.IDENTIFIER()!= null){
            templateRef.setRefValue(ctx.IDENTIFIER().getText());
        }
        return  templateRef ;
    }

    @Override
    public BooleanAttribute visitBooleanAttribute(AngularParser.BooleanAttributeContext ctx) {
        BooleanAttribute booleanAttribute = new BooleanAttribute();
        if(ctx.IDENTIFIER() !=null){
            booleanAttribute.setIdentifier(ctx.IDENTIFIER().getText());
        }

        return booleanAttribute ;
    }

    @Override
    public PropertyBinding visitPropertyBinding(AngularParser.PropertyBindingContext ctx) {
        PropertyBinding propertyBinding = new PropertyBinding();
        if(ctx.IDENTIFIER() != null){
            propertyBinding.setPropertyName(ctx.IDENTIFIER().getText());
        }

        if(ctx.STRING_LITERAL() != null){
            propertyBinding.setPropertyValue(ctx.STRING_LITERAL().getText());
        }

        return  propertyBinding ;
    }

    @Override
    public TwoWayBinding visitTwoWayBinding(AngularParser.TwoWayBindingContext ctx) {
        TwoWayBinding twoWayBinding = new TwoWayBinding();

        if(ctx.IDENTIFIER() != null){
            twoWayBinding.setName(ctx.IDENTIFIER().getText());
        }
        if(ctx.STRING_LITERAL() != null){
            twoWayBinding.setValue(ctx.STRING_LITERAL().getText());
        }

        return twoWayBinding ;
    }

    @Override
    public EventBinding visitEventBinding(AngularParser.EventBindingContext ctx){
        EventBinding eventBinding = new EventBinding();
        if(ctx.IDENTIFIER() != null){
            eventBinding.setEventName(ctx.IDENTIFIER().getText());
        }
        if(ctx.IDENTIFIER() != null){
            eventBinding.setEventValue(ctx.IDENTIFIER().getText());
        }
        return eventBinding;
    }


    @Override
    public HtmlContentBody visitHtmlContentBody(AngularParser.HtmlContentBodyContext ctx) {
        HtmlContentBody htmlContentBody = new HtmlContentBody();
        if (ctx.IDENTIFIER() != null){
            htmlContentBody.setHtmlIdentifier(ctx.IDENTIFIER().getText());
        }
//        if(ctx.operation() != null){
//            htmlContentBody.setHtmlContentOperation(visitOperation(ctx.operation()));
//        }
        if (ctx.htmlElement() != null ){
            htmlContentBody.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        }
        if(ctx.objectExpression() != null){
            htmlContentBody.setObjectExpression(visitObjectExpression(ctx.objectExpression()));
        }

        return htmlContentBody;
    }

    @Override
    public ObjectExpression visitObjectExpression(AngularParser.ObjectExpressionContext ctx) {
        ObjectExpression objectExpression = new ObjectExpression();

        objectExpression.setPropertyValue((PropertyValue) visit(ctx.propertyValue()));

        PropertyValue propertyValue = objectExpression.getPropertyValue();

        if (propertyValue instanceof SimplePropertyCall){

            List<String> identifiers= ((SimplePropertyCall) propertyValue).getIdentifiers();
            htmlBindingsToValidate.add(identifiers);  // 👈 Store for later
//                System.out.println(identifiers);
            MissedHTMLSymbolTable missedHTMLSymbolTable =new MissedHTMLSymbolTable();
//                for (int i = identifiers.size() - 1; i >= 0; i--) {
//                    MissedHTMLSymbolTable temp = new MissedHTMLSymbolTable(identifiers.get(i));
//                    temp.addChild(identifiers.get(i), missedHTMLSymbolTable);
//                    missedHTMLSymbolTable = temp;
//                }
//                symbolTable2.addChild(" ",missedHTMLSymbolTable);

//            System.out.println("\n \n-------HTML CODE---------");
//            symbolTable2.print(" ");
//            System.out.println("-------END HTML CODE------------");

        } else if (propertyValue instanceof ObjectValue) {
            ObjectValue objectValue= ((ObjectValue) propertyValue) ;
            symbolTable2.addChild(" ",new MissedHTMLSymbolTable(objectValue.getIdentifier()));
            List<String>l=new ArrayList<>();
            l.add(objectValue.getIdentifier());
            htmlBindingsToValidate.add(l);
//            System.out.println("\n \n-------HTML CODE2---------");
//            symbolTable2.print(" ");
//            System.out.println("-------END HTML CODE2------------\n \n");
        }



        return objectExpression;
    }

//    @Override
//    public ObjectExpressionValue visitObjectExpressionValue(AngularParser.ObjectExpressionValueContext ctx) {
//        ObjectExpressionValue objectExpressionValue = new ObjectExpressionValue();
//        for (int i=0 ; i< ctx.IDENTIFIER().size() ; i++){
//            if(ctx.IDENTIFIER(i) != null){
//                objectExpressionValue.getIdentifiers().add(ctx.IDENTIFIER(i).getText());
//            }
//        }
//        return objectExpressionValue;
//    }

    //=================================
    //=========css====================
    @Override
    public CssDocument visitCssDocument(AngularParser.CssDocumentContext ctx) {
        CssDocument cssDocument = new CssDocument();
        for (int i=0 ; i< ctx.cssSelector().size() ; i++){
            if(ctx.cssSelector(i) != null){
                cssDocument.getCssSelector().add(visitCssSelector(ctx.cssSelector(i)));
            }
        }
        for (int i=0 ; i< ctx.cssRule().size() ; i++){
            if(ctx.cssRule(i) != null){
                cssDocument.getCssRules().add(visitCssRule(ctx.cssRule(i)));
            }
        }
        return cssDocument;
    }


    @Override
    public CssRule visitCssRule(AngularParser.CssRuleContext ctx) {
        CssRule cssRule = new CssRule();
        if(ctx.IDENTIFIER() != null){
            cssRule.setIdentifier(ctx.IDENTIFIER().getText());
        }
        for (int i=0 ; i< ctx.ruleValue().size() ; i++){
            if(ctx.ruleValue(i) != null){
                cssRule.getRuleValues().add(visitRuleValue(ctx.ruleValue(i)));
            }
        }
        return cssRule;
    }

    @Override
    public RuleValue visitRuleValue(AngularParser.RuleValueContext ctx) {
        RuleValue ruleValue = new RuleValue();
        if(ctx.IDENTIFIER() != null){
            ruleValue.setIdentifier(ctx.IDENTIFIER().getText());
        }
        if(ctx.NUMERIC_LITERAL() != null){
            if(ctx.PX() != null) {
                ruleValue.setNumericLiteralPx(ctx.NUMERIC_LITERAL().getText());
            }
            if (ctx.PERCENTAGE() != null){
                ruleValue.setNumericLiteralPrecentage(ctx.NUMERIC_LITERAL().getText());
            }
        }
        if(ctx.COLOR() != null){
            ruleValue.setColor(ctx.COLOR().getText());
        }
        return ruleValue;
    }

    //================== ConstructorBloc =====================


    @Override
    public ConstructorDeclaration visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx) {
        ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration();

        if(ctx.CONSTRUCTOR() != null){
            constructorDeclaration.setConstructor(ctx.CONSTRUCTOR().getText());
        }
        if(ctx.constructorParams() != null){
            constructorDeclaration.setConstructorParams(visitConstructorParams(ctx.constructorParams()));
        }
        for (int i=0 ; i< ctx.constructorBody().size() ; i++){
            if(ctx.constructorBody(i) != null){
                constructorDeclaration.getConstructorBody().add( (ConstructorBody) visit(ctx.constructorBody(i)));/* */
            }
        }
        return  constructorDeclaration ;
    }

    @Override
    public CssSelector visitCssSelector(AngularParser.CssSelectorContext ctx) {
        CssSelector cssSeletor = new CssSelector();

        if(ctx.IDENTIFIER() != null && !ctx.isEmpty()){
            for (int i=0 ; i< ctx.IDENTIFIER().size() ; i++) {
                if (ctx.IDENTIFIER(i) != null) {
                    cssSeletor.getSelectors().add(ctx.IDENTIFIER(i).getText());/* */
                }
            }
        }

        if(ctx.attributeSelector() != null && !ctx.attributeSelector().isEmpty()){
            for (AngularParser.AttributeSelectorContext cssCtx : ctx.attributeSelector()) {
                cssSeletor.getAttributeSelectorList().add(visitAttributeSelector(cssCtx));
            }
        }
        return cssSeletor ;
    }

    @Override
    public AttributeSelector visitAttributeSelector(AngularParser.AttributeSelectorContext ctx) {
        AttributeSelector attributeSelector = new AttributeSelector();
        if(ctx.IDENTIFIER() != null){
            attributeSelector.setAttributeSelectorName(ctx.IDENTIFIER().getText());
        }
        if(ctx.STRING_LITERAL() != null){
            attributeSelector.setAttributeSelectorValue(ctx.STRING_LITERAL().getText());
        }

        return  attributeSelector ;
    }

    @Override
    public ConstructorParams visitConstructorParams(AngularParser.ConstructorParamsContext ctx) {
        ConstructorParams constructorParams = new ConstructorParams();
        for (int i=0 ; i< ctx.constructorParam().size() ; i++){
            if(ctx.constructorParam(i) != null){
                constructorParams.getConstructorParam().add(visitConstructorParam(ctx.constructorParam(i)));
            }
        }
        return constructorParams ;
    }

//    @Override
//    public ConstructorBody visitConstructorBody(AngularParser.ConstructorBodyContext ctx) {
//        ConstructorBody constructorBody = new ConstructorBody();
//        if(ctx.constructorBodyProperty() != null){
//            constructorBody.setConstructorBodyProperty(visitConstructorBodyProperty(ctx.constructorBodyProperty()));
//        }
//        if(ctx.commonStatement() != null){
//            constructorBody.setCommonStatement(visitCommonStatement(ctx.commonStatement()));
//        }
//        return constructorBody ;
//
//    }

    @Override
    public ConstructorParam visitConstructorParam(AngularParser.ConstructorParamContext ctx) {
        ConstructorParam constructorParam = new ConstructorParam();
        if(ctx.accessModifiers() != null){
            constructorParam.setAccessModifiers(visitAccessModifiers(ctx.accessModifiers()));
        }
        if(ctx.dataType() != null){
            constructorParam.setDataType((DataType) visit(ctx.dataType()));
        }
        if(ctx.IDENTIFIER() != null){
            constructorParam.setConstructorParamName(ctx.IDENTIFIER().getText());
        }
        return constructorParam ;
    }

//    @Override
//    public ConstructorBodyProperty visitConstructorBodyProperty(AngularParser.ConstructorBodyPropertyContext ctx) {
//        ConstructorBodyProperty constructorBodyProperty = new ConstructorBodyProperty();
//        if(ctx.parameterPropertyAssignment() != null){
//            constructorBodyProperty.setParameterPropertyAssignment(visitParameterPropertyAssignment(ctx.parameterPropertyAssignment()));
//        }
//        if(ctx.methodBodyProperty() != null){
//            constructorBodyProperty.setMethodBodyProperty( (MethodBodyProperty) visit(ctx.methodBodyProperty()));/**/
//        }
//        return constructorBodyProperty ;
//    }

//    @Override
//    public CommonStatement visitCommonStatement(AngularParser.CommonStatementContext ctx) {
//        CommonStatement commonStatement = new CommonStatement();
//        if(ctx.printStatement() != null){
//            commonStatement.setPrintStatement(visitPrintStatement(ctx.printStatement()));
//        }
//        if(ctx.conditionalStatement() != null){
//            commonStatement.setConditionStatement(visitConditionalStatement(ctx.conditionalStatement()));
//        }
//        if(ctx.switchStatement() != null){
//            commonStatement.setSwitchStatement(visitSwitchStatement(ctx.switchStatement()));
//        }
//        if(ctx.forStatement() != null){
//            commonStatement.setForStatement((ForStatement) visit(ctx.forStatement()));
//        }
//        if(ctx.whileStatement() != null){
//            commonStatement.setWhileStatement(visitWhileStatement(ctx.whileStatement()));
//        }
//        if(ctx.doWhileStatement() != null){
//            commonStatement.setDoWhileStatement(visitDoWhileStatement(ctx.doWhileStatement()));
//        }
//
//        return commonStatement ;
//    }

    //========== SwitchStatement ========
    @Override
    public SwitchStatement visitSwitchStatement(AngularParser.SwitchStatementContext ctx) {
        SwitchStatement st = new SwitchStatement();
        if(ctx.SWITCH() != null){
            st.setSwitch_KeyWord(ctx.SWITCH().getText());
        }
        if(ctx.expression() != null){
            st.setExpression((Expression) visit(ctx.expression()));
        }
        for (int i = 0; i < ctx.caseBlock().size(); i++) {
            if (ctx.caseBlock(i) != null){
                st.getCaseBlocks().add(visitCaseBlock(ctx.caseBlock(i)));
            }
        }
        if(ctx.defaultBlock() != null){
            st.setDefaultBlock(visitDefaultBlock(ctx.defaultBlock()));
        }
        return st ;

    }

    @Override
    public CaseBlock visitCaseBlock(AngularParser.CaseBlockContext ctx) {
        CaseBlock caseBlock = new CaseBlock();
        if(ctx.CASE() != null){
            caseBlock.setCase_KeyWord(ctx.CASE().getText());
        }
        if(ctx.caseValue() != null){
            caseBlock.setCaseValue(visitCaseValue(ctx.caseValue()));
        }
        if(ctx.BREAK() != null){
            caseBlock.setBreak_KeyWord(ctx.BREAK().getText());
        }
        for (int i = 0; i < ctx.caseStatement().size(); i++) {
            if (ctx.caseStatement(i) != null){
                caseBlock.getCaseStatementList().add( (CaseStatement) visit(ctx.caseStatement(i))); /* */
            }
        }
        return caseBlock ;
    }

//    @Override
//    public CaseStatement visitCaseStatement(AngularParser.CaseStatementContext ctx) {
//        CaseStatement cs = new CaseStatement();
//        if(ctx.blockProperty() != null) {
//            cs.setBlockProperty( (BlockProperty) visit(ctx.blockProperty()));/* */
//        }
//        if(ctx.methodCall() != null) {
//            cs.setMethodCall(visitMethodCall(ctx.methodCall()));
//        }
//        if(ctx.returnStatement() != null) {
//            cs.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
//        }
//        if(ctx.conditionalStatement() != null) {
//            cs.setConditionStatement(visitConditionalStatement(ctx.conditionalStatement()));
//        }
//        if(ctx.propertyCall() != null) {
//            cs.setPropertyCall((PropertyCall)visit(ctx.propertyCall()));
//        }
//        if(ctx.switchStatement() != null) {
//            cs.setSwitchStatement(visitSwitchStatement(ctx.switchStatement()));
//        }
//        return cs ;
//    }

    @Override
    public CaseValue visitCaseValue(AngularParser.CaseValueContext ctx) {
        CaseValue caseValue = new CaseValue();
        if(ctx.STRING_LITERAL() != null){
            caseValue.setStringCaseValue(ctx.STRING_LITERAL().getText());
        }
        if(ctx.NUMERIC_LITERAL() != null){
            caseValue.setCaseValue(ctx.NUMERIC_LITERAL().getText());
        }
        if(ctx.IDENTIFIER() != null){
            caseValue.setCaseValue(ctx.IDENTIFIER().getText());
        }
        return  caseValue ;
    }


    @Override
    public DefaultBlock visitDefaultBlock(AngularParser.DefaultBlockContext ctx) {
        DefaultBlock db = new DefaultBlock();
        if(ctx.DEFAULT() != null){
            db.setDefault_KeyWord(ctx.DEFAULT().getText());
        }
        if(ctx.BREAK() != null){
            db.setBreak_KeyWord(ctx.BREAK().getText());
        }
        for (int i = 0; i < ctx.caseStatement().size(); i++) {
            if (ctx.caseStatement(i) != null){
                db.getCaseStatementList().add( (CaseStatement) visit(ctx.caseStatement(i))); /*  */
            }
        }
        return db ;
    }

    //===============================
    //==== Conditional Stmt
    @Override
    public ConditionalStatement visitConditionalStatement(AngularParser.ConditionalStatementContext ctx) {
        ConditionalStatement conditionStatement = new ConditionalStatement();
        if(ctx.IF() != null) {
            conditionStatement.setIf_KeyWord(ctx.IF().getText());
        }
        if(ctx.expression() != null) {
            conditionStatement.setExpression((Expression) visit(ctx.expression()));
        }
        if(ctx.block() != null) {
            conditionStatement.setBlock(visitBlock(ctx.block()));
        }
        for (int i = 0; i < ctx.elseIfStatement().size(); i++) {
            if (ctx.elseIfStatement(i) != null){
                conditionStatement.getElseIfStmt().add(visitElseIfStatement(ctx.elseIfStatement(i)));
            }
        }
        if(ctx.elseStatement() != null) {
            conditionStatement.setElseStatement(visitElseStatement(ctx.elseStatement()));
        }
        return conditionStatement ;
    }

    @Override
    public ElseIfStatement visitElseIfStatement(AngularParser.ElseIfStatementContext ctx) {
        ElseIfStatement elseif = new ElseIfStatement();
        if(ctx.ELSE() != null){
            elseif.setElse_(ctx.ELSE().getText());
        }
        if(ctx.IF() != null){
            elseif.setIf_(ctx.IF().getText());
        }
        if(ctx.expression() != null){
            elseif.setExpression((Expression) visit(ctx.expression()));
        }
        if(ctx.block() != null){
            elseif.setBlock(visitBlock(ctx.block()));
        }
        return  elseif ;
    }

    @Override
    public ElseStatement visitElseStatement(AngularParser.ElseStatementContext ctx) {
        ElseStatement elseStatement = new ElseStatement();
        if(ctx.ELSE() != null){
            elseStatement.setElse_(ctx.ELSE().getText());
        }
        if(ctx.block() != null){
            elseStatement.setBlock(visitBlock(ctx.block()));
        }
        return  elseStatement ;

    }
    //======== forStatement =============

    @Override
    public TraditionalFor visitTraditionalFor(AngularParser.TraditionalForContext ctx) {
        TraditionalFor traditionalFor = new TraditionalFor();
        if(ctx.FOR() != null){
            traditionalFor.setFor_KeyWord(ctx.FOR().getText());
        }
        if(ctx.declareVarsKeyword() != null){
            traditionalFor.setDeclareVarsKeyWord(visitDeclareVarsKeyword(ctx.declareVarsKeyword()));
        }
        if(ctx.forInitializer() != null){
            traditionalFor.setForInitializer( (ForInitializer) visit(ctx.forInitializer())); /* */
        }
        if (ctx.expression()!=null && !ctx.expression().isEmpty()){
            if (ctx.expression(0) != null) {
                traditionalFor.setConditionExpression((Expression) visit(ctx.expression(0)));
            }
            if (ctx.expression().size() >= 2 && ctx.expression(1) != null) {
                traditionalFor.setUpdateExpression((Expression) visit(ctx.expression(1)));
            }
        }
        if(ctx.block() != null){
            traditionalFor.setBlock(visitBlock(ctx.block()));
        }
        return  traditionalFor ;
    }


    @Override
    public DeclareVarsKeyWord visitDeclareVarsKeyword(AngularParser.DeclareVarsKeywordContext ctx) {
        DeclareVarsKeyWord dKeyWord = new DeclareVarsKeyWord();
        if(ctx.VAR() != null){
            dKeyWord.setVar_KeyWord(ctx.VAR().getText());
        }
        if(ctx.LET() != null){
            dKeyWord.setLet_KeyWord(ctx.LET().getText());
        }
        if(ctx.CONST() != null){
            dKeyWord.setConst_KeyWord(ctx.CONST().getText());
        }
        return dKeyWord ;
    }

    @Override
    public ForInLoop visitForInLoop(AngularParser.ForInLoopContext ctx) {
        ForInLoop forinLoop = new ForInLoop();
        if(ctx.FOR() != null){
            forinLoop.setFor_KeyWord(ctx.FOR().getText());
        } if(ctx.declareVarsKeyword() != null){
            forinLoop.setDeclareVarsKeyWord(visitDeclareVarsKeyword(ctx.declareVarsKeyword()));
        } if(ctx.IDENTIFIER() != null){
            forinLoop.setFor_Identifier(ctx.IDENTIFIER().getText());
        } if(ctx.IN() != null){
            forinLoop.setIn_KeyWord(ctx.IN().getText());
        } if(ctx.expression() != null){
            forinLoop.setExpression((Expression) visit(ctx.expression()));
        } if(ctx.block() != null){
            forinLoop.setBlock(visitBlock(ctx.block()));
        }
        return forinLoop ;
    }

    @Override
    public ForOfLoop visitForOfLoop(AngularParser.ForOfLoopContext ctx) {
        ForOfLoop forOfLoop = new ForOfLoop();
        if(ctx.FOR() != null){
            forOfLoop.setFor_KeyWord(ctx.FOR().getText());
        } if(ctx.declareVarsKeyword() != null){
            forOfLoop.setDeclareVarsKeyWord(visitDeclareVarsKeyword(ctx.declareVarsKeyword()));
        } if(ctx.IDENTIFIER() != null){
            forOfLoop.setFor_Identifier(ctx.IDENTIFIER().getText());
        } if(ctx.OF() != null){
            forOfLoop.setOf_KeyWord(ctx.OF().getText());
        } if(ctx.expression() != null){
            forOfLoop.setExpression((Expression) visit(ctx.expression()));
        } if(ctx.block() != null){
            forOfLoop.setBlock(visitBlock(ctx.block()));
        }
        return forOfLoop ;
    }

//    @Override
//    public ForInitializer visitForInitializer(AngularParser.ForInitializerContext ctx) {
//        ForInitializer forInitializer = new ForInitializer();
//        if(ctx.variableDeclarationList() != null){
//            forInitializer.setVariableDeclarationList(visitVariableDeclarationList(ctx.variableDeclarationList()));
//        }
//        if(ctx.blockProperty() != null){
//            forInitializer.setBlockProperty( (BlockProperty) visit(ctx.blockProperty())); /* */
//        }
//        return forInitializer ;
//    }

    @Override
    public VariableDeclarationList visitVariableDeclarationList(AngularParser.VariableDeclarationListContext ctx) {
        VariableDeclarationList lists = new VariableDeclarationList();

        for (int i=0 ; i< ctx.variableDeclaration().size(); i++){
            if(ctx.variableDeclaration() != null){
                lists.getVariableDeclaration().add(visitVariableDeclaration(ctx.variableDeclaration().get(i)));
            }
        }
        return  lists ;
    }
    //-----------------------------
    @Override
    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclaration vd = new VariableDeclaration();
        if(ctx.IDENTIFIER() != null){
            vd.setVariableName(ctx.IDENTIFIER().getText());
        }
        if(ctx.dataType() != null){
            vd.setDataType((DataType) visit(ctx.dataType()));
        }
        if(ctx.expression() != null){
            vd.setExpression( (Expression) visit(ctx.expression()));
        }
        return vd;
    }


    @Override
    public WhileStatement visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        WhileStatement whileStatement = new WhileStatement();

        if(ctx.WHILE() != null){
            whileStatement.setWhile_KeyWord(ctx.WHILE().getText());
        }
        if(ctx.expression() != null){
            whileStatement.setExpression((Expression) visit(ctx.expression()));
        }
        if(ctx.block() != null){
            whileStatement.setBlock(visitBlock(ctx.block()));
        }
        return whileStatement ;
    }

    @Override
    public DoWhileStatement visitDoWhileStatement(AngularParser.DoWhileStatementContext ctx) {
        DoWhileStatement doWhileStatement = new DoWhileStatement();
        if(ctx.DO() != null){
            doWhileStatement.setDo_KeyWord(ctx.DO().getText());
        }
        if(ctx.WHILE() != null){
            doWhileStatement.setWhile_KeyWord(ctx.WHILE().getText());
        }
        if(ctx.expression() != null){
            doWhileStatement.setExpression((Expression) visit(ctx.expression()));
        }
        if(ctx.block() != null){
            doWhileStatement.setBlock(visitBlock(ctx.block()));
        }
        return doWhileStatement ;
    }

    @Override
    public Block visitBlock(AngularParser.BlockContext ctx) {
        Block block = new Block();
        for (int i=0 ; i< ctx.blockProperty().size(); i++){
            if(ctx.blockProperty(i) != null){
                block.getBlockProperties().add( (BlockProperty) visit(ctx.blockProperty(i)));/* */
            }
        }

        for (int i=0 ; i< ctx.commonStatement().size(); i++){
            if(ctx.commonStatement(i) != null){
                block.getCommonStatements().add( (CommonStatement) visit(ctx.commonStatement(i))); /* */
            }
        }

        for (int i=0 ; i< ctx.returnStatement().size(); i++){
            if (ctx.returnStatement(i)!=null){
                block.getReturnStatements().add(visitReturnStatement(ctx.returnStatement(i))); /* */
            }
        }
        return  block ;

    }

    @Override
    public RoutesDeclaration visitRoutesDeclaration(AngularParser.RoutesDeclarationContext ctx) {
        RoutesDeclaration routingDeclaration = new RoutesDeclaration();

        if (ctx.EXPORT() != null) {
            routingDeclaration.setExport(ctx.EXPORT().getText());
        }

        if (ctx.declareVarsKeyword() != null) {
            routingDeclaration.setDeclareVarsKeyWord(visitDeclareVarsKeyword(ctx.declareVarsKeyword()));
        }
        if (ctx.IDENTIFIER()!=null && !ctx.IDENTIFIER().isEmpty()){
            for (int i=0 ; i< ctx.IDENTIFIER().size() ; i++){
                if(ctx.IDENTIFIER(i) != null){
                    routingDeclaration.getIdentifier().add(ctx.IDENTIFIER(i).getText());
                }
            }
        }
        if(ctx.routeArray() != null){
            routingDeclaration.setRouteArray(visitRouteArray(ctx.routeArray()));
        }

        return  routingDeclaration ;
    }

    @Override
    public RouteArray visitRouteArray(AngularParser.RouteArrayContext ctx) {
        RouteArray routeArray = new RouteArray();

        if(ctx.routeObject() != null && !ctx.routeObject().isEmpty()){
            if (ctx.routeObject()!=null) {
                for (AngularParser.RouteObjectContext routCtx : ctx.routeObject()) {
                    routeArray.getRouteObjectList().add(visitRouteObject(routCtx));
                }
            }
        }
        return  routeArray ;
    }

    @Override
    public RouteObject visitRouteObject(AngularParser.RouteObjectContext ctx) {
        RouteObject routeObject = new RouteObject();
        if(ctx.routeProperty() != null && !ctx.routeProperty().isEmpty()){
            for (AngularParser.RoutePropertyContext routCtx : ctx.routeProperty()) {
                routeObject.getRoutePropertyList().add(visitRouteProperty(routCtx));

            }
        }
        return  routeObject ;
    }

    @Override
    public RouteProperty visitRouteProperty(AngularParser.RoutePropertyContext ctx) {
        RouteProperty routeProperty = new RouteProperty();

        if(ctx.PATH() != null){
            routeProperty.setPath(ctx.PATH().getText());
        }
        if(ctx.STRING_LITERAL() != null){
            routeProperty.setPathValue(ctx.STRING_LITERAL().getText());
        }
        if(ctx.COMPONENT_KW() != null){
            routeProperty.setComponentKeyWord(ctx.COMPONENT_KW().getText());
        }
        if(ctx.IDENTIFIER() != null){
            routeProperty.setComponentClassName(ctx.IDENTIFIER().getText());
        }
        return  routeProperty ;
    }

    //*****************************END //SARAH//**************************************//

}
