parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

prog
    : tsProg         #TsProgram
    | htmlProg       #HtmlProgram
    | cssProg        #CssProgram
  ;

//////////////////////
// HTML Part
//////////////////////

    htmlProg
        : htmlelement+         #HtmlRoot
        ;

    htmlelement
        : openCloseTag         #HtmlOpenClose
        | selfClosingTag       #HtmlSelfClosing
        ;

    openCloseTag:
        startTag elementContent* endTag
        ;

    startTag
        : OPEN_TAG tagName attribute* CLOSE_TAG
        ;

    endTag
        : OPEN_TAG_SLASH tagName CLOSE_TAG
        ;

    selfClosingTag
        : OPEN_TAG tagName attribute* SELF_CLOSD
        ;

    tagName
        : DIV      #DivTag
        | NAV      #NavTag ////////// new
        | SPAN     #SpanTag
        | P        #PTag
        | A        #ATag
        | BUTTON   #ButtonTag
        | INPUT    #InputTag
        | FORM     #FormTag
        | IMG      #ImgTag
        | INPUTTAG    #Inputtag
        | UL       #UlTag
        | LI       #LiTag
        | H1       #H1Tag
        | H2       #H2Tag
        | H3       #H3Tag
        | H4       #H4Tag
        | H5       #H5Tag
        | H6       #H6Tag
        | IDDEFINER #CustomTag
        ;


    elementContent:
        angularInterpolation   #HtmlInterpolation
        | statment             #HtmlStatement
            | htmlelement          #HtmlNestedElement
        ;

    text: IDDEFINER;

    statment: text+;

    angularInterpolation
        : LCURLY LCURLY angularInterpolationContent? RCURLY RCURLY
        ;

    angularInterpolationContent: expression (PIPE expression)*;

    attribute
        : attributeName ASSIGN attributeValue  #HtmlAttribute
        ;

    attributeName
            : standardAttribute
            | angularBinding
            | angularEvent
            | angularDirective
            | twoWayDataBinding ////new
            ;

    standardAttribute
        : CLASS      #ClassAttr
        | ID        #IdAttr
        | TITLE     #TitleAttr
        | ALT       #AltAttr
        | HREF      #HrefAttr
        | SRC       #SrcAttr
        | DISABLED  #DisabledAttr
        | TYPE      #TypeAttr
        | ROUTER_LINK #LinkAttr ///// new
        | ROUTER_LINK_Active #LinkActiveAttr ///// new
        | NAME      #NameAttr
        | IDDEFINER  #IdDefinerAttr
        ;



    angularBinding
        : LBRACK bindingName RBRACK
        ;

    twoWayDataBinding ///new
        : LBRACK LPAREN NGMODEL RPAREN RBRACK
    ;
    bindingName
        : VALUE      #ValueBinding
        | CHECKED    #CheckedBinding
        | SRC        #SrcBinding
        | HREF       #HrefBinding
        | IDDEFINER  #CustomBinding
        ;

    angularEvent
        : LPAREN eventName RPAREN
        ;

    eventName
        : CLICK      #ClickEvent
        | NG_SUBMIT      #NgSubmitEvent //////////// new
        | CHANGE     #ChangeEvent
        | INPUT      #InputEvent
        | SUBMIT     #SubmitEvent
        | KEYDOWN    #KeyDownEvent
        | KEYUP      #KeyUpEvent
        | IDDEFINER  #CustomEvent
        ;


    angularDirective
        : STAR directiveName
        ;

    directiveName
        : NGIF       #NgIfDirective
        | NGFOR      #NgForDirective
        | NGSWITCH   #NgSwitchDirective
        | IDDEFINER  #IdDefinerDirective
        ;


    attributeValue : STRING;

//////////////////////
// TypeScript Part
//////////////////////

tsProg
    : tsProgContent+  #TsProgramBlock
    | EOF             #TsEmptyProgram
    ;

tsProgContent:
    importStatement        #TsImport
    | classDeclaration     #TsClass
    | functionDeclaration  #TsFunction
    | interfaceDeclaration #TsInterface
    | decorator            #TsDecorator
    | variableDeclarations #TsVariableDecl
;

importStatement
    : IMPORT importContent FROM STRING SEMI
    ;

importContent
    : IDDEFINER         #IdentifierImport
    | namedImportBlock  #BlockImport
    ;

