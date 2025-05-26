parser grammar AngularParser ;
options { tokenVocab=AngularLexer;}

// Main Entry Point
program: statement EOF;

statement
    : importStatement+
      ( serviceBlock
      | interfaceDeclaration
      | classDeclaration
      | printStatement
      )*
    componentBlock*
    ;

componentBlock : componentDeclaration  classDeclaration+ ;
serviceBlock : serviceDeclaration classDeclaration?;

// 1 ========================= Import Statements =========================
importStatement : IMPORT OPEN_CURLY_BRACKET importItems CLOSE_CURLY_BRACKET FROM STRING_LITERAL SEMICOLON;
importItems : IDENTIFIER (COMMA IDENTIFIER)*;

// 2 ========================= Interface Statements =========================
interfaceDeclaration : EXPORT? INTERFACE IDENTIFIER OPEN_CURLY_BRACKET interfaceBody* CLOSE_CURLY_BRACKET;
    interfaceBody
    : READONLY? IDENTIFIER QUESTION? DOT_DOT dataType SEMICOLON                                                       #PropertyInterface
    | READONLY? IDENTIFIER QUESTION? OPEN_BRACKET parameterList? CLOSE_BRACKET (DOT_DOT | ARROW ) dataType SEMICOLON  #FunctionInterface
    | READONLY? IDENTIFIER QUESTION? DOT_DOT OPEN_BRACKET parameterList CLOSE_BRACKET ARROW dataType  SEMICOLON       #ArrowFunctionInterface
    ;

// 3 =========================  Service Declaration =========================
serviceDeclaration: INJECTABLE OPEN_BRACKET serviceArguments CLOSE_BRACKET;
serviceArguments :  OPEN_CURLY_BRACKET arg(COMMA arg*)* CLOSE_CURLY_BRACKET ;
arg : PROVIDED_IN DOT_DOT STRING_LITERAL;


// 4  ========================= Component Declaration =========================
componentDeclaration
    : COMPONENT openComponent componentArguments* closeComponent
    ;
selectorArg
    : SELECTOR  DOT_DOT STRING_LITERAL  COMMA
    ;
standAloneArg
    : STANDALONE DOT_DOT BOOL  COMMA
    ;
importArg
    : IMPORTS DOT_DOT OPEN_SQUARE_BRACKET (IDENTIFIER COMMA*)* CLOSE_SQUARE_BRACKET COMMA
    ;
templateArg
    :TEMPLATE_URL DOT_DOT STRING_LITERAL COMMA                      #templateUrl
    | TEMPLATE DOT_DOT SCOPE_QUOTE htmlDocument SCOPE_QUOTE COMMA   #template
    ;
styleArg
   :STYLES_URL DOT_DOT STRING_LITERAL COMMA                                                                              #StyleUrl
   |STYLES_URLS DOT_DOT (OPEN_SQUARE_BRACKET STRING_LITERAL (COMMA STRING_LITERAL*)* CLOSE_SQUARE_BRACKET )COMMA         #StyleUrls
   |STYLES DOT_DOT (
                   OPEN_SQUARE_BRACKET inlineStyle (COMMA inlineStyle)* CLOSE_SQUARE_BRACKET
                   | inlineStyle
                   ) COMMA                                                                                               #Styles
   ;
inlineStyle: SCOPE_QUOTE cssDocument SCOPE_QUOTE;

// to be process in semantic or resolve it .
componentArguments
          : importArg
          | templateArg
          | styleArg
          | selectorArg
          | standAloneArg
          ;


openComponent : OPEN_BRACKET OPEN_CURLY_BRACKET ;
closeComponent : CLOSE_CURLY_BRACKET CLOSE_BRACKET ;

// 3.1 ============= HTML
htmlDocument
    : htmlElement+
    ;

//--- HTML elements
htmlElement
    : openTag htmlContentBody* closeTag
    | selfClosingTag;


