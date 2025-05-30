// Generated from D:/compiler projects/Here-AC/src/Grammer\AngularParser.g4 by ANTLR 4.10.1
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
		ASYNC=34, STATIC=35, ABSTRACT=36, LOG=37, CONSOLE=38, READONLY=39, LET=40, 
		VAR=41, CONST=42, IN=43, OF=44, ANDAND=45, OROR=46, LT=47, LE=48, GT=49, 
		GE=50, EQEQ=51, NOTEQ=52, STRICT_E=53, STRICT_NE=54, NUMBER=55, STRING=56, 
		BOOLEAN=57, ANY=58, VOID=59, BOOL=60, LIST=61, UNDEFINED=62, UNKNOWN=63, 
		PRIVATE=64, PUBLIC=65, PROTECTED=66, SELECTOR=67, STANDALONE=68, IMPORTS=69, 
		TEMPLATE=70, TEMPLATE_URL=71, STYLES_URL=72, STYLES_URLS=73, STYLES=74, 
		PROVIDED_IN=75, OPEN_CURLY_BRACKET=76, CLOSE_CURLY_BRACKET=77, OPEN_BRACKET=78, 
		CLOSE_BRACKET=79, OPEN_SQUARE_BRACKET=80, CLOSE_SQUARE_BRACKET=81, SEMICOLON=82, 
		COMMA=83, DOT=84, DOT_DOT=85, EQ=86, ATT=87, QUESTION=88, ARROW=89, QUOTE=90, 
		SCOPE_QUOTE=91, APOSTROPHE=92, SLASH=93, STAR=94, OR=95, PERCENTAGE=96, 
		PLUSEQ=97, MINUSEQ=98, STAREQ=99, SLASHEQ=100, PLUS=101, MINUS=102, PP=103, 
		MM=104, STRING_LITERAL=105, NUMERIC_LITERAL=106, BIGINT_LITERAL=107, SYMBOL_LITERAL=108, 
		IDENTIFIER=109, COLOR=110;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_componentBlock = 2, RULE_serviceBlock = 3, 
		RULE_importStatement = 4, RULE_importItems = 5, RULE_interfaceDeclaration = 6, 
		RULE_interfaceBody = 7, RULE_serviceDeclaration = 8, RULE_serviceArguments = 9, 
		RULE_arg = 10, RULE_componentDeclaration = 11, RULE_selectorArg = 12, 
		RULE_standAloneArg = 13, RULE_importArg = 14, RULE_templateArg = 15, RULE_styleArg = 16, 
		RULE_inlineStyle = 17, RULE_componentArguments = 18, RULE_openComponent = 19, 
		RULE_closeComponent = 20, RULE_htmlDocument = 21, RULE_htmlElement = 22, 
		RULE_openTag = 23, RULE_closeTag = 24, RULE_selfClosingTag = 25, RULE_htmlAttribute = 26, 
		RULE_basicAttribute = 27, RULE_ngFor = 28, RULE_ngIF = 29, RULE_imageAttribute = 30, 
		RULE_actionAttribute = 31, RULE_htmlContentBody = 32, RULE_objectExpression = 33, 
		RULE_objectExpressionValue = 34, RULE_cssDocument = 35, RULE_cssRule = 36, 
		RULE_ruleValue = 37, RULE_classDeclaration = 38, RULE_classHeritage = 39, 
		RULE_classImplement = 40, RULE_classBody = 41, RULE_classPropertyDeclaration = 42, 
		RULE_methodDeclaration = 43, RULE_decorator = 44, RULE_returnType = 45, 
		RULE_methodBody = 46, RULE_methodBodyProperty = 47, RULE_returnStatement = 48, 
		RULE_printStatement = 49, RULE_parameterList = 50, RULE_parameter = 51, 
		RULE_constructorDeclaration = 52, RULE_constructorParams = 53, RULE_constructorParam = 54, 
		RULE_constructorBody = 55, RULE_constructorBodyProperty = 56, RULE_commonStatement = 57, 
		RULE_blockProperty = 58, RULE_parameterPropertyAssignment = 59, RULE_localVariableDeclaration = 60, 
		RULE_propertyAssignment = 61, RULE_assignDataType = 62, RULE_assigment = 63, 
		RULE_assigmentToNull = 64, RULE_compoundAssignment = 65, RULE_propertyValue = 66, 
		RULE_propertyValueObjects = 67, RULE_literalValue = 68, RULE_objectValue = 69, 
		RULE_objectProperty = 70, RULE_list = 71, RULE_indexAccessValue = 72, 
		RULE_arrowFunction = 73, RULE_preFix = 74, RULE_postFix = 75, RULE_propertyCall = 76, 
		RULE_methodCall = 77, RULE_dataType = 78, RULE_type = 79, RULE_typeArguments = 80, 
		RULE_listSuffix = 81, RULE_accessModifiers = 82, RULE_conditionalStatement = 83, 
		RULE_elseIfStatement = 84, RULE_elseStatement = 85, RULE_switchStatement = 86, 
		RULE_caseBlock = 87, RULE_defaultBlock = 88, RULE_caseValue = 89, RULE_caseStatement = 90, 
		RULE_forStatement = 91, RULE_forInitializer = 92, RULE_variableDeclarationList = 93, 
		RULE_variableDeclaration = 94, RULE_whileStatement = 95, RULE_doWhileStatement = 96, 
		RULE_expression = 97, RULE_operation = 98, RULE_block = 99, RULE_declareVarsKeyword = 100;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "componentBlock", "serviceBlock", "importStatement", 
			"importItems", "interfaceDeclaration", "interfaceBody", "serviceDeclaration", 
			"serviceArguments", "arg", "componentDeclaration", "selectorArg", "standAloneArg", 
			"importArg", "templateArg", "styleArg", "inlineStyle", "componentArguments", 
			"openComponent", "closeComponent", "htmlDocument", "htmlElement", "openTag", 
			"closeTag", "selfClosingTag", "htmlAttribute", "basicAttribute", "ngFor", 
			"ngIF", "imageAttribute", "actionAttribute", "htmlContentBody", "objectExpression", 
			"objectExpressionValue", "cssDocument", "cssRule", "ruleValue", "classDeclaration", 
			"classHeritage", "classImplement", "classBody", "classPropertyDeclaration", 
			"methodDeclaration", "decorator", "returnType", "methodBody", "methodBodyProperty", 
			"returnStatement", "printStatement", "parameterList", "parameter", "constructorDeclaration", 
			"constructorParams", "constructorParam", "constructorBody", "constructorBodyProperty", 
			"commonStatement", "blockProperty", "parameterPropertyAssignment", "localVariableDeclaration", 
			"propertyAssignment", "assignDataType", "assigment", "assigmentToNull", 
			"compoundAssignment", "propertyValue", "propertyValueObjects", "literalValue", 
			"objectValue", "objectProperty", "list", "indexAccessValue", "arrowFunction", 
			"preFix", "postFix", "propertyCall", "methodCall", "dataType", "type", 
			"typeArguments", "listSuffix", "accessModifiers", "conditionalStatement", 
			"elseIfStatement", "elseStatement", "switchStatement", "caseBlock", "defaultBlock", 
			"caseValue", "caseStatement", "forStatement", "forInitializer", "variableDeclarationList", 
			"variableDeclaration", "whileStatement", "doWhileStatement", "expression", 
			"operation", "block", "declareVarsKeyword"
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
			"'readonly'", "'let'", "'var'", "'const'", "'in'", "'of'", "'&&'", "'||'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'==='", "'!=='", "'number'", 
			"'string'", "'boolean'", "'any'", "'void'", null, "'[]'", "'undefined'", 
			"'unknown'", "'private'", "'public'", "'protected'", "'selector'", "'standalone'", 
			"'imports'", "'template'", "'templateUrl'", "'styleUrl'", "'styleUrls'", 
			"'styles'", "'providedIn'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"';'", "','", "'.'", "':'", "'='", "'@'", "'?'", "'=>'", "'\"'", "'`'", 
			"'''", "'/'", "'*'", "'|'", "'%'", "'+='", "'-='", "'*='", "'/='", "'+'", 
			"'-'", "'++'", "'--'"
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
			"LOG", "CONSOLE", "READONLY", "LET", "VAR", "CONST", "IN", "OF", "ANDAND", 
			"OROR", "LT", "LE", "GT", "GE", "EQEQ", "NOTEQ", "STRICT_E", "STRICT_NE", 
			"NUMBER", "STRING", "BOOLEAN", "ANY", "VOID", "BOOL", "LIST", "UNDEFINED", 
			"UNKNOWN", "PRIVATE", "PUBLIC", "PROTECTED", "SELECTOR", "STANDALONE", 
			"IMPORTS", "TEMPLATE", "TEMPLATE_URL", "STYLES_URL", "STYLES_URLS", "STYLES", 
			"PROVIDED_IN", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "SEMICOLON", 
			"COMMA", "DOT", "DOT_DOT", "EQ", "ATT", "QUESTION", "ARROW", "QUOTE", 
			"SCOPE_QUOTE", "APOSTROPHE", "SLASH", "STAR", "OR", "PERCENTAGE", "PLUSEQ", 
			"MINUSEQ", "STAREQ", "SLASHEQ", "PLUS", "MINUS", "PP", "MM", "STRING_LITERAL", 
			"NUMERIC_LITERAL", "BIGINT_LITERAL", "SYMBOL_LITERAL", "IDENTIFIER", 
			"COLOR"
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			statement();
			setState(203);
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
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ServiceBlockContext> serviceBlock() {
			return getRuleContexts(ServiceBlockContext.class);
		}
		public ServiceBlockContext serviceBlock(int i) {
			return getRuleContext(ServiceBlockContext.class,i);
		}
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<PrintStatementContext> printStatement() {
			return getRuleContexts(PrintStatementContext.class);
		}
		public PrintStatementContext printStatement(int i) {
			return getRuleContext(PrintStatementContext.class,i);
		}
		public List<ComponentBlockContext> componentBlock() {
			return getRuleContexts(ComponentBlockContext.class);
		}
		public ComponentBlockContext componentBlock(int i) {
			return getRuleContext(ComponentBlockContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				importStatement();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INJECTABLE) | (1L << EXPORT) | (1L << CLASS) | (1L << INTERFACE) | (1L << ABSTRACT) | (1L << CONSOLE))) != 0)) {
				{
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(210);
					serviceBlock();
					}
					break;
				case 2:
					{
					setState(211);
					interfaceDeclaration();
					}
					break;
				case 3:
					{
					setState(212);
					classDeclaration();
					}
					break;
				case 4:
					{
					setState(213);
					printStatement();
					}
					break;
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPONENT) {
				{
				{
				setState(219);
				componentBlock();
				}
				}
				setState(224);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			componentDeclaration();
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				classDeclaration();
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXPORT) | (1L << CLASS) | (1L << ABSTRACT))) != 0) );
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
			setState(231);
			serviceDeclaration();
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(232);
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
			setState(235);
			match(IMPORT);
			setState(236);
			match(OPEN_CURLY_BRACKET);
			setState(237);
			importItems();
			setState(238);
			match(CLOSE_CURLY_BRACKET);
			setState(239);
			match(FROM);
			setState(240);
			match(STRING_LITERAL);
			setState(241);
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
			setState(243);
			match(IDENTIFIER);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(244);
				match(COMMA);
				setState(245);
				match(IDENTIFIER);
				}
				}
				setState(250);
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
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(251);
				match(EXPORT);
				}
			}

			setState(254);
			match(INTERFACE);
			setState(255);
			match(IDENTIFIER);
			setState(256);
			match(OPEN_CURLY_BRACKET);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==READONLY || _la==IDENTIFIER) {
				{
				{
				setState(257);
				interfaceBody();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
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
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public TerminalNode READONLY() { return getToken(AngularParser.READONLY, 0); }
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
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PropertyInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==READONLY) {
					{
					setState(265);
					match(READONLY);
					}
				}

				setState(268);
				match(IDENTIFIER);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(269);
					match(QUESTION);
					}
				}

				setState(272);
				match(DOT_DOT);
				setState(273);
				dataType();
				setState(274);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new FunctionInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==READONLY) {
					{
					setState(276);
					match(READONLY);
					}
				}

				setState(279);
				match(IDENTIFIER);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(280);
					match(QUESTION);
					}
				}

				setState(283);
				match(OPEN_BRACKET);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(284);
					parameterList();
					}
				}

				setState(287);
				match(CLOSE_BRACKET);
				setState(288);
				_la = _input.LA(1);
				if ( !(_la==DOT_DOT || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				dataType();
				setState(290);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new ArrowFunctionInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==READONLY) {
					{
					setState(292);
					match(READONLY);
					}
				}

				setState(295);
				match(IDENTIFIER);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(296);
					match(QUESTION);
					}
				}

				setState(299);
				match(DOT_DOT);
				setState(300);
				match(OPEN_BRACKET);
				setState(301);
				parameterList();
				setState(302);
				match(CLOSE_BRACKET);
				setState(303);
				match(ARROW);
				setState(304);
				dataType();
				setState(305);
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
			setState(309);
			match(INJECTABLE);
			setState(310);
			match(OPEN_BRACKET);
			setState(311);
			serviceArguments();
			setState(312);
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
			setState(314);
			match(OPEN_CURLY_BRACKET);
			setState(315);
			arg();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(316);
				match(COMMA);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PROVIDED_IN) {
					{
					{
					setState(317);
					arg();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
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
			setState(330);
			match(PROVIDED_IN);
			setState(331);
			match(DOT_DOT);
			setState(332);
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
			setState(334);
			match(COMPONENT);
			setState(335);
			openComponent();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SELECTOR - 67)) | (1L << (STANDALONE - 67)) | (1L << (IMPORTS - 67)) | (1L << (TEMPLATE - 67)) | (1L << (TEMPLATE_URL - 67)) | (1L << (STYLES_URL - 67)) | (1L << (STYLES_URLS - 67)) | (1L << (STYLES - 67)))) != 0)) {
				{
				{
				setState(336);
				componentArguments();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
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
			setState(344);
			match(SELECTOR);
			setState(345);
			match(DOT_DOT);
			setState(346);
			match(STRING_LITERAL);
			setState(347);
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
			setState(349);
			match(STANDALONE);
			setState(350);
			match(DOT_DOT);
			setState(351);
			match(BOOL);
			setState(352);
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
			setState(354);
			match(IMPORTS);
			setState(355);
			match(DOT_DOT);
			setState(356);
			match(OPEN_SQUARE_BRACKET);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(357);
				match(IDENTIFIER);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(358);
					match(COMMA);
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(CLOSE_SQUARE_BRACKET);
			setState(370);
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
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE_URL:
				_localctx = new TemplateUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(TEMPLATE_URL);
				setState(373);
				match(DOT_DOT);
				setState(374);
				match(STRING_LITERAL);
				setState(375);
				match(COMMA);
				}
				break;
			case TEMPLATE:
				_localctx = new TemplateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(TEMPLATE);
				setState(377);
				match(DOT_DOT);
				setState(378);
				match(SCOPE_QUOTE);
				setState(379);
				htmlDocument();
				setState(380);
				match(SCOPE_QUOTE);
				setState(381);
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
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLES_URL:
				_localctx = new StyleUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(STYLES_URL);
				setState(386);
				match(DOT_DOT);
				setState(387);
				match(STRING_LITERAL);
				setState(388);
				match(COMMA);
				}
				break;
			case STYLES_URLS:
				_localctx = new StyleUrlsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(STYLES_URLS);
				setState(390);
				match(DOT_DOT);
				{
				setState(391);
				match(OPEN_SQUARE_BRACKET);
				setState(392);
				match(STRING_LITERAL);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(393);
					match(COMMA);
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==STRING_LITERAL) {
						{
						{
						setState(394);
						match(STRING_LITERAL);
						}
						}
						setState(399);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				match(CLOSE_SQUARE_BRACKET);
				}
				setState(407);
				match(COMMA);
				}
				break;
			case STYLES:
				_localctx = new StylesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(STYLES);
				setState(409);
				match(DOT_DOT);
				setState(422);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_SQUARE_BRACKET:
					{
					setState(410);
					match(OPEN_SQUARE_BRACKET);
					setState(411);
					inlineStyle();
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(412);
						match(COMMA);
						setState(413);
						inlineStyle();
						}
						}
						setState(418);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(419);
					match(CLOSE_SQUARE_BRACKET);
					}
					break;
				case SCOPE_QUOTE:
					{
					setState(421);
					inlineStyle();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(424);
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

	public static class InlineStyleContext extends ParserRuleContext {
		public List<TerminalNode> SCOPE_QUOTE() { return getTokens(AngularParser.SCOPE_QUOTE); }
		public TerminalNode SCOPE_QUOTE(int i) {
			return getToken(AngularParser.SCOPE_QUOTE, i);
		}
		public CssDocumentContext cssDocument() {
			return getRuleContext(CssDocumentContext.class,0);
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
		enterRule(_localctx, 34, RULE_inlineStyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(SCOPE_QUOTE);
			setState(429);
			cssDocument();
			setState(430);
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
		enterRule(_localctx, 36, RULE_componentArguments);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				importArg();
				}
				break;
			case TEMPLATE:
			case TEMPLATE_URL:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				templateArg();
				}
				break;
			case STYLES_URL:
			case STYLES_URLS:
			case STYLES:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				styleArg();
				}
				break;
			case SELECTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				selectorArg();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
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
		enterRule(_localctx, 38, RULE_openComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(OPEN_BRACKET);
			setState(440);
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
		enterRule(_localctx, 40, RULE_closeComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(CLOSE_CURLY_BRACKET);
			setState(443);
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
		enterRule(_localctx, 42, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(445);
				htmlElement();
				}
				}
				setState(448); 
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
		enterRule(_localctx, 44, RULE_htmlElement);
		try {
			int _alt;
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				openTag();
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(451);
						htmlContentBody();
						}
						} 
					}
					setState(456);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(457);
				closeTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
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
		enterRule(_localctx, 46, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(LT);
			setState(463);
			match(IDENTIFIER);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (OPEN_BRACKET - 78)) | (1L << (OPEN_SQUARE_BRACKET - 78)) | (1L << (STAR - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
				{
				{
				setState(464);
				htmlAttribute();
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
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
		enterRule(_localctx, 48, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(LT);
			setState(473);
			match(SLASH);
			setState(474);
			match(IDENTIFIER);
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
		enterRule(_localctx, 50, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(LT);
			setState(478);
			match(IDENTIFIER);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (OPEN_BRACKET - 78)) | (1L << (OPEN_SQUARE_BRACKET - 78)) | (1L << (STAR - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
				{
				{
				setState(479);
				htmlAttribute();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(SLASH);
			setState(486);
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
		enterRule(_localctx, 52, RULE_htmlAttribute);
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				basicAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				ngFor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				ngIF();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				imageAttribute();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(492);
				actionAttribute();
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
		enterRule(_localctx, 54, RULE_basicAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(496);
			match(EQ);
			setState(497);
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
		enterRule(_localctx, 56, RULE_ngFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(STAR);
			setState(500);
			match(NG_FOR);
			setState(501);
			match(EQ);
			setState(502);
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
		enterRule(_localctx, 58, RULE_ngIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(STAR);
			setState(505);
			match(NG_IF);
			setState(506);
			match(EQ);
			setState(507);
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
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode IMAGE_SRC() { return getToken(AngularParser.IMAGE_SRC, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 60, RULE_imageAttribute);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(OPEN_SQUARE_BRACKET);
			setState(510);
			match(IMAGE_SRC);
			setState(511);
			match(CLOSE_SQUARE_BRACKET);
			setState(512);
			match(EQ);
			setState(513);
			match(STRING_LITERAL);
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(514);
					basicAttribute();
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 62, RULE_actionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(OPEN_BRACKET);
			setState(521);
			match(CLICK);
			setState(522);
			match(CLOSE_BRACKET);
			setState(523);
			match(EQ);
			setState(524);
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
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(IDENTIFIER);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				htmlElement();
				}
				break;
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
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
		public ObjectExpressionValueContext objectExpressionValue() {
			return getRuleContext(ObjectExpressionValueContext.class,0);
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
			setState(531);
			match(OPEN_CURLY_BRACKET);
			setState(532);
			match(OPEN_CURLY_BRACKET);
			setState(533);
			objectExpressionValue();
			setState(534);
			match(CLOSE_CURLY_BRACKET);
			setState(535);
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

	public static class ObjectExpressionValueContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public ObjectExpressionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpressionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectExpressionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectExpressionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectExpressionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionValueContext objectExpressionValue() throws RecognitionException {
		ObjectExpressionValueContext _localctx = new ObjectExpressionValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_objectExpressionValue);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(IDENTIFIER);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(539);
					match(DOT);
					setState(540);
					match(IDENTIFIER);
					}
					}
					setState(545);
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

	public static class CssDocumentContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_CURLY_BRACKET() { return getTokens(AngularParser.OPEN_CURLY_BRACKET); }
		public TerminalNode OPEN_CURLY_BRACKET(int i) {
			return getToken(AngularParser.OPEN_CURLY_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_CURLY_BRACKET() { return getTokens(AngularParser.CLOSE_CURLY_BRACKET); }
		public TerminalNode CLOSE_CURLY_BRACKET(int i) {
			return getToken(AngularParser.CLOSE_CURLY_BRACKET, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
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
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==IDENTIFIER) {
				{
				{
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(548);
					match(DOT);
					}
				}

				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(551);
					match(IDENTIFIER);
					}
					}
					setState(554); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(556);
				match(OPEN_CURLY_BRACKET);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(557);
					cssRule();
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(563);
				match(CLOSE_CURLY_BRACKET);
				}
				}
				setState(568);
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
		enterRule(_localctx, 72, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(IDENTIFIER);
			setState(570);
			match(DOT_DOT);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (NUMERIC_LITERAL - 106)) | (1L << (IDENTIFIER - 106)) | (1L << (COLOR - 106)))) != 0)) {
				{
				{
				setState(571);
				ruleValue();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
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
		enterRule(_localctx, 74, RULE_ruleValue);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(NUMERIC_LITERAL);
				setState(581);
				match(PX);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				match(NUMERIC_LITERAL);
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERCENTAGE) {
					{
					setState(583);
					match(PERCENTAGE);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
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
		enterRule(_localctx, 76, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(589);
				match(EXPORT);
				}
			}

			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(592);
				match(ABSTRACT);
				}
			}

			setState(595);
			match(CLASS);
			setState(596);
			match(IDENTIFIER);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(597);
				classHeritage();
				}
			}

			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(600);
				classImplement();
				}
			}

			setState(603);
			match(OPEN_CURLY_BRACKET);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTRUCTOR) | (1L << ASYNC) | (1L << STATIC) | (1L << READONLY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRIVATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PROTECTED - 64)) | (1L << (ATT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(604);
				classBody();
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
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
		enterRule(_localctx, 78, RULE_classHeritage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(EXTENDS);
			setState(613);
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
		enterRule(_localctx, 80, RULE_classImplement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(IMPLEMENTS);
			setState(616);
			match(IDENTIFIER);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(617);
				match(COMMA);
				setState(618);
				match(IDENTIFIER);
				}
				}
				setState(623);
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
		enterRule(_localctx, 82, RULE_classBody);
		try {
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				classPropertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
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
		enterRule(_localctx, 84, RULE_classPropertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRIVATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PROTECTED - 64)))) != 0)) {
				{
				setState(629);
				accessModifiers();
				}
			}

			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(632);
				match(STATIC);
				}
			}

			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY) {
				{
				setState(635);
				match(READONLY);
				}
			}

			setState(638);
			match(IDENTIFIER);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(639);
				match(DOT_DOT);
				setState(640);
				assignDataType();
				}
			}

			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(643);
				assigment();
				}
			}

			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(646);
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
		enterRule(_localctx, 86, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATT) {
				{
				{
				setState(649);
				decorator();
				}
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRIVATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PROTECTED - 64)))) != 0)) {
				{
				{
				setState(655);
				accessModifiers();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(661);
				match(ASYNC);
				}
			}

			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(664);
				match(STATIC);
				}
			}

			setState(667);
			match(IDENTIFIER);
			setState(668);
			match(OPEN_BRACKET);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(669);
				parameterList();
				}
			}

			setState(672);
			match(CLOSE_BRACKET);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(673);
				returnType();
				}
			}

			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(676);
				assigmentToNull();
				}
			}

			setState(679);
			match(OPEN_CURLY_BRACKET);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << CONSOLE) | (1L << LET) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(680);
				methodBody();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
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
		enterRule(_localctx, 88, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(ATT);
			setState(689);
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
		enterRule(_localctx, 90, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(DOT_DOT);
			setState(692);
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
		enterRule(_localctx, 92, RULE_methodBody);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				commonStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				methodBodyProperty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(697);
				propertyCall();
				setState(698);
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
		enterRule(_localctx, 94, RULE_methodBodyProperty);
		int _la;
		try {
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				localVariableDeclaration();
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(703);
					match(SEMICOLON);
					}
				}

				}
				break;
			case THIS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				propertyAssignment();
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(707);
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
		enterRule(_localctx, 96, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(RETURN);
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NULL) | (1L << BOOL) | (1L << LIST) | (1L << UNDEFINED))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (OPEN_CURLY_BRACKET - 76)) | (1L << (OPEN_BRACKET - 76)) | (1L << (CLOSE_BRACKET - 76)) | (1L << (OPEN_SQUARE_BRACKET - 76)) | (1L << (PP - 76)) | (1L << (MM - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (NUMERIC_LITERAL - 76)) | (1L << (BIGINT_LITERAL - 76)) | (1L << (SYMBOL_LITERAL - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				setState(713);
				expression(0);
				}
			}

			setState(716);
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
		enterRule(_localctx, 98, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(CONSOLE);
			setState(719);
			match(DOT);
			setState(720);
			match(LOG);
			setState(721);
			match(OPEN_BRACKET);
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(722);
				expression(0);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(723);
					match(COMMA);
					setState(724);
					expression(0);
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(732);
			match(CLOSE_BRACKET);
			setState(733);
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
		enterRule(_localctx, 100, RULE_parameterList);
		int _la;
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				parameter();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(736);
					match(COMMA);
					setState(737);
					parameter();
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				match(IDENTIFIER);
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(744);
					match(COMMA);
					setState(745);
					match(IDENTIFIER);
					}
					}
					setState(750);
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
		enterRule(_localctx, 102, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(IDENTIFIER);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(754);
				match(QUESTION);
				}
			}

			setState(757);
			match(DOT_DOT);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYOF) {
				{
				setState(758);
				match(KEYOF);
				}
			}

			setState(761);
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
		enterRule(_localctx, 104, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(CONSTRUCTOR);
			setState(764);
			match(OPEN_BRACKET);
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRIVATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PROTECTED - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(765);
				constructorParams();
				}
			}

			setState(768);
			match(CLOSE_BRACKET);
			setState(769);
			match(OPEN_CURLY_BRACKET);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << CONSOLE) | (1L << READONLY) | (1L << LET) | (1L << CONST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRIVATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PROTECTED - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(770);
				constructorBody();
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776);
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
		enterRule(_localctx, 106, RULE_constructorParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			constructorParam();
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(779);
				match(COMMA);
				setState(780);
				constructorParam();
				}
				}
				setState(785);
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
		enterRule(_localctx, 108, RULE_constructorParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRIVATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PROTECTED - 64)))) != 0)) {
				{
				setState(786);
				accessModifiers();
				}
			}

			setState(789);
			match(IDENTIFIER);
			setState(790);
			match(DOT_DOT);
			setState(791);
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
		enterRule(_localctx, 110, RULE_constructorBody);
		try {
			setState(795);
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
				setState(793);
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
				setState(794);
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
		enterRule(_localctx, 112, RULE_constructorBodyProperty);
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				parameterPropertyAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
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
		enterRule(_localctx, 114, RULE_commonStatement);
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSOLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				printStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				conditionalStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				switchStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(805);
				whileStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(806);
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
		enterRule(_localctx, 116, RULE_blockProperty);
		try {
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				localVariableDeclaration();
				}
				break;
			case THIS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
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
		enterRule(_localctx, 118, RULE_parameterPropertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRIVATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PROTECTED - 64)))) != 0)) {
				{
				setState(813);
				accessModifiers();
				}
			}

			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY) {
				{
				setState(816);
				match(READONLY);
				}
			}

			setState(819);
			match(IDENTIFIER);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(820);
				assigment();
				}
			}

			setState(823);
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
		enterRule(_localctx, 120, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_la = _input.LA(1);
			if ( !(_la==LET || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(826);
			match(IDENTIFIER);
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(827);
				match(DOT_DOT);
				setState(828);
				assignDataType();
				}
			}

			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(831);
				assigment();
				}
			}

			setState(834);
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
		enterRule(_localctx, 122, RULE_propertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			propertyCall();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (EQ - 86)) | (1L << (PLUSEQ - 86)) | (1L << (MINUSEQ - 86)) | (1L << (STAREQ - 86)) | (1L << (SLASHEQ - 86)))) != 0)) {
				{
				setState(837);
				compoundAssignment();
				}
			}

			setState(840);
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
		enterRule(_localctx, 124, RULE_assignDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			dataType();
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(843);
				match(OR);
				setState(844);
				dataType();
				}
				}
				setState(849);
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
		enterRule(_localctx, 126, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(EQ);
			setState(851);
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
		enterRule(_localctx, 128, RULE_assigmentToNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(OR);
			setState(854);
			match(NULL);
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(855);
				match(EQ);
				setState(856);
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
		enterRule(_localctx, 130, RULE_compoundAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (EQ - 86)) | (1L << (PLUSEQ - 86)) | (1L << (MINUSEQ - 86)) | (1L << (STAREQ - 86)) | (1L << (SLASHEQ - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(860);
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
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_propertyValue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case NULL:
			case BOOL:
			case LIST:
			case UNDEFINED:
			case OPEN_CURLY_BRACKET:
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
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

				setState(863);
				propertyValueObjects();
				}
				break;
			case CLOSE_BRACKET:
				{
				_localctx = new BracketedPropertyValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(864);
				match(CLOSE_BRACKET);
				setState(865);
				propertyValue(0);
				setState(866);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(880);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOperationPropertyValueExprContext(new PropertyValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propertyValue);
						setState(870);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(871);
						operation();
						setState(872);
						propertyValue(3);
						}
						break;
					case 2:
						{
						_localctx = new ShortIfExprContext(new PropertyValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propertyValue);
						setState(874);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(875);
						match(QUESTION);
						setState(876);
						propertyValue(0);
						setState(877);
						match(DOT_DOT);
						setState(878);
						propertyValue(2);
						}
						break;
					}
					} 
				}
				setState(884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		enterRule(_localctx, 134, RULE_propertyValueObjects);
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				literalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				objectValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(887);
				list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(888);
				indexAccessValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(889);
				propertyCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(890);
				methodCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(891);
				arrowFunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(892);
				postFix();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(893);
				preFix();
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
		enterRule(_localctx, 136, RULE_literalValue);
		try {
			setState(904);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				match(NUMERIC_LITERAL);
				}
				break;
			case BIGINT_LITERAL:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(898);
				match(BIGINT_LITERAL);
				}
				break;
			case BOOL:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(899);
				match(BOOL);
				}
				break;
			case LIST:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(900);
				match(LIST);
				}
				break;
			case NULL:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(901);
				match(NULL);
				}
				break;
			case UNDEFINED:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(902);
				match(UNDEFINED);
				}
				break;
			case SYMBOL_LITERAL:
				_localctx = new SymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(903);
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
		enterRule(_localctx, 138, RULE_objectValue);
		int _la;
		try {
			int _alt;
			setState(922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(OPEN_CURLY_BRACKET);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(907);
					objectProperty();
					setState(912);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(908);
							match(COMMA);
							setState(909);
							objectProperty();
							}
							} 
						}
						setState(914);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
					}
					}
				}

				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(917);
					match(COMMA);
					}
				}

				setState(920);
				match(CLOSE_CURLY_BRACKET);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DOT_DOT() { return getToken(AngularParser.DOT_DOT, 0); }
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_objectProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(IDENTIFIER);
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(925);
				match(DOT_DOT);
				setState(926);
				propertyValue(0);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(AngularParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(AngularParser.CLOSE_SQUARE_BRACKET, 0); }
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
		enterRule(_localctx, 142, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(OPEN_SQUARE_BRACKET);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NULL) | (1L << BOOL) | (1L << LIST) | (1L << UNDEFINED))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (OPEN_CURLY_BRACKET - 76)) | (1L << (OPEN_BRACKET - 76)) | (1L << (CLOSE_BRACKET - 76)) | (1L << (OPEN_SQUARE_BRACKET - 76)) | (1L << (PP - 76)) | (1L << (MM - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (NUMERIC_LITERAL - 76)) | (1L << (BIGINT_LITERAL - 76)) | (1L << (SYMBOL_LITERAL - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				setState(930);
				propertyValue(0);
				setState(935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(931);
						match(COMMA);
						setState(932);
						propertyValue(0);
						}
						} 
					}
					setState(937);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(938);
					match(COMMA);
					}
				}

				}
			}

			setState(943);
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
		enterRule(_localctx, 144, RULE_indexAccessValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(IDENTIFIER);
			setState(946);
			match(OPEN_SQUARE_BRACKET);
			setState(947);
			propertyValue(0);
			setState(948);
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
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(OPEN_BRACKET);
			setState(951);
			parameterList();
			setState(952);
			match(CLOSE_BRACKET);
			setState(953);
			match(ARROW);
			setState(954);
			expression(0);
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
		enterRule(_localctx, 148, RULE_preFix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_la = _input.LA(1);
			if ( !(_la==PP || _la==MM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(957);
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
		enterRule(_localctx, 150, RULE_postFix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(IDENTIFIER);
			setState(960);
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
		enterRule(_localctx, 152, RULE_propertyCall);
		int _la;
		try {
			int _alt;
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new SimplePropertyCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(965); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(963);
						match(DOT);
						setState(964);
						match(IDENTIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(967); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new PropertyWithMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(970);
						match(DOT);
						setState(971);
						match(IDENTIFIER);
						}
						} 
					}
					setState(976);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				setState(981);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(977);
						match(DOT);
						setState(978);
						methodCall();
						}
						} 
					}
					setState(983);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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

	public static class MethodCallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(AngularParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngularParser.CLOSE_BRACKET, 0); }
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
		enterRule(_localctx, 154, RULE_methodCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(IDENTIFIER);
			setState(987);
			match(OPEN_BRACKET);
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(988);
				expression(0);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(989);
					match(COMMA);
					setState(990);
					expression(0);
					}
					}
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(998);
			match(CLOSE_BRACKET);
			setState(1003);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(999);
					match(DOT);
					setState(1000);
					match(IDENTIFIER);
					}
					} 
				}
				setState(1005);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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
		enterRule(_localctx, 156, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			type();
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LT || _la==LIST) {
				{
				setState(1009);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(1007);
					typeArguments();
					}
					break;
				case LIST:
					{
					setState(1008);
					listSuffix();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1013);
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
		enterRule(_localctx, 158, RULE_type);
		try {
			setState(1023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1015);
				match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1016);
				match(BOOLEAN);
				}
				break;
			case VOID:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1017);
				match(VOID);
				}
				break;
			case NULL:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1018);
				match(NULL);
				}
				break;
			case UNDEFINED:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1019);
				match(UNDEFINED);
				}
				break;
			case UNKNOWN:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1020);
				match(UNKNOWN);
				}
				break;
			case ANY:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1021);
				match(ANY);
				}
				break;
			case IDENTIFIER:
				_localctx = new ClassTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1022);
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
		enterRule(_localctx, 160, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(LT);
			setState(1026);
			dataType();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1027);
				match(COMMA);
				setState(1028);
				dataType();
				}
				}
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1034);
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
		enterRule(_localctx, 162, RULE_listSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
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
		enterRule(_localctx, 164, RULE_accessModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRIVATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PROTECTED - 64)))) != 0)) ) {
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
		enterRule(_localctx, 166, RULE_conditionalStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(IF);
			setState(1041);
			match(OPEN_BRACKET);
			setState(1042);
			expression(0);
			setState(1043);
			match(CLOSE_BRACKET);
			setState(1044);
			block();
			setState(1048);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1045);
					elseIfStatement();
					}
					} 
				}
				setState(1050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1051);
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
		enterRule(_localctx, 168, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(ELSE);
			setState(1055);
			match(IF);
			setState(1056);
			match(OPEN_BRACKET);
			setState(1057);
			expression(0);
			setState(1058);
			match(CLOSE_BRACKET);
			setState(1059);
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
		enterRule(_localctx, 170, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(ELSE);
			setState(1062);
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
		enterRule(_localctx, 172, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(SWITCH);
			setState(1065);
			match(OPEN_BRACKET);
			setState(1066);
			expression(0);
			setState(1067);
			match(CLOSE_BRACKET);
			setState(1068);
			match(OPEN_CURLY_BRACKET);
			setState(1070); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1069);
				caseBlock();
				}
				}
				setState(1072); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1074);
				defaultBlock();
				}
			}

			setState(1077);
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
		enterRule(_localctx, 174, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(CASE);
			setState(1080);
			caseValue();
			setState(1081);
			match(DOT_DOT);
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << SWITCH) | (1L << IF) | (1L << LET) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1082);
				caseStatement();
				}
				}
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1088);
			match(BREAK);
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1089);
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
		enterRule(_localctx, 176, RULE_defaultBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			match(DEFAULT);
			setState(1093);
			match(DOT_DOT);
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << SWITCH) | (1L << IF) | (1L << LET) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1094);
				caseStatement();
				}
				}
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1100);
			match(BREAK);
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1101);
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
		enterRule(_localctx, 178, RULE_caseValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (STRING_LITERAL - 105)) | (1L << (NUMERIC_LITERAL - 105)) | (1L << (IDENTIFIER - 105)))) != 0)) ) {
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
		enterRule(_localctx, 180, RULE_caseStatement);
		try {
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				blockProperty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
				methodCall();
				setState(1108);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
				conditionalStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1111);
				propertyCall();
				setState(1112);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1114);
				switchStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1115);
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
		enterRule(_localctx, 182, RULE_forStatement);
		int _la;
		try {
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				_localctx = new TraditionalForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				match(FOR);
				setState(1119);
				match(OPEN_BRACKET);
				setState(1121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1120);
					declareVarsKeyword();
					}
					break;
				}
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << LET) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
					{
					setState(1123);
					forInitializer();
					}
				}

				setState(1126);
				match(SEMICOLON);
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NULL) | (1L << BOOL) | (1L << LIST) | (1L << UNDEFINED))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (OPEN_CURLY_BRACKET - 76)) | (1L << (OPEN_BRACKET - 76)) | (1L << (CLOSE_BRACKET - 76)) | (1L << (OPEN_SQUARE_BRACKET - 76)) | (1L << (PP - 76)) | (1L << (MM - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (NUMERIC_LITERAL - 76)) | (1L << (BIGINT_LITERAL - 76)) | (1L << (SYMBOL_LITERAL - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
					{
					setState(1127);
					expression(0);
					}
				}

				setState(1130);
				match(SEMICOLON);
				setState(1132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1131);
					expression(0);
					}
					break;
				}
				setState(1134);
				match(CLOSE_BRACKET);
				setState(1135);
				block();
				}
				break;
			case 2:
				_localctx = new ForOfLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				match(FOR);
				setState(1137);
				match(OPEN_BRACKET);
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << VAR) | (1L << CONST))) != 0)) {
					{
					setState(1138);
					declareVarsKeyword();
					}
				}

				setState(1141);
				match(IDENTIFIER);
				setState(1142);
				match(OF);
				setState(1143);
				expression(0);
				setState(1144);
				match(CLOSE_BRACKET);
				setState(1145);
				block();
				}
				break;
			case 3:
				_localctx = new ForInLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1147);
				match(FOR);
				setState(1148);
				match(OPEN_BRACKET);
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << VAR) | (1L << CONST))) != 0)) {
					{
					setState(1149);
					declareVarsKeyword();
					}
				}

				setState(1152);
				match(IDENTIFIER);
				setState(1153);
				match(IN);
				setState(1154);
				expression(0);
				setState(1155);
				match(CLOSE_BRACKET);
				setState(1156);
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
		enterRule(_localctx, 184, RULE_forInitializer);
		try {
			setState(1162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				variableDeclarationList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
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
		enterRule(_localctx, 186, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			variableDeclaration();
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1165);
				match(COMMA);
				setState(1166);
				variableDeclaration();
				}
				}
				setState(1171);
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
		enterRule(_localctx, 188, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(IDENTIFIER);
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(1173);
				match(DOT_DOT);
				setState(1174);
				dataType();
				}
			}

			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1177);
				match(EQ);
				setState(1178);
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
		enterRule(_localctx, 190, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(WHILE);
			setState(1182);
			match(OPEN_BRACKET);
			setState(1183);
			expression(0);
			setState(1184);
			match(CLOSE_BRACKET);
			setState(1185);
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
		enterRule(_localctx, 192, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			match(DO);
			setState(1188);
			block();
			setState(1189);
			match(WHILE);
			setState(1190);
			match(OPEN_BRACKET);
			setState(1191);
			expression(0);
			setState(1192);
			match(CLOSE_BRACKET);
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1193);
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
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				_localctx = new ParentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1197);
				match(OPEN_BRACKET);
				setState(1198);
				expression(0);
				setState(1199);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				{
				_localctx = new LiteralOrReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1201);
				propertyValue(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(1204);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(1208); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1205);
							operation();
							setState(1206);
							expression(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1210); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(1216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
		enterRule(_localctx, 196, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			_la = _input.LA(1);
			if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (ANDAND - 45)) | (1L << (OROR - 45)) | (1L << (LT - 45)) | (1L << (LE - 45)) | (1L << (GT - 45)) | (1L << (GE - 45)) | (1L << (EQEQ - 45)) | (1L << (NOTEQ - 45)) | (1L << (STRICT_E - 45)) | (1L << (STRICT_NE - 45)) | (1L << (SLASH - 45)) | (1L << (STAR - 45)) | (1L << (PLUS - 45)) | (1L << (MINUS - 45)))) != 0)) ) {
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
		enterRule(_localctx, 198, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(OPEN_CURLY_BRACKET);
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << CONSOLE) | (1L << LET) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
				{
				setState(1223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case THIS:
				case LET:
				case CONST:
				case IDENTIFIER:
					{
					setState(1220);
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
					setState(1221);
					commonStatement();
					}
					break;
				case RETURN:
					{
					setState(1222);
					returnStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1228);
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
		enterRule(_localctx, 200, RULE_declareVarsKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
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
		case 66:
			return propertyValue_sempred((PropertyValueContext)_localctx, predIndex);
		case 97:
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
		"\u0004\u0001n\u04d1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"d\u0007d\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u00cf"+
		"\b\u0001\u000b\u0001\f\u0001\u00d0\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u00d7\b\u0001\n\u0001\f\u0001\u00da\t\u0001\u0001"+
		"\u0001\u0005\u0001\u00dd\b\u0001\n\u0001\f\u0001\u00e0\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u00e4\b\u0002\u000b\u0002\f\u0002\u00e5\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00ea\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00f7\b\u0005\n\u0005\f\u0005"+
		"\u00fa\t\u0005\u0001\u0006\u0003\u0006\u00fd\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0103\b\u0006\n\u0006\f\u0006"+
		"\u0106\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u010b\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u010f\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0116\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u011a\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u011e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0126\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u012a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0134\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u013f\b\t\n\t\f\t\u0142\t\t\u0005\t\u0144\b\t\n\t\f\t\u0147\t\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0152\b\u000b\n\u000b\f\u000b\u0155\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0168\b\u000e\n\u000e\f\u000e\u016b\t\u000e\u0005\u000e"+
		"\u016d\b\u000e\n\u000e\f\u000e\u0170\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0180\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u018c\b\u0010\n\u0010\f\u0010\u018f\t\u0010\u0005\u0010\u0191\b"+
		"\u0010\n\u0010\f\u0010\u0194\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u019f\b\u0010\n\u0010\f\u0010\u01a2\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u01a7\b\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u01ab\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01b6"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0004\u0015\u01bf\b\u0015\u000b\u0015\f\u0015\u01c0"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u01c5\b\u0016\n\u0016\f\u0016\u01c8"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01cd\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01d2\b\u0017\n\u0017"+
		"\f\u0017\u01d5\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u01e1\b\u0019\n\u0019\f\u0019\u01e4\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01ee\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0204"+
		"\b\u001e\n\u001e\f\u001e\u0207\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u0212"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u021e\b\"\n\"\f\"\u0221\t\"\u0003\"\u0223\b\"\u0001#"+
		"\u0003#\u0226\b#\u0001#\u0004#\u0229\b#\u000b#\f#\u022a\u0001#\u0001#"+
		"\u0005#\u022f\b#\n#\f#\u0232\t#\u0001#\u0005#\u0235\b#\n#\f#\u0238\t#"+
		"\u0001$\u0001$\u0001$\u0005$\u023d\b$\n$\f$\u0240\t$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u0249\b%\u0001%\u0003%\u024c\b%\u0001"+
		"&\u0003&\u024f\b&\u0001&\u0003&\u0252\b&\u0001&\u0001&\u0001&\u0003&\u0257"+
		"\b&\u0001&\u0003&\u025a\b&\u0001&\u0001&\u0005&\u025e\b&\n&\f&\u0261\t"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0005"+
		"(\u026c\b(\n(\f(\u026f\t(\u0001)\u0001)\u0001)\u0003)\u0274\b)\u0001*"+
		"\u0003*\u0277\b*\u0001*\u0003*\u027a\b*\u0001*\u0003*\u027d\b*\u0001*"+
		"\u0001*\u0001*\u0003*\u0282\b*\u0001*\u0003*\u0285\b*\u0001*\u0003*\u0288"+
		"\b*\u0001+\u0005+\u028b\b+\n+\f+\u028e\t+\u0001+\u0005+\u0291\b+\n+\f"+
		"+\u0294\t+\u0001+\u0003+\u0297\b+\u0001+\u0003+\u029a\b+\u0001+\u0001"+
		"+\u0001+\u0003+\u029f\b+\u0001+\u0001+\u0003+\u02a3\b+\u0001+\u0003+\u02a6"+
		"\b+\u0001+\u0001+\u0005+\u02aa\b+\n+\f+\u02ad\t+\u0001+\u0001+\u0001,"+
		"\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u02bd\b.\u0001/\u0001/\u0003/\u02c1\b/\u0001/\u0001/\u0003"+
		"/\u02c5\b/\u0003/\u02c7\b/\u00010\u00010\u00030\u02cb\b0\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00051\u02d6\b1\n1"+
		"\f1\u02d9\t1\u00031\u02db\b1\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00052\u02e3\b2\n2\f2\u02e6\t2\u00012\u00012\u00012\u00052\u02eb\b2"+
		"\n2\f2\u02ee\t2\u00032\u02f0\b2\u00013\u00013\u00033\u02f4\b3\u00013\u0001"+
		"3\u00033\u02f8\b3\u00013\u00013\u00014\u00014\u00014\u00034\u02ff\b4\u0001"+
		"4\u00014\u00014\u00054\u0304\b4\n4\f4\u0307\t4\u00014\u00014\u00015\u0001"+
		"5\u00015\u00055\u030e\b5\n5\f5\u0311\t5\u00016\u00036\u0314\b6\u00016"+
		"\u00016\u00016\u00016\u00017\u00017\u00037\u031c\b7\u00018\u00018\u0003"+
		"8\u0320\b8\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u0328\b9\u0001"+
		":\u0001:\u0003:\u032c\b:\u0001;\u0003;\u032f\b;\u0001;\u0003;\u0332\b"+
		";\u0001;\u0001;\u0003;\u0336\b;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001"+
		"<\u0003<\u033e\b<\u0001<\u0003<\u0341\b<\u0001<\u0001<\u0001=\u0001=\u0003"+
		"=\u0347\b=\u0001=\u0001=\u0001>\u0001>\u0001>\u0005>\u034e\b>\n>\f>\u0351"+
		"\t>\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0003@\u035a\b@\u0001"+
		"A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u0365"+
		"\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0005B\u0371\bB\nB\fB\u0374\tB\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0003C\u037f\bC\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0003D\u0389\bD\u0001E\u0001E\u0001E\u0001E\u0005"+
		"E\u038f\bE\nE\fE\u0392\tE\u0003E\u0394\bE\u0001E\u0003E\u0397\bE\u0001"+
		"E\u0001E\u0003E\u039b\bE\u0001F\u0001F\u0001F\u0003F\u03a0\bF\u0001G\u0001"+
		"G\u0001G\u0001G\u0005G\u03a6\bG\nG\fG\u03a9\tG\u0001G\u0003G\u03ac\bG"+
		"\u0003G\u03ae\bG\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001K\u0001"+
		"K\u0001K\u0001L\u0001L\u0001L\u0004L\u03c6\bL\u000bL\fL\u03c7\u0001L\u0001"+
		"L\u0001L\u0005L\u03cd\bL\nL\fL\u03d0\tL\u0001L\u0001L\u0005L\u03d4\bL"+
		"\nL\fL\u03d7\tL\u0003L\u03d9\bL\u0001M\u0001M\u0001M\u0001M\u0001M\u0005"+
		"M\u03e0\bM\nM\fM\u03e3\tM\u0003M\u03e5\bM\u0001M\u0001M\u0001M\u0005M"+
		"\u03ea\bM\nM\fM\u03ed\tM\u0001N\u0001N\u0001N\u0005N\u03f2\bN\nN\fN\u03f5"+
		"\tN\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003"+
		"O\u0400\bO\u0001P\u0001P\u0001P\u0001P\u0005P\u0406\bP\nP\fP\u0409\tP"+
		"\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0005S\u0417\bS\nS\fS\u041a\tS\u0001S\u0003S\u041d\bS"+
		"\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001"+
		"U\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0004V\u042f\bV\u000bV\fV"+
		"\u0430\u0001V\u0003V\u0434\bV\u0001V\u0001V\u0001W\u0001W\u0001W\u0001"+
		"W\u0005W\u043c\bW\nW\fW\u043f\tW\u0001W\u0001W\u0003W\u0443\bW\u0001X"+
		"\u0001X\u0001X\u0005X\u0448\bX\nX\fX\u044b\tX\u0001X\u0001X\u0003X\u044f"+
		"\bX\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0003Z\u045d\bZ\u0001[\u0001[\u0001[\u0003[\u0462\b[\u0001"+
		"[\u0003[\u0465\b[\u0001[\u0001[\u0003[\u0469\b[\u0001[\u0001[\u0003[\u046d"+
		"\b[\u0001[\u0001[\u0001[\u0001[\u0001[\u0003[\u0474\b[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0003[\u047f\b[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0003[\u0487\b[\u0001\\\u0001\\\u0003\\"+
		"\u048b\b\\\u0001]\u0001]\u0001]\u0005]\u0490\b]\n]\f]\u0493\t]\u0001^"+
		"\u0001^\u0001^\u0003^\u0498\b^\u0001^\u0001^\u0003^\u049c\b^\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0003`\u04ab\b`\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0003"+
		"a\u04b3\ba\u0001a\u0001a\u0001a\u0001a\u0004a\u04b9\ba\u000ba\fa\u04ba"+
		"\u0005a\u04bd\ba\na\fa\u04c0\ta\u0001b\u0001b\u0001c\u0001c\u0001c\u0001"+
		"c\u0005c\u04c8\bc\nc\fc\u04cb\tc\u0001c\u0001c\u0001d\u0001d\u0001d\u0000"+
		"\u0002\u0084\u00c2e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u0000\n\u0002\u0000UUYY\u0002\u0000\n\nmm\u0002\u0000"+
		"((**\u0002\u0000VVad\u0001\u0000gh\u0002\u0000\u000e\u000emm\u0001\u0000"+
		"@B\u0002\u0000ijmm\u0003\u0000-6]^ef\u0001\u0000(*\u052a\u0000\u00ca\u0001"+
		"\u0000\u0000\u0000\u0002\u00ce\u0001\u0000\u0000\u0000\u0004\u00e1\u0001"+
		"\u0000\u0000\u0000\u0006\u00e7\u0001\u0000\u0000\u0000\b\u00eb\u0001\u0000"+
		"\u0000\u0000\n\u00f3\u0001\u0000\u0000\u0000\f\u00fc\u0001\u0000\u0000"+
		"\u0000\u000e\u0133\u0001\u0000\u0000\u0000\u0010\u0135\u0001\u0000\u0000"+
		"\u0000\u0012\u013a\u0001\u0000\u0000\u0000\u0014\u014a\u0001\u0000\u0000"+
		"\u0000\u0016\u014e\u0001\u0000\u0000\u0000\u0018\u0158\u0001\u0000\u0000"+
		"\u0000\u001a\u015d\u0001\u0000\u0000\u0000\u001c\u0162\u0001\u0000\u0000"+
		"\u0000\u001e\u017f\u0001\u0000\u0000\u0000 \u01aa\u0001\u0000\u0000\u0000"+
		"\"\u01ac\u0001\u0000\u0000\u0000$\u01b5\u0001\u0000\u0000\u0000&\u01b7"+
		"\u0001\u0000\u0000\u0000(\u01ba\u0001\u0000\u0000\u0000*\u01be\u0001\u0000"+
		"\u0000\u0000,\u01cc\u0001\u0000\u0000\u0000.\u01ce\u0001\u0000\u0000\u0000"+
		"0\u01d8\u0001\u0000\u0000\u00002\u01dd\u0001\u0000\u0000\u00004\u01ed"+
		"\u0001\u0000\u0000\u00006\u01ef\u0001\u0000\u0000\u00008\u01f3\u0001\u0000"+
		"\u0000\u0000:\u01f8\u0001\u0000\u0000\u0000<\u01fd\u0001\u0000\u0000\u0000"+
		">\u0208\u0001\u0000\u0000\u0000@\u0211\u0001\u0000\u0000\u0000B\u0213"+
		"\u0001\u0000\u0000\u0000D\u0222\u0001\u0000\u0000\u0000F\u0236\u0001\u0000"+
		"\u0000\u0000H\u0239\u0001\u0000\u0000\u0000J\u024b\u0001\u0000\u0000\u0000"+
		"L\u024e\u0001\u0000\u0000\u0000N\u0264\u0001\u0000\u0000\u0000P\u0267"+
		"\u0001\u0000\u0000\u0000R\u0273\u0001\u0000\u0000\u0000T\u0276\u0001\u0000"+
		"\u0000\u0000V\u028c\u0001\u0000\u0000\u0000X\u02b0\u0001\u0000\u0000\u0000"+
		"Z\u02b3\u0001\u0000\u0000\u0000\\\u02bc\u0001\u0000\u0000\u0000^\u02c6"+
		"\u0001\u0000\u0000\u0000`\u02c8\u0001\u0000\u0000\u0000b\u02ce\u0001\u0000"+
		"\u0000\u0000d\u02ef\u0001\u0000\u0000\u0000f\u02f1\u0001\u0000\u0000\u0000"+
		"h\u02fb\u0001\u0000\u0000\u0000j\u030a\u0001\u0000\u0000\u0000l\u0313"+
		"\u0001\u0000\u0000\u0000n\u031b\u0001\u0000\u0000\u0000p\u031f\u0001\u0000"+
		"\u0000\u0000r\u0327\u0001\u0000\u0000\u0000t\u032b\u0001\u0000\u0000\u0000"+
		"v\u032e\u0001\u0000\u0000\u0000x\u0339\u0001\u0000\u0000\u0000z\u0344"+
		"\u0001\u0000\u0000\u0000|\u034a\u0001\u0000\u0000\u0000~\u0352\u0001\u0000"+
		"\u0000\u0000\u0080\u0355\u0001\u0000\u0000\u0000\u0082\u035b\u0001\u0000"+
		"\u0000\u0000\u0084\u0364\u0001\u0000\u0000\u0000\u0086\u037e\u0001\u0000"+
		"\u0000\u0000\u0088\u0388\u0001\u0000\u0000\u0000\u008a\u039a\u0001\u0000"+
		"\u0000\u0000\u008c\u039c\u0001\u0000\u0000\u0000\u008e\u03a1\u0001\u0000"+
		"\u0000\u0000\u0090\u03b1\u0001\u0000\u0000\u0000\u0092\u03b6\u0001\u0000"+
		"\u0000\u0000\u0094\u03bc\u0001\u0000\u0000\u0000\u0096\u03bf\u0001\u0000"+
		"\u0000\u0000\u0098\u03d8\u0001\u0000\u0000\u0000\u009a\u03da\u0001\u0000"+
		"\u0000\u0000\u009c\u03ee\u0001\u0000\u0000\u0000\u009e\u03ff\u0001\u0000"+
		"\u0000\u0000\u00a0\u0401\u0001\u0000\u0000\u0000\u00a2\u040c\u0001\u0000"+
		"\u0000\u0000\u00a4\u040e\u0001\u0000\u0000\u0000\u00a6\u0410\u0001\u0000"+
		"\u0000\u0000\u00a8\u041e\u0001\u0000\u0000\u0000\u00aa\u0425\u0001\u0000"+
		"\u0000\u0000\u00ac\u0428\u0001\u0000\u0000\u0000\u00ae\u0437\u0001\u0000"+
		"\u0000\u0000\u00b0\u0444\u0001\u0000\u0000\u0000\u00b2\u0450\u0001\u0000"+
		"\u0000\u0000\u00b4\u045c\u0001\u0000\u0000\u0000\u00b6\u0486\u0001\u0000"+
		"\u0000\u0000\u00b8\u048a\u0001\u0000\u0000\u0000\u00ba\u048c\u0001\u0000"+
		"\u0000\u0000\u00bc\u0494\u0001\u0000\u0000\u0000\u00be\u049d\u0001\u0000"+
		"\u0000\u0000\u00c0\u04a3\u0001\u0000\u0000\u0000\u00c2\u04b2\u0001\u0000"+
		"\u0000\u0000\u00c4\u04c1\u0001\u0000\u0000\u0000\u00c6\u04c3\u0001\u0000"+
		"\u0000\u0000\u00c8\u04ce\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\u0002"+
		"\u0001\u0000\u00cb\u00cc\u0005\u0000\u0000\u0001\u00cc\u0001\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cf\u0003\b\u0004\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d7\u0003\u0006\u0003\u0000\u00d3\u00d7\u0003\f\u0006\u0000"+
		"\u00d4\u00d7\u0003L&\u0000\u00d5\u00d7\u0003b1\u0000\u00d6\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00de\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0003\u0004\u0002\u0000\u00dc\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u0003\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003"+
		"\u0016\u000b\u0000\u00e2\u00e4\u0003L&\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u0005\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e9\u0003\u0010\b\u0000\u00e8\u00ea\u0003L&\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u0007\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0004\u0000\u0000\u00ec"+
		"\u00ed\u0005L\u0000\u0000\u00ed\u00ee\u0003\n\u0005\u0000\u00ee\u00ef"+
		"\u0005M\u0000\u0000\u00ef\u00f0\u0005\u0005\u0000\u0000\u00f0\u00f1\u0005"+
		"i\u0000\u0000\u00f1\u00f2\u0005R\u0000\u0000\u00f2\t\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f8\u0005m\u0000\u0000\u00f4\u00f5\u0005S\u0000\u0000\u00f5"+
		"\u00f7\u0005m\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fa"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f9\u000b\u0001\u0000\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005\t\u0000\u0000\u00fc\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005\r\u0000\u0000\u00ff\u0100\u0005m"+
		"\u0000\u0000\u0100\u0104\u0005L\u0000\u0000\u0101\u0103\u0003\u000e\u0007"+
		"\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0005M\u0000\u0000\u0108\r\u0001\u0000\u0000\u0000"+
		"\u0109\u010b\u0005\'\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010e\u0005m\u0000\u0000\u010d\u010f\u0005X\u0000\u0000\u010e\u010d\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005U\u0000\u0000\u0111\u0112\u0003\u009c"+
		"N\u0000\u0112\u0113\u0005R\u0000\u0000\u0113\u0134\u0001\u0000\u0000\u0000"+
		"\u0114\u0116\u0005\'\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0119\u0005m\u0000\u0000\u0118\u011a\u0005X\u0000\u0000\u0119\u0118\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u011d\u0005N\u0000\u0000\u011c\u011e\u0003d2"+
		"\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0005O\u0000\u0000"+
		"\u0120\u0121\u0007\u0000\u0000\u0000\u0121\u0122\u0003\u009cN\u0000\u0122"+
		"\u0123\u0005R\u0000\u0000\u0123\u0134\u0001\u0000\u0000\u0000\u0124\u0126"+
		"\u0005\'\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0005"+
		"m\u0000\u0000\u0128\u012a\u0005X\u0000\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0005U\u0000\u0000\u012c\u012d\u0005N\u0000\u0000\u012d"+
		"\u012e\u0003d2\u0000\u012e\u012f\u0005O\u0000\u0000\u012f\u0130\u0005"+
		"Y\u0000\u0000\u0130\u0131\u0003\u009cN\u0000\u0131\u0132\u0005R\u0000"+
		"\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u010a\u0001\u0000\u0000"+
		"\u0000\u0133\u0115\u0001\u0000\u0000\u0000\u0133\u0125\u0001\u0000\u0000"+
		"\u0000\u0134\u000f\u0001\u0000\u0000\u0000\u0135\u0136\u0005\b\u0000\u0000"+
		"\u0136\u0137\u0005N\u0000\u0000\u0137\u0138\u0003\u0012\t\u0000\u0138"+
		"\u0139\u0005O\u0000\u0000\u0139\u0011\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0005L\u0000\u0000\u013b\u0145\u0003\u0014\n\u0000\u013c\u0140\u0005"+
		"S\u0000\u0000\u013d\u013f\u0003\u0014\n\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u013c\u0001\u0000"+
		"\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000"+
		"\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0005M\u0000"+
		"\u0000\u0149\u0013\u0001\u0000\u0000\u0000\u014a\u014b\u0005K\u0000\u0000"+
		"\u014b\u014c\u0005U\u0000\u0000\u014c\u014d\u0005i\u0000\u0000\u014d\u0015"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u0007\u0000\u0000\u014f\u0153"+
		"\u0003&\u0013\u0000\u0150\u0152\u0003$\u0012\u0000\u0151\u0150\u0001\u0000"+
		"\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0003(\u0014"+
		"\u0000\u0157\u0017\u0001\u0000\u0000\u0000\u0158\u0159\u0005C\u0000\u0000"+
		"\u0159\u015a\u0005U\u0000\u0000\u015a\u015b\u0005i\u0000\u0000\u015b\u015c"+
		"\u0005S\u0000\u0000\u015c\u0019\u0001\u0000\u0000\u0000\u015d\u015e\u0005"+
		"D\u0000\u0000\u015e\u015f\u0005U\u0000\u0000\u015f\u0160\u0005<\u0000"+
		"\u0000\u0160\u0161\u0005S\u0000\u0000\u0161\u001b\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0005E\u0000\u0000\u0163\u0164\u0005U\u0000\u0000\u0164\u016e"+
		"\u0005P\u0000\u0000\u0165\u0169\u0005m\u0000\u0000\u0166\u0168\u0005S"+
		"\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000"+
		"\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016c\u0165\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000"+
		"\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0005Q\u0000\u0000\u0172\u0173\u0005S\u0000\u0000"+
		"\u0173\u001d\u0001\u0000\u0000\u0000\u0174\u0175\u0005G\u0000\u0000\u0175"+
		"\u0176\u0005U\u0000\u0000\u0176\u0177\u0005i\u0000\u0000\u0177\u0180\u0005"+
		"S\u0000\u0000\u0178\u0179\u0005F\u0000\u0000\u0179\u017a\u0005U\u0000"+
		"\u0000\u017a\u017b\u0005[\u0000\u0000\u017b\u017c\u0003*\u0015\u0000\u017c"+
		"\u017d\u0005[\u0000\u0000\u017d\u017e\u0005S\u0000\u0000\u017e\u0180\u0001"+
		"\u0000\u0000\u0000\u017f\u0174\u0001\u0000\u0000\u0000\u017f\u0178\u0001"+
		"\u0000\u0000\u0000\u0180\u001f\u0001\u0000\u0000\u0000\u0181\u0182\u0005"+
		"H\u0000\u0000\u0182\u0183\u0005U\u0000\u0000\u0183\u0184\u0005i\u0000"+
		"\u0000\u0184\u01ab\u0005S\u0000\u0000\u0185\u0186\u0005I\u0000\u0000\u0186"+
		"\u0187\u0005U\u0000\u0000\u0187\u0188\u0005P\u0000\u0000\u0188\u0192\u0005"+
		"i\u0000\u0000\u0189\u018d\u0005S\u0000\u0000\u018a\u018c\u0005i\u0000"+
		"\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000"+
		"\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000"+
		"\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000"+
		"\u0000\u0190\u0189\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0005Q\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u01ab\u0005S\u0000\u0000\u0198\u0199\u0005J\u0000\u0000\u0199\u01a6"+
		"\u0005U\u0000\u0000\u019a\u019b\u0005P\u0000\u0000\u019b\u01a0\u0003\""+
		"\u0011\u0000\u019c\u019d\u0005S\u0000\u0000\u019d\u019f\u0003\"\u0011"+
		"\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0005Q\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a7\u0003\"\u0011\u0000\u01a6\u019a\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0005S\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u0181"+
		"\u0001\u0000\u0000\u0000\u01aa\u0185\u0001\u0000\u0000\u0000\u01aa\u0198"+
		"\u0001\u0000\u0000\u0000\u01ab!\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005"+
		"[\u0000\u0000\u01ad\u01ae\u0003F#\u0000\u01ae\u01af\u0005[\u0000\u0000"+
		"\u01af#\u0001\u0000\u0000\u0000\u01b0\u01b6\u0003\u001c\u000e\u0000\u01b1"+
		"\u01b6\u0003\u001e\u000f\u0000\u01b2\u01b6\u0003 \u0010\u0000\u01b3\u01b6"+
		"\u0003\u0018\f\u0000\u01b4\u01b6\u0003\u001a\r\u0000\u01b5\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b1\u0001\u0000\u0000\u0000\u01b5\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6%\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005N\u0000"+
		"\u0000\u01b8\u01b9\u0005L\u0000\u0000\u01b9\'\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0005M\u0000\u0000\u01bb\u01bc\u0005O\u0000\u0000\u01bc)"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bf\u0003,\u0016\u0000\u01be\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01be\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1+\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c6\u0003.\u0017\u0000\u01c3\u01c5\u0003@ \u0000"+
		"\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u00030\u0018\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cd\u00032\u0019\u0000\u01cc\u01c2\u0001\u0000\u0000\u0000\u01cc\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd-\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005"+
		"/\u0000\u0000\u01cf\u01d3\u0005m\u0000\u0000\u01d0\u01d2\u00034\u001a"+
		"\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u00051\u0000\u0000\u01d7/\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0005/\u0000\u0000\u01d9\u01da\u0005]\u0000\u0000\u01da\u01db\u0005"+
		"m\u0000\u0000\u01db\u01dc\u00051\u0000\u0000\u01dc1\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0005/\u0000\u0000\u01de\u01e2\u0005m\u0000\u0000\u01df"+
		"\u01e1\u00034\u001a\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000\u01e4\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005]\u0000\u0000\u01e6\u01e7\u0005"+
		"1\u0000\u0000\u01e73\u0001\u0000\u0000\u0000\u01e8\u01ee\u00036\u001b"+
		"\u0000\u01e9\u01ee\u00038\u001c\u0000\u01ea\u01ee\u0003:\u001d\u0000\u01eb"+
		"\u01ee\u0003<\u001e\u0000\u01ec\u01ee\u0003>\u001f\u0000\u01ed\u01e8\u0001"+
		"\u0000\u0000\u0000\u01ed\u01e9\u0001\u0000\u0000\u0000\u01ed\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ee5\u0001\u0000\u0000\u0000\u01ef\u01f0\u0007\u0001"+
		"\u0000\u0000\u01f0\u01f1\u0005V\u0000\u0000\u01f1\u01f2\u0005i\u0000\u0000"+
		"\u01f27\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005^\u0000\u0000\u01f4\u01f5"+
		"\u0005\u000f\u0000\u0000\u01f5\u01f6\u0005V\u0000\u0000\u01f6\u01f7\u0005"+
		"i\u0000\u0000\u01f79\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005^\u0000"+
		"\u0000\u01f9\u01fa\u0005\u0010\u0000\u0000\u01fa\u01fb\u0005V\u0000\u0000"+
		"\u01fb\u01fc\u0005i\u0000\u0000\u01fc;\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0005P\u0000\u0000\u01fe\u01ff\u0005\u0012\u0000\u0000\u01ff\u0200\u0005"+
		"Q\u0000\u0000\u0200\u0201\u0005V\u0000\u0000\u0201\u0205\u0005i\u0000"+
		"\u0000\u0202\u0204\u00036\u001b\u0000\u0203\u0202\u0001\u0000\u0000\u0000"+
		"\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000"+
		"\u0205\u0206\u0001\u0000\u0000\u0000\u0206=\u0001\u0000\u0000\u0000\u0207"+
		"\u0205\u0001\u0000\u0000\u0000\u0208\u0209\u0005N\u0000\u0000\u0209\u020a"+
		"\u0005\u0013\u0000\u0000\u020a\u020b\u0005O\u0000\u0000\u020b\u020c\u0005"+
		"V\u0000\u0000\u020c\u020d\u0005i\u0000\u0000\u020d?\u0001\u0000\u0000"+
		"\u0000\u020e\u0212\u0005m\u0000\u0000\u020f\u0212\u0003,\u0016\u0000\u0210"+
		"\u0212\u0003B!\u0000\u0211\u020e\u0001\u0000\u0000\u0000\u0211\u020f\u0001"+
		"\u0000\u0000\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0212A\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0005L\u0000\u0000\u0214\u0215\u0005L\u0000\u0000"+
		"\u0215\u0216\u0003D\"\u0000\u0216\u0217\u0005M\u0000\u0000\u0217\u0218"+
		"\u0005M\u0000\u0000\u0218C\u0001\u0000\u0000\u0000\u0219\u0223\u0005m"+
		"\u0000\u0000\u021a\u021f\u0005m\u0000\u0000\u021b\u021c\u0005T\u0000\u0000"+
		"\u021c\u021e\u0005m\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e"+
		"\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0001\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221"+
		"\u021f\u0001\u0000\u0000\u0000\u0222\u0219\u0001\u0000\u0000\u0000\u0222"+
		"\u021a\u0001\u0000\u0000\u0000\u0223E\u0001\u0000\u0000\u0000\u0224\u0226"+
		"\u0005T\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001"+
		"\u0000\u0000\u0000\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0229\u0005"+
		"m\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u0230\u0005L\u0000"+
		"\u0000\u022d\u022f\u0003H$\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022f"+
		"\u0232\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0001\u0000\u0000\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232"+
		"\u0230\u0001\u0000\u0000\u0000\u0233\u0235\u0005M\u0000\u0000\u0234\u0225"+
		"\u0001\u0000\u0000\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234"+
		"\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237G\u0001"+
		"\u0000\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023a\u0005"+
		"m\u0000\u0000\u023a\u023e\u0005U\u0000\u0000\u023b\u023d\u0003J%\u0000"+
		"\u023c\u023b\u0001\u0000\u0000\u0000\u023d\u0240\u0001\u0000\u0000\u0000"+
		"\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000"+
		"\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000"+
		"\u0241\u0242\u0005R\u0000\u0000\u0242I\u0001\u0000\u0000\u0000\u0243\u024c"+
		"\u0005m\u0000\u0000\u0244\u0245\u0005j\u0000\u0000\u0245\u024c\u0005\u0011"+
		"\u0000\u0000\u0246\u0248\u0005j\u0000\u0000\u0247\u0249\u0005`\u0000\u0000"+
		"\u0248\u0247\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000"+
		"\u0249\u024c\u0001\u0000\u0000\u0000\u024a\u024c\u0005n\u0000\u0000\u024b"+
		"\u0243\u0001\u0000\u0000\u0000\u024b\u0244\u0001\u0000\u0000\u0000\u024b"+
		"\u0246\u0001\u0000\u0000\u0000\u024b\u024a\u0001\u0000\u0000\u0000\u024c"+
		"K\u0001\u0000\u0000\u0000\u024d\u024f\u0005\t\u0000\u0000\u024e\u024d"+
		"\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0251"+
		"\u0001\u0000\u0000\u0000\u0250\u0252\u0005$\u0000\u0000\u0251\u0250\u0001"+
		"\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\u0005\n\u0000\u0000\u0254\u0256\u0005m"+
		"\u0000\u0000\u0255\u0257\u0003N\'\u0000\u0256\u0255\u0001\u0000\u0000"+
		"\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0259\u0001\u0000\u0000"+
		"\u0000\u0258\u025a\u0003P(\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u0259"+
		"\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b"+
		"\u025f\u0005L\u0000\u0000\u025c\u025e\u0003R)\u0000\u025d\u025c\u0001"+
		"\u0000\u0000\u0000\u025e\u0261\u0001\u0000\u0000\u0000\u025f\u025d\u0001"+
		"\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0262\u0001"+
		"\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0262\u0263\u0005"+
		"M\u0000\u0000\u0263M\u0001\u0000\u0000\u0000\u0264\u0265\u0005\u000b\u0000"+
		"\u0000\u0265\u0266\u0005m\u0000\u0000\u0266O\u0001\u0000\u0000\u0000\u0267"+
		"\u0268\u0005\f\u0000\u0000\u0268\u026d\u0005m\u0000\u0000\u0269\u026a"+
		"\u0005S\u0000\u0000\u026a\u026c\u0005m\u0000\u0000\u026b\u0269\u0001\u0000"+
		"\u0000\u0000\u026c\u026f\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000"+
		"\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026eQ\u0001\u0000\u0000"+
		"\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0274\u0003T*\u0000\u0271"+
		"\u0274\u0003V+\u0000\u0272\u0274\u0003h4\u0000\u0273\u0270\u0001\u0000"+
		"\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0272\u0001\u0000"+
		"\u0000\u0000\u0274S\u0001\u0000\u0000\u0000\u0275\u0277\u0003\u00a4R\u0000"+
		"\u0276\u0275\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000"+
		"\u0277\u0279\u0001\u0000\u0000\u0000\u0278\u027a\u0005#\u0000\u0000\u0279"+
		"\u0278\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a"+
		"\u027c\u0001\u0000\u0000\u0000\u027b\u027d\u0005\'\u0000\u0000\u027c\u027b"+
		"\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027e"+
		"\u0001\u0000\u0000\u0000\u027e\u0281\u0005m\u0000\u0000\u027f\u0280\u0005"+
		"U\u0000\u0000\u0280\u0282\u0003|>\u0000\u0281\u027f\u0001\u0000\u0000"+
		"\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0284\u0001\u0000\u0000"+
		"\u0000\u0283\u0285\u0003~?\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0001\u0000\u0000\u0000\u0285\u0287\u0001\u0000\u0000\u0000\u0286"+
		"\u0288\u0005R\u0000\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0001\u0000\u0000\u0000\u0288U\u0001\u0000\u0000\u0000\u0289\u028b\u0003"+
		"X,\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000"+
		"\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000"+
		"\u0000\u028d\u0292\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000"+
		"\u0000\u028f\u0291\u0003\u00a4R\u0000\u0290\u028f\u0001\u0000\u0000\u0000"+
		"\u0291\u0294\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000"+
		"\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0297\u0005\"\u0000\u0000\u0296"+
		"\u0295\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297"+
		"\u0299\u0001\u0000\u0000\u0000\u0298\u029a\u0005#\u0000\u0000\u0299\u0298"+
		"\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b"+
		"\u0001\u0000\u0000\u0000\u029b\u029c\u0005m\u0000\u0000\u029c\u029e\u0005"+
		"N\u0000\u0000\u029d\u029f\u0003d2\u0000\u029e\u029d\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a2\u0005O\u0000\u0000\u02a1\u02a3\u0003Z-\u0000\u02a2"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a4\u02a6\u0003\u0080@\u0000\u02a5\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a7\u02ab\u0005L\u0000\u0000\u02a8\u02aa\u0003"+
		"\\.\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000"+
		"\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ae\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ae\u02af\u0005M\u0000\u0000\u02afW\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0005W\u0000\u0000\u02b1\u02b2\u0005m\u0000\u0000\u02b2Y"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005U\u0000\u0000\u02b4\u02b5\u0003"+
		"\u009cN\u0000\u02b5[\u0001\u0000\u0000\u0000\u02b6\u02bd\u0003`0\u0000"+
		"\u02b7\u02bd\u0003r9\u0000\u02b8\u02bd\u0003^/\u0000\u02b9\u02ba\u0003"+
		"\u0098L\u0000\u02ba\u02bb\u0005R\u0000\u0000\u02bb\u02bd\u0001\u0000\u0000"+
		"\u0000\u02bc\u02b6\u0001\u0000\u0000\u0000\u02bc\u02b7\u0001\u0000\u0000"+
		"\u0000\u02bc\u02b8\u0001\u0000\u0000\u0000\u02bc\u02b9\u0001\u0000\u0000"+
		"\u0000\u02bd]\u0001\u0000\u0000\u0000\u02be\u02c0\u0003x<\u0000\u02bf"+
		"\u02c1\u0005R\u0000\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c7\u0001\u0000\u0000\u0000\u02c2\u02c4"+
		"\u0003z=\u0000\u02c3\u02c5\u0005R\u0000\u0000\u02c4\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c7\u0001\u0000"+
		"\u0000\u0000\u02c6\u02be\u0001\u0000\u0000\u0000\u02c6\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c7_\u0001\u0000\u0000\u0000\u02c8\u02ca\u0005\u0016\u0000"+
		"\u0000\u02c9\u02cb\u0003\u00c2a\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000"+
		"\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000"+
		"\u02cc\u02cd\u0005R\u0000\u0000\u02cda\u0001\u0000\u0000\u0000\u02ce\u02cf"+
		"\u0005&\u0000\u0000\u02cf\u02d0\u0005T\u0000\u0000\u02d0\u02d1\u0005%"+
		"\u0000\u0000\u02d1\u02da\u0005N\u0000\u0000\u02d2\u02d7\u0003\u00c2a\u0000"+
		"\u02d3\u02d4\u0005S\u0000\u0000\u02d4\u02d6\u0003\u00c2a\u0000\u02d5\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d9\u0001\u0000\u0000\u0000\u02d7\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02db"+
		"\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02da\u02d2"+
		"\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005O\u0000\u0000\u02dd\u02de\u0005"+
		"R\u0000\u0000\u02dec\u0001\u0000\u0000\u0000\u02df\u02e4\u0003f3\u0000"+
		"\u02e0\u02e1\u0005S\u0000\u0000\u02e1\u02e3\u0003f3\u0000\u02e2\u02e0"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e6\u0001\u0000\u0000\u0000\u02e4\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02f0"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7\u02ec"+
		"\u0005m\u0000\u0000\u02e8\u02e9\u0005S\u0000\u0000\u02e9\u02eb\u0005m"+
		"\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000"+
		"\u0000\u0000\u02ed\u02f0\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ef\u02df\u0001\u0000\u0000\u0000\u02ef\u02e7\u0001\u0000"+
		"\u0000\u0000\u02f0e\u0001\u0000\u0000\u0000\u02f1\u02f3\u0005m\u0000\u0000"+
		"\u02f2\u02f4\u0005X\u0000\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f7\u0005U\u0000\u0000\u02f6\u02f8\u0005!\u0000\u0000\u02f7\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0003\u009cN\u0000\u02fag\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\u0005\u0015\u0000\u0000\u02fc\u02fe\u0005N\u0000\u0000"+
		"\u02fd\u02ff\u0003j5\u0000\u02fe\u02fd\u0001\u0000\u0000\u0000\u02fe\u02ff"+
		"\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0301"+
		"\u0005O\u0000\u0000\u0301\u0305\u0005L\u0000\u0000\u0302\u0304\u0003n"+
		"7\u0000\u0303\u0302\u0001\u0000\u0000\u0000\u0304\u0307\u0001\u0000\u0000"+
		"\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000"+
		"\u0000\u0306\u0308\u0001\u0000\u0000\u0000\u0307\u0305\u0001\u0000\u0000"+
		"\u0000\u0308\u0309\u0005M\u0000\u0000\u0309i\u0001\u0000\u0000\u0000\u030a"+
		"\u030f\u0003l6\u0000\u030b\u030c\u0005S\u0000\u0000\u030c\u030e\u0003"+
		"l6\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030e\u0311\u0001\u0000\u0000"+
		"\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000"+
		"\u0000\u0310k\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000"+
		"\u0312\u0314\u0003\u00a4R\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0313"+
		"\u0314\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315"+
		"\u0316\u0005m\u0000\u0000\u0316\u0317\u0005U\u0000\u0000\u0317\u0318\u0003"+
		"\u009cN\u0000\u0318m\u0001\u0000\u0000\u0000\u0319\u031c\u0003p8\u0000"+
		"\u031a\u031c\u0003r9\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031a"+
		"\u0001\u0000\u0000\u0000\u031co\u0001\u0000\u0000\u0000\u031d\u0320\u0003"+
		"v;\u0000\u031e\u0320\u0003^/\u0000\u031f\u031d\u0001\u0000\u0000\u0000"+
		"\u031f\u031e\u0001\u0000\u0000\u0000\u0320q\u0001\u0000\u0000\u0000\u0321"+
		"\u0328\u0003b1\u0000\u0322\u0328\u0003\u00a6S\u0000\u0323\u0328\u0003"+
		"\u00acV\u0000\u0324\u0328\u0003\u00b6[\u0000\u0325\u0328\u0003\u00be_"+
		"\u0000\u0326\u0328\u0003\u00c0`\u0000\u0327\u0321\u0001\u0000\u0000\u0000"+
		"\u0327\u0322\u0001\u0000\u0000\u0000\u0327\u0323\u0001\u0000\u0000\u0000"+
		"\u0327\u0324\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000\u0000\u0000"+
		"\u0327\u0326\u0001\u0000\u0000\u0000\u0328s\u0001\u0000\u0000\u0000\u0329"+
		"\u032c\u0003x<\u0000\u032a\u032c\u0003z=\u0000\u032b\u0329\u0001\u0000"+
		"\u0000\u0000\u032b\u032a\u0001\u0000\u0000\u0000\u032cu\u0001\u0000\u0000"+
		"\u0000\u032d\u032f\u0003\u00a4R\u0000\u032e\u032d\u0001\u0000\u0000\u0000"+
		"\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0331\u0001\u0000\u0000\u0000"+
		"\u0330\u0332\u0005\'\u0000\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0331"+
		"\u0332\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333"+
		"\u0335\u0005m\u0000\u0000\u0334\u0336\u0003~?\u0000\u0335\u0334\u0001"+
		"\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0337\u0001"+
		"\u0000\u0000\u0000\u0337\u0338\u0005R\u0000\u0000\u0338w\u0001\u0000\u0000"+
		"\u0000\u0339\u033a\u0007\u0002\u0000\u0000\u033a\u033d\u0005m\u0000\u0000"+
		"\u033b\u033c\u0005U\u0000\u0000\u033c\u033e\u0003|>\u0000\u033d\u033b"+
		"\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e\u0340"+
		"\u0001\u0000\u0000\u0000\u033f\u0341\u0003~?\u0000\u0340\u033f\u0001\u0000"+
		"\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000"+
		"\u0000\u0000\u0342\u0343\u0005R\u0000\u0000\u0343y\u0001\u0000\u0000\u0000"+
		"\u0344\u0346\u0003\u0098L\u0000\u0345\u0347\u0003\u0082A\u0000\u0346\u0345"+
		"\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0348"+
		"\u0001\u0000\u0000\u0000\u0348\u0349\u0005R\u0000\u0000\u0349{\u0001\u0000"+
		"\u0000\u0000\u034a\u034f\u0003\u009cN\u0000\u034b\u034c\u0005_\u0000\u0000"+
		"\u034c\u034e\u0003\u009cN\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034e"+
		"\u0351\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u034f"+
		"\u0350\u0001\u0000\u0000\u0000\u0350}\u0001\u0000\u0000\u0000\u0351\u034f"+
		"\u0001\u0000\u0000\u0000\u0352\u0353\u0005V\u0000\u0000\u0353\u0354\u0003"+
		"\u0084B\u0000\u0354\u007f\u0001\u0000\u0000\u0000\u0355\u0356\u0005_\u0000"+
		"\u0000\u0356\u0359\u0005\u0014\u0000\u0000\u0357\u0358\u0005V\u0000\u0000"+
		"\u0358\u035a\u0005\u0014\u0000\u0000\u0359\u0357\u0001\u0000\u0000\u0000"+
		"\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u0081\u0001\u0000\u0000\u0000"+
		"\u035b\u035c\u0007\u0003\u0000\u0000\u035c\u035d\u0003\u0084B\u0000\u035d"+
		"\u0083\u0001\u0000\u0000\u0000\u035e\u035f\u0006B\uffff\uffff\u0000\u035f"+
		"\u0365\u0003\u0086C\u0000\u0360\u0361\u0005O\u0000\u0000\u0361\u0362\u0003"+
		"\u0084B\u0000\u0362\u0363\u0005O\u0000\u0000\u0363\u0365\u0001\u0000\u0000"+
		"\u0000\u0364\u035e\u0001\u0000\u0000\u0000\u0364\u0360\u0001\u0000\u0000"+
		"\u0000\u0365\u0372\u0001\u0000\u0000\u0000\u0366\u0367\n\u0002\u0000\u0000"+
		"\u0367\u0368\u0003\u00c4b\u0000\u0368\u0369\u0003\u0084B\u0003\u0369\u0371"+
		"\u0001\u0000\u0000\u0000\u036a\u036b\n\u0001\u0000\u0000\u036b\u036c\u0005"+
		"X\u0000\u0000\u036c\u036d\u0003\u0084B\u0000\u036d\u036e\u0005U\u0000"+
		"\u0000\u036e\u036f\u0003\u0084B\u0002\u036f\u0371\u0001\u0000\u0000\u0000"+
		"\u0370\u0366\u0001\u0000\u0000\u0000\u0370\u036a\u0001\u0000\u0000\u0000"+
		"\u0371\u0374\u0001\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000\u0000"+
		"\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0085\u0001\u0000\u0000\u0000"+
		"\u0374\u0372\u0001\u0000\u0000\u0000\u0375\u037f\u0003\u0088D\u0000\u0376"+
		"\u037f\u0003\u008aE\u0000\u0377\u037f\u0003\u008eG\u0000\u0378\u037f\u0003"+
		"\u0090H\u0000\u0379\u037f\u0003\u0098L\u0000\u037a\u037f\u0003\u009aM"+
		"\u0000\u037b\u037f\u0003\u0092I\u0000\u037c\u037f\u0003\u0096K\u0000\u037d"+
		"\u037f\u0003\u0094J\u0000\u037e\u0375\u0001\u0000\u0000\u0000\u037e\u0376"+
		"\u0001\u0000\u0000\u0000\u037e\u0377\u0001\u0000\u0000\u0000\u037e\u0378"+
		"\u0001\u0000\u0000\u0000\u037e\u0379\u0001\u0000\u0000\u0000\u037e\u037a"+
		"\u0001\u0000\u0000\u0000\u037e\u037b\u0001\u0000\u0000\u0000\u037e\u037c"+
		"\u0001\u0000\u0000\u0000\u037e\u037d\u0001\u0000\u0000\u0000\u037f\u0087"+
		"\u0001\u0000\u0000\u0000\u0380\u0389\u0005i\u0000\u0000\u0381\u0389\u0005"+
		"j\u0000\u0000\u0382\u0389\u0005k\u0000\u0000\u0383\u0389\u0005<\u0000"+
		"\u0000\u0384\u0389\u0005=\u0000\u0000\u0385\u0389\u0005\u0014\u0000\u0000"+
		"\u0386\u0389\u0005>\u0000\u0000\u0387\u0389\u0005l\u0000\u0000\u0388\u0380"+
		"\u0001\u0000\u0000\u0000\u0388\u0381\u0001\u0000\u0000\u0000\u0388\u0382"+
		"\u0001\u0000\u0000\u0000\u0388\u0383\u0001\u0000\u0000\u0000\u0388\u0384"+
		"\u0001\u0000\u0000\u0000\u0388\u0385\u0001\u0000\u0000\u0000\u0388\u0386"+
		"\u0001\u0000\u0000\u0000\u0388\u0387\u0001\u0000\u0000\u0000\u0389\u0089"+
		"\u0001\u0000\u0000\u0000\u038a\u0393\u0005L\u0000\u0000\u038b\u0390\u0003"+
		"\u008cF\u0000\u038c\u038d\u0005S\u0000\u0000\u038d\u038f\u0003\u008cF"+
		"\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038f\u0392\u0001\u0000\u0000"+
		"\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000"+
		"\u0000\u0391\u0394\u0001\u0000\u0000\u0000\u0392\u0390\u0001\u0000\u0000"+
		"\u0000\u0393\u038b\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000"+
		"\u0000\u0394\u0396\u0001\u0000\u0000\u0000\u0395\u0397\u0005S\u0000\u0000"+
		"\u0396\u0395\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000"+
		"\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u039b\u0005M\u0000\u0000\u0399"+
		"\u039b\u0005m\u0000\u0000\u039a\u038a\u0001\u0000\u0000\u0000\u039a\u0399"+
		"\u0001\u0000\u0000\u0000\u039b\u008b\u0001\u0000\u0000\u0000\u039c\u039f"+
		"\u0005m\u0000\u0000\u039d\u039e\u0005U\u0000\u0000\u039e\u03a0\u0003\u0084"+
		"B\u0000\u039f\u039d\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000"+
		"\u0000\u03a0\u008d\u0001\u0000\u0000\u0000\u03a1\u03ad\u0005P\u0000\u0000"+
		"\u03a2\u03a7\u0003\u0084B\u0000\u03a3\u03a4\u0005S\u0000\u0000\u03a4\u03a6"+
		"\u0003\u0084B\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000\u03a6\u03a9\u0001"+
		"\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001"+
		"\u0000\u0000\u0000\u03a8\u03ab\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001"+
		"\u0000\u0000\u0000\u03aa\u03ac\u0005S\u0000\u0000\u03ab\u03aa\u0001\u0000"+
		"\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ae\u0001\u0000"+
		"\u0000\u0000\u03ad\u03a2\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000"+
		"\u0000\u0000\u03ae\u03af\u0001\u0000\u0000\u0000\u03af\u03b0\u0005Q\u0000"+
		"\u0000\u03b0\u008f\u0001\u0000\u0000\u0000\u03b1\u03b2\u0005m\u0000\u0000"+
		"\u03b2\u03b3\u0005P\u0000\u0000\u03b3\u03b4\u0003\u0084B\u0000\u03b4\u03b5"+
		"\u0005Q\u0000\u0000\u03b5\u0091\u0001\u0000\u0000\u0000\u03b6\u03b7\u0005"+
		"N\u0000\u0000\u03b7\u03b8\u0003d2\u0000\u03b8\u03b9\u0005O\u0000\u0000"+
		"\u03b9\u03ba\u0005Y\u0000\u0000\u03ba\u03bb\u0003\u00c2a\u0000\u03bb\u0093"+
		"\u0001\u0000\u0000\u0000\u03bc\u03bd\u0007\u0004\u0000\u0000\u03bd\u03be"+
		"\u0005m\u0000\u0000\u03be\u0095\u0001\u0000\u0000\u0000\u03bf\u03c0\u0005"+
		"m\u0000\u0000\u03c0\u03c1\u0007\u0004\u0000\u0000\u03c1\u0097\u0001\u0000"+
		"\u0000\u0000\u03c2\u03c5\u0007\u0005\u0000\u0000\u03c3\u03c4\u0005T\u0000"+
		"\u0000\u03c4\u03c6\u0005m\u0000\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000"+
		"\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000"+
		"\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03d9\u0001\u0000\u0000\u0000"+
		"\u03c9\u03ce\u0007\u0005\u0000\u0000\u03ca\u03cb\u0005T\u0000\u0000\u03cb"+
		"\u03cd\u0005m\u0000\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cd\u03d0"+
		"\u0001\u0000\u0000\u0000\u03ce\u03cc\u0001\u0000\u0000\u0000\u03ce\u03cf"+
		"\u0001\u0000\u0000\u0000\u03cf\u03d5\u0001\u0000\u0000\u0000\u03d0\u03ce"+
		"\u0001\u0000\u0000\u0000\u03d1\u03d2\u0005T\u0000\u0000\u03d2\u03d4\u0003"+
		"\u009aM\u0000\u03d3\u03d1\u0001\u0000\u0000\u0000\u03d4\u03d7\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d3\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000"+
		"\u0000\u0000\u03d6\u03d9\u0001\u0000\u0000\u0000\u03d7\u03d5\u0001\u0000"+
		"\u0000\u0000\u03d8\u03c2\u0001\u0000\u0000\u0000\u03d8\u03c9\u0001\u0000"+
		"\u0000\u0000\u03d9\u0099\u0001\u0000\u0000\u0000\u03da\u03db\u0005m\u0000"+
		"\u0000\u03db\u03e4\u0005N\u0000\u0000\u03dc\u03e1\u0003\u00c2a\u0000\u03dd"+
		"\u03de\u0005S\u0000\u0000\u03de\u03e0\u0003\u00c2a\u0000\u03df\u03dd\u0001"+
		"\u0000\u0000\u0000\u03e0\u03e3\u0001\u0000\u0000\u0000\u03e1\u03df\u0001"+
		"\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e5\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e4\u03dc\u0001"+
		"\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001"+
		"\u0000\u0000\u0000\u03e6\u03eb\u0005O\u0000\u0000\u03e7\u03e8\u0005T\u0000"+
		"\u0000\u03e8\u03ea\u0005m\u0000\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000"+
		"\u03ea\u03ed\u0001\u0000\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000"+
		"\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u009b\u0001\u0000\u0000\u0000"+
		"\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ee\u03f3\u0003\u009eO\u0000\u03ef"+
		"\u03f2\u0003\u00a0P\u0000\u03f0\u03f2\u0003\u00a2Q\u0000\u03f1\u03ef\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f5\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001"+
		"\u0000\u0000\u0000\u03f4\u009d\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001"+
		"\u0000\u0000\u0000\u03f6\u0400\u00057\u0000\u0000\u03f7\u0400\u00058\u0000"+
		"\u0000\u03f8\u0400\u00059\u0000\u0000\u03f9\u0400\u0005;\u0000\u0000\u03fa"+
		"\u0400\u0005\u0014\u0000\u0000\u03fb\u0400\u0005>\u0000\u0000\u03fc\u0400"+
		"\u0005?\u0000\u0000\u03fd\u0400\u0005:\u0000\u0000\u03fe\u0400\u0005m"+
		"\u0000\u0000\u03ff\u03f6\u0001\u0000\u0000\u0000\u03ff\u03f7\u0001\u0000"+
		"\u0000\u0000\u03ff\u03f8\u0001\u0000\u0000\u0000\u03ff\u03f9\u0001\u0000"+
		"\u0000\u0000\u03ff\u03fa\u0001\u0000\u0000\u0000\u03ff\u03fb\u0001\u0000"+
		"\u0000\u0000\u03ff\u03fc\u0001\u0000\u0000\u0000\u03ff\u03fd\u0001\u0000"+
		"\u0000\u0000\u03ff\u03fe\u0001\u0000\u0000\u0000\u0400\u009f\u0001\u0000"+
		"\u0000\u0000\u0401\u0402\u0005/\u0000\u0000\u0402\u0407\u0003\u009cN\u0000"+
		"\u0403\u0404\u0005S\u0000\u0000\u0404\u0406\u0003\u009cN\u0000\u0405\u0403"+
		"\u0001\u0000\u0000\u0000\u0406\u0409\u0001\u0000\u0000\u0000\u0407\u0405"+
		"\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u040a"+
		"\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u040a\u040b"+
		"\u00051\u0000\u0000\u040b\u00a1\u0001\u0000\u0000\u0000\u040c\u040d\u0005"+
		"=\u0000\u0000\u040d\u00a3\u0001\u0000\u0000\u0000\u040e\u040f\u0007\u0006"+
		"\u0000\u0000\u040f\u00a5\u0001\u0000\u0000\u0000\u0410\u0411\u0005\u001f"+
		"\u0000\u0000\u0411\u0412\u0005N\u0000\u0000\u0412\u0413\u0003\u00c2a\u0000"+
		"\u0413\u0414\u0005O\u0000\u0000\u0414\u0418\u0003\u00c6c\u0000\u0415\u0417"+
		"\u0003\u00a8T\u0000\u0416\u0415\u0001\u0000\u0000\u0000\u0417\u041a\u0001"+
		"\u0000\u0000\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0418\u0419\u0001"+
		"\u0000\u0000\u0000\u0419\u041c\u0001\u0000\u0000\u0000\u041a\u0418\u0001"+
		"\u0000\u0000\u0000\u041b\u041d\u0003\u00aaU\u0000\u041c\u041b\u0001\u0000"+
		"\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u00a7\u0001\u0000"+
		"\u0000\u0000\u041e\u041f\u0005 \u0000\u0000\u041f\u0420\u0005\u001f\u0000"+
		"\u0000\u0420\u0421\u0005N\u0000\u0000\u0421\u0422\u0003\u00c2a\u0000\u0422"+
		"\u0423\u0005O\u0000\u0000\u0423\u0424\u0003\u00c6c\u0000\u0424\u00a9\u0001"+
		"\u0000\u0000\u0000\u0425\u0426\u0005 \u0000\u0000\u0426\u0427\u0003\u00c6"+
		"c\u0000\u0427\u00ab\u0001\u0000\u0000\u0000\u0428\u0429\u0005\u0017\u0000"+
		"\u0000\u0429\u042a\u0005N\u0000\u0000\u042a\u042b\u0003\u00c2a\u0000\u042b"+
		"\u042c\u0005O\u0000\u0000\u042c\u042e\u0005L\u0000\u0000\u042d\u042f\u0003"+
		"\u00aeW\u0000\u042e\u042d\u0001\u0000\u0000\u0000\u042f\u0430\u0001\u0000"+
		"\u0000\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0430\u0431\u0001\u0000"+
		"\u0000\u0000\u0431\u0433\u0001\u0000\u0000\u0000\u0432\u0434\u0003\u00b0"+
		"X\u0000\u0433\u0432\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000"+
		"\u0000\u0434\u0435\u0001\u0000\u0000\u0000\u0435\u0436\u0005M\u0000\u0000"+
		"\u0436\u00ad\u0001\u0000\u0000\u0000\u0437\u0438\u0005\u001b\u0000\u0000"+
		"\u0438\u0439\u0003\u00b2Y\u0000\u0439\u043d\u0005U\u0000\u0000\u043a\u043c"+
		"\u0003\u00b4Z\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043c\u043f\u0001"+
		"\u0000\u0000\u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043d\u043e\u0001"+
		"\u0000\u0000\u0000\u043e\u0440\u0001\u0000\u0000\u0000\u043f\u043d\u0001"+
		"\u0000\u0000\u0000\u0440\u0442\u0005\u001d\u0000\u0000\u0441\u0443\u0005"+
		"R\u0000\u0000\u0442\u0441\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000"+
		"\u0000\u0000\u0443\u00af\u0001\u0000\u0000\u0000\u0444\u0445\u0005\u001c"+
		"\u0000\u0000\u0445\u0449\u0005U\u0000\u0000\u0446\u0448\u0003\u00b4Z\u0000"+
		"\u0447\u0446\u0001\u0000\u0000\u0000\u0448\u044b\u0001\u0000\u0000\u0000"+
		"\u0449\u0447\u0001\u0000\u0000\u0000\u0449\u044a\u0001\u0000\u0000\u0000"+
		"\u044a\u044c\u0001\u0000\u0000\u0000\u044b\u0449\u0001\u0000\u0000\u0000"+
		"\u044c\u044e\u0005\u001d\u0000\u0000\u044d\u044f\u0005R\u0000\u0000\u044e"+
		"\u044d\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000\u044f"+
		"\u00b1\u0001\u0000\u0000\u0000\u0450\u0451\u0007\u0007\u0000\u0000\u0451"+
		"\u00b3\u0001\u0000\u0000\u0000\u0452\u045d\u0003t:\u0000\u0453\u0454\u0003"+
		"\u009aM\u0000\u0454\u0455\u0005R\u0000\u0000\u0455\u045d\u0001\u0000\u0000"+
		"\u0000\u0456\u045d\u0003\u00a6S\u0000\u0457\u0458\u0003\u0098L\u0000\u0458"+
		"\u0459\u0005R\u0000\u0000\u0459\u045d\u0001\u0000\u0000\u0000\u045a\u045d"+
		"\u0003\u00acV\u0000\u045b\u045d\u0003`0\u0000\u045c\u0452\u0001\u0000"+
		"\u0000\u0000\u045c\u0453\u0001\u0000\u0000\u0000\u045c\u0456\u0001\u0000"+
		"\u0000\u0000\u045c\u0457\u0001\u0000\u0000\u0000\u045c\u045a\u0001\u0000"+
		"\u0000\u0000\u045c\u045b\u0001\u0000\u0000\u0000\u045d\u00b5\u0001\u0000"+
		"\u0000\u0000\u045e\u045f\u0005\u0018\u0000\u0000\u045f\u0461\u0005N\u0000"+
		"\u0000\u0460\u0462\u0003\u00c8d\u0000\u0461\u0460\u0001\u0000\u0000\u0000"+
		"\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0464\u0001\u0000\u0000\u0000"+
		"\u0463\u0465\u0003\u00b8\\\u0000\u0464\u0463\u0001\u0000\u0000\u0000\u0464"+
		"\u0465\u0001\u0000\u0000\u0000\u0465\u0466\u0001\u0000\u0000\u0000\u0466"+
		"\u0468\u0005R\u0000\u0000\u0467\u0469\u0003\u00c2a\u0000\u0468\u0467\u0001"+
		"\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u046a\u0001"+
		"\u0000\u0000\u0000\u046a\u046c\u0005R\u0000\u0000\u046b\u046d\u0003\u00c2"+
		"a\u0000\u046c\u046b\u0001\u0000\u0000\u0000\u046c\u046d\u0001\u0000\u0000"+
		"\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u046f\u0005O\u0000\u0000"+
		"\u046f\u0487\u0003\u00c6c\u0000\u0470\u0471\u0005\u0018\u0000\u0000\u0471"+
		"\u0473\u0005N\u0000\u0000\u0472\u0474\u0003\u00c8d\u0000\u0473\u0472\u0001"+
		"\u0000\u0000\u0000\u0473\u0474\u0001\u0000\u0000\u0000\u0474\u0475\u0001"+
		"\u0000\u0000\u0000\u0475\u0476\u0005m\u0000\u0000\u0476\u0477\u0005,\u0000"+
		"\u0000\u0477\u0478\u0003\u00c2a\u0000\u0478\u0479\u0005O\u0000\u0000\u0479"+
		"\u047a\u0003\u00c6c\u0000\u047a\u0487\u0001\u0000\u0000\u0000\u047b\u047c"+
		"\u0005\u0018\u0000\u0000\u047c\u047e\u0005N\u0000\u0000\u047d\u047f\u0003"+
		"\u00c8d\u0000\u047e\u047d\u0001\u0000\u0000\u0000\u047e\u047f\u0001\u0000"+
		"\u0000\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480\u0481\u0005m\u0000"+
		"\u0000\u0481\u0482\u0005+\u0000\u0000\u0482\u0483\u0003\u00c2a\u0000\u0483"+
		"\u0484\u0005O\u0000\u0000\u0484\u0485\u0003\u00c6c\u0000\u0485\u0487\u0001"+
		"\u0000\u0000\u0000\u0486\u045e\u0001\u0000\u0000\u0000\u0486\u0470\u0001"+
		"\u0000\u0000\u0000\u0486\u047b\u0001\u0000\u0000\u0000\u0487\u00b7\u0001"+
		"\u0000\u0000\u0000\u0488\u048b\u0003\u00ba]\u0000\u0489\u048b\u0003t:"+
		"\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048a\u0489\u0001\u0000\u0000"+
		"\u0000\u048b\u00b9\u0001\u0000\u0000\u0000\u048c\u0491\u0003\u00bc^\u0000"+
		"\u048d\u048e\u0005S\u0000\u0000\u048e\u0490\u0003\u00bc^\u0000\u048f\u048d"+
		"\u0001\u0000\u0000\u0000\u0490\u0493\u0001\u0000\u0000\u0000\u0491\u048f"+
		"\u0001\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000\u0492\u00bb"+
		"\u0001\u0000\u0000\u0000\u0493\u0491\u0001\u0000\u0000\u0000\u0494\u0497"+
		"\u0005m\u0000\u0000\u0495\u0496\u0005U\u0000\u0000\u0496\u0498\u0003\u009c"+
		"N\u0000\u0497\u0495\u0001\u0000\u0000\u0000\u0497\u0498\u0001\u0000\u0000"+
		"\u0000\u0498\u049b\u0001\u0000\u0000\u0000\u0499\u049a\u0005V\u0000\u0000"+
		"\u049a\u049c\u0003\u00c2a\u0000\u049b\u0499\u0001\u0000\u0000\u0000\u049b"+
		"\u049c\u0001\u0000\u0000\u0000\u049c\u00bd\u0001\u0000\u0000\u0000\u049d"+
		"\u049e\u0005\u0019\u0000\u0000\u049e\u049f\u0005N\u0000\u0000\u049f\u04a0"+
		"\u0003\u00c2a\u0000\u04a0\u04a1\u0005O\u0000\u0000\u04a1\u04a2\u0003\u00c6"+
		"c\u0000\u04a2\u00bf\u0001\u0000\u0000\u0000\u04a3\u04a4\u0005\u001a\u0000"+
		"\u0000\u04a4\u04a5\u0003\u00c6c\u0000\u04a5\u04a6\u0005\u0019\u0000\u0000"+
		"\u04a6\u04a7\u0005N\u0000\u0000\u04a7\u04a8\u0003\u00c2a\u0000\u04a8\u04aa"+
		"\u0005O\u0000\u0000\u04a9\u04ab\u0005R\u0000\u0000\u04aa\u04a9\u0001\u0000"+
		"\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u00c1\u0001\u0000"+
		"\u0000\u0000\u04ac\u04ad\u0006a\uffff\uffff\u0000\u04ad\u04ae\u0005N\u0000"+
		"\u0000\u04ae\u04af\u0003\u00c2a\u0000\u04af\u04b0\u0005O\u0000\u0000\u04b0"+
		"\u04b3\u0001\u0000\u0000\u0000\u04b1\u04b3\u0003\u0084B\u0000\u04b2\u04ac"+
		"\u0001\u0000\u0000\u0000\u04b2\u04b1\u0001\u0000\u0000\u0000\u04b3\u04be"+
		"\u0001\u0000\u0000\u0000\u04b4\u04b8\n\u0003\u0000\u0000\u04b5\u04b6\u0003"+
		"\u00c4b\u0000\u04b6\u04b7\u0003\u00c2a\u0000\u04b7\u04b9\u0001\u0000\u0000"+
		"\u0000\u04b8\u04b5\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000"+
		"\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000"+
		"\u0000\u04bb\u04bd\u0001\u0000\u0000\u0000\u04bc\u04b4\u0001\u0000\u0000"+
		"\u0000\u04bd\u04c0\u0001\u0000\u0000\u0000\u04be\u04bc\u0001\u0000\u0000"+
		"\u0000\u04be\u04bf\u0001\u0000\u0000\u0000\u04bf\u00c3\u0001\u0000\u0000"+
		"\u0000\u04c0\u04be\u0001\u0000\u0000\u0000\u04c1\u04c2\u0007\b\u0000\u0000"+
		"\u04c2\u00c5\u0001\u0000\u0000\u0000\u04c3\u04c9\u0005L\u0000\u0000\u04c4"+
		"\u04c8\u0003t:\u0000\u04c5\u04c8\u0003r9\u0000\u04c6\u04c8\u0003`0\u0000"+
		"\u04c7\u04c4\u0001\u0000\u0000\u0000\u04c7\u04c5\u0001\u0000\u0000\u0000"+
		"\u04c7\u04c6\u0001\u0000\u0000\u0000\u04c8\u04cb\u0001\u0000\u0000\u0000"+
		"\u04c9\u04c7\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000"+
		"\u04ca\u04cc\u0001\u0000\u0000\u0000\u04cb\u04c9\u0001\u0000\u0000\u0000"+
		"\u04cc\u04cd\u0005M\u0000\u0000\u04cd\u00c7\u0001\u0000\u0000\u0000\u04ce"+
		"\u04cf\u0007\t\u0000\u0000\u04cf\u00c9\u0001\u0000\u0000\u0000\u0091\u00d0"+
		"\u00d6\u00d8\u00de\u00e5\u00e9\u00f8\u00fc\u0104\u010a\u010e\u0115\u0119"+
		"\u011d\u0125\u0129\u0133\u0140\u0145\u0153\u0169\u016e\u017f\u018d\u0192"+
		"\u01a0\u01a6\u01aa\u01b5\u01c0\u01c6\u01cc\u01d3\u01e2\u01ed\u0205\u0211"+
		"\u021f\u0222\u0225\u022a\u0230\u0236\u023e\u0248\u024b\u024e\u0251\u0256"+
		"\u0259\u025f\u026d\u0273\u0276\u0279\u027c\u0281\u0284\u0287\u028c\u0292"+
		"\u0296\u0299\u029e\u02a2\u02a5\u02ab\u02bc\u02c0\u02c4\u02c6\u02ca\u02d7"+
		"\u02da\u02e4\u02ec\u02ef\u02f3\u02f7\u02fe\u0305\u030f\u0313\u031b\u031f"+
		"\u0327\u032b\u032e\u0331\u0335\u033d\u0340\u0346\u034f\u0359\u0364\u0370"+
		"\u0372\u037e\u0388\u0390\u0393\u0396\u039a\u039f\u03a7\u03ab\u03ad\u03c7"+
		"\u03ce\u03d5\u03d8\u03e1\u03e4\u03eb\u03f1\u03f3\u03ff\u0407\u0418\u041c"+
		"\u0430\u0433\u043d\u0442\u0449\u044e\u045c\u0461\u0464\u0468\u046c\u0473"+
		"\u047e\u0486\u048a\u0491\u0497\u049b\u04aa\u04b2\u04ba\u04be\u04c7\u04c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}