namedImportBlock
    : LCURLY namedImportContent? RCURLY
    ;

namedImportContent: namedImport (COMMA namedImport)* COMMA?;

namedImport
    : COMPONENT     #ComponentImport
    | INJECTABLE    #InjectableImport
    | INPUT         #InputImport
    | ROUTES         #InputRoutes ////////// new
    | IDDEFINER     #IdDefinerImport
    ;


decorator
    : DECORATOR namedImport LPAREN decoratorObject RPAREN
    ;

decoratorObject
    : LCURLY decoratorObjectContent? RCURLY
    ;

decoratorObjectContent: decoratorProperty (COMMA decoratorProperty)* COMMA?;

decoratorPropertyName
    : SELECTOR       #SelectorProperty
    | TEMPLATE_URL   #TemplateUrlProperty
    | IMPORTS        #ImportsProperty
    | STYLE_URL      #StyleUrlProperty
    | STYLE_URLS     #StyleUrlsProperty
    | PROVIDEDIN     #ProvidedInProperty
    ;



decoratorPropertyValue
    : STRING    #StringValues
    | array     #ArrayValue
    ;



decoratorProperty
    : decoratorPropertyName COLON decoratorPropertyValue
    ;
/////2
classDeclaration
    : EXPORT? CLASS className classBody
    ;
//
className: IDDEFINER;

classBody
    : LCURLY classMember* RCURLY
    ;

classMember
    : variableDeclarations   #VariableMember
    | methodDeclaration      #MethodMember
    ;
//
methodName: IDDEFINER;
//8
methodDeclaration
    : methodName LPAREN parameters? RPAREN typeSelector? functionBody
    ;
//
interfaceName: IDDEFINER;
//////////3
interfaceDeclaration
    : EXPORT? INTERFACE interfaceName LCURLY interfaceBody RCURLY
    ;

interfaceBody
    : (interfaceProperty SEMI?)*
    ;
//
interfaceProperty
    : interfacePropertyName typeSelector
    ;

interfacePropertyName: IDDEFINER;



functionDeclaration
    : regularFunctionDeclaration     # RegularFunction
    | arrowFunctionDeclaration       # ArrowFunction
    ;

//
regularFunctionName: IDDEFINER;
/////4
regularFunctionDeclaration:
       FUNCTION regularFunctionName LPAREN parameters? RPAREN typeSelector? functionBody
       ;

arrowFunctionDeclaration
    : LPAREN parameters? RPAREN typeSelector? ARROW arrowFunctionBody
    ;
////////////////////////////
arrowFunctionBody:
    returnStatement
    | functionBody
    ;
//
parameterName: IDDEFINER;

parameters:
    parameter (COMMA parameter)* COMMA?
    ;
/////5
parameter
    : parameterName typeSelector? defaultValue?
    ;

defaultValue: ASSIGN expression;

    functionBody
        : LCURLY statement* RCURLY
        ;

statement
    : variableDeclarations             #VariableDeclarationsStatement
    | expression                       #ExpressionStatement
    | returnStatement                  #ReturnStatement_
    | consoleLog                       #ConsoleLogStatement
    ;

consoleLog
    : consoleLogSplit LPAREN arguments? RPAREN SEMI
    ;

consoleLogSplit: CONSOLE DOT LOG;

returnStatement
    : RETURN expression? SEMI
    ;

arguments
    : expression (COMMA expression)* COMMA?
    ;

variableDeclarations
    :  variableDeclaration      #VariableDeclaration_
        | decoratorBasedInput      #DecoratorInput
    ;
////6
/////////// export
variableDeclaration
    : EXPORT? declarationTypes? variableName typeSelector? (ASSIGN variableValue)? SEMI? ; //////////// EXPORT? new
/////1
decoratorBasedInput
    : DECORATOR INPUT LPAREN RPAREN variableName DEFINITE_ASSIGN typeSelector SEMI?;

declarationTypes:
    CONST                      # ConstDeclaration
    | LET                      # LetDeclaration
    | VAR                      # VarDeclaration
    ;
//
variableName: IDDEFINER;

variableValue
    : expression               # ExpressionValue
    | arrowFunctionDeclaration # ArrowFunctionValue
    ;


array
    : LBRACK arrayContent? RBRACK
    ;