openTag:LT IDENTIFIER  (htmlAttribute)* GT ;
//closeTag: HTML_CLOSE_TAG;
closeTag: LT SLASH IDENTIFIER GT ;
selfClosingTag: LT IDENTIFIER (htmlAttribute)* SLASH GT;

htmlAttribute
        : basicAttribute
        | ngFor
        | ngIF
        | imageAttribute
        | actionAttribute
        ;

basicAttribute
    : (IDENTIFIER | CLASS ) EQ STRING_LITERAL ;

ngFor : STAR NG_FOR EQ STRING_LITERAL;
ngIF : STAR NG_IF EQ STRING_LITERAL ;
imageAttribute : OPEN_SQUARE_BRACKET IMAGE_SRC CLOSE_SQUARE_BRACKET EQ STRING_LITERAL basicAttribute* ;
actionAttribute : OPEN_BRACKET CLICK CLOSE_BRACKET EQ STRING_LITERAL ;

//--- HTML content body
htmlContentBody
        : IDENTIFIER
        | operation
        | htmlElement
        | objectExpression
        ;

objectExpression : OPEN_CURLY_BRACKET OPEN_CURLY_BRACKET objectExpressionValue CLOSE_CURLY_BRACKET CLOSE_CURLY_BRACKET ;
objectExpressionValue
    : IDENTIFIER
    | IDENTIFIER (DOT IDENTIFIER)*
    ;


// 3.2 ========== CSS
cssDocument :  ( DOT? IDENTIFIER+ OPEN_CURLY_BRACKET cssRule* CLOSE_CURLY_BRACKET )* ;
cssRule : IDENTIFIER DOT_DOT (ruleValue)* SEMICOLON;

ruleValue : IDENTIFIER
          | NUMERIC_LITERAL PX
          | NUMERIC_LITERAL PERCENTAGE?
          | COLOR
          ;


// 5 ========================= Class Declaration =========================
classDeclaration:  EXPORT? ABSTRACT? CLASS IDENTIFIER classHeritage? classImplement? OPEN_CURLY_BRACKET classBody* CLOSE_CURLY_BRACKET;
classHeritage: EXTENDS IDENTIFIER ;
classImplement : IMPLEMENTS IDENTIFIER (COMMA IDENTIFIER)* ;

classBody
    : classPropertyDeclaration
    | methodDeclaration
    | constructorDeclaration
    ;

classPropertyDeclaration
    : accessModifiers? STATIC? READONLY? IDENTIFIER (DOT_DOT assignDataType)?  assigment SEMICOLON?
    ;

// 5.1 ------------- MethodsDeclaration
methodDeclaration
           : decorator* accessModifiers* ASYNC? STATIC? IDENTIFIER  OPEN_BRACKET (parameterList)? CLOSE_BRACKET (returnType)? assigmentToNull? OPEN_CURLY_BRACKET (methodBody)* CLOSE_CURLY_BRACKET ;
decorator  : ATT IDENTIFIER ;
returnType : DOT_DOT dataType
           ;

methodBody
    : returnStatement
    | commonStatement
    | methodBodyProperty
    | (propertyCall SEMICOLON)
    ;

methodBodyProperty
    : localVariableDeclaration SEMICOLON?
    | propertyAssignment SEMICOLON?
    ;
    // here

// ======================= common rules ============================

returnStatement : RETURN expression? SEMICOLON ;

printStatement : CONSOLE DOT LOG OPEN_BRACKET (expression (COMMA expression)*)? CLOSE_BRACKET SEMICOLON;

parameterList: parameter (COMMA parameter)*
             | IDENTIFIER (COMMA IDENTIFIER)*
             ;
parameter: IDENTIFIER QUESTION? DOT_DOT KEYOF? dataType;

