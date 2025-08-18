// Generated from C:/Users/G.force/Desktop/comp now/Here-AC/src/Grammer\AngularParser.g4 by ANTLR 4.10.1
package Grammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentBlock}.
	 * @param ctx the parse tree
	 */
	void enterComponentBlock(AngularParser.ComponentBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentBlock}.
	 * @param ctx the parse tree
	 */
	void exitComponentBlock(AngularParser.ComponentBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#serviceBlock}.
	 * @param ctx the parse tree
	 */
	void enterServiceBlock(AngularParser.ServiceBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#serviceBlock}.
	 * @param ctx the parse tree
	 */
	void exitServiceBlock(AngularParser.ServiceBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importItems}.
	 * @param ctx the parse tree
	 */
	void enterImportItems(AngularParser.ImportItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importItems}.
	 * @param ctx the parse tree
	 */
	void exitImportItems(AngularParser.ImportItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyInterface}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterPropertyInterface(AngularParser.PropertyInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyInterface}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitPropertyInterface(AngularParser.PropertyInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionInterface}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInterface(AngularParser.FunctionInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionInterface}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInterface(AngularParser.FunctionInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionInterface}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionInterface(AngularParser.ArrowFunctionInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionInterface}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionInterface(AngularParser.ArrowFunctionInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterServiceDeclaration(AngularParser.ServiceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitServiceDeclaration(AngularParser.ServiceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#serviceArguments}.
	 * @param ctx the parse tree
	 */
	void enterServiceArguments(AngularParser.ServiceArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#serviceArguments}.
	 * @param ctx the parse tree
	 */
	void exitServiceArguments(AngularParser.ServiceArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(AngularParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(AngularParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selectorArg}.
	 * @param ctx the parse tree
	 */
	void enterSelectorArg(AngularParser.SelectorArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selectorArg}.
	 * @param ctx the parse tree
	 */
	void exitSelectorArg(AngularParser.SelectorArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#standAloneArg}.
	 * @param ctx the parse tree
	 */
	void enterStandAloneArg(AngularParser.StandAloneArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#standAloneArg}.
	 * @param ctx the parse tree
	 */
	void exitStandAloneArg(AngularParser.StandAloneArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importArg}.
	 * @param ctx the parse tree
	 */
	void enterImportArg(AngularParser.ImportArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importArg}.
	 * @param ctx the parse tree
	 */
	void exitImportArg(AngularParser.ImportArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateUrl}
	 * labeled alternative in {@link AngularParser#templateArg}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateUrl}
	 * labeled alternative in {@link AngularParser#templateArg}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code template}
	 * labeled alternative in {@link AngularParser#templateArg}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code template}
	 * labeled alternative in {@link AngularParser#templateArg}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrl}
	 * labeled alternative in {@link AngularParser#styleArg}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrl(AngularParser.StyleUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrl}
	 * labeled alternative in {@link AngularParser#styleArg}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrl(AngularParser.StyleUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrls}
	 * labeled alternative in {@link AngularParser#styleArg}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrls(AngularParser.StyleUrlsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrls}
	 * labeled alternative in {@link AngularParser#styleArg}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrls(AngularParser.StyleUrlsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Styles}
	 * labeled alternative in {@link AngularParser#styleArg}.
	 * @param ctx the parse tree
	 */
	void enterStyles(AngularParser.StylesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Styles}
	 * labeled alternative in {@link AngularParser#styleArg}.
	 * @param ctx the parse tree
	 */
	void exitStyles(AngularParser.StylesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentArguments}.
	 * @param ctx the parse tree
	 */
	void enterComponentArguments(AngularParser.ComponentArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentArguments}.
	 * @param ctx the parse tree
	 */
	void exitComponentArguments(AngularParser.ComponentArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#openComponent}.
	 * @param ctx the parse tree
	 */
	void enterOpenComponent(AngularParser.OpenComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#openComponent}.
	 * @param ctx the parse tree
	 */
	void exitOpenComponent(AngularParser.OpenComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closeComponent}.
	 * @param ctx the parse tree
	 */
	void enterCloseComponent(AngularParser.CloseComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closeComponent}.
	 * @param ctx the parse tree
	 */
	void exitCloseComponent(AngularParser.CloseComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(AngularParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(AngularParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#basicAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBasicAttribute(AngularParser.BasicAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#basicAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBasicAttribute(AngularParser.BasicAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngFor}.
	 * @param ctx the parse tree
	 */
	void enterNgFor(AngularParser.NgForContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngFor}.
	 * @param ctx the parse tree
	 */
	void exitNgFor(AngularParser.NgForContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngIF}.
	 * @param ctx the parse tree
	 */
	void enterNgIF(AngularParser.NgIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngIF}.
	 * @param ctx the parse tree
	 */
	void exitNgIF(AngularParser.NgIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imageAttribute}.
	 * @param ctx the parse tree
	 */
	void enterImageAttribute(AngularParser.ImageAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imageAttribute}.
	 * @param ctx the parse tree
	 */
	void exitImageAttribute(AngularParser.ImageAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#actionAttribute}.
	 * @param ctx the parse tree
	 */
	void enterActionAttribute(AngularParser.ActionAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#actionAttribute}.
	 * @param ctx the parse tree
	 */
	void exitActionAttribute(AngularParser.ActionAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateRef}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void enterTemplateRef(AngularParser.TemplateRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateRef}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void exitTemplateRef(AngularParser.TemplateRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyBinding}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyBinding}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoWayBinding}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoWayBinding}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanAttribute}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAttribute(AngularParser.BooleanAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanAttribute}
	 * labeled alternative in {@link AngularParser#htmlBinding}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAttribute(AngularParser.BooleanAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlContentBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentBody(AngularParser.HtmlContentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlContentBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentBody(AngularParser.HtmlContentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpression(AngularParser.ObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpression(AngularParser.ObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#inlineStyle}.
	 * @param ctx the parse tree
	 */
	void enterInlineStyle(AngularParser.InlineStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#inlineStyle}.
	 * @param ctx the parse tree
	 */
	void exitInlineStyle(AngularParser.InlineStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssDocument}.
	 * @param ctx the parse tree
	 */
	void enterCssDocument(AngularParser.CssDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssDocument}.
	 * @param ctx the parse tree
	 */
	void exitCssDocument(AngularParser.CssDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSelector(AngularParser.AttributeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSelector(AngularParser.AttributeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(AngularParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ruleValue}.
	 * @param ctx the parse tree
	 */
	void enterRuleValue(AngularParser.RuleValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ruleValue}.
	 * @param ctx the parse tree
	 */
	void exitRuleValue(AngularParser.RuleValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#routesDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRoutesDeclaration(AngularParser.RoutesDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#routesDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRoutesDeclaration(AngularParser.RoutesDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#routeArray}.
	 * @param ctx the parse tree
	 */
	void enterRouteArray(AngularParser.RouteArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#routeArray}.
	 * @param ctx the parse tree
	 */
	void exitRouteArray(AngularParser.RouteArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#routeObject}.
	 * @param ctx the parse tree
	 */
	void enterRouteObject(AngularParser.RouteObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#routeObject}.
	 * @param ctx the parse tree
	 */
	void exitRouteObject(AngularParser.RouteObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 */
	void enterRouteProperty(AngularParser.RoutePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 */
	void exitRouteProperty(AngularParser.RoutePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void enterClassHeritage(AngularParser.ClassHeritageContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void exitClassHeritage(AngularParser.ClassHeritageContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classImplement}.
	 * @param ctx the parse tree
	 */
	void enterClassImplement(AngularParser.ClassImplementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classImplement}.
	 * @param ctx the parse tree
	 */
	void exitClassImplement(AngularParser.ClassImplementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classPropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassPropertyDeclaration(AngularParser.ClassPropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classPropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassPropertyDeclaration(AngularParser.ClassPropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(AngularParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(AngularParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(AngularParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(AngularParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodBodyProperty}.
	 * @param ctx the parse tree
	 */
	void enterMethodBodyProperty(AngularParser.MethodBodyPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodBodyProperty}.
	 * @param ctx the parse tree
	 */
	void exitMethodBodyProperty(AngularParser.MethodBodyPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(AngularParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(AngularParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorParams}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParams(AngularParser.ConstructorParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorParams}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParams(AngularParser.ConstructorParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorParam}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParam(AngularParser.ConstructorParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorParam}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParam(AngularParser.ConstructorParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(AngularParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(AngularParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorBodyProperty}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBodyProperty(AngularParser.ConstructorBodyPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorBodyProperty}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBodyProperty(AngularParser.ConstructorBodyPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#commonStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommonStatement(AngularParser.CommonStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#commonStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommonStatement(AngularParser.CommonStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#blockProperty}.
	 * @param ctx the parse tree
	 */
	void enterBlockProperty(AngularParser.BlockPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#blockProperty}.
	 * @param ctx the parse tree
	 */
	void exitBlockProperty(AngularParser.BlockPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterPropertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterParameterPropertyAssignment(AngularParser.ParameterPropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterPropertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitParameterPropertyAssignment(AngularParser.ParameterPropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(AngularParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(AngularParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignDataType}.
	 * @param ctx the parse tree
	 */
	void enterAssignDataType(AngularParser.AssignDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignDataType}.
	 * @param ctx the parse tree
	 */
	void exitAssignDataType(AngularParser.AssignDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(AngularParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(AngularParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assigmentToNull}.
	 * @param ctx the parse tree
	 */
	void enterAssigmentToNull(AngularParser.AssigmentToNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assigmentToNull}.
	 * @param ctx the parse tree
	 */
	void exitAssigmentToNull(AngularParser.AssigmentToNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#compoundAssignment}.
	 * @param ctx the parse tree
	 */
	void enterCompoundAssignment(AngularParser.CompoundAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#compoundAssignment}.
	 * @param ctx the parse tree
	 */
	void exitCompoundAssignment(AngularParser.CompoundAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOperationPropertyValueExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperationPropertyValueExpr(AngularParser.BinaryOperationPropertyValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOperationPropertyValueExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperationPropertyValueExpr(AngularParser.BinaryOperationPropertyValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketedPropertyValueExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterBracketedPropertyValueExpr(AngularParser.BracketedPropertyValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketedPropertyValueExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitBracketedPropertyValueExpr(AngularParser.BracketedPropertyValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyValueObjectExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValueObjectExpr(AngularParser.PropertyValueObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyValueObjectExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValueObjectExpr(AngularParser.PropertyValueObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShortIfExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterShortIfExpr(AngularParser.ShortIfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShortIfExpr}
	 * labeled alternative in {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitShortIfExpr(AngularParser.ShortIfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyValueObjects}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValueObjects(AngularParser.PropertyValueObjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyValueObjects}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValueObjects(AngularParser.PropertyValueObjectsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(AngularParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(AngularParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolExpr}
	 * labeled alternative in {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterSymbolExpr(AngularParser.SymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolExpr}
	 * labeled alternative in {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitSymbolExpr(AngularParser.SymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(AngularParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(AngularParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpreadObjectProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterSpreadObjectProperty(AngularParser.SpreadObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpreadObjectProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitSpreadObjectProperty(AngularParser.SpreadObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalObjectProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterNormalObjectProperty(AngularParser.NormalObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalObjectProperty}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitNormalObjectProperty(AngularParser.NormalObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(AngularParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(AngularParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpreadElementExpr}
	 * labeled alternative in {@link AngularParser#spreadElement}.
	 * @param ctx the parse tree
	 */
	void enterSpreadElementExpr(AngularParser.SpreadElementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpreadElementExpr}
	 * labeled alternative in {@link AngularParser#spreadElement}.
	 * @param ctx the parse tree
	 */
	void exitSpreadElementExpr(AngularParser.SpreadElementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#indexAccessValue}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccessValue(AngularParser.IndexAccessValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#indexAccessValue}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccessValue(AngularParser.IndexAccessValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionExpr(AngularParser.ArrowFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionExpr(AngularParser.ArrowFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionBlockExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBlockExpr(AngularParser.ArrowFunctionBlockExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionBlockExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBlockExpr(AngularParser.ArrowFunctionBlockExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionWithParamsExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionWithParamsExpr(AngularParser.ArrowFunctionWithParamsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionWithParamsExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionWithParamsExpr(AngularParser.ArrowFunctionWithParamsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionWithParamsBlockExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionWithParamsBlockExpr(AngularParser.ArrowFunctionWithParamsBlockExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionWithParamsBlockExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionWithParamsBlockExpr(AngularParser.ArrowFunctionWithParamsBlockExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#preFix}.
	 * @param ctx the parse tree
	 */
	void enterPreFix(AngularParser.PreFixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#preFix}.
	 * @param ctx the parse tree
	 */
	void exitPreFix(AngularParser.PreFixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#postFix}.
	 * @param ctx the parse tree
	 */
	void enterPostFix(AngularParser.PostFixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#postFix}.
	 * @param ctx the parse tree
	 */
	void exitPostFix(AngularParser.PostFixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimplePropertyCall}
	 * labeled alternative in {@link AngularParser#propertyCall}.
	 * @param ctx the parse tree
	 */
	void enterSimplePropertyCall(AngularParser.SimplePropertyCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimplePropertyCall}
	 * labeled alternative in {@link AngularParser#propertyCall}.
	 * @param ctx the parse tree
	 */
	void exitSimplePropertyCall(AngularParser.SimplePropertyCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyWithMethodCall}
	 * labeled alternative in {@link AngularParser#propertyCall}.
	 * @param ctx the parse tree
	 */
	void enterPropertyWithMethodCall(AngularParser.PropertyWithMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyWithMethodCall}
	 * labeled alternative in {@link AngularParser#propertyCall}.
	 * @param ctx the parse tree
	 */
	void exitPropertyWithMethodCall(AngularParser.PropertyWithMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(AngularParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(AngularParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(AngularParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(AngularParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimitiveType}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(AngularParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimitiveType}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(AngularParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassType}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterClassType(AngularParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassType}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitClassType(AngularParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(AngularParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(AngularParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#listSuffix}.
	 * @param ctx the parse tree
	 */
	void enterListSuffix(AngularParser.ListSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#listSuffix}.
	 * @param ctx the parse tree
	 */
	void exitListSuffix(AngularParser.ListSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifiers(AngularParser.AccessModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifiers(AngularParser.AccessModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(AngularParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(AngularParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(AngularParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(AngularParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBlock(AngularParser.DefaultBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBlock(AngularParser.DefaultBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#caseValue}.
	 * @param ctx the parse tree
	 */
	void enterCaseValue(AngularParser.CaseValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#caseValue}.
	 * @param ctx the parse tree
	 */
	void exitCaseValue(AngularParser.CaseValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(AngularParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(AngularParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TraditionalFor}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterTraditionalFor(AngularParser.TraditionalForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TraditionalFor}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitTraditionalFor(AngularParser.TraditionalForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfLoop(AngularParser.ForOfLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfLoop(AngularParser.ForOfLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInLoop(AngularParser.ForInLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInLoop(AngularParser.ForInLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForInitializer(AngularParser.ForInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForInitializer(AngularParser.ForInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(AngularParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(AngularParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(AngularParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentExpression(AngularParser.ParentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentExpression(AngularParser.ParentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(AngularParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(AngularParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralOrReferenceExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralOrReferenceExpression(AngularParser.LiteralOrReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralOrReferenceExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralOrReferenceExpression(AngularParser.LiteralOrReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(AngularParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(AngularParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#declareVarsKeyword}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVarsKeyword(AngularParser.DeclareVarsKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#declareVarsKeyword}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVarsKeyword(AngularParser.DeclareVarsKeywordContext ctx);
}