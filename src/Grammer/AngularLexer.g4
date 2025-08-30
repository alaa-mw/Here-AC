lexer grammar AngularLexer;

// Whitespace and Comments
WHITESPACE: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Keywords and Tokens
IMPORT: 'import'; //
FROM: 'from';//
AS: 'as';//
COMPONENT: '@Component';//
INJECTABLE : '@Injectable';//
EXPORT: 'export';//
CLASS: 'class';//
EXTENDS: 'extends';//
IMPLEMENTS: 'implements';//
INTERFACE: 'interface';//
THIS : 'this';//
NG_FOR : 'ngFor' ;//
NG_IF : 'ngIf' ;//
PX : 'px' ;//
IMAGE_SRC : 'src' ;//
CLICK : 'click' ;//
NULL : 'null' ; //
CONSTRUCTOR :'constructor' ;//
RETURN : 'return' ;//
SWITCH : 'switch' ;//
FOR : 'for' ;//
WHILE : 'while';//
DO : 'do' ;//
CASE : 'case' ;//
DEFAULT : 'default' ;//
BREAK : 'break' ;//
CONTINUE : 'continue';//
IF: 'if';//
ELSE: 'else';//
KEYOF : 'keyof' ;//
ASYNC:'async';//
STATIC:'static';//
ABSTRACT:'abstract';//
LOG : 'log' ;//
CONSOLE : 'console' ;//
READONLY: 'readonly';//
//ROUTES: 'Routes';
PATH: 'path';//
CHILDREN: 'children';//
COMPONENT_KW: 'component'; // لتجنب التعارض مع @Component//
LOADCOMPONENT: 'loadComponent';//
THEN: 'then';//
BOOTSTRAP_APP:'bootstrapApplication';//
PROVIDERS:'providers';//
PROVIDE_ROUTER:'provideRouter';//
LET : 'let';//
VAR : 'var';//
CONST: 'const';//
IN: 'in';//
OF: 'of';//
// new added 😎
NEW:'new';//

// Logical Operators
ANDAND: '&&';//
OROR: '||';//

// Comparison Operators
LT: '<';//
LE: '<=';//
GT: '>';//
GE: '>=';//


// Equality Operators
EQEQ: '==';//
NOTEQ: '!=';//
STRICT_E : '===';//
STRICT_NE : '!==';//


// TypeScript Data Types
NUMBER: 'number';//
STRING: 'string';//
BOOLEAN: 'boolean';//
ANY: 'any';//
VOID: 'void';//
BOOL: 'true' | 'false' ;//
LIST :  '[]' ;//
UNDEFINED : 'undefined';//
UNKNOWN : 'unknown';//

//Access Modifiers
PRIVATE : 'private' ;//
PUBLIC  :'public' ;//
PROTECTED :'protected' ;//

//Angular arguments Declaration
//Component
SELECTOR : 'selector' ;//
STANDALONE : 'standalone';//
IMPORTS : 'imports';//
TEMPLATE : 'template';
TEMPLATE_URL : 'templateUrl';//
STYLES_URL : 'styleUrl';//
STYLES_URLS : 'styleUrls';//
STYLES : 'styles';//
PROVIDED_IN : 'providedIn';//service arg //

// Punctuation
OPEN_CURLY_BRACKET: '{';//
CLOSE_CURLY_BRACKET: '}';//
OPEN_BRACKET: '(';//
CLOSE_BRACKET: ')';//
OPEN_SQUARE_BRACKET: '[';//
CLOSE_SQUARE_BRACKET: ']';//
SEMICOLON: ';';//
COMMA: ',';//
DOT: '.';//
DOT_DOT: ':';//
// new added 😎
SPREAD:'...';//
EQ: '=';//
ATT:'@';//
QUESTION:'?';//
ARROW:'=>';//
// new added 😎
HASH: '#';//
TILDE : '~';//

QUOTE: '"';//
SCOPE_QUOTE : '`';//
APOSTROPHE: '\'';//
SLASH : '/' ;//
STAR : '*';//
OR : '|' ;
PERCENTAGE : '%';//
PLUSEQ: '+=';//
MINUSEQ: '-=';//
STAREQ: '*=';//
SLASHEQ: '/=';//

PLUS : '+';//
MINUS : '-';//
PP : '++';//
MM :'--' ;//


// Identifiers and Literals
STRING_LITERAL : '"' .*? '"' | '\'' .*? '\'';//
NUMERIC_LITERAL: [0-9]+ ('.' [0-9]+)?;//
BIGINT_LITERAL: [0-9]+ 'n';//
SYMBOL_LITERAL: 'Symbol' '(' STRING_LITERAL? ')';//
//IDENTIFIER : [a-zA-Z_-][a-zA-Z0-9_-]*;
// new added 😎
IDENTIFIER : [a-zA-Z_-][a-zA-Z0-9_$-]*;//

// new added 😎
COLOR : '#' HEX_DIGIT HEX_DIGIT HEX_DIGIT
         (HEX_DIGIT HEX_DIGIT HEX_DIGIT)? ;//

fragment HEX_DIGIT : [a-fA-F0-9] ;//


// HTML Tokens
//HTML_CLOSE_TAG: '<' '/' IDENTIFIER '>';

