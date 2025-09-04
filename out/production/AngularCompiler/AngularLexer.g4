lexer grammar AngularLexer;

WS                : [ \n\t\r]+ -> skip;
LINE_COMMENT      : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT     : '/*' .*? '*/' -> skip;

IMPORT            : 'import';
FROM              : 'from';
EXPORT            : 'export';
ARROW             : '=>';
INTERFACE         : 'interface';
FUNCTION          : 'function' ;
CLASS             : 'class';
IMPLEMENTS                 :'implements'; ////////// NEW
ROUTES            : 'Routes';
SELECTOR          : 'selector';
TEMPLATE_URL      : 'templateUrl';
IMPORTS           : 'imports';
STYLE_URLS        : 'styleUrls';
STYLE_URL         : 'styleUrl';
PROVIDEDIN        : 'providedIn';

CONST             : 'const';
LET               : 'let';
VAR               : 'var';

PUBLIC            : 'public';
PRIVATE           : 'private';
PROTECTED         : 'protected';


ANY_TYPE          : 'any';
STRING_TYPE       : 'string';
NUMBER_TYPE       : 'number';
BOOLEAN_TYPE      : 'boolean';
VOID_TYPE         : 'void';
ARRAY             : 'Array';
UNDEFINED         :'undefined';
RETURN            : 'return';
THIS              : 'this';
CONSOLE           : 'console';
LOG               : 'log';

CSS_IMPORT        : '@import';
CSS_URL           : 'url';
    CSS_COLOR
      : '#' HEX HEX HEX (HEX HEX HEX)? ;

fragment HEX : [0-9a-fA-F] ;
CSS_UNIT          : ('px' | 'em' | 'rem' | '%' | 'vh' | 'vw');


DIV       : 'div';
BODY      : 'body';
NAV       : 'nav';
SPAN      : 'span';
P         : 'p';
A         : 'a';
BUTTON    : 'button';
FORM      : 'form';
IMG       : 'img';
INPUTTAG   : 'input';
UL        : 'ul';
LI        : 'li';
H1        : 'h1';
H2        : 'h2';
H3        : 'h3';
H4        : 'h4';
H5        : 'h5';
H6        : 'h6';


COLOR        : 'color';
BACKGROUND   : 'background';
WIDTH        : 'width';
HEIGHT       : 'height';
MARGIN       : 'margin';
PADDING      : 'padding';
FONTSIZE     : 'font-size';
DISPLAY      : 'display';
POSITION     : 'position';
BORDER       : 'border';
BOXSIZING       : 'box-sizing';


HTML         : 'html';


ALT         : 'alt';
HREF        : 'href';
SRC         : 'src';
DISABLED    : 'disabled';
TYPE        : 'type';
ROUTER_LINK: 'routerLink';
ROUTER_LINK_Active :'routerLinkActive';

VALUE       : 'value';
CHECKED     : 'checked';

CLICK       : 'click';
NG_SUBMIT           :'ngSubmit';
CHANGE      : 'change';
SUBMIT      : 'submit';
KEYDOWN     : 'keydown';
KEYUP       : 'keyup';

NGIF        : 'ngIf';
NGFOR       : 'ngFor';
NGSWITCH    : 'ngSwitch';
NGMODEL:     'ngModel';

ROUTE_COMPONENT         : 'component';
PATH:               'path';


COMPONENT         : 'Component';
INJECTABLE        : 'Injectable';
INPUT             : 'Input';
IDDEFINER         :[a-zA-Z_$][-a-zA-Z0-9_$]*;
NAME        : 'name';
ID          : 'id';
TITLE       : 'title';

OPEN_TAG          : '<';
CLOSE_TAG         : '>';
SELF_CLOSD         :'/>';
OPEN_TAG_SLASH    : '</';

COMMA             : ',';
SEMI              : ';';
COLON             : ':';
DOT               : '.';
HASH              : '#';
LPAREN            : '(';
RPAREN            : ')';
LCURLY            : '{';
RCURLY            : '}';
ASSIGN            : '=';
LBRACK            : '[';
RBRACK            : ']';
DOLLAR            : '$';
PIPE              : '|';

PLUS             : '+';
MINUS            : '-';
STAR             : '*';
DIVISION         : '/';
PERCENT          : '%' ;


LE                : '<=';
GE                : '>=';
EQ                : '==';
NEQ               : '!=';
DEFINITE_ASSIGN   : '!';
PPLUS             : '++';
MMINUS            : '--';
SQ                : '\'';
DQ                : '"';


STRING    : '"' .*? '"' | '\'' .*? '\'';
NUMBER : ('-' | '+')? [0-9]+ ('.' [0-9]+)? ;
BOOL               :'true' | 'false' ;
NULL               :'null';

DECORATOR         : '@';



