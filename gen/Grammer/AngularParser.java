// Generated from D:/compiler projects/_last-git/Here-AC/src/Grammer\AngularParser.g4 by ANTLR 4.10.1
package Grammer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, LINE_COMMENT=2, BLOCK_COMMENT=3, IMPORT=4, FROM=5, AS=6, 
		COMPONENT=7, INJECTABLE=8, EXPORT=9, CLASS=10, EXTENDS=11, IMPLEMENTS=12, 
		INTERFACE=13, THIS=14, NG_FOR=15, NG_IF=16, PX=17, IMAGE_SRC=18, CLICK=19, 
		NULL=20, CONSTRUCTOR=21, RETURN=22, SWITCH=23, FOR=24, WHILE=25, DO=26, 
		CASE=27, DEFAULT=28, BREAK=29, CONTINUE=30, IF=31, ELSE=32, KEYOF=33, 
		ASYNC=34, STATIC=35, ABSTRACT=36, LOG=37, CONSOLE=38, READONLY=39, PATH=40, 
		CHILDREN=41, COMPONENT_KW=42, LOADCOMPONENT=43, THEN=44, BOOTSTRAP_APP=45, 
		PROVIDERS=46, PROVIDE_ROUTER=47, LET=48, VAR=49, CONST=50, IN=51, OF=52, 
		NEW=53, ANDAND=54, OROR=55, LT=56, LE=57, GT=58, GE=59, EQEQ=60, NOTEQ=61, 
		STRICT_E=62, STRICT_NE=63, NUMBER=64, STRING=65, BOOLEAN=66, ANY=67, VOID=68, 
		BOOL=69, LIST=70, UNDEFINED=71, UNKNOWN=72, PRIVATE=73, PUBLIC=74, PROTECTED=75, 
		SELECTOR=76, STANDALONE=77, IMPORTS=78, TEMPLATE=79, TEMPLATE_URL=80, 
		STYLES_URL=81, STYLES_URLS=82, STYLES=83, PROVIDED_IN=84, OPEN_CURLY_BRACKET=85, 
		CLOSE_CURLY_BRACKET=86, OPEN_BRACKET=87, CLOSE_BRACKET=88, OPEN_SQUARE_BRACKET=89, 
		CLOSE_SQUARE_BRACKET=90, SEMICOLON=91, COMMA=92, DOT=93, DOT_DOT=94, SPREAD=95, 
		EQ=96, ATT=97, QUESTION=98, ARROW=99, HASH=100, TILDE=101, QUOTE=102, 
		SCOPE_QUOTE=103, APOSTROPHE=104, SLASH=105, STAR=106, OR=107, PERCENTAGE=108, 
		PLUSEQ=109, MINUSEQ=110, STAREQ=111, SLASHEQ=112, PLUS=113, MINUS=114, 
		PP=115, MM=116, STRING_LITERAL=117, NUMERIC_LITERAL=118, BIGINT_LITERAL=119, 
		SYMBOL_LITERAL=120, IDENTIFIER=121, COLOR=122;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_componentBlock = 2, RULE_serviceBlock = 3, 
		RULE_importStatement = 4, RULE_importItems = 5, RULE_interfaceDeclaration = 6, 
		RULE_interfaceBody = 7, RULE_serviceDeclaration = 8, RULE_serviceArguments = 9, 
		RULE_arg = 10, RULE_componentDeclaration = 11, RULE_selectorArg = 12, 
		RULE_standAloneArg = 13, RULE_importArg = 14, RULE_templateArg = 15, RULE_styleArg = 16, 
		RULE_componentArguments = 17, RULE_openComponent = 18, RULE_closeComponent = 19, 
		RULE_htmlDocument = 20, RULE_htmlElement = 21, RULE_openTag = 22, RULE_closeTag = 23, 
		RULE_selfClosingTag = 24, RULE_htmlAttribute = 25, RULE_basicAttribute = 26, 
		RULE_ngFor = 27, RULE_ngIF = 28, RULE_imageAttribute = 29, RULE_actionAttribute = 30, 
		RULE_htmlBinding = 31, RULE_htmlContentBody = 32, RULE_objectExpression = 33, 
		RULE_inlineStyle = 34, RULE_cssDocument = 35, RULE_cssSelector = 36, RULE_attributeSelector = 37, 
		RULE_cssRule = 38, RULE_ruleValue = 39, RULE_routesDeclaration = 40, RULE_routeArray = 41, 
		RULE_routeObject = 42, RULE_routeProperty = 43, RULE_classDeclaration = 44, 
		RULE_classHeritage = 45, RULE_classImplement = 46, RULE_classBody = 47, 
		RULE_classPropertyDeclaration = 48, RULE_methodDeclaration = 49, RULE_decorator = 50, 
		RULE_returnType = 51, RULE_methodBody = 52, RULE_methodBodyProperty = 53, 
		RULE_returnStatement = 54, RULE_printStatement = 55, RULE_parameterList = 56, 
		RULE_parameter = 57, RULE_constructorDeclaration = 58, RULE_constructorParams = 59, 
		RULE_constructorParam = 60, RULE_constructorBody = 61, RULE_constructorBodyProperty = 62, 
		RULE_commonStatement = 63, RULE_blockProperty = 64, RULE_parameterPropertyAssignment = 65, 
		RULE_localVariableDeclaration = 66, RULE_propertyAssignment = 67, RULE_assignDataType = 68, 
		RULE_assigment = 69, RULE_assigmentToNull = 70, RULE_compoundAssignment = 71, 
		RULE_propertyValue = 72, RULE_propertyValueObjects = 73, RULE_literalValue = 74, 
		RULE_objectValue = 75, RULE_objectProperty = 76, RULE_list = 77, RULE_spreadElement = 78, 
		RULE_indexAccessValue = 79, RULE_arrowFunction = 80, RULE_preFix = 81, 
		RULE_postFix = 82, RULE_propertyCall = 83, RULE_methodCall = 84, RULE_dataType = 85, 
		RULE_singleDataType = 86, RULE_type = 87, RULE_typeArguments = 88, RULE_listSuffix = 89, 
		RULE_accessModifiers = 90, RULE_newExpression = 91, RULE_conditionalStatement = 92, 
		RULE_elseIfStatement = 93, RULE_elseStatement = 94, RULE_switchStatement = 95, 
		RULE_caseBlock = 96, RULE_defaultBlock = 97, RULE_caseValue = 98, RULE_caseStatement = 99, 
		RULE_forStatement = 100, RULE_forInitializer = 101, RULE_variableDeclarationList = 102, 
		RULE_variableDeclaration = 103, RULE_whileStatement = 104, RULE_doWhileStatement = 105, 
		RULE_expression = 106, RULE_operation = 107, RULE_block = 108, RULE_declareVarsKeyword = 109;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "componentBlock", "serviceBlock", "importStatement", 
			"importItems", "interfaceDeclaration", "interfaceBody", "serviceDeclaration", 
			"serviceArguments", "arg", "componentDeclaration", "selectorArg", "standAloneArg", 
			"importArg", "templateArg", "styleArg", "componentArguments", "openComponent", 
			"closeComponent", "htmlDocument", "htmlElement", "openTag", "closeTag", 
			"selfClosingTag", "htmlAttribute", "basicAttribute", "ngFor", "ngIF", 
			"imageAttribute", "actionAttribute", "htmlBinding", "htmlContentBody", 
			"objectExpression", "inlineStyle", "cssDocument", "cssSelector", "attributeSelector", 
			"cssRule", "ruleValue", "routesDeclaration", "routeArray", "routeObject", 
			"routeProperty", "classDeclaration", "classHeritage", "classImplement", 
			"classBody", "classPropertyDeclaration", "methodDeclaration", "decorator", 
			"returnType", "methodBody", "methodBodyProperty", "returnStatement", 
			"printStatement", "parameterList", "parameter", "constructorDeclaration", 
			"constructorParams", "constructorParam", "constructorBody", "constructorBodyProperty", 
			"commonStatement", "blockProperty", "parameterPropertyAssignment", "localVariableDeclaration", 
			"propertyAssignment", "assignDataType", "assigment", "assigmentToNull", 
			"compoundAssignment", "propertyValue", "propertyValueObjects", "literalValue", 
			"objectValue", "objectProperty", "list", "spreadElement", "indexAccessValue", 
			"arrowFunction", "preFix", "postFix", "propertyCall", "methodCall", "dataType", 
			"singleDataType", "type", "typeArguments", "listSuffix", "accessModifiers", 
			"newExpression", "conditionalStatement", "elseIfStatement", "elseStatement", 
			"switchStatement", "caseBlock", "defaultBlock", "caseValue", "caseStatement", 
			"forStatement", "forInitializer", "variableDeclarationList", "variableDeclaration", 
			"whileStatement", "doWhileStatement", "expression", "operation", "block", 
			"declareVarsKeyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'import'", "'from'", "'as'", "'@Component'", 
			"'@Injectable'", "'export'", "'class'", "'extends'", "'implements'", 
			"'interface'", "'this'", "'ngFor'", "'ngIf'", "'px'", "'src'", "'click'", 
			"'null'", "'constructor'", "'return'", "'switch'", "'for'", "'while'", 
			"'do'", "'case'", "'default'", "'break'", "'continue'", "'if'", "'else'", 
			"'keyof'", "'async'", "'static'", "'abstract'", "'log'", "'console'", 
			"'readonly'", "'path'", "'children'", "'component'", "'loadComponent'", 
			"'then'", "'bootstrapApplication'", "'providers'", "'provideRouter'", 
			"'let'", "'var'", "'const'", "'in'", "'of'", "'new'", "'&&'", "'||'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'==='", "'!=='", "'number'", 
			"'string'", "'boolean'", "'any'", "'void'", null, "'[]'", "'undefined'", 
			"'unknown'", "'private'", "'public'", "'protected'", "'selector'", "'standalone'", 
			"'imports'", "'template'", "'templateUrl'", "'styleUrl'", "'styleUrls'", 
			"'styles'", "'providedIn'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"';'", "','", "'.'", "':'", "'...'", "'='", "'@'", "'?'", "'=>'", "'#'", 
			"'~'", "'\"'", "'`'", "'''", "'/'", "'*'", "'|'", "'%'", "'+='", "'-='", 
			"'*='", "'/='", "'+'", "'-'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "LINE_COMMENT", "BLOCK_COMMENT", "IMPORT", "FROM", 
			"AS", "COMPONENT", "INJECTABLE", "EXPORT", "CLASS", "EXTENDS", "IMPLEMENTS", 
			"INTERFACE", "THIS", "NG_FOR", "NG_IF", "PX", "IMAGE_SRC", "CLICK", "NULL", 
			"CONSTRUCTOR", "RETURN", "SWITCH", "FOR", "WHILE", "DO", "CASE", "DEFAULT", 
			"BREAK", "CONTINUE", "IF", "ELSE", "KEYOF", "ASYNC", "STATIC", "ABSTRACT", 
			"LOG", "CONSOLE", "READONLY", "PATH", "CHILDREN", "COMPONENT_KW", "LOADCOMPONENT", 
			"THEN", "BOOTSTRAP_APP", "PROVIDERS", "PROVIDE_ROUTER", "LET", "VAR", 
			"CONST", "IN", "OF", "NEW", "ANDAND", "OROR", "LT", "LE", "GT", "GE", 
			"EQEQ", "NOTEQ", "STRICT_E", "STRICT_NE", "NUMBER", "STRING", "BOOLEAN", 
			"ANY", "VOID", "BOOL", "LIST", "UNDEFINED", "UNKNOWN", "PRIVATE", "PUBLIC", 
			"PROTECTED", "SELECTOR", "STANDALONE", "IMPORTS", "TEMPLATE", "TEMPLATE_URL", 
			"STYLES_URL", "STYLES_URLS", "STYLES", "PROVIDED_IN", "OPEN_CURLY_BRACKET", 
			"CLOSE_CURLY_BRACKET", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", 
			"CLOSE_SQUARE_BRACKET", "SEMICOLON", "COMMA", "DOT", "DOT_DOT", "SPREAD", 
			"EQ", "ATT", "QUESTION", "ARROW", "HASH", "TILDE", "QUOTE", "SCOPE_QUOTE", 
			"APOSTROPHE", "SLASH", "STAR", "OR", "PERCENTAGE", "PLUSEQ", "MINUSEQ", 
			"STAREQ", "SLASHEQ", "PLUS", "MINUS", "PP", "MM", "STRING_LITERAL", "NUMERIC_LITERAL", 
			"BIGINT_LITERAL", "SYMBOL_LITERAL", "IDENTIFIER", "COLOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << COMPONENT) | (1L << INJECTABLE) | (1L << EXPORT) | (1L << CLASS) | (1L << INTERFACE) | (1L << ABSTRACT) | (1L << CONSOLE) | (1L << LET) | (1L << VAR) | (1L << CONST))) != 0)) {
				{
				{
				setState(220);
				statement();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public RoutesDeclarationContext routesDeclaration() {
			return getRuleContext(RoutesDeclarationContext.class,0);
		}
		public ServiceBlockContext serviceBlock() {
			return getRuleContext(ServiceBlockContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ComponentBlockContext componentBlock() {
			return getRuleContext(ComponentBlockContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				routesDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				serviceBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				componentBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				printStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentBlockContext extends ParserRuleContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ComponentBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBlockContext componentBlock() throws RecognitionException {
		ComponentBlockContext _localctx = new ComponentBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_componentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			componentDeclaration();
			setState(239); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(238);
					classDeclaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(241); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServiceBlockContext extends ParserRuleContext {
		public ServiceDeclarationContext serviceDeclaration() {
			return getRuleContext(ServiceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ServiceBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceBlockContext serviceBlock() throws RecognitionException {
		ServiceBlockContext _localctx = new ServiceBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_serviceBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			serviceDeclaration();
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(244);
				classDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public ImportItemsContext importItems() {
			return getRuleContext(ImportItemsContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(IMPORT);
			setState(248);
			match(OPEN_CURLY_BRACKET);
			setState(249);
			importItems();
			setState(250);
			match(CLOSE_CURLY_BRACKET);
			setState(251);
			match(FROM);
			setState(252);
			match(STRING_LITERAL);
			setState(253);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportItemsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemsContext importItems() throws RecognitionException {
		ImportItemsContext _localctx = new ImportItemsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IDENTIFIER);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				match(IDENTIFIER);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public List<InterfaceBodyContext> interfaceBody() {
			return getRuleContexts(InterfaceBodyContext.class);
		}
		public InterfaceBodyContext interfaceBody(int i) {
			return getRuleContext(InterfaceBodyContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(263);
				match(EXPORT);
				}
			}

			setState(266);
			match(INTERFACE);
			setState(267);
			match(IDENTIFIER);
			setState(268);
			match(OPEN_CURLY_BRACKET);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==READONLY || _la==IDENTIFIER) {
				{
				{
				setState(269);
				interfaceBody();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
	 
		public InterfaceBodyContext() { }
		public void copyFrom(InterfaceBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrowFunctionInterfaceContext extends InterfaceBodyContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode READONLY() { return getToken(AngularParser.READONLY, 0); }
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public ArrowFunctionInterfaceContext(InterfaceBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionInterface(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionInterfaceContext extends InterfaceBodyContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionInterfaceContext(InterfaceBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionInterface(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyInterfaceContext extends InterfaceBodyContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode READONLY() { return getToken(AngularParser.READONLY, 0); }
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public PropertyInterfaceContext(InterfaceBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceBody);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new PropertyInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==READONLY) {
					{
					setState(277);
					match(READONLY);
					}
				}

				setState(280);
				match(IDENTIFIER);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(281);
					match(QUESTION);
					}
				}

				setState(284);
				match(DOT_DOT);
				setState(285);
				dataType();
				setState(286);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new FunctionInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(IDENTIFIER);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(289);
					match(QUESTION);
					}
				}

				setState(292);
				match(OPEN_BRACKET);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(293);
					parameterList();
					}
				}

				setState(296);
				match(CLOSE_BRACKET);
				setState(297);
				match(DOT_DOT);
				setState(298);
				dataType();
				setState(299);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new ArrowFunctionInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==READONLY) {
					{
					setState(301);
					match(READONLY);
					}
				}

				setState(304);
				match(IDENTIFIER);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(305);
					match(QUESTION);
					}
				}

				setState(308);
				match(DOT_DOT);
				setState(309);
				match(OPEN_BRACKET);
				setState(310);
				parameterList();
				setState(311);
				match(CLOSE_BRACKET);
				setState(312);
				match(ARROW);
				setState(313);
				dataType();
				setState(314);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServiceDeclarationContext extends ParserRuleContext {
		public TerminalNode INJECTABLE() { return getToken(AngularParser.INJECTABLE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ServiceArgumentsContext serviceArguments() {
			return getRuleContext(ServiceArgumentsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public ServiceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceDeclarationContext serviceDeclaration() throws RecognitionException {
		ServiceDeclarationContext _localctx = new ServiceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_serviceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(INJECTABLE);
			setState(319);
			match(OPEN_BRACKET);
			setState(320);
			serviceArguments();
			setState(321);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServiceArgumentsContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ServiceArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceArgumentsContext serviceArguments() throws RecognitionException {
		ServiceArgumentsContext _localctx = new ServiceArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_serviceArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(OPEN_CURLY_BRACKET);
			setState(324);
			arg();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(325);
				match(COMMA);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PROVIDED_IN) {
					{
					{
					setState(326);
					arg();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode PROVIDED_IN() { return getToken(AngularParser.PROVIDED_IN, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(PROVIDED_IN);
			setState(340);
			match(DOT_DOT);
			setState(341);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public OpenComponentContext openComponent() {
			return getRuleContext(OpenComponentContext.class,0);
		}
		public CloseComponentContext closeComponent() {
			return getRuleContext(CloseComponentContext.class,0);
		}
		public List<ComponentArgumentsContext> componentArguments() {
			return getRuleContexts(ComponentArgumentsContext.class);
		}
		public ComponentArgumentsContext componentArguments(int i) {
			return getRuleContext(ComponentArgumentsContext.class,i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(COMPONENT);
			setState(344);
			openComponent();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (SELECTOR - 76)) | (1L << (STANDALONE - 76)) | (1L << (IMPORTS - 76)) | (1L << (TEMPLATE - 76)) | (1L << (TEMPLATE_URL - 76)) | (1L << (STYLES_URL - 76)) | (1L << (STYLES_URLS - 76)) | (1L << (STYLES - 76)))) != 0)) {
				{
				{
				setState(345);
				componentArguments();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			closeComponent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorArgContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public SelectorArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorArgContext selectorArg() throws RecognitionException {
		SelectorArgContext _localctx = new SelectorArgContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectorArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(SELECTOR);
			setState(354);
			match(DOT_DOT);
			setState(355);
			match(STRING_LITERAL);
			setState(356);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandAloneArgContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode BOOL() { return getToken(AngularParser.BOOL, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public StandAloneArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standAloneArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandAloneArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandAloneArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandAloneArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandAloneArgContext standAloneArg() throws RecognitionException {
		StandAloneArgContext _localctx = new StandAloneArgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_standAloneArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(STANDALONE);
			setState(359);
			match(DOT_DOT);
			setState(360);
			match(BOOL);
			setState(361);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportArgContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public ImportArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportArgContext importArg() throws RecognitionException {
		ImportArgContext _localctx = new ImportArgContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_importArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(IMPORTS);
			setState(364);
			match(DOT_DOT);
			setState(365);
			match(OPEN_SQUARE_BRACKET);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(366);
				match(IDENTIFIER);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(367);
					match(COMMA);
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(CLOSE_SQUARE_BRACKET);
			setState(379);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateArgContext extends ParserRuleContext {
		public TemplateArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateArg; }
	 
		public TemplateArgContext() { }
		public void copyFrom(TemplateArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TemplateContext extends TemplateArgContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public List<TerminalNode> SCOPE_QUOTE() { return getTokens(AngularParser.SCOPE_QUOTE); }
		public TerminalNode SCOPE_QUOTE(int i) {
			return getToken(AngularParser.SCOPE_QUOTE, i);
		}
		public HtmlDocumentContext htmlDocument() {
			return getRuleContext(HtmlDocumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public TemplateContext(TemplateArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TemplateUrlContext extends TemplateArgContext {
		public TerminalNode TEMPLATE_URL() { return getToken(AngularParser.TEMPLATE_URL, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public TemplateUrlContext(TemplateArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgContext templateArg() throws RecognitionException {
		TemplateArgContext _localctx = new TemplateArgContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_templateArg);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE_URL:
				_localctx = new TemplateUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(TEMPLATE_URL);
				setState(382);
				match(DOT_DOT);
				setState(383);
				match(STRING_LITERAL);
				setState(384);
				match(COMMA);
				}
				break;
			case TEMPLATE:
				_localctx = new TemplateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(TEMPLATE);
				setState(386);
				match(DOT_DOT);
				setState(387);
				match(SCOPE_QUOTE);
				setState(388);
				htmlDocument();
				setState(389);
				match(SCOPE_QUOTE);
				setState(390);
				match(COMMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleArgContext extends ParserRuleContext {
		public StyleArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleArg; }
	 
		public StyleArgContext() { }
		public void copyFrom(StyleArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StyleUrlContext extends StyleArgContext {
		public TerminalNode STYLES_URL() { return getToken(AngularParser.STYLES_URL, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public StyleUrlContext(StyleArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StyleUrlsContext extends StyleArgContext {
		public TerminalNode STYLES_URLS() { return getToken(AngularParser.STYLES_URLS, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(AngularParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(AngularParser.STRING_LITERAL, i);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public StyleUrlsContext(StyleArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrls(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StylesContext extends StyleArgContext {
		public TerminalNode STYLES() { return getToken(AngularParser.STYLES, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public List<InlineStyleContext> inlineStyle() {
			return getRuleContexts(InlineStyleContext.class);
		}
		public InlineStyleContext inlineStyle(int i) {
			return getRuleContext(InlineStyleContext.class,i);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public StylesContext(StyleArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleArgContext styleArg() throws RecognitionException {
		StyleArgContext _localctx = new StyleArgContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_styleArg);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLES_URL:
				_localctx = new StyleUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(STYLES_URL);
				setState(395);
				match(DOT_DOT);
				setState(396);
				match(STRING_LITERAL);
				setState(397);
				match(COMMA);
				}
				break;
			case STYLES_URLS:
				_localctx = new StyleUrlsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(STYLES_URLS);
				setState(399);
				match(DOT_DOT);
				{
				setState(400);
				match(OPEN_SQUARE_BRACKET);
				setState(401);
				match(STRING_LITERAL);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(402);
					match(COMMA);
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==STRING_LITERAL) {
						{
						{
						setState(403);
						match(STRING_LITERAL);
						}
						}
						setState(408);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414);
				match(CLOSE_SQUARE_BRACKET);
				}
				setState(416);
				match(COMMA);
				}
				break;
			case STYLES:
				_localctx = new StylesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(STYLES);
				setState(418);
				match(DOT_DOT);
				setState(431);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_SQUARE_BRACKET:
					{
					setState(419);
					match(OPEN_SQUARE_BRACKET);
					setState(420);
					inlineStyle();
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(421);
						match(COMMA);
						setState(422);
						inlineStyle();
						}
						}
						setState(427);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(428);
					match(CLOSE_SQUARE_BRACKET);
					}
					break;
				case SCOPE_QUOTE:
					{
					setState(430);
					inlineStyle();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(433);
				match(COMMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentArgumentsContext extends ParserRuleContext {
		public ImportArgContext importArg() {
			return getRuleContext(ImportArgContext.class,0);
		}
		public TemplateArgContext templateArg() {
			return getRuleContext(TemplateArgContext.class,0);
		}
		public StyleArgContext styleArg() {
			return getRuleContext(StyleArgContext.class,0);
		}
		public SelectorArgContext selectorArg() {
			return getRuleContext(SelectorArgContext.class,0);
		}
		public StandAloneArgContext standAloneArg() {
			return getRuleContext(StandAloneArgContext.class,0);
		}
		public ComponentArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentArgumentsContext componentArguments() throws RecognitionException {
		ComponentArgumentsContext _localctx = new ComponentArgumentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_componentArguments);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				importArg();
				}
				break;
			case TEMPLATE:
			case TEMPLATE_URL:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				templateArg();
				}
				break;
			case STYLES_URL:
			case STYLES_URLS:
			case STYLES:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				styleArg();
				}
				break;
			case SELECTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				selectorArg();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				standAloneArg();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenComponentContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public OpenComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpenComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpenComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpenComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenComponentContext openComponent() throws RecognitionException {
		OpenComponentContext _localctx = new OpenComponentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_openComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(OPEN_BRACKET);
			setState(445);
			match(OPEN_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseComponentContext extends ParserRuleContext {
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public CloseComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCloseComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCloseComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCloseComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseComponentContext closeComponent() throws RecognitionException {
		CloseComponentContext _localctx = new CloseComponentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_closeComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(CLOSE_CURLY_BRACKET);
			setState(448);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(450);
				htmlElement();
				}
				}
				setState(453); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<HtmlContentBodyContext> htmlContentBody() {
			return getRuleContexts(HtmlContentBodyContext.class);
		}
		public HtmlContentBodyContext htmlContentBody(int i) {
			return getRuleContext(HtmlContentBodyContext.class,i);
		}
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_htmlElement);
		try {
			int _alt;
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				openTag();
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(456);
						htmlContentBody();
						}
						} 
					}
					setState(461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(462);
				closeTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				selfClosingTag();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(LT);
			setState(468);
			match(IDENTIFIER);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==IMAGE_SRC || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (OPEN_BRACKET - 87)) | (1L << (OPEN_SQUARE_BRACKET - 87)) | (1L << (HASH - 87)) | (1L << (STAR - 87)) | (1L << (IDENTIFIER - 87)))) != 0)) {
				{
				{
				setState(469);
				htmlAttribute();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(AngularParser.SLASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(LT);
			setState(478);
			match(SLASH);
			setState(479);
			match(IDENTIFIER);
			setState(480);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode SLASH() { return getToken(AngularParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(LT);
			setState(483);
			match(IDENTIFIER);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==IMAGE_SRC || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (OPEN_BRACKET - 87)) | (1L << (OPEN_SQUARE_BRACKET - 87)) | (1L << (HASH - 87)) | (1L << (STAR - 87)) | (1L << (IDENTIFIER - 87)))) != 0)) {
				{
				{
				setState(484);
				htmlAttribute();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(SLASH);
			setState(491);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeContext extends ParserRuleContext {
		public BasicAttributeContext basicAttribute() {
			return getRuleContext(BasicAttributeContext.class,0);
		}
		public NgForContext ngFor() {
			return getRuleContext(NgForContext.class,0);
		}
		public NgIFContext ngIF() {
			return getRuleContext(NgIFContext.class,0);
		}
		public ImageAttributeContext imageAttribute() {
			return getRuleContext(ImageAttributeContext.class,0);
		}
		public ActionAttributeContext actionAttribute() {
			return getRuleContext(ActionAttributeContext.class,0);
		}
		public HtmlBindingContext htmlBinding() {
			return getRuleContext(HtmlBindingContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_htmlAttribute);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				basicAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				ngFor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				ngIF();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				imageAttribute();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(497);
				actionAttribute();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(498);
				htmlBinding();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicAttributeContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public BasicAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBasicAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBasicAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBasicAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicAttributeContext basicAttribute() throws RecognitionException {
		BasicAttributeContext _localctx = new BasicAttributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_basicAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(502);
			match(EQ);
			setState(503);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NgForContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode NG_FOR() { return getToken(AngularParser.NG_FOR, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public NgForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgForContext ngFor() throws RecognitionException {
		NgForContext _localctx = new NgForContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ngFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(STAR);
			setState(506);
			match(NG_FOR);
			setState(507);
			match(EQ);
			setState(508);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NgIFContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode NG_IF() { return getToken(AngularParser.NG_IF, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public NgIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngIF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgIF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgIFContext ngIF() throws RecognitionException {
		NgIFContext _localctx = new NgIFContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ngIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(STAR);
			setState(511);
			match(NG_IF);
			setState(512);
			match(EQ);
			setState(513);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImageAttributeContext extends ParserRuleContext {
		public TerminalNode IMAGE_SRC() { return getToken(AngularParser.IMAGE_SRC, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public List<BasicAttributeContext> basicAttribute() {
			return getRuleContexts(BasicAttributeContext.class);
		}
		public BasicAttributeContext basicAttribute(int i) {
			return getRuleContext(BasicAttributeContext.class,i);
		}
		public ImageAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImageAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImageAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImageAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageAttributeContext imageAttribute() throws RecognitionException {
		ImageAttributeContext _localctx = new ImageAttributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_imageAttribute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_SQUARE_BRACKET) {
				{
				setState(515);
				match(OPEN_SQUARE_BRACKET);
				}
			}

			setState(518);
			match(IMAGE_SRC);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_SQUARE_BRACKET) {
				{
				setState(519);
				match(CLOSE_SQUARE_BRACKET);
				}
			}

			setState(522);
			match(EQ);
			setState(523);
			match(STRING_LITERAL);
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(524);
					basicAttribute();
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionAttributeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode CLICK() { return getToken(AngularParser.CLICK, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public ActionAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterActionAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitActionAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitActionAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionAttributeContext actionAttribute() throws RecognitionException {
		ActionAttributeContext _localctx = new ActionAttributeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_actionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(OPEN_BRACKET);
			setState(531);
			match(CLICK);
			setState(532);
			match(CLOSE_BRACKET);
			setState(533);
			match(EQ);
			setState(534);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlBindingContext extends ParserRuleContext {
		public HtmlBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBinding; }
	 
		public HtmlBindingContext() { }
		public void copyFrom(HtmlBindingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TwoWayBindingContext extends HtmlBindingContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public TwoWayBindingContext(HtmlBindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTwoWayBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTwoWayBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTwoWayBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EventBindingContext extends HtmlBindingContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public EventBindingContext(HtmlBindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyBindingContext extends HtmlBindingContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public PropertyBindingContext(HtmlBindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAttributeContext extends HtmlBindingContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public BooleanAttributeContext(HtmlBindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBooleanAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBooleanAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBooleanAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TemplateRefContext extends HtmlBindingContext {
		public TerminalNode HASH() { return getToken(AngularParser.HASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TemplateRefContext(HtmlBindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBindingContext htmlBinding() throws RecognitionException {
		HtmlBindingContext _localctx = new HtmlBindingContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_htmlBinding);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new TemplateRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(HASH);
				setState(537);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(OPEN_BRACKET);
				setState(539);
				match(IDENTIFIER);
				setState(540);
				match(CLOSE_BRACKET);
				setState(541);
				match(EQ);
				setState(542);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				_localctx = new PropertyBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(543);
				match(OPEN_SQUARE_BRACKET);
				setState(544);
				match(IDENTIFIER);
				setState(545);
				match(CLOSE_SQUARE_BRACKET);
				setState(546);
				match(EQ);
				setState(547);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				_localctx = new TwoWayBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				match(OPEN_SQUARE_BRACKET);
				setState(549);
				match(OPEN_BRACKET);
				setState(550);
				match(IDENTIFIER);
				setState(551);
				match(CLOSE_BRACKET);
				setState(552);
				match(CLOSE_SQUARE_BRACKET);
				setState(553);
				match(EQ);
				setState(554);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				_localctx = new BooleanAttributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(555);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlContentBodyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public HtmlContentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentBodyContext htmlContentBody() throws RecognitionException {
		HtmlContentBodyContext _localctx = new HtmlContentBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_htmlContentBody);
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(IDENTIFIER);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				htmlElement();
				}
				break;
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				objectExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectExpressionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_CURLY_BRACKET() { return getTokens(AngularParser.OPEN_CURLY_BRACKET); }
		public TerminalNode OPEN_CURLY_BRACKET(int i) {
			return getToken(AngularParser.OPEN_CURLY_BRACKET, i);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public List<TerminalNode> CLOSE_CURLY_BRACKET() { return getTokens(AngularParser.CLOSE_CURLY_BRACKET); }
		public TerminalNode CLOSE_CURLY_BRACKET(int i) {
			return getToken(AngularParser.CLOSE_CURLY_BRACKET, i);
		}
		public ObjectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionContext objectExpression() throws RecognitionException {
		ObjectExpressionContext _localctx = new ObjectExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_objectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(OPEN_CURLY_BRACKET);
			setState(564);
			match(OPEN_CURLY_BRACKET);
			setState(565);
			propertyValue(0);
			setState(566);
			match(CLOSE_CURLY_BRACKET);
			setState(567);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineStyleContext extends ParserRuleContext {
		public List<TerminalNode> SCOPE_QUOTE() { return getTokens(AngularParser.SCOPE_QUOTE); }
		public TerminalNode SCOPE_QUOTE(int i) {
			return getToken(AngularParser.SCOPE_QUOTE, i);
		}
		public List<CssDocumentContext> cssDocument() {
			return getRuleContexts(CssDocumentContext.class);
		}
		public CssDocumentContext cssDocument(int i) {
			return getRuleContext(CssDocumentContext.class,i);
		}
		public InlineStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInlineStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInlineStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInlineStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineStyleContext inlineStyle() throws RecognitionException {
		InlineStyleContext _localctx = new InlineStyleContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_inlineStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(SCOPE_QUOTE);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (OPEN_CURLY_BRACKET - 85)) | (1L << (OPEN_SQUARE_BRACKET - 85)) | (1L << (COMMA - 85)) | (1L << (DOT - 85)) | (1L << (DOT_DOT - 85)) | (1L << (IDENTIFIER - 85)))) != 0)) {
				{
				{
				setState(570);
				cssDocument();
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			match(SCOPE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CssDocumentContext extends ParserRuleContext {
		public List<CssSelectorContext> cssSelector() {
			return getRuleContexts(CssSelectorContext.class);
		}
		public CssSelectorContext cssSelector(int i) {
			return getRuleContext(CssSelectorContext.class,i);
		}
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDocumentContext cssDocument() throws RecognitionException {
		CssDocumentContext _localctx = new CssDocumentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cssDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			cssSelector();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(579);
				match(COMMA);
				setState(580);
				cssSelector();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(586);
			match(OPEN_CURLY_BRACKET);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(587);
				cssRule();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CssSelectorContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<AttributeSelectorContext> attributeSelector() {
			return getRuleContexts(AttributeSelectorContext.class);
		}
		public AttributeSelectorContext attributeSelector(int i) {
			return getRuleContext(AttributeSelectorContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<TerminalNode> DOT_DOT() { return getTokens(AngularParser.DOT_DOT); }
		public TerminalNode DOT_DOT(int i) {
			return getToken(AngularParser.DOT_DOT, i);
		}
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(595);
				match(IDENTIFIER);
				}
				break;
			}
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (OPEN_SQUARE_BRACKET - 89)) | (1L << (DOT - 89)) | (1L << (DOT_DOT - 89)) | (1L << (IDENTIFIER - 89)))) != 0)) {
				{
				setState(607);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					{
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT) {
						{
						setState(598);
						match(DOT);
						}
					}

					setState(601);
					match(IDENTIFIER);
					}
					}
					break;
				case 2:
					{
					{
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT_DOT) {
						{
						setState(602);
						match(DOT_DOT);
						}
					}

					setState(605);
					match(IDENTIFIER);
					}
					}
					break;
				case 3:
					{
					setState(606);
					attributeSelector();
					}
					break;
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeSelectorContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public AttributeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSelectorContext attributeSelector() throws RecognitionException {
		AttributeSelectorContext _localctx = new AttributeSelectorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_attributeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(OPEN_SQUARE_BRACKET);
			setState(613);
			match(IDENTIFIER);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(614);
				match(EQ);
				setState(615);
				match(STRING_LITERAL);
				}
			}

			setState(618);
			match(CLOSE_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CssRuleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<RuleValueContext> ruleValue() {
			return getRuleContexts(RuleValueContext.class);
		}
		public RuleValueContext ruleValue(int i) {
			return getRuleContext(RuleValueContext.class,i);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(IDENTIFIER);
			setState(621);
			match(DOT_DOT);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (NUMERIC_LITERAL - 118)) | (1L << (IDENTIFIER - 118)) | (1L << (COLOR - 118)))) != 0)) {
				{
				{
				setState(622);
				ruleValue();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(628);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(AngularParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PX() { return getToken(AngularParser.PX, 0); }
		public TerminalNode PERCENTAGE() { return getToken(AngularParser.PERCENTAGE, 0); }
		public TerminalNode COLOR() { return getToken(AngularParser.COLOR, 0); }
		public RuleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRuleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRuleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRuleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleValueContext ruleValue() throws RecognitionException {
		RuleValueContext _localctx = new RuleValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ruleValue);
		int _la;
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(NUMERIC_LITERAL);
				setState(632);
				match(PX);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				match(NUMERIC_LITERAL);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERCENTAGE) {
					{
					setState(634);
					match(PERCENTAGE);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
				match(COLOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutesDeclarationContext extends ParserRuleContext {
		public DeclareVarsKeywordContext declareVarsKeyword() {
			return getRuleContext(DeclareVarsKeywordContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public RouteArrayContext routeArray() {
			return getRuleContext(RouteArrayContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public RoutesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRoutesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRoutesDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRoutesDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutesDeclarationContext routesDeclaration() throws RecognitionException {
		RoutesDeclarationContext _localctx = new RoutesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_routesDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(640);
				match(EXPORT);
				}
			}

			setState(643);
			declareVarsKeyword();
			setState(644);
			match(IDENTIFIER);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(645);
				match(DOT_DOT);
				setState(646);
				match(IDENTIFIER);
				}
			}

			setState(649);
			match(EQ);
			setState(650);
			routeArray();
			setState(651);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RouteArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public List<RouteObjectContext> routeObject() {
			return getRuleContexts(RouteObjectContext.class);
		}
		public RouteObjectContext routeObject(int i) {
			return getRuleContext(RouteObjectContext.class,i);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public RouteArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteArrayContext routeArray() throws RecognitionException {
		RouteArrayContext _localctx = new RouteArrayContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_routeArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(OPEN_SQUARE_BRACKET);
			setState(654);
			routeObject();
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(655);
				match(COMMA);
				setState(656);
				routeObject();
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662);
			match(CLOSE_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RouteObjectContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public List<RoutePropertyContext> routeProperty() {
			return getRuleContexts(RoutePropertyContext.class);
		}
		public RoutePropertyContext routeProperty(int i) {
			return getRuleContext(RoutePropertyContext.class,i);
		}
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public RouteObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteObjectContext routeObject() throws RecognitionException {
		RouteObjectContext _localctx = new RouteObjectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_routeObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(OPEN_CURLY_BRACKET);
			setState(665);
			routeProperty();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(666);
				match(COMMA);
				setState(667);
				routeProperty();
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutePropertyContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(AngularParser.PATH, 0); }
		public List<TerminalNode> DOT_DOT() { return getTokens(AngularParser.DOT_DOT); }
		public TerminalNode DOT_DOT(int i) {
			return getToken(AngularParser.DOT_DOT, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public TerminalNode COMPONENT_KW() { return getToken(AngularParser.COMPONENT_KW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public RoutePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutePropertyContext routeProperty() throws RecognitionException {
		RoutePropertyContext _localctx = new RoutePropertyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_routeProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(PATH);
			setState(676);
			match(DOT_DOT);
			setState(677);
			match(STRING_LITERAL);
			setState(678);
			match(COMMA);
			setState(679);
			match(COMPONENT_KW);
			setState(680);
			match(DOT_DOT);
			setState(681);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode ABSTRACT() { return getToken(AngularParser.ABSTRACT, 0); }
		public ClassHeritageContext classHeritage() {
			return getRuleContext(ClassHeritageContext.class,0);
		}
		public ClassImplementContext classImplement() {
			return getRuleContext(ClassImplementContext.class,0);
		}
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(683);
				match(EXPORT);
				}
			}

			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(686);
				match(ABSTRACT);
				}
			}

			setState(689);
			match(CLASS);
			setState(690);
			match(IDENTIFIER);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(691);
				classHeritage();
				}
			}

			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(694);
				classImplement();
				}
			}

			setState(697);
			match(OPEN_CURLY_BRACKET);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTRUCTOR) | (1L << ASYNC) | (1L << STATIC) | (1L << READONLY))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PRIVATE - 73)) | (1L << (PUBLIC - 73)) | (1L << (PROTECTED - 73)) | (1L << (ATT - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
				{
				{
				setState(698);
				classBody();
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeritageContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ClassHeritageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeritage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassHeritage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassHeritage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassHeritage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeritageContext classHeritage() throws RecognitionException {
		ClassHeritageContext _localctx = new ClassHeritageContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classHeritage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(EXTENDS);
			setState(707);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassImplementContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ClassImplementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImplement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassImplement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassImplement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassImplement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassImplementContext classImplement() throws RecognitionException {
		ClassImplementContext _localctx = new ClassImplementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classImplement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(IMPLEMENTS);
			setState(710);
			match(IDENTIFIER);
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(711);
				match(COMMA);
				setState(712);
				match(IDENTIFIER);
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassPropertyDeclarationContext classPropertyDeclaration() {
			return getRuleContext(ClassPropertyDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classBody);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				classPropertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassPropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(AngularParser.STATIC, 0); }
		public TerminalNode READONLY() { return getToken(AngularParser.READONLY, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public AssignDataTypeContext assignDataType() {
			return getRuleContext(AssignDataTypeContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ClassPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPropertyDeclarationContext classPropertyDeclaration() throws RecognitionException {
		ClassPropertyDeclarationContext _localctx = new ClassPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classPropertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PRIVATE - 73)) | (1L << (PUBLIC - 73)) | (1L << (PROTECTED - 73)))) != 0)) {
				{
				setState(723);
				accessModifiers();
				}
			}

			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(726);
				match(STATIC);
				}
			}

			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY) {
				{
				setState(729);
				match(READONLY);
				}
			}

			setState(732);
			match(IDENTIFIER);
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(733);
				match(DOT_DOT);
				setState(734);
				assignDataType();
				}
			}

			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(737);
				assigment();
				}
			}

			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(740);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public List<AccessModifiersContext> accessModifiers() {
			return getRuleContexts(AccessModifiersContext.class);
		}
		public AccessModifiersContext accessModifiers(int i) {
			return getRuleContext(AccessModifiersContext.class,i);
		}
		public TerminalNode ASYNC() { return getToken(AngularParser.ASYNC, 0); }
		public TerminalNode STATIC() { return getToken(AngularParser.STATIC, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public AssigmentToNullContext assigmentToNull() {
			return getRuleContext(AssigmentToNullContext.class,0);
		}
		public List<MethodBodyContext> methodBody() {
			return getRuleContexts(MethodBodyContext.class);
		}
		public MethodBodyContext methodBody(int i) {
			return getRuleContext(MethodBodyContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATT) {
				{
				{
				setState(743);
				decorator();
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PRIVATE - 73)) | (1L << (PUBLIC - 73)) | (1L << (PROTECTED - 73)))) != 0)) {
				{
				{
				setState(749);
				accessModifiers();
				}
				}
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(755);
				match(ASYNC);
				}
			}

			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(758);
				match(STATIC);
				}
			}

			setState(761);
			match(IDENTIFIER);
			setState(762);
			match(OPEN_BRACKET);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(763);
				parameterList();
				}
			}

			setState(766);
			match(CLOSE_BRACKET);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(767);
				returnType();
				}
			}

			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(770);
				assigmentToNull();
				}
			}

			setState(773);
			match(OPEN_CURLY_BRACKET);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << CONSOLE) | (1L << LET) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(774);
				methodBody();
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode ATT() { return getToken(AngularParser.ATT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(ATT);
			setState(783);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(DOT_DOT);
			setState(786);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public CommonStatementContext commonStatement() {
			return getRuleContext(CommonStatementContext.class,0);
		}
		public MethodBodyPropertyContext methodBodyProperty() {
			return getRuleContext(MethodBodyPropertyContext.class,0);
		}
		public PropertyCallContext propertyCall() {
			return getRuleContext(PropertyCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_methodBody);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				commonStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				methodBodyProperty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(791);
				propertyCall();
				setState(792);
				match(SEMICOLON);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyPropertyContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public PropertyAssignmentContext propertyAssignment() {
			return getRuleContext(PropertyAssignmentContext.class,0);
		}
		public MethodBodyPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBodyProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodBodyProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodBodyProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodBodyProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyPropertyContext methodBodyProperty() throws RecognitionException {
		MethodBodyPropertyContext _localctx = new MethodBodyPropertyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_methodBodyProperty);
		int _la;
		try {
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				localVariableDeclaration();
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(797);
					match(SEMICOLON);
					}
				}

				}
				break;
			case THIS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				propertyAssignment();
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(801);
					match(SEMICOLON);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(RETURN);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NULL) | (1L << NEW))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BOOL - 69)) | (1L << (LIST - 69)) | (1L << (UNDEFINED - 69)) | (1L << (OPEN_CURLY_BRACKET - 69)) | (1L << (OPEN_BRACKET - 69)) | (1L << (CLOSE_BRACKET - 69)) | (1L << (OPEN_SQUARE_BRACKET - 69)) | (1L << (SPREAD - 69)) | (1L << (PP - 69)) | (1L << (MM - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (NUMERIC_LITERAL - 69)) | (1L << (BIGINT_LITERAL - 69)) | (1L << (SYMBOL_LITERAL - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				setState(807);
				expression(0);
				}
			}

			setState(810);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(AngularParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(AngularParser.LOG, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(CONSOLE);
			setState(813);
			match(DOT);
			setState(814);
			match(LOG);
			setState(815);
			match(OPEN_BRACKET);
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(816);
				expression(0);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(817);
					match(COMMA);
					setState(818);
					expression(0);
					}
					}
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(826);
			match(CLOSE_BRACKET);
			setState(827);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_parameterList);
		int _la;
		try {
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				parameter();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(830);
					match(COMMA);
					setState(831);
					parameter();
					}
					}
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				match(IDENTIFIER);
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(838);
					match(COMMA);
					setState(839);
					match(IDENTIFIER);
					}
					}
					setState(844);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public TerminalNode KEYOF() { return getToken(AngularParser.KEYOF, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(IDENTIFIER);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(848);
				match(QUESTION);
				}
			}

			setState(851);
			match(DOT_DOT);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYOF) {
				{
				setState(852);
				match(KEYOF);
				}
			}

			setState(855);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public ConstructorParamsContext constructorParams() {
			return getRuleContext(ConstructorParamsContext.class,0);
		}
		public List<ConstructorBodyContext> constructorBody() {
			return getRuleContexts(ConstructorBodyContext.class);
		}
		public ConstructorBodyContext constructorBody(int i) {
			return getRuleContext(ConstructorBodyContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(CONSTRUCTOR);
			setState(858);
			match(OPEN_BRACKET);
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PRIVATE - 73)) | (1L << (PUBLIC - 73)) | (1L << (PROTECTED - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
				{
				setState(859);
				constructorParams();
				}
			}

			setState(862);
			match(CLOSE_BRACKET);
			setState(863);
			match(OPEN_CURLY_BRACKET);
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << CONSOLE) | (1L << READONLY) | (1L << LET) | (1L << CONST))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PRIVATE - 73)) | (1L << (PUBLIC - 73)) | (1L << (PROTECTED - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
				{
				{
				setState(864);
				constructorBody();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(870);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorParamsContext extends ParserRuleContext {
		public List<ConstructorParamContext> constructorParam() {
			return getRuleContexts(ConstructorParamContext.class);
		}
		public ConstructorParamContext constructorParam(int i) {
			return getRuleContext(ConstructorParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ConstructorParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParamsContext constructorParams() throws RecognitionException {
		ConstructorParamsContext _localctx = new ConstructorParamsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_constructorParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			constructorParam();
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(873);
				match(COMMA);
				setState(874);
				constructorParam();
				}
				}
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorParamContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public ConstructorParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParamContext constructorParam() throws RecognitionException {
		ConstructorParamContext _localctx = new ConstructorParamContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_constructorParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PRIVATE - 73)) | (1L << (PUBLIC - 73)) | (1L << (PROTECTED - 73)))) != 0)) {
				{
				setState(880);
				accessModifiers();
				}
			}

			setState(883);
			match(IDENTIFIER);
			setState(884);
			match(DOT_DOT);
			setState(885);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ConstructorBodyPropertyContext constructorBodyProperty() {
			return getRuleContext(ConstructorBodyPropertyContext.class,0);
		}
		public CommonStatementContext commonStatement() {
			return getRuleContext(CommonStatementContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_constructorBody);
		try {
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case READONLY:
			case LET:
			case CONST:
			case PRIVATE:
			case PUBLIC:
			case PROTECTED:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				constructorBodyProperty();
				}
				break;
			case SWITCH:
			case FOR:
			case WHILE:
			case DO:
			case IF:
			case CONSOLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				commonStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyPropertyContext extends ParserRuleContext {
		public ParameterPropertyAssignmentContext parameterPropertyAssignment() {
			return getRuleContext(ParameterPropertyAssignmentContext.class,0);
		}
		public MethodBodyPropertyContext methodBodyProperty() {
			return getRuleContext(MethodBodyPropertyContext.class,0);
		}
		public ConstructorBodyPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBodyProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorBodyProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorBodyProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorBodyProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyPropertyContext constructorBodyProperty() throws RecognitionException {
		ConstructorBodyPropertyContext _localctx = new ConstructorBodyPropertyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constructorBodyProperty);
		try {
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				parameterPropertyAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				methodBodyProperty();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonStatementContext extends ParserRuleContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public CommonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonStatementContext commonStatement() throws RecognitionException {
		CommonStatementContext _localctx = new CommonStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_commonStatement);
		try {
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSOLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				printStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				conditionalStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(897);
				switchStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(898);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(899);
				whileStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(900);
				doWhileStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockPropertyContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public PropertyAssignmentContext propertyAssignment() {
			return getRuleContext(PropertyAssignmentContext.class,0);
		}
		public BlockPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockPropertyContext blockProperty() throws RecognitionException {
		BlockPropertyContext _localctx = new BlockPropertyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_blockProperty);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				localVariableDeclaration();
				}
				break;
			case THIS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				propertyAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterPropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public TerminalNode READONLY() { return getToken(AngularParser.READONLY, 0); }
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public ParameterPropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterPropertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterPropertyAssignmentContext parameterPropertyAssignment() throws RecognitionException {
		ParameterPropertyAssignmentContext _localctx = new ParameterPropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_parameterPropertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PRIVATE - 73)) | (1L << (PUBLIC - 73)) | (1L << (PROTECTED - 73)))) != 0)) {
				{
				setState(907);
				accessModifiers();
				}
			}

			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY) {
				{
				setState(910);
				match(READONLY);
				}
			}

			setState(913);
			match(IDENTIFIER);
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(914);
				assigment();
				}
			}

			setState(917);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public AssignDataTypeContext assignDataType() {
			return getRuleContext(AssignDataTypeContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			_la = _input.LA(1);
			if ( !(_la==LET || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(920);
			match(IDENTIFIER);
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(921);
				match(DOT_DOT);
				setState(922);
				assignDataType();
				}
			}

			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(925);
				assigment();
				}
			}

			setState(928);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyCallContext propertyCall() {
			return getRuleContext(PropertyCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public CompoundAssignmentContext compoundAssignment() {
			return getRuleContext(CompoundAssignmentContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_propertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			propertyCall();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (EQ - 96)) | (1L << (PLUSEQ - 96)) | (1L << (MINUSEQ - 96)) | (1L << (STAREQ - 96)) | (1L << (SLASHEQ - 96)))) != 0)) {
				{
				setState(931);
				compoundAssignment();
				}
			}

			setState(934);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignDataTypeContext extends ParserRuleContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AngularParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AngularParser.OR, i);
		}
		public AssignDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignDataTypeContext assignDataType() throws RecognitionException {
		AssignDataTypeContext _localctx = new AssignDataTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assignDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			dataType();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(937);
				match(OR);
				setState(938);
				dataType();
				}
				}
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(EQ);
			setState(945);
			propertyValue(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigmentToNullContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(AngularParser.OR, 0); }
		public List<TerminalNode> NULL() { return getTokens(AngularParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(AngularParser.NULL, i);
		}
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public AssigmentToNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigmentToNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssigmentToNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssigmentToNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssigmentToNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentToNullContext assigmentToNull() throws RecognitionException {
		AssigmentToNullContext _localctx = new AssigmentToNullContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assigmentToNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(OR);
			setState(948);
			match(NULL);
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(949);
				match(EQ);
				setState(950);
				match(NULL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundAssignmentContext extends ParserRuleContext {
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode PLUSEQ() { return getToken(AngularParser.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(AngularParser.MINUSEQ, 0); }
		public TerminalNode STAREQ() { return getToken(AngularParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(AngularParser.SLASHEQ, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public CompoundAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCompoundAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCompoundAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCompoundAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundAssignmentContext compoundAssignment() throws RecognitionException {
		CompoundAssignmentContext _localctx = new CompoundAssignmentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_compoundAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (EQ - 96)) | (1L << (PLUSEQ - 96)) | (1L << (MINUSEQ - 96)) | (1L << (STAREQ - 96)) | (1L << (SLASHEQ - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(954);
			propertyValue(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyValueContext extends ParserRuleContext {
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
	 
		public PropertyValueContext() { }
		public void copyFrom(PropertyValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryOperationPropertyValueExprContext extends PropertyValueContext {
		public List<PropertyValueContext> propertyValue() {
			return getRuleContexts(PropertyValueContext.class);
		}
		public PropertyValueContext propertyValue(int i) {
			return getRuleContext(PropertyValueContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public BinaryOperationPropertyValueExprContext(PropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBinaryOperationPropertyValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBinaryOperationPropertyValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBinaryOperationPropertyValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedPropertyValueExprContext extends PropertyValueContext {
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(AngularParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(AngularParser.CLOSE_BRACKET, i);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public BracketedPropertyValueExprContext(PropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBracketedPropertyValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBracketedPropertyValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBracketedPropertyValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyValueObjectExprContext extends PropertyValueContext {
		public PropertyValueObjectsContext propertyValueObjects() {
			return getRuleContext(PropertyValueObjectsContext.class,0);
		}
		public PropertyValueObjectExprContext(PropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyValueObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyValueObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyValueObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShortIfExprContext extends PropertyValueContext {
		public List<PropertyValueContext> propertyValue() {
			return getRuleContexts(PropertyValueContext.class);
		}
		public PropertyValueContext propertyValue(int i) {
			return getRuleContext(PropertyValueContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public ShortIfExprContext(PropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterShortIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitShortIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitShortIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		return propertyValue(0);
	}

	private PropertyValueContext propertyValue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, _parentState);
		PropertyValueContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_propertyValue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case NULL:
			case NEW:
			case BOOL:
			case LIST:
			case UNDEFINED:
			case OPEN_CURLY_BRACKET:
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case SPREAD:
			case PP:
			case MM:
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
			case BIGINT_LITERAL:
			case SYMBOL_LITERAL:
			case IDENTIFIER:
				{
				_localctx = new PropertyValueObjectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(957);
				propertyValueObjects();
				}
				break;
			case CLOSE_BRACKET:
				{
				_localctx = new BracketedPropertyValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(958);
				match(CLOSE_BRACKET);
				setState(959);
				propertyValue(0);
				setState(960);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(976);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(974);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOperationPropertyValueExprContext(new PropertyValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propertyValue);
						setState(964);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(965);
						operation();
						setState(966);
						propertyValue(3);
						}
						break;
					case 2:
						{
						_localctx = new ShortIfExprContext(new PropertyValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propertyValue);
						setState(968);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(969);
						match(QUESTION);
						setState(970);
						propertyValue(0);
						setState(971);
						match(DOT_DOT);
						setState(972);
						propertyValue(2);
						}
						break;
					}
					} 
				}
				setState(978);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PropertyValueObjectsContext extends ParserRuleContext {
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ObjectValueContext objectValue() {
			return getRuleContext(ObjectValueContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IndexAccessValueContext indexAccessValue() {
			return getRuleContext(IndexAccessValueContext.class,0);
		}
		public PropertyCallContext propertyCall() {
			return getRuleContext(PropertyCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public PostFixContext postFix() {
			return getRuleContext(PostFixContext.class,0);
		}
		public PreFixContext preFix() {
			return getRuleContext(PreFixContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public SpreadElementContext spreadElement() {
			return getRuleContext(SpreadElementContext.class,0);
		}
		public PropertyValueObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValueObjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyValueObjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyValueObjects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyValueObjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueObjectsContext propertyValueObjects() throws RecognitionException {
		PropertyValueObjectsContext _localctx = new PropertyValueObjectsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_propertyValueObjects);
		try {
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				literalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				objectValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(981);
				list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(982);
				indexAccessValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(983);
				propertyCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(984);
				methodCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(985);
				arrowFunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(986);
				postFix();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(987);
				preFix();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(988);
				newExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(989);
				spreadElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralValueContext extends ParserRuleContext {
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
	 
		public LiteralValueContext() { }
		public void copyFrom(LiteralValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExprContext extends LiteralValueContext {
		public TerminalNode BOOL() { return getToken(AngularParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(AngularParser.LIST, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public TerminalNode UNDEFINED() { return getToken(AngularParser.UNDEFINED, 0); }
		public ValueExprContext(LiteralValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExprContext extends LiteralValueContext {
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(AngularParser.NUMERIC_LITERAL, 0); }
		public TerminalNode BIGINT_LITERAL() { return getToken(AngularParser.BIGINT_LITERAL, 0); }
		public LiteralExprContext(LiteralValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymbolExprContext extends LiteralValueContext {
		public TerminalNode SYMBOL_LITERAL() { return getToken(AngularParser.SYMBOL_LITERAL, 0); }
		public SymbolExprContext(LiteralValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSymbolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSymbolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_literalValue);
		try {
			setState(1000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				match(NUMERIC_LITERAL);
				}
				break;
			case BIGINT_LITERAL:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(994);
				match(BIGINT_LITERAL);
				}
				break;
			case BOOL:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(995);
				match(BOOL);
				}
				break;
			case LIST:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(996);
				match(LIST);
				}
				break;
			case NULL:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(997);
				match(NULL);
				}
				break;
			case UNDEFINED:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(998);
				match(UNDEFINED);
				}
				break;
			case SYMBOL_LITERAL:
				_localctx = new SymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(999);
				match(SYMBOL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectValueContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ObjectValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectValueContext objectValue() throws RecognitionException {
		ObjectValueContext _localctx = new ObjectValueContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_objectValue);
		int _la;
		try {
			int _alt;
			setState(1018);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				match(OPEN_CURLY_BRACKET);
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPREAD || _la==IDENTIFIER) {
					{
					setState(1003);
					objectProperty();
					setState(1008);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1004);
							match(COMMA);
							setState(1005);
							objectProperty();
							}
							} 
						}
						setState(1010);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
					}
					}
				}

				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1013);
					match(COMMA);
					}
				}

				setState(1016);
				match(CLOSE_CURLY_BRACKET);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPropertyContext extends ParserRuleContext {
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	 
		public ObjectPropertyContext() { }
		public void copyFrom(ObjectPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalObjectPropertyContext extends ObjectPropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public NormalObjectPropertyContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNormalObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNormalObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNormalObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpreadObjectPropertyContext extends ObjectPropertyContext {
		public SpreadElementContext spreadElement() {
			return getRuleContext(SpreadElementContext.class,0);
		}
		public SpreadObjectPropertyContext(ObjectPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSpreadObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSpreadObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSpreadObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_objectProperty);
		int _la;
		try {
			setState(1026);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPREAD:
				_localctx = new SpreadObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				spreadElement();
				}
				break;
			case IDENTIFIER:
				_localctx = new NormalObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				match(IDENTIFIER);
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_DOT) {
					{
					setState(1022);
					match(DOT_DOT);
					setState(1023);
					propertyValue(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public List<SpreadElementContext> spreadElement() {
			return getRuleContexts(SpreadElementContext.class);
		}
		public SpreadElementContext spreadElement(int i) {
			return getRuleContext(SpreadElementContext.class,i);
		}
		public List<PropertyValueContext> propertyValue() {
			return getRuleContexts(PropertyValueContext.class);
		}
		public PropertyValueContext propertyValue(int i) {
			return getRuleContext(PropertyValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(OPEN_SQUARE_BRACKET);
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1029);
				spreadElement();
				}
				break;
			case 2:
				{
				setState(1030);
				propertyValue(0);
				}
				break;
			}
			setState(1040);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1033);
					match(COMMA);
					setState(1036);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						setState(1034);
						spreadElement();
						}
						break;
					case 2:
						{
						setState(1035);
						propertyValue(0);
						}
						break;
					}
					}
					} 
				}
				setState(1042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1043);
				match(COMMA);
				}
			}

			setState(1046);
			match(CLOSE_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpreadElementContext extends ParserRuleContext {
		public SpreadElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spreadElement; }
	 
		public SpreadElementContext() { }
		public void copyFrom(SpreadElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpreadElementExprContext extends SpreadElementContext {
		public TerminalNode SPREAD() { return getToken(AngularParser.SPREAD, 0); }
		public PropertyCallContext propertyCall() {
			return getRuleContext(PropertyCallContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public SpreadElementExprContext(SpreadElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSpreadElementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSpreadElementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSpreadElementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpreadElementContext spreadElement() throws RecognitionException {
		SpreadElementContext _localctx = new SpreadElementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_spreadElement);
		try {
			_localctx = new SpreadElementExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(SPREAD);
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1049);
				propertyCall();
				}
				break;
			case 2:
				{
				setState(1050);
				match(IDENTIFIER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAccessValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public IndexAccessValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAccessValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIndexAccessValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIndexAccessValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIndexAccessValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAccessValueContext indexAccessValue() throws RecognitionException {
		IndexAccessValueContext _localctx = new IndexAccessValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_indexAccessValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(IDENTIFIER);
			setState(1054);
			match(OPEN_SQUARE_BRACKET);
			setState(1055);
			propertyValue(0);
			setState(1056);
			match(CLOSE_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
	 
		public ArrowFunctionContext() { }
		public void copyFrom(ArrowFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrowFunctionExprContext extends ArrowFunctionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionExprContext(ArrowFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrowFunctionBlockExprContext extends ArrowFunctionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArrowFunctionBlockExprContext(ArrowFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionBlockExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionBlockExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrowFunctionWithParamsBlockExprContext extends ArrowFunctionContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArrowFunctionWithParamsBlockExprContext(ArrowFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionWithParamsBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionWithParamsBlockExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionWithParamsBlockExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrowFunctionWithParamsExprContext extends ArrowFunctionContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionWithParamsExprContext(ArrowFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionWithParamsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionWithParamsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionWithParamsExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_arrowFunction);
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				_localctx = new ArrowFunctionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(IDENTIFIER);
				setState(1059);
				match(ARROW);
				setState(1060);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ArrowFunctionBlockExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				match(IDENTIFIER);
				setState(1062);
				match(ARROW);
				setState(1063);
				block();
				}
				break;
			case 3:
				_localctx = new ArrowFunctionWithParamsExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1064);
				match(OPEN_BRACKET);
				setState(1065);
				parameterList();
				setState(1066);
				match(CLOSE_BRACKET);
				setState(1067);
				match(ARROW);
				setState(1068);
				expression(0);
				}
				break;
			case 4:
				_localctx = new ArrowFunctionWithParamsBlockExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1070);
				match(OPEN_BRACKET);
				setState(1071);
				parameterList();
				setState(1072);
				match(CLOSE_BRACKET);
				setState(1073);
				match(ARROW);
				setState(1074);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreFixContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode PP() { return getToken(AngularParser.PP, 0); }
		public TerminalNode MM() { return getToken(AngularParser.MM, 0); }
		public PreFixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preFix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPreFix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPreFix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPreFix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreFixContext preFix() throws RecognitionException {
		PreFixContext _localctx = new PreFixContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_preFix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			_la = _input.LA(1);
			if ( !(_la==PP || _la==MM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1079);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostFixContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode PP() { return getToken(AngularParser.PP, 0); }
		public TerminalNode MM() { return getToken(AngularParser.MM, 0); }
		public PostFixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postFix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostFix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostFix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostFix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostFixContext postFix() throws RecognitionException {
		PostFixContext _localctx = new PostFixContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_postFix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(IDENTIFIER);
			setState(1082);
			_la = _input.LA(1);
			if ( !(_la==PP || _la==MM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyCallContext extends ParserRuleContext {
		public PropertyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyCall; }
	 
		public PropertyCallContext() { }
		public void copyFrom(PropertyCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimplePropertyCallContext extends PropertyCallContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<IndexAccessValueContext> indexAccessValue() {
			return getRuleContexts(IndexAccessValueContext.class);
		}
		public IndexAccessValueContext indexAccessValue(int i) {
			return getRuleContext(IndexAccessValueContext.class,i);
		}
		public List<TerminalNode> QUESTION() { return getTokens(AngularParser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(AngularParser.QUESTION, i);
		}
		public SimplePropertyCallContext(PropertyCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSimplePropertyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSimplePropertyCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSimplePropertyCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyWithMethodCallContext extends PropertyCallContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<TerminalNode> QUESTION() { return getTokens(AngularParser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(AngularParser.QUESTION, i);
		}
		public PropertyWithMethodCallContext(PropertyCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyWithMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyWithMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyWithMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyCallContext propertyCall() throws RecognitionException {
		PropertyCallContext _localctx = new PropertyCallContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_propertyCall);
		int _la;
		try {
			int _alt;
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				_localctx = new SimplePropertyCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1086);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QUESTION) {
							{
							setState(1085);
							match(QUESTION);
							}
						}

						setState(1088);
						match(DOT);
						setState(1091);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
						case 1:
							{
							setState(1089);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(1090);
							indexAccessValue();
							}
							break;
						}
						}
						} 
					}
					setState(1097);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new PropertyWithMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1100);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QUESTION) {
							{
							setState(1099);
							match(QUESTION);
							}
						}

						setState(1102);
						match(DOT);
						setState(1103);
						match(IDENTIFIER);
						}
						} 
					}
					setState(1108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(1111); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1109);
						match(DOT);
						setState(1110);
						methodCall();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1113); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(IDENTIFIER);
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1118);
				typeArguments();
				}
			}

			setState(1121);
			match(OPEN_BRACKET);
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1122);
				expression(0);
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1123);
					match(COMMA);
					setState(1124);
					expression(0);
					}
					}
					setState(1129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1132);
			match(CLOSE_BRACKET);
			setState(1137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1133);
					match(DOT);
					setState(1134);
					match(IDENTIFIER);
					}
					} 
				}
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public List<SingleDataTypeContext> singleDataType() {
			return getRuleContexts(SingleDataTypeContext.class);
		}
		public SingleDataTypeContext singleDataType(int i) {
			return getRuleContext(SingleDataTypeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AngularParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AngularParser.OR, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_dataType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			singleDataType();
			setState(1145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1141);
					match(OR);
					setState(1142);
					singleDataType();
					}
					} 
				}
				setState(1147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<ListSuffixContext> listSuffix() {
			return getRuleContexts(ListSuffixContext.class);
		}
		public ListSuffixContext listSuffix(int i) {
			return getRuleContext(ListSuffixContext.class,i);
		}
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_singleDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			type();
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LT || _la==LIST) {
				{
				setState(1151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(1149);
					typeArguments();
					}
					break;
				case LIST:
					{
					setState(1150);
					listSuffix();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimitiveTypeContext extends TypeContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(AngularParser.VOID, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public TerminalNode UNDEFINED() { return getToken(AngularParser.UNDEFINED, 0); }
		public TerminalNode UNKNOWN() { return getToken(AngularParser.UNKNOWN, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public PrimitiveTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassTypeContext extends TypeContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ClassTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_type);
		try {
			setState(1165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1157);
				match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1158);
				match(BOOLEAN);
				}
				break;
			case VOID:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1159);
				match(VOID);
				}
				break;
			case NULL:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1160);
				match(NULL);
				}
				break;
			case UNDEFINED:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1161);
				match(UNDEFINED);
				}
				break;
			case UNKNOWN:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1162);
				match(UNKNOWN);
				}
				break;
			case ANY:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1163);
				match(ANY);
				}
				break;
			case IDENTIFIER:
				_localctx = new ClassTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1164);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			match(LT);
			setState(1168);
			dataType();
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1169);
				match(COMMA);
				setState(1170);
				dataType();
				}
				}
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1176);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListSuffixContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(AngularParser.LIST, 0); }
		public ListSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterListSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitListSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitListSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListSuffixContext listSuffix() throws RecognitionException {
		ListSuffixContext _localctx = new ListSuffixContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_listSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			match(LIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifiersContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public AccessModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAccessModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAccessModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAccessModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifiersContext accessModifiers() throws RecognitionException {
		AccessModifiersContext _localctx = new AccessModifiersContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_accessModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PRIVATE - 73)) | (1L << (PUBLIC - 73)) | (1L << (PROTECTED - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_newExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(NEW);
			setState(1183);
			match(IDENTIFIER);
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1184);
				typeArguments();
				}
			}

			setState(1187);
			match(OPEN_BRACKET);
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1188);
				expression(0);
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1189);
					match(COMMA);
					setState(1190);
					expression(0);
					}
					}
					setState(1195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1198);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_conditionalStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(IF);
			setState(1201);
			match(OPEN_BRACKET);
			setState(1202);
			expression(0);
			setState(1203);
			match(CLOSE_BRACKET);
			setState(1204);
			block();
			setState(1208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1205);
					elseIfStatement();
					}
					} 
				}
				setState(1210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1211);
				elseStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(ELSE);
			setState(1215);
			match(IF);
			setState(1216);
			match(OPEN_BRACKET);
			setState(1217);
			expression(0);
			setState(1218);
			match(CLOSE_BRACKET);
			setState(1219);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			match(ELSE);
			setState(1222);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(AngularParser.SWITCH, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public List<CaseBlockContext> caseBlock() {
			return getRuleContexts(CaseBlockContext.class);
		}
		public CaseBlockContext caseBlock(int i) {
			return getRuleContext(CaseBlockContext.class,i);
		}
		public DefaultBlockContext defaultBlock() {
			return getRuleContext(DefaultBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			match(SWITCH);
			setState(1225);
			match(OPEN_BRACKET);
			setState(1226);
			expression(0);
			setState(1227);
			match(CLOSE_BRACKET);
			setState(1228);
			match(OPEN_CURLY_BRACKET);
			setState(1230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1229);
				caseBlock();
				}
				}
				setState(1232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1234);
				defaultBlock();
				}
			}

			setState(1237);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AngularParser.CASE, 0); }
		public CaseValueContext caseValue() {
			return getRuleContext(CaseValueContext.class,0);
		}
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode BREAK() { return getToken(AngularParser.BREAK, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(CASE);
			setState(1240);
			caseValue();
			setState(1241);
			match(DOT_DOT);
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << SWITCH) | (1L << IF) | (1L << LET) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1242);
				caseStatement();
				}
				}
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1248);
			match(BREAK);
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1249);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultBlockContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(AngularParser.DEFAULT, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode BREAK() { return getToken(AngularParser.BREAK, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public DefaultBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDefaultBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDefaultBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDefaultBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultBlockContext defaultBlock() throws RecognitionException {
		DefaultBlockContext _localctx = new DefaultBlockContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_defaultBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(DEFAULT);
			setState(1253);
			match(DOT_DOT);
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << SWITCH) | (1L << IF) | (1L << LET) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1254);
				caseStatement();
				}
				}
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1260);
			match(BREAK);
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1261);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(AngularParser.NUMERIC_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public CaseValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCaseValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCaseValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCaseValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseValueContext caseValue() throws RecognitionException {
		CaseValueContext _localctx = new CaseValueContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_caseValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (STRING_LITERAL - 117)) | (1L << (NUMERIC_LITERAL - 117)) | (1L << (IDENTIFIER - 117)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public BlockPropertyContext blockProperty() {
			return getRuleContext(BlockPropertyContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public PropertyCallContext propertyCall() {
			return getRuleContext(PropertyCallContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_caseStatement);
		try {
			setState(1276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				blockProperty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				methodCall();
				setState(1268);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1270);
				conditionalStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1271);
				propertyCall();
				setState(1272);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1274);
				switchStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1275);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TraditionalForContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclareVarsKeywordContext declareVarsKeyword() {
			return getRuleContext(DeclareVarsKeywordContext.class,0);
		}
		public ForInitializerContext forInitializer() {
			return getRuleContext(ForInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TraditionalForContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTraditionalFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTraditionalFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTraditionalFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInLoopContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(AngularParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclareVarsKeywordContext declareVarsKeyword() {
			return getRuleContext(DeclareVarsKeywordContext.class,0);
		}
		public ForInLoopContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForInLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForInLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForInLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForOfLoopContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OF() { return getToken(AngularParser.OF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclareVarsKeywordContext declareVarsKeyword() {
			return getRuleContext(DeclareVarsKeywordContext.class,0);
		}
		public ForOfLoopContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForOfLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForOfLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForOfLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_forStatement);
		int _la;
		try {
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				_localctx = new TraditionalForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				match(FOR);
				setState(1279);
				match(OPEN_BRACKET);
				setState(1281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1280);
					declareVarsKeyword();
					}
					break;
				}
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << LET) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
					{
					setState(1283);
					forInitializer();
					}
				}

				setState(1286);
				match(SEMICOLON);
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NULL) | (1L << NEW))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BOOL - 69)) | (1L << (LIST - 69)) | (1L << (UNDEFINED - 69)) | (1L << (OPEN_CURLY_BRACKET - 69)) | (1L << (OPEN_BRACKET - 69)) | (1L << (CLOSE_BRACKET - 69)) | (1L << (OPEN_SQUARE_BRACKET - 69)) | (1L << (SPREAD - 69)) | (1L << (PP - 69)) | (1L << (MM - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (NUMERIC_LITERAL - 69)) | (1L << (BIGINT_LITERAL - 69)) | (1L << (SYMBOL_LITERAL - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
					{
					setState(1287);
					expression(0);
					}
				}

				setState(1290);
				match(SEMICOLON);
				setState(1292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1291);
					expression(0);
					}
					break;
				}
				setState(1294);
				match(CLOSE_BRACKET);
				setState(1295);
				block();
				}
				break;
			case 2:
				_localctx = new ForOfLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				match(FOR);
				setState(1297);
				match(OPEN_BRACKET);
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << VAR) | (1L << CONST))) != 0)) {
					{
					setState(1298);
					declareVarsKeyword();
					}
				}

				setState(1301);
				match(IDENTIFIER);
				setState(1302);
				match(OF);
				setState(1303);
				expression(0);
				setState(1304);
				match(CLOSE_BRACKET);
				setState(1305);
				block();
				}
				break;
			case 3:
				_localctx = new ForInLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1307);
				match(FOR);
				setState(1308);
				match(OPEN_BRACKET);
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << VAR) | (1L << CONST))) != 0)) {
					{
					setState(1309);
					declareVarsKeyword();
					}
				}

				setState(1312);
				match(IDENTIFIER);
				setState(1313);
				match(IN);
				setState(1314);
				expression(0);
				setState(1315);
				match(CLOSE_BRACKET);
				setState(1316);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitializerContext extends ParserRuleContext {
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public BlockPropertyContext blockProperty() {
			return getRuleContext(BlockPropertyContext.class,0);
		}
		public ForInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitializerContext forInitializer() throws RecognitionException {
		ForInitializerContext _localctx = new ForInitializerContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_forInitializer);
		try {
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1320);
				variableDeclarationList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321);
				blockProperty();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			variableDeclaration();
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1325);
				match(COMMA);
				setState(1326);
				variableDeclaration();
				}
				}
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			match(IDENTIFIER);
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(1333);
				match(DOT_DOT);
				setState(1334);
				dataType();
				}
			}

			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1337);
				match(EQ);
				setState(1338);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			match(WHILE);
			setState(1342);
			match(OPEN_BRACKET);
			setState(1343);
			expression(0);
			setState(1344);
			match(CLOSE_BRACKET);
			setState(1345);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AngularParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(DO);
			setState(1348);
			block();
			setState(1349);
			match(WHILE);
			setState(1350);
			match(OPEN_BRACKET);
			setState(1351);
			expression(0);
			setState(1352);
			match(CLOSE_BRACKET);
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1353);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentExpressionContext extends ExpressionContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public ParentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralOrReferenceExpressionContext extends ExpressionContext {
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public LiteralOrReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralOrReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralOrReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralOrReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				_localctx = new ParentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1357);
				match(OPEN_BRACKET);
				setState(1358);
				expression(0);
				setState(1359);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				{
				_localctx = new LiteralOrReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1361);
				propertyValue(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(1364);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(1368); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1365);
							operation();
							setState(1366);
							expression(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1370); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(1376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode ANDAND() { return getToken(AngularParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(AngularParser.OROR, 0); }
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TerminalNode LE() { return getToken(AngularParser.LE, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public TerminalNode GE() { return getToken(AngularParser.GE, 0); }
		public TerminalNode EQEQ() { return getToken(AngularParser.EQEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(AngularParser.NOTEQ, 0); }
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode STRICT_NE() { return getToken(AngularParser.STRICT_NE, 0); }
		public TerminalNode STRICT_E() { return getToken(AngularParser.STRICT_E, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(AngularParser.SLASH, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (ANDAND - 54)) | (1L << (OROR - 54)) | (1L << (LT - 54)) | (1L << (LE - 54)) | (1L << (GT - 54)) | (1L << (GE - 54)) | (1L << (EQEQ - 54)) | (1L << (NOTEQ - 54)) | (1L << (STRICT_E - 54)) | (1L << (STRICT_NE - 54)) | (1L << (SLASH - 54)) | (1L << (STAR - 54)) | (1L << (PLUS - 54)) | (1L << (MINUS - 54)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(AngularParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(AngularParser.CLOSE_CURLY_BRACKET, 0); }
		public List<BlockPropertyContext> blockProperty() {
			return getRuleContexts(BlockPropertyContext.class);
		}
		public BlockPropertyContext blockProperty(int i) {
			return getRuleContext(BlockPropertyContext.class,i);
		}
		public List<CommonStatementContext> commonStatement() {
			return getRuleContexts(CommonStatementContext.class);
		}
		public CommonStatementContext commonStatement(int i) {
			return getRuleContext(CommonStatementContext.class,i);
		}
		public List<ReturnStatementContext> returnStatement() {
			return getRuleContexts(ReturnStatementContext.class);
		}
		public ReturnStatementContext returnStatement(int i) {
			return getRuleContext(ReturnStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(OPEN_CURLY_BRACKET);
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << CONSOLE) | (1L << LET) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
				{
				setState(1383);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case THIS:
				case LET:
				case CONST:
				case IDENTIFIER:
					{
					setState(1380);
					blockProperty();
					}
					break;
				case SWITCH:
				case FOR:
				case WHILE:
				case DO:
				case IF:
				case CONSOLE:
					{
					setState(1381);
					commonStatement();
					}
					break;
				case RETURN:
					{
					setState(1382);
					returnStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1388);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareVarsKeywordContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public DeclareVarsKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareVarsKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclareVarsKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclareVarsKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclareVarsKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareVarsKeywordContext declareVarsKeyword() throws RecognitionException {
		DeclareVarsKeywordContext _localctx = new DeclareVarsKeywordContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_declareVarsKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << VAR) | (1L << CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 72:
			return propertyValue_sempred((PropertyValueContext)_localctx, predIndex);
		case 106:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean propertyValue_sempred(PropertyValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001z\u0571\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0001"+
		"\u0000\u0005\u0000\u00de\b\u0000\n\u0000\f\u0000\u00e1\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00ec\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u00f0\b\u0002\u000b\u0002\f\u0002\u00f1\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00f6\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0103\b\u0005\n\u0005\f\u0005\u0106\t\u0005"+
		"\u0001\u0006\u0003\u0006\u0109\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u010f\b\u0006\n\u0006\f\u0006\u0112\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u0117\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u011b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0123\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0127\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u012f\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0133\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u013d"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0148\b\t\n\t\f\t\u014b\t\t\u0005\t\u014d\b\t\n\t\f"+
		"\t\u0150\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u015b\b\u000b\n\u000b\f\u000b\u015e"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0171\b\u000e\n\u000e\f\u000e"+
		"\u0174\t\u000e\u0005\u000e\u0176\b\u000e\n\u000e\f\u000e\u0179\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0189\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0195\b\u0010\n\u0010\f\u0010\u0198"+
		"\t\u0010\u0005\u0010\u019a\b\u0010\n\u0010\f\u0010\u019d\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u01a8\b\u0010\n\u0010\f\u0010"+
		"\u01ab\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01b0\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01b4\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01bb\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0004\u0014\u01c4\b\u0014\u000b\u0014\f\u0014\u01c5\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u01ca\b\u0015\n\u0015\f\u0015\u01cd\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d2\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u01d7\b\u0016\n\u0016\f\u0016\u01da\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01e6\b\u0018"+
		"\n\u0018\f\u0018\u01e9\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01f4\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0003\u001d\u0205"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0209\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u020e\b\u001d\n\u001d\f\u001d\u0211"+
		"\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u022d\b\u001f\u0001 \u0001"+
		" \u0001 \u0003 \u0232\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0005\"\u023c\b\"\n\"\f\"\u023f\t\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0005#\u0246\b#\n#\f#\u0249\t#\u0001#\u0001#\u0005#\u024d"+
		"\b#\n#\f#\u0250\t#\u0001#\u0001#\u0001$\u0003$\u0255\b$\u0001$\u0003$"+
		"\u0258\b$\u0001$\u0001$\u0003$\u025c\b$\u0001$\u0001$\u0005$\u0260\b$"+
		"\n$\f$\u0263\t$\u0001%\u0001%\u0001%\u0001%\u0003%\u0269\b%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0005&\u0270\b&\n&\f&\u0273\t&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u027c\b\'\u0001\'\u0003\'\u027f"+
		"\b\'\u0001(\u0003(\u0282\b(\u0001(\u0001(\u0001(\u0001(\u0003(\u0288\b"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005)\u0292"+
		"\b)\n)\f)\u0295\t)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0005*\u029d"+
		"\b*\n*\f*\u02a0\t*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0003,\u02ad\b,\u0001,\u0003,\u02b0\b,\u0001,\u0001"+
		",\u0001,\u0003,\u02b5\b,\u0001,\u0003,\u02b8\b,\u0001,\u0001,\u0005,\u02bc"+
		"\b,\n,\f,\u02bf\t,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0005.\u02ca\b.\n.\f.\u02cd\t.\u0001/\u0001/\u0001/\u0003/\u02d2"+
		"\b/\u00010\u00030\u02d5\b0\u00010\u00030\u02d8\b0\u00010\u00030\u02db"+
		"\b0\u00010\u00010\u00010\u00030\u02e0\b0\u00010\u00030\u02e3\b0\u0001"+
		"0\u00030\u02e6\b0\u00011\u00051\u02e9\b1\n1\f1\u02ec\t1\u00011\u00051"+
		"\u02ef\b1\n1\f1\u02f2\t1\u00011\u00031\u02f5\b1\u00011\u00031\u02f8\b"+
		"1\u00011\u00011\u00011\u00031\u02fd\b1\u00011\u00011\u00031\u0301\b1\u0001"+
		"1\u00031\u0304\b1\u00011\u00011\u00051\u0308\b1\n1\f1\u030b\t1\u00011"+
		"\u00011\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00034\u031b\b4\u00015\u00015\u00035\u031f\b5\u0001"+
		"5\u00015\u00035\u0323\b5\u00035\u0325\b5\u00016\u00016\u00036\u0329\b"+
		"6\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0005"+
		"7\u0334\b7\n7\f7\u0337\t7\u00037\u0339\b7\u00017\u00017\u00017\u00018"+
		"\u00018\u00018\u00058\u0341\b8\n8\f8\u0344\t8\u00018\u00018\u00018\u0005"+
		"8\u0349\b8\n8\f8\u034c\t8\u00038\u034e\b8\u00019\u00019\u00039\u0352\b"+
		"9\u00019\u00019\u00039\u0356\b9\u00019\u00019\u0001:\u0001:\u0001:\u0003"+
		":\u035d\b:\u0001:\u0001:\u0001:\u0005:\u0362\b:\n:\f:\u0365\t:\u0001:"+
		"\u0001:\u0001;\u0001;\u0001;\u0005;\u036c\b;\n;\f;\u036f\t;\u0001<\u0003"+
		"<\u0372\b<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0003=\u037a\b=\u0001"+
		">\u0001>\u0003>\u037e\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003"+
		"?\u0386\b?\u0001@\u0001@\u0003@\u038a\b@\u0001A\u0003A\u038d\bA\u0001"+
		"A\u0003A\u0390\bA\u0001A\u0001A\u0003A\u0394\bA\u0001A\u0001A\u0001B\u0001"+
		"B\u0001B\u0001B\u0003B\u039c\bB\u0001B\u0003B\u039f\bB\u0001B\u0001B\u0001"+
		"C\u0001C\u0003C\u03a5\bC\u0001C\u0001C\u0001D\u0001D\u0001D\u0005D\u03ac"+
		"\bD\nD\fD\u03af\tD\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0003"+
		"F\u03b8\bF\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0003H\u03c3\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0005H\u03cf\bH\nH\fH\u03d2\tH\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u03df\bI\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u03e9\bJ\u0001"+
		"K\u0001K\u0001K\u0001K\u0005K\u03ef\bK\nK\fK\u03f2\tK\u0003K\u03f4\bK"+
		"\u0001K\u0003K\u03f7\bK\u0001K\u0001K\u0003K\u03fb\bK\u0001L\u0001L\u0001"+
		"L\u0001L\u0003L\u0401\bL\u0003L\u0403\bL\u0001M\u0001M\u0001M\u0003M\u0408"+
		"\bM\u0001M\u0001M\u0001M\u0003M\u040d\bM\u0005M\u040f\bM\nM\fM\u0412\t"+
		"M\u0001M\u0003M\u0415\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0003N\u041c"+
		"\bN\u0001O\u0001O\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0003P\u0435\bP\u0001Q\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0001R\u0001S\u0001S\u0003S\u043f\bS\u0001S\u0001S\u0001S\u0003S\u0444"+
		"\bS\u0005S\u0446\bS\nS\fS\u0449\tS\u0001S\u0001S\u0003S\u044d\bS\u0001"+
		"S\u0001S\u0005S\u0451\bS\nS\fS\u0454\tS\u0001S\u0001S\u0004S\u0458\bS"+
		"\u000bS\fS\u0459\u0003S\u045c\bS\u0001T\u0001T\u0003T\u0460\bT\u0001T"+
		"\u0001T\u0001T\u0001T\u0005T\u0466\bT\nT\fT\u0469\tT\u0003T\u046b\bT\u0001"+
		"T\u0001T\u0001T\u0005T\u0470\bT\nT\fT\u0473\tT\u0001U\u0001U\u0001U\u0005"+
		"U\u0478\bU\nU\fU\u047b\tU\u0001V\u0001V\u0001V\u0005V\u0480\bV\nV\fV\u0483"+
		"\tV\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0003"+
		"W\u048e\bW\u0001X\u0001X\u0001X\u0001X\u0005X\u0494\bX\nX\fX\u0497\tX"+
		"\u0001X\u0001X\u0001Y\u0001Y\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0003"+
		"[\u04a2\b[\u0001[\u0001[\u0001[\u0001[\u0005[\u04a8\b[\n[\f[\u04ab\t["+
		"\u0003[\u04ad\b[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\"+
		"\u0001\\\u0005\\\u04b7\b\\\n\\\f\\\u04ba\t\\\u0001\\\u0003\\\u04bd\b\\"+
		"\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001^\u0001^\u0001"+
		"^\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0004_\u04cf\b_\u000b_\f_"+
		"\u04d0\u0001_\u0003_\u04d4\b_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001"+
		"`\u0005`\u04dc\b`\n`\f`\u04df\t`\u0001`\u0001`\u0003`\u04e3\b`\u0001a"+
		"\u0001a\u0001a\u0005a\u04e8\ba\na\fa\u04eb\ta\u0001a\u0001a\u0003a\u04ef"+
		"\ba\u0001b\u0001b\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0003c\u04fd\bc\u0001d\u0001d\u0001d\u0003d\u0502\bd\u0001"+
		"d\u0003d\u0505\bd\u0001d\u0001d\u0003d\u0509\bd\u0001d\u0001d\u0003d\u050d"+
		"\bd\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u0514\bd\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u051f\bd\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0003d\u0527\bd\u0001e\u0001e\u0003e\u052b"+
		"\be\u0001f\u0001f\u0001f\u0005f\u0530\bf\nf\ff\u0533\tf\u0001g\u0001g"+
		"\u0001g\u0003g\u0538\bg\u0001g\u0001g\u0003g\u053c\bg\u0001h\u0001h\u0001"+
		"h\u0001h\u0001h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0003i\u054b\bi\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0003j\u0553"+
		"\bj\u0001j\u0001j\u0001j\u0001j\u0004j\u0559\bj\u000bj\fj\u055a\u0005"+
		"j\u055d\bj\nj\fj\u0560\tj\u0001k\u0001k\u0001l\u0001l\u0001l\u0001l\u0005"+
		"l\u0568\bl\nl\fl\u056b\tl\u0001l\u0001l\u0001m\u0001m\u0001m\u0000\u0002"+
		"\u0090\u00d4n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u0000"+
		"\t\u0002\u0000\n\nyy\u0002\u00000022\u0002\u0000``mp\u0001\u0000st\u0002"+
		"\u0000\u000e\u000eyy\u0001\u0000IK\u0002\u0000uvyy\u0003\u00006?ijqr\u0001"+
		"\u000002\u05e0\u0000\u00df\u0001\u0000\u0000\u0000\u0002\u00eb\u0001\u0000"+
		"\u0000\u0000\u0004\u00ed\u0001\u0000\u0000\u0000\u0006\u00f3\u0001\u0000"+
		"\u0000\u0000\b\u00f7\u0001\u0000\u0000\u0000\n\u00ff\u0001\u0000\u0000"+
		"\u0000\f\u0108\u0001\u0000\u0000\u0000\u000e\u013c\u0001\u0000\u0000\u0000"+
		"\u0010\u013e\u0001\u0000\u0000\u0000\u0012\u0143\u0001\u0000\u0000\u0000"+
		"\u0014\u0153\u0001\u0000\u0000\u0000\u0016\u0157\u0001\u0000\u0000\u0000"+
		"\u0018\u0161\u0001\u0000\u0000\u0000\u001a\u0166\u0001\u0000\u0000\u0000"+
		"\u001c\u016b\u0001\u0000\u0000\u0000\u001e\u0188\u0001\u0000\u0000\u0000"+
		" \u01b3\u0001\u0000\u0000\u0000\"\u01ba\u0001\u0000\u0000\u0000$\u01bc"+
		"\u0001\u0000\u0000\u0000&\u01bf\u0001\u0000\u0000\u0000(\u01c3\u0001\u0000"+
		"\u0000\u0000*\u01d1\u0001\u0000\u0000\u0000,\u01d3\u0001\u0000\u0000\u0000"+
		".\u01dd\u0001\u0000\u0000\u00000\u01e2\u0001\u0000\u0000\u00002\u01f3"+
		"\u0001\u0000\u0000\u00004\u01f5\u0001\u0000\u0000\u00006\u01f9\u0001\u0000"+
		"\u0000\u00008\u01fe\u0001\u0000\u0000\u0000:\u0204\u0001\u0000\u0000\u0000"+
		"<\u0212\u0001\u0000\u0000\u0000>\u022c\u0001\u0000\u0000\u0000@\u0231"+
		"\u0001\u0000\u0000\u0000B\u0233\u0001\u0000\u0000\u0000D\u0239\u0001\u0000"+
		"\u0000\u0000F\u0242\u0001\u0000\u0000\u0000H\u0254\u0001\u0000\u0000\u0000"+
		"J\u0264\u0001\u0000\u0000\u0000L\u026c\u0001\u0000\u0000\u0000N\u027e"+
		"\u0001\u0000\u0000\u0000P\u0281\u0001\u0000\u0000\u0000R\u028d\u0001\u0000"+
		"\u0000\u0000T\u0298\u0001\u0000\u0000\u0000V\u02a3\u0001\u0000\u0000\u0000"+
		"X\u02ac\u0001\u0000\u0000\u0000Z\u02c2\u0001\u0000\u0000\u0000\\\u02c5"+
		"\u0001\u0000\u0000\u0000^\u02d1\u0001\u0000\u0000\u0000`\u02d4\u0001\u0000"+
		"\u0000\u0000b\u02ea\u0001\u0000\u0000\u0000d\u030e\u0001\u0000\u0000\u0000"+
		"f\u0311\u0001\u0000\u0000\u0000h\u031a\u0001\u0000\u0000\u0000j\u0324"+
		"\u0001\u0000\u0000\u0000l\u0326\u0001\u0000\u0000\u0000n\u032c\u0001\u0000"+
		"\u0000\u0000p\u034d\u0001\u0000\u0000\u0000r\u034f\u0001\u0000\u0000\u0000"+
		"t\u0359\u0001\u0000\u0000\u0000v\u0368\u0001\u0000\u0000\u0000x\u0371"+
		"\u0001\u0000\u0000\u0000z\u0379\u0001\u0000\u0000\u0000|\u037d\u0001\u0000"+
		"\u0000\u0000~\u0385\u0001\u0000\u0000\u0000\u0080\u0389\u0001\u0000\u0000"+
		"\u0000\u0082\u038c\u0001\u0000\u0000\u0000\u0084\u0397\u0001\u0000\u0000"+
		"\u0000\u0086\u03a2\u0001\u0000\u0000\u0000\u0088\u03a8\u0001\u0000\u0000"+
		"\u0000\u008a\u03b0\u0001\u0000\u0000\u0000\u008c\u03b3\u0001\u0000\u0000"+
		"\u0000\u008e\u03b9\u0001\u0000\u0000\u0000\u0090\u03c2\u0001\u0000\u0000"+
		"\u0000\u0092\u03de\u0001\u0000\u0000\u0000\u0094\u03e8\u0001\u0000\u0000"+
		"\u0000\u0096\u03fa\u0001\u0000\u0000\u0000\u0098\u0402\u0001\u0000\u0000"+
		"\u0000\u009a\u0404\u0001\u0000\u0000\u0000\u009c\u0418\u0001\u0000\u0000"+
		"\u0000\u009e\u041d\u0001\u0000\u0000\u0000\u00a0\u0434\u0001\u0000\u0000"+
		"\u0000\u00a2\u0436\u0001\u0000\u0000\u0000\u00a4\u0439\u0001\u0000\u0000"+
		"\u0000\u00a6\u045b\u0001\u0000\u0000\u0000\u00a8\u045d\u0001\u0000\u0000"+
		"\u0000\u00aa\u0474\u0001\u0000\u0000\u0000\u00ac\u047c\u0001\u0000\u0000"+
		"\u0000\u00ae\u048d\u0001\u0000\u0000\u0000\u00b0\u048f\u0001\u0000\u0000"+
		"\u0000\u00b2\u049a\u0001\u0000\u0000\u0000\u00b4\u049c\u0001\u0000\u0000"+
		"\u0000\u00b6\u049e\u0001\u0000\u0000\u0000\u00b8\u04b0\u0001\u0000\u0000"+
		"\u0000\u00ba\u04be\u0001\u0000\u0000\u0000\u00bc\u04c5\u0001\u0000\u0000"+
		"\u0000\u00be\u04c8\u0001\u0000\u0000\u0000\u00c0\u04d7\u0001\u0000\u0000"+
		"\u0000\u00c2\u04e4\u0001\u0000\u0000\u0000\u00c4\u04f0\u0001\u0000\u0000"+
		"\u0000\u00c6\u04fc\u0001\u0000\u0000\u0000\u00c8\u0526\u0001\u0000\u0000"+
		"\u0000\u00ca\u052a\u0001\u0000\u0000\u0000\u00cc\u052c\u0001\u0000\u0000"+
		"\u0000\u00ce\u0534\u0001\u0000\u0000\u0000\u00d0\u053d\u0001\u0000\u0000"+
		"\u0000\u00d2\u0543\u0001\u0000\u0000\u0000\u00d4\u0552\u0001\u0000\u0000"+
		"\u0000\u00d6\u0561\u0001\u0000\u0000\u0000\u00d8\u0563\u0001\u0000\u0000"+
		"\u0000\u00da\u056e\u0001\u0000\u0000\u0000\u00dc\u00de\u0003\u0002\u0001"+
		"\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005\u0000\u0000\u0001\u00e3\u0001\u0001\u0000\u0000"+
		"\u0000\u00e4\u00ec\u0003\b\u0004\u0000\u00e5\u00ec\u0003P(\u0000\u00e6"+
		"\u00ec\u0003\u0006\u0003\u0000\u00e7\u00ec\u0003\f\u0006\u0000\u00e8\u00ec"+
		"\u0003\u0004\u0002\u0000\u00e9\u00ec\u0003X,\u0000\u00ea\u00ec\u0003n"+
		"7\u0000\u00eb\u00e4\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u0003\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ef\u0003\u0016\u000b\u0000\u00ee\u00f0\u0003X,\u0000\u00ef"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u0005\u0001\u0000\u0000\u0000\u00f3\u00f5\u0003\u0010\b\u0000\u00f4\u00f6"+
		"\u0003X,\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u0007\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0004"+
		"\u0000\u0000\u00f8\u00f9\u0005U\u0000\u0000\u00f9\u00fa\u0003\n\u0005"+
		"\u0000\u00fa\u00fb\u0005V\u0000\u0000\u00fb\u00fc\u0005\u0005\u0000\u0000"+
		"\u00fc\u00fd\u0005u\u0000\u0000\u00fd\u00fe\u0005[\u0000\u0000\u00fe\t"+
		"\u0001\u0000\u0000\u0000\u00ff\u0104\u0005y\u0000\u0000\u0100\u0101\u0005"+
		"\\\u0000\u0000\u0101\u0103\u0005y\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u000b\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0109\u0005\t\u0000"+
		"\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0005\r\u0000\u0000"+
		"\u010b\u010c\u0005y\u0000\u0000\u010c\u0110\u0005U\u0000\u0000\u010d\u010f"+
		"\u0003\u000e\u0007\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112"+
		"\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0005V\u0000\u0000\u0114\r\u0001"+
		"\u0000\u0000\u0000\u0115\u0117\u0005\'\u0000\u0000\u0116\u0115\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u011a\u0005y\u0000\u0000\u0119\u011b\u0005b\u0000\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005^\u0000\u0000\u011d"+
		"\u011e\u0003\u00aaU\u0000\u011e\u011f\u0005[\u0000\u0000\u011f\u013d\u0001"+
		"\u0000\u0000\u0000\u0120\u0122\u0005y\u0000\u0000\u0121\u0123\u0005b\u0000"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u0005W\u0000\u0000"+
		"\u0125\u0127\u0003p8\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0005X\u0000\u0000\u0129\u012a\u0005^\u0000\u0000\u012a\u012b\u0003\u00aa"+
		"U\u0000\u012b\u012c\u0005[\u0000\u0000\u012c\u013d\u0001\u0000\u0000\u0000"+
		"\u012d\u012f\u0005\'\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0132\u0005y\u0000\u0000\u0131\u0133\u0005b\u0000\u0000\u0132\u0131\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005^\u0000\u0000\u0135\u0136\u0005W\u0000"+
		"\u0000\u0136\u0137\u0003p8\u0000\u0137\u0138\u0005X\u0000\u0000\u0138"+
		"\u0139\u0005c\u0000\u0000\u0139\u013a\u0003\u00aaU\u0000\u013a\u013b\u0005"+
		"[\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0116\u0001\u0000"+
		"\u0000\u0000\u013c\u0120\u0001\u0000\u0000\u0000\u013c\u012e\u0001\u0000"+
		"\u0000\u0000\u013d\u000f\u0001\u0000\u0000\u0000\u013e\u013f\u0005\b\u0000"+
		"\u0000\u013f\u0140\u0005W\u0000\u0000\u0140\u0141\u0003\u0012\t\u0000"+
		"\u0141\u0142\u0005X\u0000\u0000\u0142\u0011\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0005U\u0000\u0000\u0144\u014e\u0003\u0014\n\u0000\u0145\u0149"+
		"\u0005\\\u0000\u0000\u0146\u0148\u0003\u0014\n\u0000\u0147\u0146\u0001"+
		"\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014d\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u0145\u0001"+
		"\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0151\u0001"+
		"\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0152\u0005"+
		"V\u0000\u0000\u0152\u0013\u0001\u0000\u0000\u0000\u0153\u0154\u0005T\u0000"+
		"\u0000\u0154\u0155\u0005^\u0000\u0000\u0155\u0156\u0005u\u0000\u0000\u0156"+
		"\u0015\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0007\u0000\u0000\u0158"+
		"\u015c\u0003$\u0012\u0000\u0159\u015b\u0003\"\u0011\u0000\u015a\u0159"+
		"\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f"+
		"\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0003&\u0013\u0000\u0160\u0017\u0001\u0000\u0000\u0000\u0161\u0162\u0005"+
		"L\u0000\u0000\u0162\u0163\u0005^\u0000\u0000\u0163\u0164\u0005u\u0000"+
		"\u0000\u0164\u0165\u0005\\\u0000\u0000\u0165\u0019\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0005M\u0000\u0000\u0167\u0168\u0005^\u0000\u0000\u0168\u0169"+
		"\u0005E\u0000\u0000\u0169\u016a\u0005\\\u0000\u0000\u016a\u001b\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005N\u0000\u0000\u016c\u016d\u0005^\u0000"+
		"\u0000\u016d\u0177\u0005Y\u0000\u0000\u016e\u0172\u0005y\u0000\u0000\u016f"+
		"\u0171\u0005\\\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171\u0174"+
		"\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0175\u016e\u0001\u0000\u0000\u0000\u0176\u0179"+
		"\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0001\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177"+
		"\u0001\u0000\u0000\u0000\u017a\u017b\u0005Z\u0000\u0000\u017b\u017c\u0005"+
		"\\\u0000\u0000\u017c\u001d\u0001\u0000\u0000\u0000\u017d\u017e\u0005P"+
		"\u0000\u0000\u017e\u017f\u0005^\u0000\u0000\u017f\u0180\u0005u\u0000\u0000"+
		"\u0180\u0189\u0005\\\u0000\u0000\u0181\u0182\u0005O\u0000\u0000\u0182"+
		"\u0183\u0005^\u0000\u0000\u0183\u0184\u0005g\u0000\u0000\u0184\u0185\u0003"+
		"(\u0014\u0000\u0185\u0186\u0005g\u0000\u0000\u0186\u0187\u0005\\\u0000"+
		"\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u017d\u0001\u0000\u0000"+
		"\u0000\u0188\u0181\u0001\u0000\u0000\u0000\u0189\u001f\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0005Q\u0000\u0000\u018b\u018c\u0005^\u0000\u0000\u018c"+
		"\u018d\u0005u\u0000\u0000\u018d\u01b4\u0005\\\u0000\u0000\u018e\u018f"+
		"\u0005R\u0000\u0000\u018f\u0190\u0005^\u0000\u0000\u0190\u0191\u0005Y"+
		"\u0000\u0000\u0191\u019b\u0005u\u0000\u0000\u0192\u0196\u0005\\\u0000"+
		"\u0000\u0193\u0195\u0005u\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000"+
		"\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u0192\u0001\u0000\u0000\u0000"+
		"\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u019f\u0005Z\u0000\u0000\u019f"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a0\u01b4\u0005\\\u0000\u0000\u01a1\u01a2"+
		"\u0005S\u0000\u0000\u01a2\u01af\u0005^\u0000\u0000\u01a3\u01a4\u0005Y"+
		"\u0000\u0000\u01a4\u01a9\u0003D\"\u0000\u01a5\u01a6\u0005\\\u0000\u0000"+
		"\u01a6\u01a8\u0003D\"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8"+
		"\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005Z\u0000\u0000\u01ad\u01b0"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b0\u0003D\"\u0000\u01af\u01a3\u0001"+
		"\u0000\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0005\\\u0000\u0000\u01b2\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b3\u018a\u0001\u0000\u0000\u0000\u01b3\u018e\u0001\u0000"+
		"\u0000\u0000\u01b3\u01a1\u0001\u0000\u0000\u0000\u01b4!\u0001\u0000\u0000"+
		"\u0000\u01b5\u01bb\u0003\u001c\u000e\u0000\u01b6\u01bb\u0003\u001e\u000f"+
		"\u0000\u01b7\u01bb\u0003 \u0010\u0000\u01b8\u01bb\u0003\u0018\f\u0000"+
		"\u01b9\u01bb\u0003\u001a\r\u0000\u01ba\u01b5\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b6\u0001\u0000\u0000\u0000\u01ba\u01b7\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b8\u0001\u0000\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb"+
		"#\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005W\u0000\u0000\u01bd\u01be\u0005"+
		"U\u0000\u0000\u01be%\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005V\u0000"+
		"\u0000\u01c0\u01c1\u0005X\u0000\u0000\u01c1\'\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c4\u0003*\u0015\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c6)\u0001\u0000\u0000\u0000\u01c7\u01cb"+
		"\u0003,\u0016\u0000\u01c8\u01ca\u0003@ \u0000\u01c9\u01c8\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0001\u0000"+
		"\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003.\u0017"+
		"\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01d2\u00030\u0018\u0000"+
		"\u01d1\u01c7\u0001\u0000\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d2+\u0001\u0000\u0000\u0000\u01d3\u01d4\u00058\u0000\u0000\u01d4\u01d8"+
		"\u0005y\u0000\u0000\u01d5\u01d7\u00032\u0019\u0000\u01d6\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01db\u0001\u0000"+
		"\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01dc\u0005:\u0000"+
		"\u0000\u01dc-\u0001\u0000\u0000\u0000\u01dd\u01de\u00058\u0000\u0000\u01de"+
		"\u01df\u0005i\u0000\u0000\u01df\u01e0\u0005y\u0000\u0000\u01e0\u01e1\u0005"+
		":\u0000\u0000\u01e1/\u0001\u0000\u0000\u0000\u01e2\u01e3\u00058\u0000"+
		"\u0000\u01e3\u01e7\u0005y\u0000\u0000\u01e4\u01e6\u00032\u0019\u0000\u01e5"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0005i\u0000\u0000\u01eb\u01ec\u0005:\u0000\u0000\u01ec1\u0001"+
		"\u0000\u0000\u0000\u01ed\u01f4\u00034\u001a\u0000\u01ee\u01f4\u00036\u001b"+
		"\u0000\u01ef\u01f4\u00038\u001c\u0000\u01f0\u01f4\u0003:\u001d\u0000\u01f1"+
		"\u01f4\u0003<\u001e\u0000\u01f2\u01f4\u0003>\u001f\u0000\u01f3\u01ed\u0001"+
		"\u0000\u0000\u0000\u01f3\u01ee\u0001\u0000\u0000\u0000\u01f3\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f43\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0007\u0000\u0000\u0000\u01f6\u01f7\u0005`\u0000"+
		"\u0000\u01f7\u01f8\u0005u\u0000\u0000\u01f85\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fa\u0005j\u0000\u0000\u01fa\u01fb\u0005\u000f\u0000\u0000\u01fb\u01fc"+
		"\u0005`\u0000\u0000\u01fc\u01fd\u0005u\u0000\u0000\u01fd7\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0005j\u0000\u0000\u01ff\u0200\u0005\u0010\u0000"+
		"\u0000\u0200\u0201\u0005`\u0000\u0000\u0201\u0202\u0005u\u0000\u0000\u0202"+
		"9\u0001\u0000\u0000\u0000\u0203\u0205\u0005Y\u0000\u0000\u0204\u0203\u0001"+
		"\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206\u0001"+
		"\u0000\u0000\u0000\u0206\u0208\u0005\u0012\u0000\u0000\u0207\u0209\u0005"+
		"Z\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0005`\u0000"+
		"\u0000\u020b\u020f\u0005u\u0000\u0000\u020c\u020e\u00034\u001a\u0000\u020d"+
		"\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f"+
		"\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210"+
		";\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0005W\u0000\u0000\u0213\u0214\u0005\u0013\u0000\u0000\u0214\u0215\u0005"+
		"X\u0000\u0000\u0215\u0216\u0005`\u0000\u0000\u0216\u0217\u0005u\u0000"+
		"\u0000\u0217=\u0001\u0000\u0000\u0000\u0218\u0219\u0005d\u0000\u0000\u0219"+
		"\u022d\u0005y\u0000\u0000\u021a\u021b\u0005W\u0000\u0000\u021b\u021c\u0005"+
		"y\u0000\u0000\u021c\u021d\u0005X\u0000\u0000\u021d\u021e\u0005`\u0000"+
		"\u0000\u021e\u022d\u0005u\u0000\u0000\u021f\u0220\u0005Y\u0000\u0000\u0220"+
		"\u0221\u0005y\u0000\u0000\u0221\u0222\u0005Z\u0000\u0000\u0222\u0223\u0005"+
		"`\u0000\u0000\u0223\u022d\u0005u\u0000\u0000\u0224\u0225\u0005Y\u0000"+
		"\u0000\u0225\u0226\u0005W\u0000\u0000\u0226\u0227\u0005y\u0000\u0000\u0227"+
		"\u0228\u0005X\u0000\u0000\u0228\u0229\u0005Z\u0000\u0000\u0229\u022a\u0005"+
		"`\u0000\u0000\u022a\u022d\u0005u\u0000\u0000\u022b\u022d\u0005y\u0000"+
		"\u0000\u022c\u0218\u0001\u0000\u0000\u0000\u022c\u021a\u0001\u0000\u0000"+
		"\u0000\u022c\u021f\u0001\u0000\u0000\u0000\u022c\u0224\u0001\u0000\u0000"+
		"\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d?\u0001\u0000\u0000\u0000"+
		"\u022e\u0232\u0005y\u0000\u0000\u022f\u0232\u0003*\u0015\u0000\u0230\u0232"+
		"\u0003B!\u0000\u0231\u022e\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000"+
		"\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0232A\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0005U\u0000\u0000\u0234\u0235\u0005U\u0000\u0000\u0235"+
		"\u0236\u0003\u0090H\u0000\u0236\u0237\u0005V\u0000\u0000\u0237\u0238\u0005"+
		"V\u0000\u0000\u0238C\u0001\u0000\u0000\u0000\u0239\u023d\u0005g\u0000"+
		"\u0000\u023a\u023c\u0003F#\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023c"+
		"\u023f\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0001\u0000\u0000\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f"+
		"\u023d\u0001\u0000\u0000\u0000\u0240\u0241\u0005g\u0000\u0000\u0241E\u0001"+
		"\u0000\u0000\u0000\u0242\u0247\u0003H$\u0000\u0243\u0244\u0005\\\u0000"+
		"\u0000\u0244\u0246\u0003H$\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0246"+
		"\u0249\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247"+
		"\u0248\u0001\u0000\u0000\u0000\u0248\u024a\u0001\u0000\u0000\u0000\u0249"+
		"\u0247\u0001\u0000\u0000\u0000\u024a\u024e\u0005U\u0000\u0000\u024b\u024d"+
		"\u0003L&\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000"+
		"\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000"+
		"\u0000\u0000\u024f\u0251\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\u0005V\u0000\u0000\u0252G\u0001\u0000\u0000\u0000"+
		"\u0253\u0255\u0005y\u0000\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255\u0261\u0001\u0000\u0000\u0000\u0256"+
		"\u0258\u0005]\u0000\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u0260"+
		"\u0005y\u0000\u0000\u025a\u025c\u0005^\u0000\u0000\u025b\u025a\u0001\u0000"+
		"\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000"+
		"\u0000\u0000\u025d\u0260\u0005y\u0000\u0000\u025e\u0260\u0003J%\u0000"+
		"\u025f\u0257\u0001\u0000\u0000\u0000\u025f\u025b\u0001\u0000\u0000\u0000"+
		"\u025f\u025e\u0001\u0000\u0000\u0000\u0260\u0263\u0001\u0000\u0000\u0000"+
		"\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000"+
		"\u0262I\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0264"+
		"\u0265\u0005Y\u0000\u0000\u0265\u0268\u0005y\u0000\u0000\u0266\u0267\u0005"+
		"`\u0000\u0000\u0267\u0269\u0005u\u0000\u0000\u0268\u0266\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0005Z\u0000\u0000\u026bK\u0001\u0000\u0000\u0000\u026c"+
		"\u026d\u0005y\u0000\u0000\u026d\u0271\u0005^\u0000\u0000\u026e\u0270\u0003"+
		"N\'\u0000\u026f\u026e\u0001\u0000\u0000\u0000\u0270\u0273\u0001\u0000"+
		"\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000"+
		"\u0000\u0000\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0005[\u0000\u0000\u0275M\u0001\u0000\u0000\u0000"+
		"\u0276\u027f\u0005y\u0000\u0000\u0277\u0278\u0005v\u0000\u0000\u0278\u027f"+
		"\u0005\u0011\u0000\u0000\u0279\u027b\u0005v\u0000\u0000\u027a\u027c\u0005"+
		"l\u0000\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000"+
		"\u0000\u0000\u027c\u027f\u0001\u0000\u0000\u0000\u027d\u027f\u0005z\u0000"+
		"\u0000\u027e\u0276\u0001\u0000\u0000\u0000\u027e\u0277\u0001\u0000\u0000"+
		"\u0000\u027e\u0279\u0001\u0000\u0000\u0000\u027e\u027d\u0001\u0000\u0000"+
		"\u0000\u027fO\u0001\u0000\u0000\u0000\u0280\u0282\u0005\t\u0000\u0000"+
		"\u0281\u0280\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0284\u0003\u00dam\u0000\u0284"+
		"\u0287\u0005y\u0000\u0000\u0285\u0286\u0005^\u0000\u0000\u0286\u0288\u0005"+
		"y\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000"+
		"\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0005`\u0000"+
		"\u0000\u028a\u028b\u0003R)\u0000\u028b\u028c\u0005[\u0000\u0000\u028c"+
		"Q\u0001\u0000\u0000\u0000\u028d\u028e\u0005Y\u0000\u0000\u028e\u0293\u0003"+
		"T*\u0000\u028f\u0290\u0005\\\u0000\u0000\u0290\u0292\u0003T*\u0000\u0291"+
		"\u028f\u0001\u0000\u0000\u0000\u0292\u0295\u0001\u0000\u0000\u0000\u0293"+
		"\u0291\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294"+
		"\u0296\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0296"+
		"\u0297\u0005Z\u0000\u0000\u0297S\u0001\u0000\u0000\u0000\u0298\u0299\u0005"+
		"U\u0000\u0000\u0299\u029e\u0003V+\u0000\u029a\u029b\u0005\\\u0000\u0000"+
		"\u029b\u029d\u0003V+\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029d\u02a0"+
		"\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0001\u0000\u0000\u0000\u029f\u02a1\u0001\u0000\u0000\u0000\u02a0\u029e"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005V\u0000\u0000\u02a2U\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a4\u0005(\u0000\u0000\u02a4\u02a5\u0005^\u0000\u0000"+
		"\u02a5\u02a6\u0005u\u0000\u0000\u02a6\u02a7\u0005\\\u0000\u0000\u02a7"+
		"\u02a8\u0005*\u0000\u0000\u02a8\u02a9\u0005^\u0000\u0000\u02a9\u02aa\u0005"+
		"y\u0000\u0000\u02aaW\u0001\u0000\u0000\u0000\u02ab\u02ad\u0005\t\u0000"+
		"\u0000\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000"+
		"\u0000\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u02b0\u0005$\u0000\u0000"+
		"\u02af\u02ae\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0005\n\u0000\u0000\u02b2"+
		"\u02b4\u0005y\u0000\u0000\u02b3\u02b5\u0003Z-\u0000\u02b4\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b7\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b8\u0003\\.\u0000\u02b7\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000"+
		"\u0000\u0000\u02b9\u02bd\u0005U\u0000\u0000\u02ba\u02bc\u0003^/\u0000"+
		"\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bf\u0001\u0000\u0000\u0000"+
		"\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000"+
		"\u02be\u02c0\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c1\u0005V\u0000\u0000\u02c1Y\u0001\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0005\u000b\u0000\u0000\u02c3\u02c4\u0005y\u0000\u0000\u02c4[\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c6\u0005\f\u0000\u0000\u02c6\u02cb\u0005y\u0000"+
		"\u0000\u02c7\u02c8\u0005\\\u0000\u0000\u02c8\u02ca\u0005y\u0000\u0000"+
		"\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000"+
		"\u02cc]\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce"+
		"\u02d2\u0003`0\u0000\u02cf\u02d2\u0003b1\u0000\u02d0\u02d2\u0003t:\u0000"+
		"\u02d1\u02ce\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2_\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d5\u0003\u00b4Z\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6\u02d8"+
		"\u0005#\u0000\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001"+
		"\u0000\u0000\u0000\u02d8\u02da\u0001\u0000\u0000\u0000\u02d9\u02db\u0005"+
		"\'\u0000\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000"+
		"\u0000\u0000\u02db\u02dc\u0001\u0000\u0000\u0000\u02dc\u02df\u0005y\u0000"+
		"\u0000\u02dd\u02de\u0005^\u0000\u0000\u02de\u02e0\u0003\u0088D\u0000\u02df"+
		"\u02dd\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e1\u02e3\u0003\u008aE\u0000\u02e2\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e6\u0005[\u0000\u0000\u02e5\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6a\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e9\u0003d2\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000"+
		"\u02e9\u02ec\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000"+
		"\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02f0\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed\u02ef\u0003\u00b4Z\u0000\u02ee"+
		"\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000\u02f0"+
		"\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f5\u0005\"\u0000\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f4\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f7\u0001\u0000\u0000\u0000\u02f6\u02f8"+
		"\u0005#\u0000\u0000\u02f7\u02f6\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fa\u0005"+
		"y\u0000\u0000\u02fa\u02fc\u0005W\u0000\u0000\u02fb\u02fd\u0003p8\u0000"+
		"\u02fc\u02fb\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000"+
		"\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u0300\u0005X\u0000\u0000\u02ff"+
		"\u0301\u0003f3\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0300\u0301\u0001"+
		"\u0000\u0000\u0000\u0301\u0303\u0001\u0000\u0000\u0000\u0302\u0304\u0003"+
		"\u008cF\u0000\u0303\u0302\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000"+
		"\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0309\u0005U\u0000"+
		"\u0000\u0306\u0308\u0003h4\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0308"+
		"\u030b\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u0309"+
		"\u030a\u0001\u0000\u0000\u0000\u030a\u030c\u0001\u0000\u0000\u0000\u030b"+
		"\u0309\u0001\u0000\u0000\u0000\u030c\u030d\u0005V\u0000\u0000\u030dc\u0001"+
		"\u0000\u0000\u0000\u030e\u030f\u0005a\u0000\u0000\u030f\u0310\u0005y\u0000"+
		"\u0000\u0310e\u0001\u0000\u0000\u0000\u0311\u0312\u0005^\u0000\u0000\u0312"+
		"\u0313\u0003\u00aaU\u0000\u0313g\u0001\u0000\u0000\u0000\u0314\u031b\u0003"+
		"l6\u0000\u0315\u031b\u0003~?\u0000\u0316\u031b\u0003j5\u0000\u0317\u0318"+
		"\u0003\u00a6S\u0000\u0318\u0319\u0005[\u0000\u0000\u0319\u031b\u0001\u0000"+
		"\u0000\u0000\u031a\u0314\u0001\u0000\u0000\u0000\u031a\u0315\u0001\u0000"+
		"\u0000\u0000\u031a\u0316\u0001\u0000\u0000\u0000\u031a\u0317\u0001\u0000"+
		"\u0000\u0000\u031bi\u0001\u0000\u0000\u0000\u031c\u031e\u0003\u0084B\u0000"+
		"\u031d\u031f\u0005[\u0000\u0000\u031e\u031d\u0001\u0000\u0000\u0000\u031e"+
		"\u031f\u0001\u0000\u0000\u0000\u031f\u0325\u0001\u0000\u0000\u0000\u0320"+
		"\u0322\u0003\u0086C\u0000\u0321\u0323\u0005[\u0000\u0000\u0322\u0321\u0001"+
		"\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323\u0325\u0001"+
		"\u0000\u0000\u0000\u0324\u031c\u0001\u0000\u0000\u0000\u0324\u0320\u0001"+
		"\u0000\u0000\u0000\u0325k\u0001\u0000\u0000\u0000\u0326\u0328\u0005\u0016"+
		"\u0000\u0000\u0327\u0329\u0003\u00d4j\u0000\u0328\u0327\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000"+
		"\u0000\u032a\u032b\u0005[\u0000\u0000\u032bm\u0001\u0000\u0000\u0000\u032c"+
		"\u032d\u0005&\u0000\u0000\u032d\u032e\u0005]\u0000\u0000\u032e\u032f\u0005"+
		"%\u0000\u0000\u032f\u0338\u0005W\u0000\u0000\u0330\u0335\u0003\u00d4j"+
		"\u0000\u0331\u0332\u0005\\\u0000\u0000\u0332\u0334\u0003\u00d4j\u0000"+
		"\u0333\u0331\u0001\u0000\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000"+
		"\u0335\u0333\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000"+
		"\u0336\u0339\u0001\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000\u0000"+
		"\u0338\u0330\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000"+
		"\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u033b\u0005X\u0000\u0000\u033b"+
		"\u033c\u0005[\u0000\u0000\u033co\u0001\u0000\u0000\u0000\u033d\u0342\u0003"+
		"r9\u0000\u033e\u033f\u0005\\\u0000\u0000\u033f\u0341\u0003r9\u0000\u0340"+
		"\u033e\u0001\u0000\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000\u0342"+
		"\u0340\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343"+
		"\u034e\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345"+
		"\u034a\u0005y\u0000\u0000\u0346\u0347\u0005\\\u0000\u0000\u0347\u0349"+
		"\u0005y\u0000\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0349\u034c\u0001"+
		"\u0000\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a\u034b\u0001"+
		"\u0000\u0000\u0000\u034b\u034e\u0001\u0000\u0000\u0000\u034c\u034a\u0001"+
		"\u0000\u0000\u0000\u034d\u033d\u0001\u0000\u0000\u0000\u034d\u0345\u0001"+
		"\u0000\u0000\u0000\u034eq\u0001\u0000\u0000\u0000\u034f\u0351\u0005y\u0000"+
		"\u0000\u0350\u0352\u0005b\u0000\u0000\u0351\u0350\u0001\u0000\u0000\u0000"+
		"\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000"+
		"\u0353\u0355\u0005^\u0000\u0000\u0354\u0356\u0005!\u0000\u0000\u0355\u0354"+
		"\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0357"+
		"\u0001\u0000\u0000\u0000\u0357\u0358\u0003\u00aaU\u0000\u0358s\u0001\u0000"+
		"\u0000\u0000\u0359\u035a\u0005\u0015\u0000\u0000\u035a\u035c\u0005W\u0000"+
		"\u0000\u035b\u035d\u0003v;\u0000\u035c\u035b\u0001\u0000\u0000\u0000\u035c"+
		"\u035d\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000\u0000\u035e"+
		"\u035f\u0005X\u0000\u0000\u035f\u0363\u0005U\u0000\u0000\u0360\u0362\u0003"+
		"z=\u0000\u0361\u0360\u0001\u0000\u0000\u0000\u0362\u0365\u0001\u0000\u0000"+
		"\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000"+
		"\u0000\u0364\u0366\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000"+
		"\u0000\u0366\u0367\u0005V\u0000\u0000\u0367u\u0001\u0000\u0000\u0000\u0368"+
		"\u036d\u0003x<\u0000\u0369\u036a\u0005\\\u0000\u0000\u036a\u036c\u0003"+
		"x<\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036c\u036f\u0001\u0000\u0000"+
		"\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000"+
		"\u0000\u036ew\u0001\u0000\u0000\u0000\u036f\u036d\u0001\u0000\u0000\u0000"+
		"\u0370\u0372\u0003\u00b4Z\u0000\u0371\u0370\u0001\u0000\u0000\u0000\u0371"+
		"\u0372\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000\u0373"+
		"\u0374\u0005y\u0000\u0000\u0374\u0375\u0005^\u0000\u0000\u0375\u0376\u0003"+
		"\u00aaU\u0000\u0376y\u0001\u0000\u0000\u0000\u0377\u037a\u0003|>\u0000"+
		"\u0378\u037a\u0003~?\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u0378"+
		"\u0001\u0000\u0000\u0000\u037a{\u0001\u0000\u0000\u0000\u037b\u037e\u0003"+
		"\u0082A\u0000\u037c\u037e\u0003j5\u0000\u037d\u037b\u0001\u0000\u0000"+
		"\u0000\u037d\u037c\u0001\u0000\u0000\u0000\u037e}\u0001\u0000\u0000\u0000"+
		"\u037f\u0386\u0003n7\u0000\u0380\u0386\u0003\u00b8\\\u0000\u0381\u0386"+
		"\u0003\u00be_\u0000\u0382\u0386\u0003\u00c8d\u0000\u0383\u0386\u0003\u00d0"+
		"h\u0000\u0384\u0386\u0003\u00d2i\u0000\u0385\u037f\u0001\u0000\u0000\u0000"+
		"\u0385\u0380\u0001\u0000\u0000\u0000\u0385\u0381\u0001\u0000\u0000\u0000"+
		"\u0385\u0382\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000"+
		"\u0385\u0384\u0001\u0000\u0000\u0000\u0386\u007f\u0001\u0000\u0000\u0000"+
		"\u0387\u038a\u0003\u0084B\u0000\u0388\u038a\u0003\u0086C\u0000\u0389\u0387"+
		"\u0001\u0000\u0000\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u038a\u0081"+
		"\u0001\u0000\u0000\u0000\u038b\u038d\u0003\u00b4Z\u0000\u038c\u038b\u0001"+
		"\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038f\u0001"+
		"\u0000\u0000\u0000\u038e\u0390\u0005\'\u0000\u0000\u038f\u038e\u0001\u0000"+
		"\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000"+
		"\u0000\u0000\u0391\u0393\u0005y\u0000\u0000\u0392\u0394\u0003\u008aE\u0000"+
		"\u0393\u0392\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000"+
		"\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0396\u0005[\u0000\u0000\u0396"+
		"\u0083\u0001\u0000\u0000\u0000\u0397\u0398\u0007\u0001\u0000\u0000\u0398"+
		"\u039b\u0005y\u0000\u0000\u0399\u039a\u0005^\u0000\u0000\u039a\u039c\u0003"+
		"\u0088D\u0000\u039b\u0399\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000"+
		"\u0000\u0000\u039c\u039e\u0001\u0000\u0000\u0000\u039d\u039f\u0003\u008a"+
		"E\u0000\u039e\u039d\u0001\u0000\u0000\u0000\u039e\u039f\u0001\u0000\u0000"+
		"\u0000\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a1\u0005[\u0000\u0000"+
		"\u03a1\u0085\u0001\u0000\u0000\u0000\u03a2\u03a4\u0003\u00a6S\u0000\u03a3"+
		"\u03a5\u0003\u008eG\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a4\u03a5"+
		"\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a7"+
		"\u0005[\u0000\u0000\u03a7\u0087\u0001\u0000\u0000\u0000\u03a8\u03ad\u0003"+
		"\u00aaU\u0000\u03a9\u03aa\u0005k\u0000\u0000\u03aa\u03ac\u0003\u00aaU"+
		"\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ac\u03af\u0001\u0000\u0000"+
		"\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000"+
		"\u0000\u03ae\u0089\u0001\u0000\u0000\u0000\u03af\u03ad\u0001\u0000\u0000"+
		"\u0000\u03b0\u03b1\u0005`\u0000\u0000\u03b1\u03b2\u0003\u0090H\u0000\u03b2"+
		"\u008b\u0001\u0000\u0000\u0000\u03b3\u03b4\u0005k\u0000\u0000\u03b4\u03b7"+
		"\u0005\u0014\u0000\u0000\u03b5\u03b6\u0005`\u0000\u0000\u03b6\u03b8\u0005"+
		"\u0014\u0000\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001"+
		"\u0000\u0000\u0000\u03b8\u008d\u0001\u0000\u0000\u0000\u03b9\u03ba\u0007"+
		"\u0002\u0000\u0000\u03ba\u03bb\u0003\u0090H\u0000\u03bb\u008f\u0001\u0000"+
		"\u0000\u0000\u03bc\u03bd\u0006H\uffff\uffff\u0000\u03bd\u03c3\u0003\u0092"+
		"I\u0000\u03be\u03bf\u0005X\u0000\u0000\u03bf\u03c0\u0003\u0090H\u0000"+
		"\u03c0\u03c1\u0005X\u0000\u0000\u03c1\u03c3\u0001\u0000\u0000\u0000\u03c2"+
		"\u03bc\u0001\u0000\u0000\u0000\u03c2\u03be\u0001\u0000\u0000\u0000\u03c3"+
		"\u03d0\u0001\u0000\u0000\u0000\u03c4\u03c5\n\u0002\u0000\u0000\u03c5\u03c6"+
		"\u0003\u00d6k\u0000\u03c6\u03c7\u0003\u0090H\u0003\u03c7\u03cf\u0001\u0000"+
		"\u0000\u0000\u03c8\u03c9\n\u0001\u0000\u0000\u03c9\u03ca\u0005b\u0000"+
		"\u0000\u03ca\u03cb\u0003\u0090H\u0000\u03cb\u03cc\u0005^\u0000\u0000\u03cc"+
		"\u03cd\u0003\u0090H\u0002\u03cd\u03cf\u0001\u0000\u0000\u0000\u03ce\u03c4"+
		"\u0001\u0000\u0000\u0000\u03ce\u03c8\u0001\u0000\u0000\u0000\u03cf\u03d2"+
		"\u0001\u0000\u0000\u0000\u03d0\u03ce\u0001\u0000\u0000\u0000\u03d0\u03d1"+
		"\u0001\u0000\u0000\u0000\u03d1\u0091\u0001\u0000\u0000\u0000\u03d2\u03d0"+
		"\u0001\u0000\u0000\u0000\u03d3\u03df\u0003\u0094J\u0000\u03d4\u03df\u0003"+
		"\u0096K\u0000\u03d5\u03df\u0003\u009aM\u0000\u03d6\u03df\u0003\u009eO"+
		"\u0000\u03d7\u03df\u0003\u00a6S\u0000\u03d8\u03df\u0003\u00a8T\u0000\u03d9"+
		"\u03df\u0003\u00a0P\u0000\u03da\u03df\u0003\u00a4R\u0000\u03db\u03df\u0003"+
		"\u00a2Q\u0000\u03dc\u03df\u0003\u00b6[\u0000\u03dd\u03df\u0003\u009cN"+
		"\u0000\u03de\u03d3\u0001\u0000\u0000\u0000\u03de\u03d4\u0001\u0000\u0000"+
		"\u0000\u03de\u03d5\u0001\u0000\u0000\u0000\u03de\u03d6\u0001\u0000\u0000"+
		"\u0000\u03de\u03d7\u0001\u0000\u0000\u0000\u03de\u03d8\u0001\u0000\u0000"+
		"\u0000\u03de\u03d9\u0001\u0000\u0000\u0000\u03de\u03da\u0001\u0000\u0000"+
		"\u0000\u03de\u03db\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000"+
		"\u0000\u03de\u03dd\u0001\u0000\u0000\u0000\u03df\u0093\u0001\u0000\u0000"+
		"\u0000\u03e0\u03e9\u0005u\u0000\u0000\u03e1\u03e9\u0005v\u0000\u0000\u03e2"+
		"\u03e9\u0005w\u0000\u0000\u03e3\u03e9\u0005E\u0000\u0000\u03e4\u03e9\u0005"+
		"F\u0000\u0000\u03e5\u03e9\u0005\u0014\u0000\u0000\u03e6\u03e9\u0005G\u0000"+
		"\u0000\u03e7\u03e9\u0005x\u0000\u0000\u03e8\u03e0\u0001\u0000\u0000\u0000"+
		"\u03e8\u03e1\u0001\u0000\u0000\u0000\u03e8\u03e2\u0001\u0000\u0000\u0000"+
		"\u03e8\u03e3\u0001\u0000\u0000\u0000\u03e8\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e8\u03e5\u0001\u0000\u0000\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e8\u03e7\u0001\u0000\u0000\u0000\u03e9\u0095\u0001\u0000\u0000\u0000"+
		"\u03ea\u03f3\u0005U\u0000\u0000\u03eb\u03f0\u0003\u0098L\u0000\u03ec\u03ed"+
		"\u0005\\\u0000\u0000\u03ed\u03ef\u0003\u0098L\u0000\u03ee\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f2\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001"+
		"\u0000\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000\u0000\u03f1\u03f4\u0001"+
		"\u0000\u0000\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f3\u03eb\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4\u03f6\u0001"+
		"\u0000\u0000\u0000\u03f5\u03f7\u0005\\\u0000\u0000\u03f6\u03f5\u0001\u0000"+
		"\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000"+
		"\u0000\u0000\u03f8\u03fb\u0005V\u0000\u0000\u03f9\u03fb\u0005y\u0000\u0000"+
		"\u03fa\u03ea\u0001\u0000\u0000\u0000\u03fa\u03f9\u0001\u0000\u0000\u0000"+
		"\u03fb\u0097\u0001\u0000\u0000\u0000\u03fc\u0403\u0003\u009cN\u0000\u03fd"+
		"\u0400\u0005y\u0000\u0000\u03fe\u03ff\u0005^\u0000\u0000\u03ff\u0401\u0003"+
		"\u0090H\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000"+
		"\u0000\u0000\u0401\u0403\u0001\u0000\u0000\u0000\u0402\u03fc\u0001\u0000"+
		"\u0000\u0000\u0402\u03fd\u0001\u0000\u0000\u0000\u0403\u0099\u0001\u0000"+
		"\u0000\u0000\u0404\u0407\u0005Y\u0000\u0000\u0405\u0408\u0003\u009cN\u0000"+
		"\u0406\u0408\u0003\u0090H\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0407"+
		"\u0406\u0001\u0000\u0000\u0000\u0408\u0410\u0001\u0000\u0000\u0000\u0409"+
		"\u040c\u0005\\\u0000\u0000\u040a\u040d\u0003\u009cN\u0000\u040b\u040d"+
		"\u0003\u0090H\u0000\u040c\u040a\u0001\u0000\u0000\u0000\u040c\u040b\u0001"+
		"\u0000\u0000\u0000\u040d\u040f\u0001\u0000\u0000\u0000\u040e\u0409\u0001"+
		"\u0000\u0000\u0000\u040f\u0412\u0001\u0000\u0000\u0000\u0410\u040e\u0001"+
		"\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000\u0411\u0414\u0001"+
		"\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000\u0413\u0415\u0005"+
		"\\\u0000\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0414\u0415\u0001\u0000"+
		"\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000\u0416\u0417\u0005Z\u0000"+
		"\u0000\u0417\u009b\u0001\u0000\u0000\u0000\u0418\u041b\u0005_\u0000\u0000"+
		"\u0419\u041c\u0003\u00a6S\u0000\u041a\u041c\u0005y\u0000\u0000\u041b\u0419"+
		"\u0001\u0000\u0000\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041c\u009d"+
		"\u0001\u0000\u0000\u0000\u041d\u041e\u0005y\u0000\u0000\u041e\u041f\u0005"+
		"Y\u0000\u0000\u041f\u0420\u0003\u0090H\u0000\u0420\u0421\u0005Z\u0000"+
		"\u0000\u0421\u009f\u0001\u0000\u0000\u0000\u0422\u0423\u0005y\u0000\u0000"+
		"\u0423\u0424\u0005c\u0000\u0000\u0424\u0435\u0003\u00d4j\u0000\u0425\u0426"+
		"\u0005y\u0000\u0000\u0426\u0427\u0005c\u0000\u0000\u0427\u0435\u0003\u00d8"+
		"l\u0000\u0428\u0429\u0005W\u0000\u0000\u0429\u042a\u0003p8\u0000\u042a"+
		"\u042b\u0005X\u0000\u0000\u042b\u042c\u0005c\u0000\u0000\u042c\u042d\u0003"+
		"\u00d4j\u0000\u042d\u0435\u0001\u0000\u0000\u0000\u042e\u042f\u0005W\u0000"+
		"\u0000\u042f\u0430\u0003p8\u0000\u0430\u0431\u0005X\u0000\u0000\u0431"+
		"\u0432\u0005c\u0000\u0000\u0432\u0433\u0003\u00d8l\u0000\u0433\u0435\u0001"+
		"\u0000\u0000\u0000\u0434\u0422\u0001\u0000\u0000\u0000\u0434\u0425\u0001"+
		"\u0000\u0000\u0000\u0434\u0428\u0001\u0000\u0000\u0000\u0434\u042e\u0001"+
		"\u0000\u0000\u0000\u0435\u00a1\u0001\u0000\u0000\u0000\u0436\u0437\u0007"+
		"\u0003\u0000\u0000\u0437\u0438\u0005y\u0000\u0000\u0438\u00a3\u0001\u0000"+
		"\u0000\u0000\u0439\u043a\u0005y\u0000\u0000\u043a\u043b\u0007\u0003\u0000"+
		"\u0000\u043b\u00a5\u0001\u0000\u0000\u0000\u043c\u0447\u0007\u0004\u0000"+
		"\u0000\u043d\u043f\u0005b\u0000\u0000\u043e\u043d\u0001\u0000\u0000\u0000"+
		"\u043e\u043f\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000"+
		"\u0440\u0443\u0005]\u0000\u0000\u0441\u0444\u0005y\u0000\u0000\u0442\u0444"+
		"\u0003\u009eO\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0443\u0442\u0001"+
		"\u0000\u0000\u0000\u0444\u0446\u0001\u0000\u0000\u0000\u0445\u043e\u0001"+
		"\u0000\u0000\u0000\u0446\u0449\u0001\u0000\u0000\u0000\u0447\u0445\u0001"+
		"\u0000\u0000\u0000\u0447\u0448\u0001\u0000\u0000\u0000\u0448\u045c\u0001"+
		"\u0000\u0000\u0000\u0449\u0447\u0001\u0000\u0000\u0000\u044a\u0452\u0007"+
		"\u0004\u0000\u0000\u044b\u044d\u0005b\u0000\u0000\u044c\u044b\u0001\u0000"+
		"\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000"+
		"\u0000\u0000\u044e\u044f\u0005]\u0000\u0000\u044f\u0451\u0005y\u0000\u0000"+
		"\u0450\u044c\u0001\u0000\u0000\u0000\u0451\u0454\u0001\u0000\u0000\u0000"+
		"\u0452\u0450\u0001\u0000\u0000\u0000\u0452\u0453\u0001\u0000\u0000\u0000"+
		"\u0453\u0457\u0001\u0000\u0000\u0000\u0454\u0452\u0001\u0000\u0000\u0000"+
		"\u0455\u0456\u0005]\u0000\u0000\u0456\u0458\u0003\u00a8T\u0000\u0457\u0455"+
		"\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u0457"+
		"\u0001\u0000\u0000\u0000\u0459\u045a\u0001\u0000\u0000\u0000\u045a\u045c"+
		"\u0001\u0000\u0000\u0000\u045b\u043c\u0001\u0000\u0000\u0000\u045b\u044a"+
		"\u0001\u0000\u0000\u0000\u045c\u00a7\u0001\u0000\u0000\u0000\u045d\u045f"+
		"\u0005y\u0000\u0000\u045e\u0460\u0003\u00b0X\u0000\u045f\u045e\u0001\u0000"+
		"\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460\u0461\u0001\u0000"+
		"\u0000\u0000\u0461\u046a\u0005W\u0000\u0000\u0462\u0467\u0003\u00d4j\u0000"+
		"\u0463\u0464\u0005\\\u0000\u0000\u0464\u0466\u0003\u00d4j\u0000\u0465"+
		"\u0463\u0001\u0000\u0000\u0000\u0466\u0469\u0001\u0000\u0000\u0000\u0467"+
		"\u0465\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000\u0000\u0468"+
		"\u046b\u0001\u0000\u0000\u0000\u0469\u0467\u0001\u0000\u0000\u0000\u046a"+
		"\u0462\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000\u0000\u046b"+
		"\u046c\u0001\u0000\u0000\u0000\u046c\u0471\u0005X\u0000\u0000\u046d\u046e"+
		"\u0005]\u0000\u0000\u046e\u0470\u0005y\u0000\u0000\u046f\u046d\u0001\u0000"+
		"\u0000\u0000\u0470\u0473\u0001\u0000\u0000\u0000\u0471\u046f\u0001\u0000"+
		"\u0000\u0000\u0471\u0472\u0001\u0000\u0000\u0000\u0472\u00a9\u0001\u0000"+
		"\u0000\u0000\u0473\u0471\u0001\u0000\u0000\u0000\u0474\u0479\u0003\u00ac"+
		"V\u0000\u0475\u0476\u0005k\u0000\u0000\u0476\u0478\u0003\u00acV\u0000"+
		"\u0477\u0475\u0001\u0000\u0000\u0000\u0478\u047b\u0001\u0000\u0000\u0000"+
		"\u0479\u0477\u0001\u0000\u0000\u0000\u0479\u047a\u0001\u0000\u0000\u0000"+
		"\u047a\u00ab\u0001\u0000\u0000\u0000\u047b\u0479\u0001\u0000\u0000\u0000"+
		"\u047c\u0481\u0003\u00aeW\u0000\u047d\u0480\u0003\u00b0X\u0000\u047e\u0480"+
		"\u0003\u00b2Y\u0000\u047f\u047d\u0001\u0000\u0000\u0000\u047f\u047e\u0001"+
		"\u0000\u0000\u0000\u0480\u0483\u0001\u0000\u0000\u0000\u0481\u047f\u0001"+
		"\u0000\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482\u00ad\u0001"+
		"\u0000\u0000\u0000\u0483\u0481\u0001\u0000\u0000\u0000\u0484\u048e\u0005"+
		"@\u0000\u0000\u0485\u048e\u0005A\u0000\u0000\u0486\u048e\u0005B\u0000"+
		"\u0000\u0487\u048e\u0005D\u0000\u0000\u0488\u048e\u0005\u0014\u0000\u0000"+
		"\u0489\u048e\u0005G\u0000\u0000\u048a\u048e\u0005H\u0000\u0000\u048b\u048e"+
		"\u0005C\u0000\u0000\u048c\u048e\u0005y\u0000\u0000\u048d\u0484\u0001\u0000"+
		"\u0000\u0000\u048d\u0485\u0001\u0000\u0000\u0000\u048d\u0486\u0001\u0000"+
		"\u0000\u0000\u048d\u0487\u0001\u0000\u0000\u0000\u048d\u0488\u0001\u0000"+
		"\u0000\u0000\u048d\u0489\u0001\u0000\u0000\u0000\u048d\u048a\u0001\u0000"+
		"\u0000\u0000\u048d\u048b\u0001\u0000\u0000\u0000\u048d\u048c\u0001\u0000"+
		"\u0000\u0000\u048e\u00af\u0001\u0000\u0000\u0000\u048f\u0490\u00058\u0000"+
		"\u0000\u0490\u0495\u0003\u00aaU\u0000\u0491\u0492\u0005\\\u0000\u0000"+
		"\u0492\u0494\u0003\u00aaU\u0000\u0493\u0491\u0001\u0000\u0000\u0000\u0494"+
		"\u0497\u0001\u0000\u0000\u0000\u0495\u0493\u0001\u0000\u0000\u0000\u0495"+
		"\u0496\u0001\u0000\u0000\u0000\u0496\u0498\u0001\u0000\u0000\u0000\u0497"+
		"\u0495\u0001\u0000\u0000\u0000\u0498\u0499\u0005:\u0000\u0000\u0499\u00b1"+
		"\u0001\u0000\u0000\u0000\u049a\u049b\u0005F\u0000\u0000\u049b\u00b3\u0001"+
		"\u0000\u0000\u0000\u049c\u049d\u0007\u0005\u0000\u0000\u049d\u00b5\u0001"+
		"\u0000\u0000\u0000\u049e\u049f\u00055\u0000\u0000\u049f\u04a1\u0005y\u0000"+
		"\u0000\u04a0\u04a2\u0003\u00b0X\u0000\u04a1\u04a0\u0001\u0000\u0000\u0000"+
		"\u04a1\u04a2\u0001\u0000\u0000\u0000\u04a2\u04a3\u0001\u0000\u0000\u0000"+
		"\u04a3\u04ac\u0005W\u0000\u0000\u04a4\u04a9\u0003\u00d4j\u0000\u04a5\u04a6"+
		"\u0005\\\u0000\u0000\u04a6\u04a8\u0003\u00d4j\u0000\u04a7\u04a5\u0001"+
		"\u0000\u0000\u0000\u04a8\u04ab\u0001\u0000\u0000\u0000\u04a9\u04a7\u0001"+
		"\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000\u0000\u04aa\u04ad\u0001"+
		"\u0000\u0000\u0000\u04ab\u04a9\u0001\u0000\u0000\u0000\u04ac\u04a4\u0001"+
		"\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001"+
		"\u0000\u0000\u0000\u04ae\u04af\u0005X\u0000\u0000\u04af\u00b7\u0001\u0000"+
		"\u0000\u0000\u04b0\u04b1\u0005\u001f\u0000\u0000\u04b1\u04b2\u0005W\u0000"+
		"\u0000\u04b2\u04b3\u0003\u00d4j\u0000\u04b3\u04b4\u0005X\u0000\u0000\u04b4"+
		"\u04b8\u0003\u00d8l\u0000\u04b5\u04b7\u0003\u00ba]\u0000\u04b6\u04b5\u0001"+
		"\u0000\u0000\u0000\u04b7\u04ba\u0001\u0000\u0000\u0000\u04b8\u04b6\u0001"+
		"\u0000\u0000\u0000\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04bc\u0001"+
		"\u0000\u0000\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000\u04bb\u04bd\u0003"+
		"\u00bc^\u0000\u04bc\u04bb\u0001\u0000\u0000\u0000\u04bc\u04bd\u0001\u0000"+
		"\u0000\u0000\u04bd\u00b9\u0001\u0000\u0000\u0000\u04be\u04bf\u0005 \u0000"+
		"\u0000\u04bf\u04c0\u0005\u001f\u0000\u0000\u04c0\u04c1\u0005W\u0000\u0000"+
		"\u04c1\u04c2\u0003\u00d4j\u0000\u04c2\u04c3\u0005X\u0000\u0000\u04c3\u04c4"+
		"\u0003\u00d8l\u0000\u04c4\u00bb\u0001\u0000\u0000\u0000\u04c5\u04c6\u0005"+
		" \u0000\u0000\u04c6\u04c7\u0003\u00d8l\u0000\u04c7\u00bd\u0001\u0000\u0000"+
		"\u0000\u04c8\u04c9\u0005\u0017\u0000\u0000\u04c9\u04ca\u0005W\u0000\u0000"+
		"\u04ca\u04cb\u0003\u00d4j\u0000\u04cb\u04cc\u0005X\u0000\u0000\u04cc\u04ce"+
		"\u0005U\u0000\u0000\u04cd\u04cf\u0003\u00c0`\u0000\u04ce\u04cd\u0001\u0000"+
		"\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0\u04ce\u0001\u0000"+
		"\u0000\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000\u04d1\u04d3\u0001\u0000"+
		"\u0000\u0000\u04d2\u04d4\u0003\u00c2a\u0000\u04d3\u04d2\u0001\u0000\u0000"+
		"\u0000\u04d3\u04d4\u0001\u0000\u0000\u0000\u04d4\u04d5\u0001\u0000\u0000"+
		"\u0000\u04d5\u04d6\u0005V\u0000\u0000\u04d6\u00bf\u0001\u0000\u0000\u0000"+
		"\u04d7\u04d8\u0005\u001b\u0000\u0000\u04d8\u04d9\u0003\u00c4b\u0000\u04d9"+
		"\u04dd\u0005^\u0000\u0000\u04da\u04dc\u0003\u00c6c\u0000\u04db\u04da\u0001"+
		"\u0000\u0000\u0000\u04dc\u04df\u0001\u0000\u0000\u0000\u04dd\u04db\u0001"+
		"\u0000\u0000\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u04e0\u0001"+
		"\u0000\u0000\u0000\u04df\u04dd\u0001\u0000\u0000\u0000\u04e0\u04e2\u0005"+
		"\u001d\u0000\u0000\u04e1\u04e3\u0005[\u0000\u0000\u04e2\u04e1\u0001\u0000"+
		"\u0000\u0000\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u00c1\u0001\u0000"+
		"\u0000\u0000\u04e4\u04e5\u0005\u001c\u0000\u0000\u04e5\u04e9\u0005^\u0000"+
		"\u0000\u04e6\u04e8\u0003\u00c6c\u0000\u04e7\u04e6\u0001\u0000\u0000\u0000"+
		"\u04e8\u04eb\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000"+
		"\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea\u04ec\u0001\u0000\u0000\u0000"+
		"\u04eb\u04e9\u0001\u0000\u0000\u0000\u04ec\u04ee\u0005\u001d\u0000\u0000"+
		"\u04ed\u04ef\u0005[\u0000\u0000\u04ee\u04ed\u0001\u0000\u0000\u0000\u04ee"+
		"\u04ef\u0001\u0000\u0000\u0000\u04ef\u00c3\u0001\u0000\u0000\u0000\u04f0"+
		"\u04f1\u0007\u0006\u0000\u0000\u04f1\u00c5\u0001\u0000\u0000\u0000\u04f2"+
		"\u04fd\u0003\u0080@\u0000\u04f3\u04f4\u0003\u00a8T\u0000\u04f4\u04f5\u0005"+
		"[\u0000\u0000\u04f5\u04fd\u0001\u0000\u0000\u0000\u04f6\u04fd\u0003\u00b8"+
		"\\\u0000\u04f7\u04f8\u0003\u00a6S\u0000\u04f8\u04f9\u0005[\u0000\u0000"+
		"\u04f9\u04fd\u0001\u0000\u0000\u0000\u04fa\u04fd\u0003\u00be_\u0000\u04fb"+
		"\u04fd\u0003l6\u0000\u04fc\u04f2\u0001\u0000\u0000\u0000\u04fc\u04f3\u0001"+
		"\u0000\u0000\u0000\u04fc\u04f6\u0001\u0000\u0000\u0000\u04fc\u04f7\u0001"+
		"\u0000\u0000\u0000\u04fc\u04fa\u0001\u0000\u0000\u0000\u04fc\u04fb\u0001"+
		"\u0000\u0000\u0000\u04fd\u00c7\u0001\u0000\u0000\u0000\u04fe\u04ff\u0005"+
		"\u0018\u0000\u0000\u04ff\u0501\u0005W\u0000\u0000\u0500\u0502\u0003\u00da"+
		"m\u0000\u0501\u0500\u0001\u0000\u0000\u0000\u0501\u0502\u0001\u0000\u0000"+
		"\u0000\u0502\u0504\u0001\u0000\u0000\u0000\u0503\u0505\u0003\u00cae\u0000"+
		"\u0504\u0503\u0001\u0000\u0000\u0000\u0504\u0505\u0001\u0000\u0000\u0000"+
		"\u0505\u0506\u0001\u0000\u0000\u0000\u0506\u0508\u0005[\u0000\u0000\u0507"+
		"\u0509\u0003\u00d4j\u0000\u0508\u0507\u0001\u0000\u0000\u0000\u0508\u0509"+
		"\u0001\u0000\u0000\u0000\u0509\u050a\u0001\u0000\u0000\u0000\u050a\u050c"+
		"\u0005[\u0000\u0000\u050b\u050d\u0003\u00d4j\u0000\u050c\u050b\u0001\u0000"+
		"\u0000\u0000\u050c\u050d\u0001\u0000\u0000\u0000\u050d\u050e\u0001\u0000"+
		"\u0000\u0000\u050e\u050f\u0005X\u0000\u0000\u050f\u0527\u0003\u00d8l\u0000"+
		"\u0510\u0511\u0005\u0018\u0000\u0000\u0511\u0513\u0005W\u0000\u0000\u0512"+
		"\u0514\u0003\u00dam\u0000\u0513\u0512\u0001\u0000\u0000\u0000\u0513\u0514"+
		"\u0001\u0000\u0000\u0000\u0514\u0515\u0001\u0000\u0000\u0000\u0515\u0516"+
		"\u0005y\u0000\u0000\u0516\u0517\u00054\u0000\u0000\u0517\u0518\u0003\u00d4"+
		"j\u0000\u0518\u0519\u0005X\u0000\u0000\u0519\u051a\u0003\u00d8l\u0000"+
		"\u051a\u0527\u0001\u0000\u0000\u0000\u051b\u051c\u0005\u0018\u0000\u0000"+
		"\u051c\u051e\u0005W\u0000\u0000\u051d\u051f\u0003\u00dam\u0000\u051e\u051d"+
		"\u0001\u0000\u0000\u0000\u051e\u051f\u0001\u0000\u0000\u0000\u051f\u0520"+
		"\u0001\u0000\u0000\u0000\u0520\u0521\u0005y\u0000\u0000\u0521\u0522\u0005"+
		"3\u0000\u0000\u0522\u0523\u0003\u00d4j\u0000\u0523\u0524\u0005X\u0000"+
		"\u0000\u0524\u0525\u0003\u00d8l\u0000\u0525\u0527\u0001\u0000\u0000\u0000"+
		"\u0526\u04fe\u0001\u0000\u0000\u0000\u0526\u0510\u0001\u0000\u0000\u0000"+
		"\u0526\u051b\u0001\u0000\u0000\u0000\u0527\u00c9\u0001\u0000\u0000\u0000"+
		"\u0528\u052b\u0003\u00ccf\u0000\u0529\u052b\u0003\u0080@\u0000\u052a\u0528"+
		"\u0001\u0000\u0000\u0000\u052a\u0529\u0001\u0000\u0000\u0000\u052b\u00cb"+
		"\u0001\u0000\u0000\u0000\u052c\u0531\u0003\u00ceg\u0000\u052d\u052e\u0005"+
		"\\\u0000\u0000\u052e\u0530\u0003\u00ceg\u0000\u052f\u052d\u0001\u0000"+
		"\u0000\u0000\u0530\u0533\u0001\u0000\u0000\u0000\u0531\u052f\u0001\u0000"+
		"\u0000\u0000\u0531\u0532\u0001\u0000\u0000\u0000\u0532\u00cd\u0001\u0000"+
		"\u0000\u0000\u0533\u0531\u0001\u0000\u0000\u0000\u0534\u0537\u0005y\u0000"+
		"\u0000\u0535\u0536\u0005^\u0000\u0000\u0536\u0538\u0003\u00aaU\u0000\u0537"+
		"\u0535\u0001\u0000\u0000\u0000\u0537\u0538\u0001\u0000\u0000\u0000\u0538"+
		"\u053b\u0001\u0000\u0000\u0000\u0539\u053a\u0005`\u0000\u0000\u053a\u053c"+
		"\u0003\u00d4j\u0000\u053b\u0539\u0001\u0000\u0000\u0000\u053b\u053c\u0001"+
		"\u0000\u0000\u0000\u053c\u00cf\u0001\u0000\u0000\u0000\u053d\u053e\u0005"+
		"\u0019\u0000\u0000\u053e\u053f\u0005W\u0000\u0000\u053f\u0540\u0003\u00d4"+
		"j\u0000\u0540\u0541\u0005X\u0000\u0000\u0541\u0542\u0003\u00d8l\u0000"+
		"\u0542\u00d1\u0001\u0000\u0000\u0000\u0543\u0544\u0005\u001a\u0000\u0000"+
		"\u0544\u0545\u0003\u00d8l\u0000\u0545\u0546\u0005\u0019\u0000\u0000\u0546"+
		"\u0547\u0005W\u0000\u0000\u0547\u0548\u0003\u00d4j\u0000\u0548\u054a\u0005"+
		"X\u0000\u0000\u0549\u054b\u0005[\u0000\u0000\u054a\u0549\u0001\u0000\u0000"+
		"\u0000\u054a\u054b\u0001\u0000\u0000\u0000\u054b\u00d3\u0001\u0000\u0000"+
		"\u0000\u054c\u054d\u0006j\uffff\uffff\u0000\u054d\u054e\u0005W\u0000\u0000"+
		"\u054e\u054f\u0003\u00d4j\u0000\u054f\u0550\u0005X\u0000\u0000\u0550\u0553"+
		"\u0001\u0000\u0000\u0000\u0551\u0553\u0003\u0090H\u0000\u0552\u054c\u0001"+
		"\u0000\u0000\u0000\u0552\u0551\u0001\u0000\u0000\u0000\u0553\u055e\u0001"+
		"\u0000\u0000\u0000\u0554\u0558\n\u0003\u0000\u0000\u0555\u0556\u0003\u00d6"+
		"k\u0000\u0556\u0557\u0003\u00d4j\u0000\u0557\u0559\u0001\u0000\u0000\u0000"+
		"\u0558\u0555\u0001\u0000\u0000\u0000\u0559\u055a\u0001\u0000\u0000\u0000"+
		"\u055a\u0558\u0001\u0000\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000"+
		"\u055b\u055d\u0001\u0000\u0000\u0000\u055c\u0554\u0001\u0000\u0000\u0000"+
		"\u055d\u0560\u0001\u0000\u0000\u0000\u055e\u055c\u0001\u0000\u0000\u0000"+
		"\u055e\u055f\u0001\u0000\u0000\u0000\u055f\u00d5\u0001\u0000\u0000\u0000"+
		"\u0560\u055e\u0001\u0000\u0000\u0000\u0561\u0562\u0007\u0007\u0000\u0000"+
		"\u0562\u00d7\u0001\u0000\u0000\u0000\u0563\u0569\u0005U\u0000\u0000\u0564"+
		"\u0568\u0003\u0080@\u0000\u0565\u0568\u0003~?\u0000\u0566\u0568\u0003"+
		"l6\u0000\u0567\u0564\u0001\u0000\u0000\u0000\u0567\u0565\u0001\u0000\u0000"+
		"\u0000\u0567\u0566\u0001\u0000\u0000\u0000\u0568\u056b\u0001\u0000\u0000"+
		"\u0000\u0569\u0567\u0001\u0000\u0000\u0000\u0569\u056a\u0001\u0000\u0000"+
		"\u0000\u056a\u056c\u0001\u0000\u0000\u0000\u056b\u0569\u0001\u0000\u0000"+
		"\u0000\u056c\u056d\u0005V\u0000\u0000\u056d\u00d9\u0001\u0000\u0000\u0000"+
		"\u056e\u056f\u0007\b\u0000\u0000\u056f\u00db\u0001\u0000\u0000\u0000\u00a4"+
		"\u00df\u00eb\u00f1\u00f5\u0104\u0108\u0110\u0116\u011a\u0122\u0126\u012e"+
		"\u0132\u013c\u0149\u014e\u015c\u0172\u0177\u0188\u0196\u019b\u01a9\u01af"+
		"\u01b3\u01ba\u01c5\u01cb\u01d1\u01d8\u01e7\u01f3\u0204\u0208\u020f\u022c"+
		"\u0231\u023d\u0247\u024e\u0254\u0257\u025b\u025f\u0261\u0268\u0271\u027b"+
		"\u027e\u0281\u0287\u0293\u029e\u02ac\u02af\u02b4\u02b7\u02bd\u02cb\u02d1"+
		"\u02d4\u02d7\u02da\u02df\u02e2\u02e5\u02ea\u02f0\u02f4\u02f7\u02fc\u0300"+
		"\u0303\u0309\u031a\u031e\u0322\u0324\u0328\u0335\u0338\u0342\u034a\u034d"+
		"\u0351\u0355\u035c\u0363\u036d\u0371\u0379\u037d\u0385\u0389\u038c\u038f"+
		"\u0393\u039b\u039e\u03a4\u03ad\u03b7\u03c2\u03ce\u03d0\u03de\u03e8\u03f0"+
		"\u03f3\u03f6\u03fa\u0400\u0402\u0407\u040c\u0410\u0414\u041b\u0434\u043e"+
		"\u0443\u0447\u044c\u0452\u0459\u045b\u045f\u0467\u046a\u0471\u0479\u047f"+
		"\u0481\u048d\u0495\u04a1\u04a9\u04ac\u04b8\u04bc\u04d0\u04d3\u04dd\u04e2"+
		"\u04e9\u04ee\u04fc\u0501\u0504\u0508\u050c\u0513\u051e\u0526\u052a\u0531"+
		"\u0537\u053b\u054a\u0552\u055a\u055e\u0567\u0569";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}