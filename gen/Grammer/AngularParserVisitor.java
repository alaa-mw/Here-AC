// Generated from C:/Users/G.force/Desktop/comp now/Here-AC/src/Grammer\AngularParser.g4 by ANTLR 4.10.1
package Grammer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBlock(AngularParser.ComponentBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#serviceBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceBlock(AngularParser.ServiceBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItems(AngularParser.ImportItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyInterface}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyInterface(AngularParser.PropertyInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionInterface}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInterface(AngularParser.FunctionInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionInterface}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionInterface(AngularParser.ArrowFunctionInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDeclaration(AngularParser.ServiceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#serviceArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceArguments(AngularParser.ServiceArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(AngularParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selectorArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorArg(AngularParser.SelectorArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#standAloneArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandAloneArg(AngularParser.StandAloneArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportArg(AngularParser.ImportArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateUrl}
	 * labeled alternative in {@link AngularParser#templateArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code template}
	 * labeled alternative in {@link AngularParser#templateArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleUrl}
	 * labeled alternative in {@link AngularParser#styleArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrl(AngularParser.StyleUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleUrls}
	 * labeled alternative in {@link AngularParser#styleArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrls(AngularParser.StyleUrlsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Styles}
	 * labeled alternative in {@link AngularParser#styleArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyles(AngularParser.StylesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentArguments(AngularParser.ComponentArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#openComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenComponent(AngularParser.OpenComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closeComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseComponent(AngularParser.CloseComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(AngularParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#basicAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicAttribute(AngularParser.BasicAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgFor(AngularParser.NgForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngIF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIF(AngularParser.NgIFContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#imageAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageAttribute(AngularParser.ImageAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#actionAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionAttribute(AngularParser.ActionAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateRef}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateRef(AngularParser.TemplateRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyBinding}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoWayBinding}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanAttribute}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAttribute(AngularParser.BooleanAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlContentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentBody(AngularParser.HtmlContentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpression(AngularParser.ObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#inlineStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineStyle(AngularParser.InlineStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDocument(AngularParser.CssDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attributeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSelector(AngularParser.AttributeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ruleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleValue(AngularParser.RuleValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routesDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutesDeclaration(AngularParser.RoutesDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteArray(AngularParser.RouteArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routeObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteObject(AngularParser.RouteObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteProperty(AngularParser.RoutePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classHeritage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeritage(AngularParser.ClassHeritageContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classImplement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassImplement(AngularParser.ClassImplementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPropertyDeclaration(AngularParser.ClassPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(AngularParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(AngularParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodBodyProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBodyProperty(AngularParser.MethodBodyPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(AngularParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParams(AngularParser.ConstructorParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParam(AngularParser.ConstructorParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(AngularParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorBodyProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBodyProperty(AngularParser.ConstructorBodyPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#commonStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonStatement(AngularParser.CommonStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#blockProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockProperty(AngularParser.BlockPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterPropertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterPropertyAssignment(AngularParser.ParameterPropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(AngularParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDataType(AngularParser.AssignDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(AngularParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assigmentToNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigmentToNull(AngularParser.AssigmentToNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#compoundAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundAssignment(AngularParser.CompoundAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOperationPropertyValueExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperationPropertyValueExpr(AngularParser.BinaryOperationPropertyValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketedPropertyValueExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedPropertyValueExpr(AngularParser.BracketedPropertyValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyValueObjectExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValueObjectExpr(AngularParser.PropertyValueObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortIfExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortIfExpr(AngularParser.ShortIfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyValueObjects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValueObjects(AngularParser.PropertyValueObjectsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(AngularParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SymbolExpr}
	 * labeled alternative in {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolExpr(AngularParser.SymbolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(AngularParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpreadObjectProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadObjectProperty(AngularParser.SpreadObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalObjectProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalObjectProperty(AngularParser.NormalObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(AngularParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpreadElementExpr}
	 * labeled alternative in {@link AngularParser#spreadElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadElementExpr(AngularParser.SpreadElementExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#indexAccessValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccessValue(AngularParser.IndexAccessValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionExpr(AngularParser.ArrowFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionBlockExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionBlockExpr(AngularParser.ArrowFunctionBlockExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionWithParamsExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionWithParamsExpr(AngularParser.ArrowFunctionWithParamsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionWithParamsBlockExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionWithParamsBlockExpr(AngularParser.ArrowFunctionWithParamsBlockExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#preFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreFix(AngularParser.PreFixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#postFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostFix(AngularParser.PostFixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimplePropertyCall}
	 * labeled alternative in {@link AngularParser#propertyCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePropertyCall(AngularParser.SimplePropertyCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyWithMethodCall}
	 * labeled alternative in {@link AngularParser#propertyCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyWithMethodCall(AngularParser.PropertyWithMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(AngularParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(AngularParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimitiveType}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(AngularParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassType}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(AngularParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(AngularParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#listSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSuffix(AngularParser.ListSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifiers(AngularParser.AccessModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(AngularParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(AngularParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#defaultBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBlock(AngularParser.DefaultBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#caseValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseValue(AngularParser.CaseValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(AngularParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TraditionalFor}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraditionalFor(AngularParser.TraditionalForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForOfLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOfLoop(AngularParser.ForOfLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInLoop(AngularParser.ForInLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitializer(AngularParser.ForInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(AngularParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentExpression(AngularParser.ParentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(AngularParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralOrReferenceExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralOrReferenceExpression(AngularParser.LiteralOrReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(AngularParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#declareVarsKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVarsKeyword(AngularParser.DeclareVarsKeywordContext ctx);
}