// 5.2 -------------  ConstructorDeclaration
constructorDeclaration
    : CONSTRUCTOR OPEN_BRACKET constructorParams?  CLOSE_BRACKET OPEN_CURLY_BRACKET constructorBody* CLOSE_CURLY_BRACKET
    ;
constructorParams
    : constructorParam (COMMA constructorParam)*
    ;
constructorParam
    : accessModifiers? IDENTIFIER DOT_DOT dataType
    ;


constructorBody
    : constructorBodyProperty
    | commonStatement
    ;
constructorBodyProperty
    : parameterPropertyAssignment
    | methodBodyProperty  // Inherits all method statement types
//    | superCall
    ;
    //superCall
    //    : SUPER OPEN_BRACKET argumentList? CLOSE_BRACKET SEMICOLON?
    //    ;

// --- these statement use in many places ( func , constructor, block)
commonStatement
    : printStatement
    | conditionalStatement
    | switchStatement
    | forStatement
    | whileStatement
    | doWhileStatement
    ;

//  -------------  propertyDeclarationRules --start

blockProperty
    : localVariableDeclaration
    | propertyAssignment
    ;
parameterPropertyAssignment
    : accessModifiers? READONLY? IDENTIFIER (assigment)? SEMICOLON
    ;

localVariableDeclaration
    : (LET | CONST) IDENTIFIER (DOT_DOT assignDataType)? assigment? SEMICOLON
    ;
propertyAssignment
    :  propertyCall compoundAssignment?  SEMICOLON
    ;

assignDataType : dataType (OR dataType)*;
assigment :  EQ propertyValue ;
assigmentToNull :  OR NULL (EQ NULL)? ;
compoundAssignment
    : (PLUSEQ
    | MINUSEQ
    | STAREQ
    | SLASHEQ
    | EQ ) propertyValue
    ;


propertyValue
    :propertyValueObjects                                           #PropertyValueObjectExpr
    |CLOSE_BRACKET propertyValue CLOSE_BRACKET                      #BracketedPropertyValueExpr
    | propertyValue operation propertyValue                         #BinaryOperationPropertyValueExpr
    | propertyValue QUESTION propertyValue DOT_DOT propertyValue    #ShortIfExpr
    ;

propertyValueObjects
            : literalValue
            | objectValue
            | list
            | indexAccessValue
            | propertyCall
            | methodCall
            | arrowFunction
            | postFix
            | preFix
            ;

/* Primitive Literals */
literalValue
    : STRING_LITERAL                            # LiteralExpr
    | NUMERIC_LITERAL                           # LiteralExpr
    | BIGINT_LITERAL                            # LiteralExpr
    | BOOL                                      # ValueExpr
    | LIST                                      # ValueExpr
    | NULL                                      # ValueExpr
    | UNDEFINED                                 # ValueExpr
    | SYMBOL_LITERAL                            # SymbolExpr
    ;


objectValue
    : OPEN_CURLY_BRACKET (objectProperty (COMMA objectProperty)* )? COMMA? CLOSE_CURLY_BRACKET
    | IDENTIFIER
    ;
objectProperty
    : IDENTIFIER (DOT_DOT propertyValue)?
    ;
list
    :  OPEN_SQUARE_BRACKET (propertyValue (COMMA propertyValue)* COMMA? )? CLOSE_SQUARE_BRACKET
    ;
indexAccessValue
    : IDENTIFIER OPEN_SQUARE_BRACKET propertyValue CLOSE_SQUARE_BRACKET
    ;
arrowFunction
    : OPEN_BRACKET parameterList CLOSE_BRACKET ARROW expression
    ;
preFix
    : ( PP |  MM ) IDENTIFIER
    ;
postFix
    : IDENTIFIER  ( PP |  MM )
    ;

propertyCall
    : (THIS | IDENTIFIER) (DOT IDENTIFIER)+                         #SimplePropertyCall
    | (THIS | IDENTIFIER) (DOT IDENTIFIER)* (DOT methodCall)*       #PropertyWithMethodCall
    ;