arrayContent: expression (COMMA expression)* COMMA?;

object
    : LCURLY objectContent? RCURLY
    ;

objectContent: objectProperty (COMMA objectProperty)* COMMA?;
/////////7
objectProperty
    : objectPropertyName COLON expression
    ;
//
objectPropertyName: IDDEFINER;

expression
    : primaryExpr arithmaticExpr*;

arithmaticExpr: binaryOperator primaryExpr SEMI?;

primaryExpr
    : literal             # LiteralLabel
    | array               # ArrayLabel
    | object              # ObjectLabel
    | variableReferences  # VariableReferencesLabel
    | functionCall        # FunctionCallLabel
    | memberAccess        # MemberAccessLabel
    | arrayAccess         # ArrayAccessLabel
    ;


literal
    : STRING    # StringLiteralLabel
    | NUMBER    # NumberLiteralLabel
    | BOOL      # BoolLiteralLabel
    | NULL      # NullLiteralLabel
    | UNDEFINED # UndefinedLiteralLabel
    ;

//
variableReferences
    : IDDEFINER
    ;

memberAccess
    : memberAccessElement DOT IDDEFINER
    ;
memberAccessElement
    : IDDEFINER # IdDefinerLabel
    | THIS      # ThisLabel
    ;


arrayAccess
    : IDDEFINER LBRACK expression? RBRACK
    ;

functionCall
    : IDDEFINER LPAREN arguments? RPAREN
    ;

binaryOperator
    : PLUS     # PlusLabel
    | MINUS    # MinusLabel
    | STAR     # StarLabel
    | DIVISION # DivisionLabel
    | PERCENT  # PercentLabel
    | ASSIGN   # AssignLabel
    ;

typeSelector: COLON type;

type
    : arrayBracketType #ArrayBracketTypeLabel
    | baseType         #BaseTypeLabel
    | arrayType        #ArrayTypeLabel
    ;


arrayBracketType
    : baseType (LBRACK RBRACK)+
    ;

arrayType
    : ARRAY OPEN_TAG type CLOSE_TAG
    ;

baseType
    : STRING_TYPE     #StringType
    | NUMBER_TYPE     #NumberType
    | BOOLEAN_TYPE    #BooleanType
    | ANY_TYPE        #AnyType
    | VOID_TYPE        #VoidType
    | ROUTES      #RoutesType /////////// new
    | IDDEFINER       #IdDefinerType
    ;


//////////////////////
// CSS Part
//////////////////////


cssProg : cssStatement+  #CssRoot;

cssStatement
    : ruleSet             #CssRuleSet
    | cssImportStatement  #CssImport
    ;

cssImportStatement
    : CSS_IMPORT cssImportContent SEMI?
    ;

cssImportContent
    : url                 #UrlContent
    | urlStatement        #UrlStatementContent

    ;

url: STRING;

urlStatement
    : CSS_URL LPAREN STRING RPAREN
    ;

ruleSet
    : selectorGroup LCURLY declaration* RCURLY
    ;

selectorGroup
    : selector (COMMA selector)* COMMA?
    ;

selector
    : cssClass    # CssClassSelector
    | cssID       # CssIDSelector
    | STAR        # StarSelector
    | HTML        # HtmlSelector
    | BODY        # BodySelector
    | IDDEFINER   # IdDefinerSelector
    ;


cssClass: DOT IDDEFINER;
cssID: HASH IDDEFINER;

declaration
    : cssProperty COLON cssValue SEMI
    ;

cssProperty
    : COLOR       #ColorProperty
    | BACKGROUND  #BackgroundProperty
    | WIDTH       #WidthProperty
    | HEIGHT      #HeightProperty
    | MARGIN      #MarginProperty
    | PADDING     #PaddingProperty
    | FONTSIZE    #FontSizeProperty
    | DISPLAY     #DisplayProperty
    | POSITION    #PositionProperty
    | BORDER      #BorderProperty
    | BOXSIZING   #BoxSizingProperty
    | IDDEFINER   #IdDefinerProperty
    ;


cssValue:
     values (COMMA values)* COMMA?;

values
    : unitOfMeasurement     # UnitValue
    | CSS_COLOR             # ColorValue
    | STRING                # StringValue
    | IDDEFINER             # IdValue
    ;

unitOfMeasurement: NUMBER CSS_UNIT?;