methodCall
    : IDENTIFIER OPEN_BRACKET  (expression (COMMA expression)*)? CLOSE_BRACKET (DOT IDENTIFIER)*
    ;

dataType
    : type (typeArguments | listSuffix)*
    ;

type
    : NUMBER        #PrimitiveType
    | STRING        #PrimitiveType
    | BOOLEAN       #PrimitiveType
    | VOID          #PrimitiveType
    | NULL          #PrimitiveType
    | UNDEFINED     #PrimitiveType
    | UNKNOWN       #PrimitiveType
    | ANY           #PrimitiveType
    | IDENTIFIER    #ClassType
    ;

typeArguments
    : LT dataType (COMMA dataType)* GT
    ;

listSuffix
    : LIST
    ;


accessModifiers
    : PRIVATE
    | PUBLIC
    | PROTECTED
    ;

//  -------------  propertyDeclarationRules --end

//  ---------- statements for func, constructor
//  --- condition statement
conditionalStatement
    : IF OPEN_BRACKET expression CLOSE_BRACKET block (elseIfStatement)* (elseStatement)?
    ;

elseIfStatement
    : ELSE IF OPEN_BRACKET expression CLOSE_BRACKET block
    ;

elseStatement
    : ELSE block
    ;

//  ---  switch statement
switchStatement
    : SWITCH OPEN_BRACKET expression CLOSE_BRACKET OPEN_CURLY_BRACKET caseBlock+ defaultBlock? CLOSE_CURLY_BRACKET
    ;

caseBlock
    : CASE caseValue DOT_DOT (caseStatement)* BREAK SEMICOLON?
    ;

defaultBlock
    : DEFAULT DOT_DOT (caseStatement)* BREAK SEMICOLON?
    ;

caseValue
    : STRING_LITERAL
    | NUMERIC_LITERAL
    | IDENTIFIER
    ;

caseStatement
    : blockProperty
    | methodCall SEMICOLON
    | returnStatement
    | conditionalStatement
    | propertyCall SEMICOLON
    | switchStatement
    ;

//  ---  for statement
forStatement
    : FOR OPEN_BRACKET (declareVarsKeyword)? forInitializer? SEMICOLON expression? SEMICOLON expression? CLOSE_BRACKET block  # TraditionalFor
    | FOR OPEN_BRACKET (declareVarsKeyword)? IDENTIFIER OF expression CLOSE_BRACKET block                                     # ForOfLoop
    | FOR OPEN_BRACKET (declareVarsKeyword)? IDENTIFIER IN expression CLOSE_BRACKET block                                     # ForInLoop
    ;

forInitializer
    : variableDeclarationList
    | blockProperty
    ;

variableDeclarationList
    : variableDeclaration (COMMA variableDeclaration)*
    ;

variableDeclaration
    : IDENTIFIER (DOT_DOT dataType)? (EQ expression)?
    ;

//  ---  while Statement
whileStatement
    : WHILE OPEN_BRACKET expression CLOSE_BRACKET block
    ;

//  ---  Do-While Statement
doWhileStatement
    : DO block WHILE OPEN_BRACKET expression CLOSE_BRACKET SEMICOLON?
    ;

// --- expression
expression
        : expression (operation expression)+        #BinaryExpression
        | OPEN_BRACKET expression CLOSE_BRACKET     #ParentExpression
        | propertyValue                             #LiteralOrReferenceExpression
        ;

operation
    : ANDAND
    | OROR
    | LT
    | LE
    | GT
    | GE
    | EQEQ
    | NOTEQ
    | PLUS
    | STRICT_NE
    | STRICT_E
    | MINUS
    | STAR
    | SLASH
    ;

block
    : OPEN_CURLY_BRACKET (blockProperty | commonStatement |returnStatement )* CLOSE_CURLY_BRACKET
    ;

declareVarsKeyword: VAR | LET | CONST ;