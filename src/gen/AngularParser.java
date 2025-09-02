// Generated from C:/Users/LONOVO/Desktop/AngularCompiler/AngularCompiler/src/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LINE_COMMENT=2, BLOCK_COMMENT=3, IMPORT=4, FROM=5, EXPORT=6, ARROW=7, 
		INTERFACE=8, FUNCTION=9, CLASS=10, ROUTES=11, SELECTOR=12, TEMPLATE_URL=13, 
		IMPORTS=14, STYLE_URLS=15, STYLE_URL=16, PROVIDEDIN=17, CONST=18, LET=19, 
		VAR=20, PUBLIC=21, PRIVATE=22, PROTECTED=23, ANY_TYPE=24, STRING_TYPE=25, 
		NUMBER_TYPE=26, BOOLEAN_TYPE=27, VOID_TYPE=28, ARRAY=29, UNDEFINED=30, 
		RETURN=31, THIS=32, CONSOLE=33, LOG=34, CSS_IMPORT=35, CSS_URL=36, CSS_COLOR=37, 
		CSS_UNIT=38, DIV=39, BODY=40, NAV=41, SPAN=42, P=43, A=44, BUTTON=45, 
		FORM=46, IMG=47, INPUTTAG=48, UL=49, LI=50, H1=51, H2=52, H3=53, H4=54, 
		H5=55, H6=56, COLOR=57, BACKGROUND=58, WIDTH=59, HEIGHT=60, MARGIN=61, 
		PADDING=62, FONTSIZE=63, DISPLAY=64, POSITION=65, BORDER=66, BOXSIZING=67, 
		HTML=68, ALT=69, HREF=70, SRC=71, DISABLED=72, TYPE=73, ROUTER_LINK=74, 
		ROUTER_LINK_Active=75, VALUE=76, CHECKED=77, CLICK=78, NG_SUBMIT=79, CHANGE=80, 
		SUBMIT=81, KEYDOWN=82, KEYUP=83, NGIF=84, NGFOR=85, NGSWITCH=86, NGMODEL=87, 
		ROUTE_COMPONENT=88, PATH=89, COMPONENT=90, INJECTABLE=91, INPUT=92, IDDEFINER=93, 
		NAME=94, ID=95, TITLE=96, OPEN_TAG=97, CLOSE_TAG=98, SELF_CLOSD=99, OPEN_TAG_SLASH=100, 
		COMMA=101, SEMI=102, COLON=103, DOT=104, HASH=105, LPAREN=106, RPAREN=107, 
		LCURLY=108, RCURLY=109, ASSIGN=110, LBRACK=111, RBRACK=112, DOLLAR=113, 
		PIPE=114, PLUS=115, MINUS=116, STAR=117, DIVISION=118, PERCENT=119, LE=120, 
		GE=121, EQ=122, NEQ=123, DEFINITE_ASSIGN=124, PPLUS=125, MMINUS=126, SQ=127, 
		DQ=128, STRING=129, NUMBER=130, BOOL=131, NULL=132, DECORATOR=133;
	public static final int
		RULE_prog = 0, RULE_htmlProg = 1, RULE_htmlelement = 2, RULE_openCloseTag = 3, 
		RULE_startTag = 4, RULE_endTag = 5, RULE_selfClosingTag = 6, RULE_tagName = 7, 
		RULE_elementContent = 8, RULE_text = 9, RULE_statment = 10, RULE_angularInterpolation = 11, 
		RULE_angularInterpolationContent = 12, RULE_attribute = 13, RULE_attributeName = 14, 
		RULE_standardAttribute = 15, RULE_angularBinding = 16, RULE_twoWayDataBinding = 17, 
		RULE_bindingName = 18, RULE_angularEvent = 19, RULE_eventName = 20, RULE_angularDirective = 21, 
		RULE_directiveName = 22, RULE_attributeValue = 23, RULE_tsProg = 24, RULE_tsProgContent = 25, 
		RULE_importStatement = 26, RULE_importContent = 27, RULE_namedImportBlock = 28, 
		RULE_namedImportContent = 29, RULE_namedImport = 30, RULE_decorator = 31, 
		RULE_decoratorObject = 32, RULE_decoratorObjectContent = 33, RULE_decoratorPropertyName = 34, 
		RULE_decoratorPropertyValue = 35, RULE_decoratorProperty = 36, RULE_routerDeclaration = 37, 
		RULE_routerName = 38, RULE_routers = 39, RULE_routerArrayContent = 40, 
		RULE_routerPropertyName = 41, RULE_routerPropertyValue = 42, RULE_routerProperty = 43, 
		RULE_classDeclaration = 44, RULE_className = 45, RULE_classBody = 46, 
		RULE_classMember = 47, RULE_methodName = 48, RULE_methodDeclaration = 49, 
		RULE_interfaceName = 50, RULE_interfaceDeclaration = 51, RULE_interfaceBody = 52, 
		RULE_interfaceProperty = 53, RULE_interfacePropertyName = 54, RULE_functionDeclaration = 55, 
		RULE_regularFunctionName = 56, RULE_regularFunctionDeclaration = 57, RULE_arrowFunctionDeclaration = 58, 
		RULE_arrowFunctionBody = 59, RULE_parameterName = 60, RULE_parameters = 61, 
		RULE_parameter = 62, RULE_defaultValue = 63, RULE_functionBody = 64, RULE_statement = 65, 
		RULE_consoleLog = 66, RULE_consoleLogSplit = 67, RULE_returnStatement = 68, 
		RULE_arguments = 69, RULE_variableDeclarations = 70, RULE_variableDeclaration = 71, 
		RULE_decoratorBasedInput = 72, RULE_declarationTypes = 73, RULE_variableName = 74, 
		RULE_variableValue = 75, RULE_array = 76, RULE_arrayContent = 77, RULE_object = 78, 
		RULE_objectContent = 79, RULE_objectProperty = 80, RULE_objectPropertyName = 81, 
		RULE_expression = 82, RULE_arithmaticExpr = 83, RULE_primaryExpr = 84, 
		RULE_literal = 85, RULE_variableReferences = 86, RULE_memberAccess = 87, 
		RULE_memberAccessElement = 88, RULE_arrayAccess = 89, RULE_functionCall = 90, 
		RULE_binaryOperator = 91, RULE_typeSelector = 92, RULE_type = 93, RULE_arrayBracketType = 94, 
		RULE_arrayType = 95, RULE_baseType = 96, RULE_cssProg = 97, RULE_cssStatement = 98, 
		RULE_cssImportStatement = 99, RULE_cssImportContent = 100, RULE_url = 101, 
		RULE_urlStatement = 102, RULE_ruleSet = 103, RULE_selectorGroup = 104, 
		RULE_selector = 105, RULE_cssClass = 106, RULE_cssID = 107, RULE_declaration = 108, 
		RULE_cssProperty = 109, RULE_cssValue = 110, RULE_values = 111, RULE_unitOfMeasurement = 112;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "htmlProg", "htmlelement", "openCloseTag", "startTag", "endTag", 
			"selfClosingTag", "tagName", "elementContent", "text", "statment", "angularInterpolation", 
			"angularInterpolationContent", "attribute", "attributeName", "standardAttribute", 
			"angularBinding", "twoWayDataBinding", "bindingName", "angularEvent", 
			"eventName", "angularDirective", "directiveName", "attributeValue", "tsProg", 
			"tsProgContent", "importStatement", "importContent", "namedImportBlock", 
			"namedImportContent", "namedImport", "decorator", "decoratorObject", 
			"decoratorObjectContent", "decoratorPropertyName", "decoratorPropertyValue", 
			"decoratorProperty", "routerDeclaration", "routerName", "routers", "routerArrayContent", 
			"routerPropertyName", "routerPropertyValue", "routerProperty", "classDeclaration", 
			"className", "classBody", "classMember", "methodName", "methodDeclaration", 
			"interfaceName", "interfaceDeclaration", "interfaceBody", "interfaceProperty", 
			"interfacePropertyName", "functionDeclaration", "regularFunctionName", 
			"regularFunctionDeclaration", "arrowFunctionDeclaration", "arrowFunctionBody", 
			"parameterName", "parameters", "parameter", "defaultValue", "functionBody", 
			"statement", "consoleLog", "consoleLogSplit", "returnStatement", "arguments", 
			"variableDeclarations", "variableDeclaration", "decoratorBasedInput", 
			"declarationTypes", "variableName", "variableValue", "array", "arrayContent", 
			"object", "objectContent", "objectProperty", "objectPropertyName", "expression", 
			"arithmaticExpr", "primaryExpr", "literal", "variableReferences", "memberAccess", 
			"memberAccessElement", "arrayAccess", "functionCall", "binaryOperator", 
			"typeSelector", "type", "arrayBracketType", "arrayType", "baseType", 
			"cssProg", "cssStatement", "cssImportStatement", "cssImportContent", 
			"url", "urlStatement", "ruleSet", "selectorGroup", "selector", "cssClass", 
			"cssID", "declaration", "cssProperty", "cssValue", "values", "unitOfMeasurement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'import'", "'from'", "'export'", "'=>'", "'interface'", 
			"'function'", "'class'", "'Routes'", "'selector'", "'templateUrl'", "'imports'", 
			"'styleUrls'", "'styleUrl'", "'providedIn'", "'const'", "'let'", "'var'", 
			"'public'", "'private'", "'protected'", "'any'", "'string'", "'number'", 
			"'boolean'", "'void'", "'Array'", "'undefined'", "'return'", "'this'", 
			"'console'", "'log'", "'@import'", "'url'", null, null, "'div'", "'body'", 
			"'nav'", "'span'", "'p'", "'a'", "'button'", "'form'", "'img'", "'input'", 
			"'ul'", "'li'", "'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'h6'", "'color'", 
			"'background'", "'width'", "'height'", "'margin'", "'padding'", "'font-size'", 
			"'display'", "'position'", "'border'", "'box-sizing'", "'html'", "'alt'", 
			"'href'", "'src'", "'disabled'", "'type'", "'routerLink'", "'routerLinkActive'", 
			"'value'", "'checked'", "'click'", "'ngSubmit'", "'change'", "'submit'", 
			"'keydown'", "'keyup'", "'ngIf'", "'ngFor'", "'ngSwitch'", "'ngModel'", 
			"'component'", "'path'", "'Component'", "'Injectable'", "'Input'", null, 
			"'name'", "'id'", "'title'", "'<'", "'>'", "'/>'", "'</'", "','", "';'", 
			"':'", "'.'", "'#'", "'('", "')'", "'{'", "'}'", "'='", "'['", "']'", 
			"'$'", "'|'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<='", "'>='", "'=='", 
			"'!='", "'!'", "'++'", "'--'", "'''", "'\"'", null, null, null, "'null'", 
			"'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_COMMENT", "BLOCK_COMMENT", "IMPORT", "FROM", "EXPORT", 
			"ARROW", "INTERFACE", "FUNCTION", "CLASS", "ROUTES", "SELECTOR", "TEMPLATE_URL", 
			"IMPORTS", "STYLE_URLS", "STYLE_URL", "PROVIDEDIN", "CONST", "LET", "VAR", 
			"PUBLIC", "PRIVATE", "PROTECTED", "ANY_TYPE", "STRING_TYPE", "NUMBER_TYPE", 
			"BOOLEAN_TYPE", "VOID_TYPE", "ARRAY", "UNDEFINED", "RETURN", "THIS", 
			"CONSOLE", "LOG", "CSS_IMPORT", "CSS_URL", "CSS_COLOR", "CSS_UNIT", "DIV", 
			"BODY", "NAV", "SPAN", "P", "A", "BUTTON", "FORM", "IMG", "INPUTTAG", 
			"UL", "LI", "H1", "H2", "H3", "H4", "H5", "H6", "COLOR", "BACKGROUND", 
			"WIDTH", "HEIGHT", "MARGIN", "PADDING", "FONTSIZE", "DISPLAY", "POSITION", 
			"BORDER", "BOXSIZING", "HTML", "ALT", "HREF", "SRC", "DISABLED", "TYPE", 
			"ROUTER_LINK", "ROUTER_LINK_Active", "VALUE", "CHECKED", "CLICK", "NG_SUBMIT", 
			"CHANGE", "SUBMIT", "KEYDOWN", "KEYUP", "NGIF", "NGFOR", "NGSWITCH", 
			"NGMODEL", "ROUTE_COMPONENT", "PATH", "COMPONENT", "INJECTABLE", "INPUT", 
			"IDDEFINER", "NAME", "ID", "TITLE", "OPEN_TAG", "CLOSE_TAG", "SELF_CLOSD", 
			"OPEN_TAG_SLASH", "COMMA", "SEMI", "COLON", "DOT", "HASH", "LPAREN", 
			"RPAREN", "LCURLY", "RCURLY", "ASSIGN", "LBRACK", "RBRACK", "DOLLAR", 
			"PIPE", "PLUS", "MINUS", "STAR", "DIVISION", "PERCENT", "LE", "GE", "EQ", 
			"NEQ", "DEFINITE_ASSIGN", "PPLUS", "MMINUS", "SQ", "DQ", "STRING", "NUMBER", 
			"BOOL", "NULL", "DECORATOR"
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssProgramContext extends ProgContext {
		public CssProgContext cssProg() {
			return getRuleContext(CssProgContext.class,0);
		}
		public CssProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssProgram(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsProgramContext extends ProgContext {
		public TsProgContext tsProg() {
			return getRuleContext(TsProgContext.class,0);
		}
		public TsProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsProgram(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlProgramContext extends ProgContext {
		public HtmlProgContext htmlProg() {
			return getRuleContext(HtmlProgContext.class,0);
		}
		public HtmlProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new TsProgramContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				tsProg();
				}
				break;
			case 2:
				_localctx = new HtmlProgramContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				htmlProg();
				}
				break;
			case 3:
				_localctx = new CssProgramContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				cssProg();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlProgContext extends ParserRuleContext {
		public HtmlProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlProg; }
	 
		public HtmlProgContext() { }
		public void copyFrom(HtmlProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlRootContext extends HtmlProgContext {
		public List<HtmlelementContext> htmlelement() {
			return getRuleContexts(HtmlelementContext.class);
		}
		public HtmlelementContext htmlelement(int i) {
			return getRuleContext(HtmlelementContext.class,i);
		}
		public HtmlRootContext(HtmlProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlProgContext htmlProg() throws RecognitionException {
		HtmlProgContext _localctx = new HtmlProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlProg);
		int _la;
		try {
			_localctx = new HtmlRootContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				htmlelement();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_TAG );
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlelementContext extends ParserRuleContext {
		public HtmlelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlelement; }
	 
		public HtmlelementContext() { }
		public void copyFrom(HtmlelementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOpenCloseContext extends HtmlelementContext {
		public OpenCloseTagContext openCloseTag() {
			return getRuleContext(OpenCloseTagContext.class,0);
		}
		public HtmlOpenCloseContext(HtmlelementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlOpenClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlOpenClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlOpenClose(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfClosingContext extends HtmlelementContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public HtmlSelfClosingContext(HtmlelementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlelementContext htmlelement() throws RecognitionException {
		HtmlelementContext _localctx = new HtmlelementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlelement);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new HtmlOpenCloseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				openCloseTag();
				}
				break;
			case 2:
				_localctx = new HtmlSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenCloseTagContext extends ParserRuleContext {
		public StartTagContext startTag() {
			return getRuleContext(StartTagContext.class,0);
		}
		public EndTagContext endTag() {
			return getRuleContext(EndTagContext.class,0);
		}
		public List<ElementContentContext> elementContent() {
			return getRuleContexts(ElementContentContext.class);
		}
		public ElementContentContext elementContent(int i) {
			return getRuleContext(ElementContentContext.class,i);
		}
		public OpenCloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openCloseTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpenCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpenCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpenCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenCloseTagContext openCloseTag() throws RecognitionException {
		OpenCloseTagContext _localctx = new OpenCloseTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_openCloseTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			startTag();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 32785L) != 0)) {
				{
				{
				setState(241);
				elementContent();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			endTag();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(AngularParser.OPEN_TAG, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode CLOSE_TAG() { return getToken(AngularParser.CLOSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public StartTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStartTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStartTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStartTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartTagContext startTag() throws RecognitionException {
		StartTagContext _localctx = new StartTagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_startTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(OPEN_TAG);
			setState(250);
			tagName();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 286010713833599L) != 0)) {
				{
				{
				setState(251);
				attribute();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(CLOSE_TAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG_SLASH() { return getToken(AngularParser.OPEN_TAG_SLASH, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode CLOSE_TAG() { return getToken(AngularParser.CLOSE_TAG, 0); }
		public EndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndTagContext endTag() throws RecognitionException {
		EndTagContext _localctx = new EndTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(OPEN_TAG_SLASH);
			setState(260);
			tagName();
			setState(261);
			match(CLOSE_TAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(AngularParser.OPEN_TAG, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode SELF_CLOSD() { return getToken(AngularParser.SELF_CLOSD, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
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
		enterRule(_localctx, 12, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(OPEN_TAG);
			setState(264);
			tagName();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 286010713833599L) != 0)) {
				{
				{
				setState(265);
				attribute();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(SELF_CLOSD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
	 
		public TagNameContext() { }
		public void copyFrom(TagNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H3TagContext extends TagNameContext {
		public TerminalNode H3() { return getToken(AngularParser.H3, 0); }
		public H3TagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterH3Tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitH3Tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitH3Tag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivTagContext extends TagNameContext {
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public DivTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDivTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDivTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDivTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormTagContext extends TagNameContext {
		public TerminalNode FORM() { return getToken(AngularParser.FORM, 0); }
		public FormTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H4TagContext extends TagNameContext {
		public TerminalNode H4() { return getToken(AngularParser.H4, 0); }
		public H4TagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterH4Tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitH4Tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitH4Tag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiTagContext extends TagNameContext {
		public TerminalNode LI() { return getToken(AngularParser.LI, 0); }
		public LiTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H5TagContext extends TagNameContext {
		public TerminalNode H5() { return getToken(AngularParser.H5, 0); }
		public H5TagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterH5Tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitH5Tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitH5Tag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UlTagContext extends TagNameContext {
		public TerminalNode UL() { return getToken(AngularParser.UL, 0); }
		public UlTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUlTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BodyTagContext extends TagNameContext {
		public TerminalNode BODY() { return getToken(AngularParser.BODY, 0); }
		public BodyTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBodyTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBodyTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBodyTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ATagContext extends TagNameContext {
		public TerminalNode A() { return getToken(AngularParser.A, 0); }
		public ATagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterATag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitATag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitATag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CustomTagContext extends TagNameContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public CustomTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCustomTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCustomTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCustomTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtonTagContext extends TagNameContext {
		public TerminalNode BUTTON() { return getToken(AngularParser.BUTTON, 0); }
		public ButtonTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterButtonTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitButtonTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitButtonTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PTagContext extends TagNameContext {
		public TerminalNode P() { return getToken(AngularParser.P, 0); }
		public PTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NavTagContext extends TagNameContext {
		public TerminalNode NAV() { return getToken(AngularParser.NAV, 0); }
		public NavTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImgTagContext extends TagNameContext {
		public TerminalNode IMG() { return getToken(AngularParser.IMG, 0); }
		public ImgTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImgTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImgTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImgTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputTagContext extends TagNameContext {
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode INPUTTAG() { return getToken(AngularParser.INPUTTAG, 0); }
		public InputTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H6TagContext extends TagNameContext {
		public TerminalNode H6() { return getToken(AngularParser.H6, 0); }
		public H6TagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterH6Tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitH6Tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitH6Tag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpanTagContext extends TagNameContext {
		public TerminalNode SPAN() { return getToken(AngularParser.SPAN, 0); }
		public SpanTagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSpanTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSpanTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSpanTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H2TagContext extends TagNameContext {
		public TerminalNode H2() { return getToken(AngularParser.H2, 0); }
		public H2TagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterH2Tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitH2Tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitH2Tag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H1TagContext extends TagNameContext {
		public TerminalNode H1() { return getToken(AngularParser.H1, 0); }
		public H1TagContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterH1Tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitH1Tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitH1Tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tagName);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV:
				_localctx = new DivTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(DIV);
				}
				break;
			case NAV:
				_localctx = new NavTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(NAV);
				}
				break;
			case BODY:
				_localctx = new BodyTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(BODY);
				}
				break;
			case SPAN:
				_localctx = new SpanTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(SPAN);
				}
				break;
			case P:
				_localctx = new PTagContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(P);
				}
				break;
			case A:
				_localctx = new ATagContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				match(A);
				}
				break;
			case BUTTON:
				_localctx = new ButtonTagContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(279);
				match(BUTTON);
				}
				break;
			case INPUT:
				_localctx = new InputTagContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				match(INPUT);
				}
				break;
			case FORM:
				_localctx = new FormTagContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(281);
				match(FORM);
				}
				break;
			case IMG:
				_localctx = new ImgTagContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(282);
				match(IMG);
				}
				break;
			case INPUTTAG:
				_localctx = new InputTagContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(283);
				match(INPUTTAG);
				}
				break;
			case UL:
				_localctx = new UlTagContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(284);
				match(UL);
				}
				break;
			case LI:
				_localctx = new LiTagContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(285);
				match(LI);
				}
				break;
			case H1:
				_localctx = new H1TagContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(286);
				match(H1);
				}
				break;
			case H2:
				_localctx = new H2TagContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(287);
				match(H2);
				}
				break;
			case H3:
				_localctx = new H3TagContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(288);
				match(H3);
				}
				break;
			case H4:
				_localctx = new H4TagContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(289);
				match(H4);
				}
				break;
			case H5:
				_localctx = new H5TagContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(290);
				match(H5);
				}
				break;
			case H6:
				_localctx = new H6TagContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(291);
				match(H6);
				}
				break;
			case IDDEFINER:
				_localctx = new CustomTagContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(292);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContentContext extends ParserRuleContext {
		public ElementContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementContent; }
	 
		public ElementContentContext() { }
		public void copyFrom(ElementContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlStatementContext extends ElementContentContext {
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public HtmlStatementContext(ElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNestedElementContext extends ElementContentContext {
		public HtmlelementContext htmlelement() {
			return getRuleContext(HtmlelementContext.class,0);
		}
		public HtmlNestedElementContext(ElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlNestedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlNestedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlNestedElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlInterpolationContext extends ElementContentContext {
		public AngularInterpolationContext angularInterpolation() {
			return getRuleContext(AngularInterpolationContext.class,0);
		}
		public HtmlInterpolationContext(ElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContentContext elementContent() throws RecognitionException {
		ElementContentContext _localctx = new ElementContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementContent);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				_localctx = new HtmlInterpolationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				angularInterpolation();
				}
				break;
			case IDDEFINER:
				_localctx = new HtmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				statment();
				}
				break;
			case OPEN_TAG:
				_localctx = new HtmlNestedElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				htmlelement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatmentContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(302);
					text();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(305); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AngularInterpolationContext extends ParserRuleContext {
		public List<TerminalNode> LCURLY() { return getTokens(AngularParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(AngularParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(AngularParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(AngularParser.RCURLY, i);
		}
		public AngularInterpolationContentContext angularInterpolationContent() {
			return getRuleContext(AngularInterpolationContentContext.class,0);
		}
		public AngularInterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularInterpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularInterpolationContext angularInterpolation() throws RecognitionException {
		AngularInterpolationContext _localctx = new AngularInterpolationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_angularInterpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(LCURLY);
			setState(308);
			match(LCURLY);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDEFINED || _la==THIS || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1030792445953L) != 0)) {
				{
				setState(309);
				angularInterpolationContent();
				}
			}

			setState(312);
			match(RCURLY);
			setState(313);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AngularInterpolationContentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(AngularParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(AngularParser.PIPE, i);
		}
		public AngularInterpolationContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularInterpolationContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularInterpolationContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularInterpolationContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularInterpolationContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularInterpolationContentContext angularInterpolationContent() throws RecognitionException {
		AngularInterpolationContentContext _localctx = new AngularInterpolationContentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_angularInterpolationContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			expression();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(316);
				match(PIPE);
				setState(317);
				expression();
				}
				}
				setState(322);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends AttributeContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public HtmlAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
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

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attribute);
		try {
			_localctx = new HtmlAttributeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			attributeName();
			setState(324);
			match(ASSIGN);
			setState(325);
			attributeValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeNameContext extends ParserRuleContext {
		public StandardAttributeContext standardAttribute() {
			return getRuleContext(StandardAttributeContext.class,0);
		}
		public AngularBindingContext angularBinding() {
			return getRuleContext(AngularBindingContext.class,0);
		}
		public AngularEventContext angularEvent() {
			return getRuleContext(AngularEventContext.class,0);
		}
		public AngularDirectiveContext angularDirective() {
			return getRuleContext(AngularDirectiveContext.class,0);
		}
		public TwoWayDataBindingContext twoWayDataBinding() {
			return getRuleContext(TwoWayDataBindingContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributeName);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				standardAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				angularBinding();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				angularEvent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				angularDirective();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				twoWayDataBinding();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StandardAttributeContext extends ParserRuleContext {
		public StandardAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardAttribute; }
	 
		public StandardAttributeContext() { }
		public void copyFrom(StandardAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LinkAttrContext extends StandardAttributeContext {
		public TerminalNode ROUTER_LINK() { return getToken(AngularParser.ROUTER_LINK, 0); }
		public LinkAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLinkAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLinkAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLinkAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TitleAttrContext extends StandardAttributeContext {
		public TerminalNode TITLE() { return getToken(AngularParser.TITLE, 0); }
		public TitleAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTitleAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTitleAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTitleAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SrcAttrContext extends StandardAttributeContext {
		public TerminalNode SRC() { return getToken(AngularParser.SRC, 0); }
		public SrcAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSrcAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSrcAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSrcAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AltAttrContext extends StandardAttributeContext {
		public TerminalNode ALT() { return getToken(AngularParser.ALT, 0); }
		public AltAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAltAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAltAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAltAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAttrContext extends StandardAttributeContext {
		public TerminalNode TYPE() { return getToken(AngularParser.TYPE, 0); }
		public TypeAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisabledAttrContext extends StandardAttributeContext {
		public TerminalNode DISABLED() { return getToken(AngularParser.DISABLED, 0); }
		public DisabledAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDisabledAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDisabledAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDisabledAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameAttrContext extends StandardAttributeContext {
		public TerminalNode NAME() { return getToken(AngularParser.NAME, 0); }
		public NameAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNameAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNameAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNameAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdDefinerAttrContext extends StandardAttributeContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public IdDefinerAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdDefinerAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdDefinerAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdDefinerAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassAttrContext extends StandardAttributeContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public ClassAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HrefAttrContext extends StandardAttributeContext {
		public TerminalNode HREF() { return getToken(AngularParser.HREF, 0); }
		public HrefAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHrefAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHrefAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHrefAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAttrContext extends StandardAttributeContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public IdAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LinkActiveAttrContext extends StandardAttributeContext {
		public TerminalNode ROUTER_LINK_Active() { return getToken(AngularParser.ROUTER_LINK_Active, 0); }
		public LinkActiveAttrContext(StandardAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLinkActiveAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLinkActiveAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLinkActiveAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardAttributeContext standardAttribute() throws RecognitionException {
		StandardAttributeContext _localctx = new StandardAttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_standardAttribute);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new ClassAttrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(CLASS);
				}
				break;
			case ID:
				_localctx = new IdAttrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(ID);
				}
				break;
			case TITLE:
				_localctx = new TitleAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				match(TITLE);
				}
				break;
			case ALT:
				_localctx = new AltAttrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(ALT);
				}
				break;
			case HREF:
				_localctx = new HrefAttrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
				match(HREF);
				}
				break;
			case SRC:
				_localctx = new SrcAttrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(339);
				match(SRC);
				}
				break;
			case DISABLED:
				_localctx = new DisabledAttrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(340);
				match(DISABLED);
				}
				break;
			case TYPE:
				_localctx = new TypeAttrContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(341);
				match(TYPE);
				}
				break;
			case ROUTER_LINK:
				_localctx = new LinkAttrContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(342);
				match(ROUTER_LINK);
				}
				break;
			case ROUTER_LINK_Active:
				_localctx = new LinkActiveAttrContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(343);
				match(ROUTER_LINK_Active);
				}
				break;
			case NAME:
				_localctx = new NameAttrContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(344);
				match(NAME);
				}
				break;
			case IDDEFINER:
				_localctx = new IdDefinerAttrContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(345);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AngularBindingContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public BindingNameContext bindingName() {
			return getRuleContext(BindingNameContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public AngularBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularBindingContext angularBinding() throws RecognitionException {
		AngularBindingContext _localctx = new AngularBindingContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_angularBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(LBRACK);
			setState(349);
			bindingName();
			setState(350);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TwoWayDataBindingContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode NGMODEL() { return getToken(AngularParser.NGMODEL, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TwoWayDataBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWayDataBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTwoWayDataBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTwoWayDataBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTwoWayDataBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWayDataBindingContext twoWayDataBinding() throws RecognitionException {
		TwoWayDataBindingContext _localctx = new TwoWayDataBindingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_twoWayDataBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(LBRACK);
			setState(353);
			match(LPAREN);
			setState(354);
			match(NGMODEL);
			setState(355);
			match(RPAREN);
			setState(356);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BindingNameContext extends ParserRuleContext {
		public BindingNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingName; }
	 
		public BindingNameContext() { }
		public void copyFrom(BindingNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SrcBindingContext extends BindingNameContext {
		public TerminalNode SRC() { return getToken(AngularParser.SRC, 0); }
		public SrcBindingContext(BindingNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSrcBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSrcBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSrcBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckedBindingContext extends BindingNameContext {
		public TerminalNode CHECKED() { return getToken(AngularParser.CHECKED, 0); }
		public CheckedBindingContext(BindingNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCheckedBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCheckedBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCheckedBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CustomBindingContext extends BindingNameContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public CustomBindingContext(BindingNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCustomBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCustomBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCustomBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueBindingContext extends BindingNameContext {
		public TerminalNode VALUE() { return getToken(AngularParser.VALUE, 0); }
		public ValueBindingContext(BindingNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HrefBindingContext extends BindingNameContext {
		public TerminalNode HREF() { return getToken(AngularParser.HREF, 0); }
		public HrefBindingContext(BindingNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHrefBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHrefBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHrefBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingNameContext bindingName() throws RecognitionException {
		BindingNameContext _localctx = new BindingNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bindingName);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				_localctx = new ValueBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(VALUE);
				}
				break;
			case CHECKED:
				_localctx = new CheckedBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(CHECKED);
				}
				break;
			case SRC:
				_localctx = new SrcBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(SRC);
				}
				break;
			case HREF:
				_localctx = new HrefBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				match(HREF);
				}
				break;
			case IDDEFINER:
				_localctx = new CustomBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AngularEventContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public AngularEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularEventContext angularEvent() throws RecognitionException {
		AngularEventContext _localctx = new AngularEventContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_angularEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(LPAREN);
			setState(366);
			eventName();
			setState(367);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EventNameContext extends ParserRuleContext {
		public EventNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventName; }
	 
		public EventNameContext() { }
		public void copyFrom(EventNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CustomEventContext extends EventNameContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public CustomEventContext(EventNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCustomEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCustomEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCustomEvent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyDownEventContext extends EventNameContext {
		public TerminalNode KEYDOWN() { return getToken(AngularParser.KEYDOWN, 0); }
		public KeyDownEventContext(EventNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKeyDownEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKeyDownEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKeyDownEvent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChangeEventContext extends EventNameContext {
		public TerminalNode CHANGE() { return getToken(AngularParser.CHANGE, 0); }
		public ChangeEventContext(EventNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterChangeEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitChangeEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitChangeEvent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyUpEventContext extends EventNameContext {
		public TerminalNode KEYUP() { return getToken(AngularParser.KEYUP, 0); }
		public KeyUpEventContext(EventNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKeyUpEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKeyUpEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKeyUpEvent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClickEventContext extends EventNameContext {
		public TerminalNode CLICK() { return getToken(AngularParser.CLICK, 0); }
		public ClickEventContext(EventNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClickEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClickEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClickEvent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgSubmitEventContext extends EventNameContext {
		public TerminalNode NG_SUBMIT() { return getToken(AngularParser.NG_SUBMIT, 0); }
		public NgSubmitEventContext(EventNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgSubmitEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgSubmitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgSubmitEvent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputEventContext extends EventNameContext {
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public InputEventContext(EventNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputEvent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubmitEventContext extends EventNameContext {
		public TerminalNode SUBMIT() { return getToken(AngularParser.SUBMIT, 0); }
		public SubmitEventContext(EventNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSubmitEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSubmitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSubmitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventNameContext eventName() throws RecognitionException {
		EventNameContext _localctx = new EventNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_eventName);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLICK:
				_localctx = new ClickEventContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(CLICK);
				}
				break;
			case NG_SUBMIT:
				_localctx = new NgSubmitEventContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(NG_SUBMIT);
				}
				break;
			case CHANGE:
				_localctx = new ChangeEventContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(CHANGE);
				}
				break;
			case INPUT:
				_localctx = new InputEventContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				match(INPUT);
				}
				break;
			case SUBMIT:
				_localctx = new SubmitEventContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				match(SUBMIT);
				}
				break;
			case KEYDOWN:
				_localctx = new KeyDownEventContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				match(KEYDOWN);
				}
				break;
			case KEYUP:
				_localctx = new KeyUpEventContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(375);
				match(KEYUP);
				}
				break;
			case IDDEFINER:
				_localctx = new CustomEventContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(376);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AngularDirectiveContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public DirectiveNameContext directiveName() {
			return getRuleContext(DirectiveNameContext.class,0);
		}
		public AngularDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularDirectiveContext angularDirective() throws RecognitionException {
		AngularDirectiveContext _localctx = new AngularDirectiveContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_angularDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(STAR);
			setState(380);
			directiveName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveNameContext extends ParserRuleContext {
		public DirectiveNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveName; }
	 
		public DirectiveNameContext() { }
		public void copyFrom(DirectiveNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgForDirectiveContext extends DirectiveNameContext {
		public TerminalNode NGFOR() { return getToken(AngularParser.NGFOR, 0); }
		public NgForDirectiveContext(DirectiveNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgForDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgForDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgForDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgSwitchDirectiveContext extends DirectiveNameContext {
		public TerminalNode NGSWITCH() { return getToken(AngularParser.NGSWITCH, 0); }
		public NgSwitchDirectiveContext(DirectiveNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgSwitchDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgSwitchDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgSwitchDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdDefinerDirectiveContext extends DirectiveNameContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public IdDefinerDirectiveContext(DirectiveNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdDefinerDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdDefinerDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdDefinerDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgIfDirectiveContext extends DirectiveNameContext {
		public TerminalNode NGIF() { return getToken(AngularParser.NGIF, 0); }
		public NgIfDirectiveContext(DirectiveNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgIfDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgIfDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgIfDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveNameContext directiveName() throws RecognitionException {
		DirectiveNameContext _localctx = new DirectiveNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_directiveName);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NGIF:
				_localctx = new NgIfDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(NGIF);
				}
				break;
			case NGFOR:
				_localctx = new NgForDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(NGFOR);
				}
				break;
			case NGSWITCH:
				_localctx = new NgSwitchDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(NGSWITCH);
				}
				break;
			case IDDEFINER:
				_localctx = new IdDefinerDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TsProgContext extends ParserRuleContext {
		public TsProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsProg; }
	 
		public TsProgContext() { }
		public void copyFrom(TsProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsEmptyProgramContext extends TsProgContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public TsEmptyProgramContext(TsProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsEmptyProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsEmptyProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsEmptyProgram(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsProgramBlockContext extends TsProgContext {
		public List<TsProgContentContext> tsProgContent() {
			return getRuleContexts(TsProgContentContext.class);
		}
		public TsProgContentContext tsProgContent(int i) {
			return getRuleContext(TsProgContentContext.class,i);
		}
		public TsProgramBlockContext(TsProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsProgramBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsProgramBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsProgramBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsProgContext tsProg() throws RecognitionException {
		TsProgContext _localctx = new TsProgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tsProg);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case EXPORT:
			case INTERFACE:
			case FUNCTION:
			case CLASS:
			case CONST:
			case LET:
			case VAR:
			case IDDEFINER:
			case LPAREN:
			case DECORATOR:
				_localctx = new TsProgramBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(390);
					tsProgContent();
					}
					}
					setState(393); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1836880L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1099511635969L) != 0) );
				}
				break;
			case EOF:
				_localctx = new TsEmptyProgramContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TsProgContentContext extends ParserRuleContext {
		public TsProgContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsProgContent; }
	 
		public TsProgContentContext() { }
		public void copyFrom(TsProgContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsImportContext extends TsProgContentContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public TsImportContext(TsProgContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsClassContext extends TsProgContentContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TsClassContext(TsProgContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsFunctionContext extends TsProgContentContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TsFunctionContext(TsProgContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsRouterDeclContext extends TsProgContentContext {
		public RouterDeclarationContext routerDeclaration() {
			return getRuleContext(RouterDeclarationContext.class,0);
		}
		public TsRouterDeclContext(TsProgContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsRouterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsRouterDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsRouterDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsVariableDeclContext extends TsProgContentContext {
		public VariableDeclarationsContext variableDeclarations() {
			return getRuleContext(VariableDeclarationsContext.class,0);
		}
		public TsVariableDeclContext(TsProgContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsInterfaceContext extends TsProgContentContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TsInterfaceContext(TsProgContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsInterface(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsDecoratorContext extends TsProgContentContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public TsDecoratorContext(TsProgContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTsDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTsDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTsDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsProgContentContext tsProgContent() throws RecognitionException {
		TsProgContentContext _localctx = new TsProgContentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tsProgContent);
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new TsImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				importStatement();
				}
				break;
			case 2:
				_localctx = new TsClassContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				classDeclaration();
				}
				break;
			case 3:
				_localctx = new TsFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				functionDeclaration();
				}
				break;
			case 4:
				_localctx = new TsInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				interfaceDeclaration();
				}
				break;
			case 5:
				_localctx = new TsDecoratorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				decorator();
				}
				break;
			case 6:
				_localctx = new TsVariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(403);
				variableDeclarations();
				}
				break;
			case 7:
				_localctx = new TsRouterDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(404);
				routerDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public ImportContentContext importContent() {
			return getRuleContext(ImportContentContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
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
		enterRule(_localctx, 52, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(IMPORT);
			setState(408);
			importContent();
			setState(409);
			match(FROM);
			setState(410);
			match(STRING);
			setState(411);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportContentContext extends ParserRuleContext {
		public ImportContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importContent; }
	 
		public ImportContentContext() { }
		public void copyFrom(ImportContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierImportContext extends ImportContentContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public IdentifierImportContext(ImportContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockImportContext extends ImportContentContext {
		public NamedImportBlockContext namedImportBlock() {
			return getRuleContext(NamedImportBlockContext.class,0);
		}
		public BlockImportContext(ImportContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportContentContext importContent() throws RecognitionException {
		ImportContentContext _localctx = new ImportContentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_importContent);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDDEFINER:
				_localctx = new IdentifierImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(IDDEFINER);
				}
				break;
			case LCURLY:
				_localctx = new BlockImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				namedImportBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamedImportBlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public NamedImportContentContext namedImportContent() {
			return getRuleContext(NamedImportContentContext.class,0);
		}
		public NamedImportBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedImportBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNamedImportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNamedImportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNamedImportBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedImportBlockContext namedImportBlock() throws RecognitionException {
		NamedImportBlockContext _localctx = new NamedImportBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_namedImportBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(LCURLY);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTES || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 15L) != 0)) {
				{
				setState(418);
				namedImportContent();
				}
			}

			setState(421);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamedImportContentContext extends ParserRuleContext {
		public List<NamedImportContext> namedImport() {
			return getRuleContexts(NamedImportContext.class);
		}
		public NamedImportContext namedImport(int i) {
			return getRuleContext(NamedImportContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public NamedImportContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedImportContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNamedImportContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNamedImportContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNamedImportContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedImportContentContext namedImportContent() throws RecognitionException {
		NamedImportContentContext _localctx = new NamedImportContentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namedImportContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			namedImport();
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					match(COMMA);
					setState(425);
					namedImport();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(431);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamedImportContext extends ParserRuleContext {
		public NamedImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedImport; }
	 
		public NamedImportContext() { }
		public void copyFrom(NamedImportContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdDefinerImportContext extends NamedImportContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public IdDefinerImportContext(NamedImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdDefinerImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdDefinerImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdDefinerImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputImportContext extends NamedImportContext {
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public InputImportContext(NamedImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputRoutesContext extends NamedImportContext {
		public TerminalNode ROUTES() { return getToken(AngularParser.ROUTES, 0); }
		public InputRoutesContext(NamedImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputRoutes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputRoutes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputRoutes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentImportContext extends NamedImportContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public ComponentImportContext(NamedImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InjectableImportContext extends NamedImportContext {
		public TerminalNode INJECTABLE() { return getToken(AngularParser.INJECTABLE, 0); }
		public InjectableImportContext(NamedImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInjectableImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInjectableImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInjectableImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedImportContext namedImport() throws RecognitionException {
		NamedImportContext _localctx = new NamedImportContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_namedImport);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPONENT:
				_localctx = new ComponentImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(COMPONENT);
				}
				break;
			case INJECTABLE:
				_localctx = new InjectableImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(INJECTABLE);
				}
				break;
			case INPUT:
				_localctx = new InputImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(INPUT);
				}
				break;
			case ROUTES:
				_localctx = new InputRoutesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(ROUTES);
				}
				break;
			case IDDEFINER:
				_localctx = new IdDefinerImportContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(438);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode DECORATOR() { return getToken(AngularParser.DECORATOR, 0); }
		public NamedImportContext namedImport() {
			return getRuleContext(NamedImportContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public DecoratorObjectContext decoratorObject() {
			return getRuleContext(DecoratorObjectContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
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
		enterRule(_localctx, 62, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(DECORATOR);
			setState(442);
			namedImport();
			setState(443);
			match(LPAREN);
			setState(444);
			decoratorObject();
			setState(445);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorObjectContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public DecoratorObjectContentContext decoratorObjectContent() {
			return getRuleContext(DecoratorObjectContentContext.class,0);
		}
		public DecoratorObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorObjectContext decoratorObject() throws RecognitionException {
		DecoratorObjectContext _localctx = new DecoratorObjectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_decoratorObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(LCURLY);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) {
				{
				setState(448);
				decoratorObjectContent();
				}
			}

			setState(451);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorObjectContentContext extends ParserRuleContext {
		public List<DecoratorPropertyContext> decoratorProperty() {
			return getRuleContexts(DecoratorPropertyContext.class);
		}
		public DecoratorPropertyContext decoratorProperty(int i) {
			return getRuleContext(DecoratorPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public DecoratorObjectContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorObjectContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorObjectContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorObjectContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorObjectContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorObjectContentContext decoratorObjectContent() throws RecognitionException {
		DecoratorObjectContentContext _localctx = new DecoratorObjectContentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_decoratorObjectContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			decoratorProperty();
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(454);
					match(COMMA);
					setState(455);
					decoratorProperty();
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(461);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorPropertyNameContext extends ParserRuleContext {
		public DecoratorPropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorPropertyName; }
	 
		public DecoratorPropertyNameContext() { }
		public void copyFrom(DecoratorPropertyNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlPropertyContext extends DecoratorPropertyNameContext {
		public TerminalNode STYLE_URL() { return getToken(AngularParser.STYLE_URL, 0); }
		public StyleUrlPropertyContext(DecoratorPropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrlProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrlProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrlProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsPropertyContext extends DecoratorPropertyNameContext {
		public TerminalNode STYLE_URLS() { return getToken(AngularParser.STYLE_URLS, 0); }
		public StyleUrlsPropertyContext(DecoratorPropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrlsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrlsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrlsProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropertyContext extends DecoratorPropertyNameContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public SelectorPropertyContext(DecoratorPropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProvidedInPropertyContext extends DecoratorPropertyNameContext {
		public TerminalNode PROVIDEDIN() { return getToken(AngularParser.PROVIDEDIN, 0); }
		public ProvidedInPropertyContext(DecoratorPropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProvidedInProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProvidedInProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProvidedInProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropertyContext extends DecoratorPropertyNameContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public ImportsPropertyContext(DecoratorPropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlPropertyContext extends DecoratorPropertyNameContext {
		public TerminalNode TEMPLATE_URL() { return getToken(AngularParser.TEMPLATE_URL, 0); }
		public TemplateUrlPropertyContext(DecoratorPropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateUrlProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateUrlProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateUrlProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorPropertyNameContext decoratorPropertyName() throws RecognitionException {
		DecoratorPropertyNameContext _localctx = new DecoratorPropertyNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_decoratorPropertyName);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(SELECTOR);
				}
				break;
			case TEMPLATE_URL:
				_localctx = new TemplateUrlPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(TEMPLATE_URL);
				}
				break;
			case IMPORTS:
				_localctx = new ImportsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				match(IMPORTS);
				}
				break;
			case STYLE_URL:
				_localctx = new StyleUrlPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				match(STYLE_URL);
				}
				break;
			case STYLE_URLS:
				_localctx = new StyleUrlsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(468);
				match(STYLE_URLS);
				}
				break;
			case PROVIDEDIN:
				_localctx = new ProvidedInPropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(469);
				match(PROVIDEDIN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorPropertyValueContext extends ParserRuleContext {
		public DecoratorPropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorPropertyValue; }
	 
		public DecoratorPropertyValueContext() { }
		public void copyFrom(DecoratorPropertyValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueContext extends DecoratorPropertyValueContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayValueContext(DecoratorPropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValuesContext extends DecoratorPropertyValueContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public StringValuesContext(DecoratorPropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorPropertyValueContext decoratorPropertyValue() throws RecognitionException {
		DecoratorPropertyValueContext _localctx = new DecoratorPropertyValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_decoratorPropertyValue);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringValuesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(STRING);
				}
				break;
			case LBRACK:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorPropertyContext extends ParserRuleContext {
		public DecoratorPropertyNameContext decoratorPropertyName() {
			return getRuleContext(DecoratorPropertyNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public DecoratorPropertyValueContext decoratorPropertyValue() {
			return getRuleContext(DecoratorPropertyValueContext.class,0);
		}
		public DecoratorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorPropertyContext decoratorProperty() throws RecognitionException {
		DecoratorPropertyContext _localctx = new DecoratorPropertyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_decoratorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			decoratorPropertyName();
			setState(477);
			match(COLON);
			setState(478);
			decoratorPropertyValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouterDeclarationContext extends ParserRuleContext {
		public DeclarationTypesContext declarationTypes() {
			return getRuleContext(DeclarationTypesContext.class,0);
		}
		public RouterNameContext routerName() {
			return getRuleContext(RouterNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public RoutersContext routers() {
			return getRuleContext(RoutersContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public RouterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterDeclarationContext routerDeclaration() throws RecognitionException {
		RouterDeclarationContext _localctx = new RouterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_routerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(480);
				match(EXPORT);
				}
			}

			setState(483);
			declarationTypes();
			setState(484);
			routerName();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(485);
				typeSelector();
				}
			}

			setState(488);
			match(ASSIGN);
			setState(489);
			routers();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(490);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouterNameContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public RouterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterNameContext routerName() throws RecognitionException {
		RouterNameContext _localctx = new RouterNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_routerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutersContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public List<RouterArrayContentContext> routerArrayContent() {
			return getRuleContexts(RouterArrayContentContext.class);
		}
		public RouterArrayContentContext routerArrayContent(int i) {
			return getRuleContext(RouterArrayContentContext.class,i);
		}
		public RoutersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutersContext routers() throws RecognitionException {
		RoutersContext _localctx = new RoutersContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_routers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(LBRACK);
			setState(497); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(496);
				routerArrayContent();
				}
				}
				setState(499); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LCURLY );
			setState(501);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouterArrayContentContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public List<RouterPropertyContext> routerProperty() {
			return getRuleContexts(RouterPropertyContext.class);
		}
		public RouterPropertyContext routerProperty(int i) {
			return getRuleContext(RouterPropertyContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public RouterArrayContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerArrayContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterArrayContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterArrayContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterArrayContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterArrayContentContext routerArrayContent() throws RecognitionException {
		RouterArrayContentContext _localctx = new RouterArrayContentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_routerArrayContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(LCURLY);
			setState(504);
			routerProperty();
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(505);
					match(COMMA);
					setState(506);
					routerProperty();
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(512);
				match(COMMA);
				}
			}

			setState(515);
			match(RCURLY);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(516);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouterPropertyNameContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(AngularParser.PATH, 0); }
		public TerminalNode ROUTE_COMPONENT() { return getToken(AngularParser.ROUTE_COMPONENT, 0); }
		public RouterPropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerPropertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterPropertyNameContext routerPropertyName() throws RecognitionException {
		RouterPropertyNameContext _localctx = new RouterPropertyNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_routerPropertyName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if ( !(_la==ROUTE_COMPONENT || _la==PATH) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouterPropertyValueContext extends ParserRuleContext {
		public RouterPropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerPropertyValue; }
	 
		public RouterPropertyValueContext() { }
		public void copyFrom(RouterPropertyValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentValueContext extends RouterPropertyValueContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public ComponentValueContext(RouterPropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PathValueContext extends RouterPropertyValueContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public PathValueContext(RouterPropertyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPathValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPathValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPathValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterPropertyValueContext routerPropertyValue() throws RecognitionException {
		RouterPropertyValueContext _localctx = new RouterPropertyValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_routerPropertyValue);
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new PathValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(STRING);
				}
				break;
			case IDDEFINER:
				_localctx = new ComponentValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouterPropertyContext extends ParserRuleContext {
		public RouterPropertyNameContext routerPropertyName() {
			return getRuleContext(RouterPropertyNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public RouterPropertyValueContext routerPropertyValue() {
			return getRuleContext(RouterPropertyValueContext.class,0);
		}
		public RouterPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterPropertyContext routerProperty() throws RecognitionException {
		RouterPropertyContext _localctx = new RouterPropertyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_routerProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			routerPropertyName();
			setState(526);
			match(COLON);
			setState(527);
			routerPropertyValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
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
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(529);
				match(EXPORT);
				}
			}

			setState(532);
			match(CLASS);
			setState(533);
			className();
			setState(534);
			classBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
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
		enterRule(_localctx, 92, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(LCURLY);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835072L) != 0) || _la==IDDEFINER || _la==DECORATOR) {
				{
				{
				setState(539);
				classMember();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	 
		public ClassMemberContext() { }
		public void copyFrom(ClassMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableMemberContext extends ClassMemberContext {
		public VariableDeclarationsContext variableDeclarations() {
			return getRuleContext(VariableDeclarationsContext.class,0);
		}
		public VariableMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableMember(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodMemberContext extends ClassMemberContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classMember);
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new VariableMemberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				variableDeclarations();
				}
				break;
			case 2:
				_localctx = new MethodMemberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				methodDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
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
			setState(553);
			methodName();
			setState(554);
			match(LPAREN);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDDEFINER) {
				{
				setState(555);
				parameters();
				}
			}

			setState(558);
			match(RPAREN);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(559);
				typeSelector();
				}
			}

			setState(562);
			functionBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceNameContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public InterfaceNameContext interfaceName() {
			return getRuleContext(InterfaceNameContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
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
		enterRule(_localctx, 102, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(566);
				match(EXPORT);
				}
			}

			setState(569);
			match(INTERFACE);
			setState(570);
			interfaceName();
			setState(571);
			match(LCURLY);
			setState(572);
			interfaceBody();
			setState(573);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfacePropertyContext> interfaceProperty() {
			return getRuleContexts(InterfacePropertyContext.class);
		}
		public InterfacePropertyContext interfaceProperty(int i) {
			return getRuleContext(InterfacePropertyContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDDEFINER) {
				{
				{
				setState(575);
				interfaceProperty();
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(576);
					match(SEMI);
					}
				}

				}
				}
				setState(583);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacePropertyContext extends ParserRuleContext {
		public InterfacePropertyNameContext interfacePropertyName() {
			return getRuleContext(InterfacePropertyNameContext.class,0);
		}
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public InterfacePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePropertyContext interfaceProperty() throws RecognitionException {
		InterfacePropertyContext _localctx = new InterfacePropertyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_interfaceProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			interfacePropertyName();
			setState(585);
			typeSelector();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacePropertyNameContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public InterfacePropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacePropertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfacePropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfacePropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfacePropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePropertyNameContext interfacePropertyName() throws RecognitionException {
		InterfacePropertyNameContext _localctx = new InterfacePropertyNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_interfacePropertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionContext extends FunctionDeclarationContext {
		public RegularFunctionDeclarationContext regularFunctionDeclaration() {
			return getRuleContext(RegularFunctionDeclarationContext.class,0);
		}
		public RegularFunctionContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends FunctionDeclarationContext {
		public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
			return getRuleContext(ArrowFunctionDeclarationContext.class,0);
		}
		public ArrowFunctionContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
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

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_functionDeclaration);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				_localctx = new RegularFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				regularFunctionDeclaration();
				}
				break;
			case LPAREN:
				_localctx = new ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				arrowFunctionDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionNameContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public RegularFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRegularFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRegularFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRegularFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionNameContext regularFunctionName() throws RecognitionException {
		RegularFunctionNameContext _localctx = new RegularFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_regularFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public RegularFunctionNameContext regularFunctionName() {
			return getRuleContext(RegularFunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public RegularFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRegularFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRegularFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRegularFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionDeclarationContext regularFunctionDeclaration() throws RecognitionException {
		RegularFunctionDeclarationContext _localctx = new RegularFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_regularFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(FUNCTION);
			setState(596);
			regularFunctionName();
			setState(597);
			match(LPAREN);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDDEFINER) {
				{
				setState(598);
				parameters();
				}
			}

			setState(601);
			match(RPAREN);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(602);
				typeSelector();
				}
			}

			setState(605);
			functionBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public ArrowFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionDeclarationContext arrowFunctionDeclaration() throws RecognitionException {
		ArrowFunctionDeclarationContext _localctx = new ArrowFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arrowFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(LPAREN);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDDEFINER) {
				{
				setState(608);
				parameters();
				}
			}

			setState(611);
			match(RPAREN);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(612);
				typeSelector();
				}
			}

			setState(615);
			match(ARROW);
			setState(616);
			arrowFunctionBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionBodyContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
		ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arrowFunctionBody);
		try {
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				returnStatement();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				functionBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterNameContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
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
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			parameter();
			setState(629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(625);
					match(COMMA);
					setState(626);
					parameter();
					}
					} 
				}
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(632);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
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
		enterRule(_localctx, 124, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			parameterName();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(636);
				typeSelector();
				}
			}

			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(639);
				defaultValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(ASSIGN);
			setState(643);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(LCURLY);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16107962432L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 2130304073729L) != 0)) {
				{
				{
				setState(646);
				statement();
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(652);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationsStatementContext extends StatementContext {
		public VariableDeclarationsContext variableDeclarations() {
			return getRuleContext(VariableDeclarationsContext.class,0);
		}
		public VariableDeclarationsStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclarationsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclarationsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclarationsStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatement_Context extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStatement_Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement_(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleLogStatementContext extends StatementContext {
		public ConsoleLogContext consoleLog() {
			return getRuleContext(ConsoleLogContext.class,0);
		}
		public ConsoleLogStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConsoleLogStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConsoleLogStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConsoleLogStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_statement);
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationsStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				variableDeclarations();
				}
				break;
			case 2:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				expression();
				}
				break;
			case 3:
				_localctx = new ReturnStatement_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				returnStatement();
				}
				break;
			case 4:
				_localctx = new ConsoleLogStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(657);
				consoleLog();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleLogContext extends ParserRuleContext {
		public ConsoleLogSplitContext consoleLogSplit() {
			return getRuleContext(ConsoleLogSplitContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ConsoleLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConsoleLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConsoleLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConsoleLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsoleLogContext consoleLog() throws RecognitionException {
		ConsoleLogContext _localctx = new ConsoleLogContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_consoleLog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			consoleLogSplit();
			setState(661);
			match(LPAREN);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDEFINED || _la==THIS || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1030792445953L) != 0)) {
				{
				setState(662);
				arguments();
				}
			}

			setState(665);
			match(RPAREN);
			setState(666);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleLogSplitContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(AngularParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(AngularParser.LOG, 0); }
		public ConsoleLogSplitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleLogSplit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConsoleLogSplit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConsoleLogSplit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConsoleLogSplit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsoleLogSplitContext consoleLogSplit() throws RecognitionException {
		ConsoleLogSplitContext _localctx = new ConsoleLogSplitContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_consoleLogSplit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(CONSOLE);
			setState(669);
			match(DOT);
			setState(670);
			match(LOG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
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
		enterRule(_localctx, 136, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(RETURN);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDEFINED || _la==THIS || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1030792445953L) != 0)) {
				{
				setState(673);
				expression();
				}
			}

			setState(676);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
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
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			expression();
			setState(683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(679);
					match(COMMA);
					setState(680);
					expression();
					}
					} 
				}
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(686);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationsContext extends ParserRuleContext {
		public VariableDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarations; }
	 
		public VariableDeclarationsContext() { }
		public void copyFrom(VariableDeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaration_Context extends VariableDeclarationsContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclaration_Context(VariableDeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration_(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorInputContext extends VariableDeclarationsContext {
		public DecoratorBasedInputContext decoratorBasedInput() {
			return getRuleContext(DecoratorBasedInputContext.class,0);
		}
		public DecoratorInputContext(VariableDeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationsContext variableDeclarations() throws RecognitionException {
		VariableDeclarationsContext _localctx = new VariableDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_variableDeclarations);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPORT:
			case CONST:
			case LET:
			case VAR:
			case IDDEFINER:
				_localctx = new VariableDeclaration_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				variableDeclaration();
				}
				break;
			case DECORATOR:
				_localctx = new DecoratorInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				decoratorBasedInput();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public DeclarationTypesContext declarationTypes() {
			return getRuleContext(DeclarationTypesContext.class,0);
		}
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
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
		enterRule(_localctx, 142, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(693);
				match(EXPORT);
				}
			}

			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) {
				{
				setState(696);
				declarationTypes();
				}
			}

			setState(699);
			variableName();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(700);
				typeSelector();
				}
			}

			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(703);
				match(ASSIGN);
				setState(704);
				variableValue();
				}
			}

			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(707);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorBasedInputContext extends ParserRuleContext {
		public TerminalNode DECORATOR() { return getToken(AngularParser.DECORATOR, 0); }
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode DEFINITE_ASSIGN() { return getToken(AngularParser.DEFINITE_ASSIGN, 0); }
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public DecoratorBasedInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorBasedInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorBasedInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorBasedInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorBasedInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorBasedInputContext decoratorBasedInput() throws RecognitionException {
		DecoratorBasedInputContext _localctx = new DecoratorBasedInputContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_decoratorBasedInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(DECORATOR);
			setState(711);
			match(INPUT);
			setState(712);
			match(LPAREN);
			setState(713);
			match(RPAREN);
			setState(714);
			variableName();
			setState(715);
			match(DEFINITE_ASSIGN);
			setState(716);
			typeSelector();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(717);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationTypesContext extends ParserRuleContext {
		public DeclarationTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationTypes; }
	 
		public DeclarationTypesContext() { }
		public void copyFrom(DeclarationTypesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends DeclarationTypesContext {
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public VarDeclarationContext(DeclarationTypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetDeclarationContext extends DeclarationTypesContext {
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public LetDeclarationContext(DeclarationTypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclarationContext extends DeclarationTypesContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public ConstDeclarationContext(DeclarationTypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationTypesContext declarationTypes() throws RecognitionException {
		DeclarationTypesContext _localctx = new DeclarationTypesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_declarationTypes);
		try {
			setState(723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new ConstDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				match(CONST);
				}
				break;
			case LET:
				_localctx = new LetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(LET);
				}
				break;
			case VAR:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				match(VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableValueContext extends ParserRuleContext {
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
	 
		public VariableValueContext() { }
		public void copyFrom(VariableValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionValueContext extends VariableValueContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionValueContext extends VariableValueContext {
		public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
			return getRuleContext(ArrowFunctionDeclarationContext.class,0);
		}
		public ArrowFunctionValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_variableValue);
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDEFINED:
			case THIS:
			case IDDEFINER:
			case LCURLY:
			case LBRACK:
			case STRING:
			case NUMBER:
			case BOOL:
			case NULL:
				_localctx = new ExpressionValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				expression();
				}
				break;
			case LPAREN:
				_localctx = new ArrowFunctionValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				arrowFunctionDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public ArrayContentContext arrayContent() {
			return getRuleContext(ArrayContentContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(LBRACK);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDEFINED || _la==THIS || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1030792445953L) != 0)) {
				{
				setState(732);
				arrayContent();
				}
			}

			setState(735);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContentContext extends ParserRuleContext {
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
		public ArrayContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContentContext arrayContent() throws RecognitionException {
		ArrayContentContext _localctx = new ArrayContentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_arrayContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			expression();
			setState(742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(738);
					match(COMMA);
					setState(739);
					expression();
					}
					} 
				}
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(745);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public ObjectContentContext objectContent() {
			return getRuleContext(ObjectContentContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(LCURLY);
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDDEFINER) {
				{
				setState(749);
				objectContent();
				}
			}

			setState(752);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContentContext extends ParserRuleContext {
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
		public ObjectContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContentContext objectContent() throws RecognitionException {
		ObjectContentContext _localctx = new ObjectContentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_objectContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			objectProperty();
			setState(759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(755);
					match(COMMA);
					setState(756);
					objectProperty();
					}
					} 
				}
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(762);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyContext extends ParserRuleContext {
		public ObjectPropertyNameContext objectPropertyName() {
			return getRuleContext(ObjectPropertyNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 160, RULE_objectProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			objectPropertyName();
			setState(766);
			match(COLON);
			setState(767);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyNameContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public ObjectPropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPropertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyNameContext objectPropertyName() throws RecognitionException {
		ObjectPropertyNameContext _localctx = new ObjectPropertyNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_objectPropertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<ArithmaticExprContext> arithmaticExpr() {
			return getRuleContexts(ArithmaticExprContext.class);
		}
		public ArithmaticExprContext arithmaticExpr(int i) {
			return getRuleContext(ArithmaticExprContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			primaryExpr();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 993L) != 0)) {
				{
				{
				setState(772);
				arithmaticExpr();
				}
				}
				setState(777);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmaticExprContext extends ParserRuleContext {
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ArithmaticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmaticExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArithmaticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArithmaticExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArithmaticExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmaticExprContext arithmaticExpr() throws RecognitionException {
		ArithmaticExprContext _localctx = new ArithmaticExprContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_arithmaticExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			binaryOperator();
			setState(779);
			primaryExpr();
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(780);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	 
		public PrimaryExprContext() { }
		public void copyFrom(PrimaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLabelContext extends PrimaryExprContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectLabelContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableReferencesLabelContext extends PrimaryExprContext {
		public VariableReferencesContext variableReferences() {
			return getRuleContext(VariableReferencesContext.class,0);
		}
		public VariableReferencesLabelContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableReferencesLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableReferencesLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableReferencesLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLabelContext extends PrimaryExprContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayLabelContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessLabelContext extends PrimaryExprContext {
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public MemberAccessLabelContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberAccessLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberAccessLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberAccessLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessLabelContext extends PrimaryExprContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessLabelContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayAccessLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayAccessLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayAccessLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralLabelContext extends PrimaryExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralLabelContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallLabelContext extends PrimaryExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallLabelContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCallLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCallLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCallLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_primaryExpr);
		try {
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				_localctx = new LiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				literal();
				}
				break;
			case 2:
				_localctx = new ArrayLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				array();
				}
				break;
			case 3:
				_localctx = new ObjectLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				object();
				}
				break;
			case 4:
				_localctx = new VariableReferencesLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(786);
				variableReferences();
				}
				break;
			case 5:
				_localctx = new FunctionCallLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(787);
				functionCall();
				}
				break;
			case 6:
				_localctx = new MemberAccessLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(788);
				memberAccess();
				}
				break;
			case 7:
				_localctx = new ArrayAccessLabelContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(789);
				arrayAccess();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralLabelContext extends LiteralContext {
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public NullLiteralLabelContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNullLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNullLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNullLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UndefinedLiteralLabelContext extends LiteralContext {
		public TerminalNode UNDEFINED() { return getToken(AngularParser.UNDEFINED, 0); }
		public UndefinedLiteralLabelContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUndefinedLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUndefinedLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUndefinedLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLiteralLabelContext extends LiteralContext {
		public TerminalNode BOOL() { return getToken(AngularParser.BOOL, 0); }
		public BoolLiteralLabelContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBoolLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBoolLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBoolLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralLabelContext extends LiteralContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public NumberLiteralLabelContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumberLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumberLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumberLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralLabelContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public StringLiteralLabelContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_literal);
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NumberLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				match(NUMBER);
				}
				break;
			case BOOL:
				_localctx = new BoolLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(794);
				match(BOOL);
				}
				break;
			case NULL:
				_localctx = new NullLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(795);
				match(NULL);
				}
				break;
			case UNDEFINED:
				_localctx = new UndefinedLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(796);
				match(UNDEFINED);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableReferencesContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public VariableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReferences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferencesContext variableReferences() throws RecognitionException {
		VariableReferencesContext _localctx = new VariableReferencesContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_variableReferences);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ParserRuleContext {
		public MemberAccessElementContext memberAccessElement() {
			return getRuleContext(MemberAccessElementContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			memberAccessElement();
			setState(802);
			match(DOT);
			setState(803);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessElementContext extends ParserRuleContext {
		public MemberAccessElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccessElement; }
	 
		public MemberAccessElementContext() { }
		public void copyFrom(MemberAccessElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisLabelContext extends MemberAccessElementContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ThisLabelContext(MemberAccessElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdDefinerLabelContext extends MemberAccessElementContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public IdDefinerLabelContext(MemberAccessElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdDefinerLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdDefinerLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdDefinerLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessElementContext memberAccessElement() throws RecognitionException {
		MemberAccessElementContext _localctx = new MemberAccessElementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_memberAccessElement);
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDDEFINER:
				_localctx = new IdDefinerLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				match(IDDEFINER);
				}
				break;
			case THIS:
				_localctx = new ThisLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(THIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(IDDEFINER);
			setState(810);
			match(LBRACK);
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDEFINED || _la==THIS || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1030792445953L) != 0)) {
				{
				setState(811);
				expression();
				}
			}

			setState(814);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(IDDEFINER);
			setState(817);
			match(LPAREN);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDEFINED || _la==THIS || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1030792445953L) != 0)) {
				{
				setState(818);
				arguments();
				}
			}

			setState(821);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOperatorContext extends ParserRuleContext {
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
	 
		public BinaryOperatorContext() { }
		public void copyFrom(BinaryOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PercentLabelContext extends BinaryOperatorContext {
		public TerminalNode PERCENT() { return getToken(AngularParser.PERCENT, 0); }
		public PercentLabelContext(BinaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPercentLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPercentLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPercentLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionLabelContext extends BinaryOperatorContext {
		public TerminalNode DIVISION() { return getToken(AngularParser.DIVISION, 0); }
		public DivisionLabelContext(BinaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDivisionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDivisionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDivisionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusLabelContext extends BinaryOperatorContext {
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public MinusLabelContext(BinaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMinusLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMinusLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMinusLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarLabelContext extends BinaryOperatorContext {
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public StarLabelContext(BinaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStarLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStarLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStarLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusLabelContext extends BinaryOperatorContext {
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public PlusLabelContext(BinaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPlusLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPlusLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPlusLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignLabelContext extends BinaryOperatorContext {
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public AssignLabelContext(BinaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_binaryOperator);
		try {
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlusLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new MinusLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new StarLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				match(STAR);
				}
				break;
			case DIVISION:
				_localctx = new DivisionLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(826);
				match(DIVISION);
				}
				break;
			case PERCENT:
				_localctx = new PercentLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(827);
				match(PERCENT);
				}
				break;
			case ASSIGN:
				_localctx = new AssignLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(828);
				match(ASSIGN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(COLON);
			setState(832);
			type();
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeLabelContext extends TypeContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayTypeLabelContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayTypeLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayTypeLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayTypeLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseTypeLabelContext extends TypeContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public BaseTypeLabelContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBaseTypeLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBaseTypeLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBaseTypeLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayBracketTypeLabelContext extends TypeContext {
		public ArrayBracketTypeContext arrayBracketType() {
			return getRuleContext(ArrayBracketTypeContext.class,0);
		}
		public ArrayBracketTypeLabelContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayBracketTypeLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayBracketTypeLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayBracketTypeLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_type);
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new ArrayBracketTypeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				arrayBracketType();
				}
				break;
			case 2:
				_localctx = new BaseTypeLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				baseType();
				}
				break;
			case 3:
				_localctx = new ArrayTypeLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				arrayType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayBracketTypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(AngularParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AngularParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AngularParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AngularParser.RBRACK, i);
		}
		public ArrayBracketTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayBracketType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayBracketType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayBracketType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayBracketType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayBracketTypeContext arrayBracketType() throws RecognitionException {
		ArrayBracketTypeContext _localctx = new ArrayBracketTypeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_arrayBracketType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			baseType();
			setState(842); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(840);
					match(LBRACK);
					setState(841);
					match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(844); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(AngularParser.ARRAY, 0); }
		public TerminalNode OPEN_TAG() { return getToken(AngularParser.OPEN_TAG, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_TAG() { return getToken(AngularParser.CLOSE_TAG, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(ARRAY);
			setState(847);
			match(OPEN_TAG);
			setState(848);
			type();
			setState(849);
			match(CLOSE_TAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BaseTypeContext extends ParserRuleContext {
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
	 
		public BaseTypeContext() { }
		public void copyFrom(BaseTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidTypeContext extends BaseTypeContext {
		public TerminalNode VOID_TYPE() { return getToken(AngularParser.VOID_TYPE, 0); }
		public VoidTypeContext(BaseTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoutesTypeContext extends BaseTypeContext {
		public TerminalNode ROUTES() { return getToken(AngularParser.ROUTES, 0); }
		public RoutesTypeContext(BaseTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRoutesType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRoutesType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRoutesType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberTypeContext extends BaseTypeContext {
		public TerminalNode NUMBER_TYPE() { return getToken(AngularParser.NUMBER_TYPE, 0); }
		public NumberTypeContext(BaseTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumberType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumberType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTypeContext extends BaseTypeContext {
		public TerminalNode STRING_TYPE() { return getToken(AngularParser.STRING_TYPE, 0); }
		public StringTypeContext(BaseTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends BaseTypeContext {
		public TerminalNode BOOLEAN_TYPE() { return getToken(AngularParser.BOOLEAN_TYPE, 0); }
		public BooleanTypeContext(BaseTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdDefinerTypeContext extends BaseTypeContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public IdDefinerTypeContext(BaseTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdDefinerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdDefinerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdDefinerType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyTypeContext extends BaseTypeContext {
		public TerminalNode ANY_TYPE() { return getToken(AngularParser.ANY_TYPE, 0); }
		public AnyTypeContext(BaseTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_baseType);
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_TYPE:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				match(STRING_TYPE);
				}
				break;
			case NUMBER_TYPE:
				_localctx = new NumberTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				match(NUMBER_TYPE);
				}
				break;
			case BOOLEAN_TYPE:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				match(BOOLEAN_TYPE);
				}
				break;
			case ANY_TYPE:
				_localctx = new AnyTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				match(ANY_TYPE);
				}
				break;
			case VOID_TYPE:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(855);
				match(VOID_TYPE);
				}
				break;
			case ROUTES:
				_localctx = new RoutesTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(856);
				match(ROUTES);
				}
				break;
			case IDDEFINER:
				_localctx = new IdDefinerTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(857);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssProgContext extends ParserRuleContext {
		public CssProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProg; }
	 
		public CssProgContext() { }
		public void copyFrom(CssProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRootContext extends CssProgContext {
		public List<CssStatementContext> cssStatement() {
			return getRuleContexts(CssStatementContext.class);
		}
		public CssStatementContext cssStatement(int i) {
			return getRuleContext(CssStatementContext.class,i);
		}
		public CssRootContext(CssProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssProgContext cssProg() throws RecognitionException {
		CssProgContext _localctx = new CssProgContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_cssProg);
		int _la;
		try {
			_localctx = new CssRootContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(861); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(860);
				cssStatement();
				}
				}
				setState(863); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CSS_IMPORT || _la==BODY || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 563156145405953L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssStatementContext extends ParserRuleContext {
		public CssStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStatement; }
	 
		public CssStatementContext() { }
		public void copyFrom(CssStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleSetContext extends CssStatementContext {
		public RuleSetContext ruleSet() {
			return getRuleContext(RuleSetContext.class,0);
		}
		public CssRuleSetContext(CssStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssImportContext extends CssStatementContext {
		public CssImportStatementContext cssImportStatement() {
			return getRuleContext(CssImportStatementContext.class,0);
		}
		public CssImportContext(CssStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStatementContext cssStatement() throws RecognitionException {
		CssStatementContext _localctx = new CssStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_cssStatement);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
			case HTML:
			case IDDEFINER:
			case DOT:
			case HASH:
			case STAR:
				_localctx = new CssRuleSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				ruleSet();
				}
				break;
			case CSS_IMPORT:
				_localctx = new CssImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				cssImportStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssImportStatementContext extends ParserRuleContext {
		public TerminalNode CSS_IMPORT() { return getToken(AngularParser.CSS_IMPORT, 0); }
		public CssImportContentContext cssImportContent() {
			return getRuleContext(CssImportContentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public CssImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssImportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssImportStatementContext cssImportStatement() throws RecognitionException {
		CssImportStatementContext _localctx = new CssImportStatementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_cssImportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(CSS_IMPORT);
			setState(870);
			cssImportContent();
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(871);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssImportContentContext extends ParserRuleContext {
		public CssImportContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssImportContent; }
	 
		public CssImportContentContext() { }
		public void copyFrom(CssImportContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlContentContext extends CssImportContentContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public UrlContentContext(CssImportContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUrlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUrlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUrlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlStatementContentContext extends CssImportContentContext {
		public UrlStatementContext urlStatement() {
			return getRuleContext(UrlStatementContext.class,0);
		}
		public UrlStatementContentContext(CssImportContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUrlStatementContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUrlStatementContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUrlStatementContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssImportContentContext cssImportContent() throws RecognitionException {
		CssImportContentContext _localctx = new CssImportContentContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_cssImportContent);
		try {
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new UrlContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				url();
				}
				break;
			case CSS_URL:
				_localctx = new UrlStatementContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				urlStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UrlStatementContext extends ParserRuleContext {
		public TerminalNode CSS_URL() { return getToken(AngularParser.CSS_URL, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public UrlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUrlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUrlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUrlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlStatementContext urlStatement() throws RecognitionException {
		UrlStatementContext _localctx = new UrlStatementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_urlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(CSS_URL);
			setState(881);
			match(LPAREN);
			setState(882);
			match(STRING);
			setState(883);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetContext extends ParserRuleContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_ruleSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			selectorGroup();
			setState(886);
			match(LCURLY);
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 68719478783L) != 0)) {
				{
				{
				setState(887);
				declaration();
				}
				}
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(893);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorGroupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_selectorGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			selector();
			setState(900);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(896);
					match(COMMA);
					setState(897);
					selector();
					}
					} 
				}
				setState(902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(903);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelectorContext extends SelectorContext {
		public TerminalNode HTML() { return getToken(AngularParser.HTML, 0); }
		public HtmlSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarSelectorContext extends SelectorContext {
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public StarSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStarSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStarSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStarSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdDefinerSelectorContext extends SelectorContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public IdDefinerSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdDefinerSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdDefinerSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdDefinerSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssClassSelectorContext extends SelectorContext {
		public CssClassContext cssClass() {
			return getRuleContext(CssClassContext.class,0);
		}
		public CssClassSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIDSelectorContext extends SelectorContext {
		public CssIDContext cssID() {
			return getRuleContext(CssIDContext.class,0);
		}
		public CssIDSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssIDSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssIDSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssIDSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BodySelectorContext extends SelectorContext {
		public TerminalNode BODY() { return getToken(AngularParser.BODY, 0); }
		public BodySelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBodySelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBodySelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBodySelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_selector);
		try {
			setState(912);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CssClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				cssClass();
				}
				break;
			case HASH:
				_localctx = new CssIDSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				cssID();
				}
				break;
			case STAR:
				_localctx = new StarSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				match(STAR);
				}
				break;
			case HTML:
				_localctx = new HtmlSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(909);
				match(HTML);
				}
				break;
			case BODY:
				_localctx = new BodySelectorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(910);
				match(BODY);
				}
				break;
			case IDDEFINER:
				_localctx = new IdDefinerSelectorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(911);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssClassContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public CssClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssClassContext cssClass() throws RecognitionException {
		CssClassContext _localctx = new CssClassContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_cssClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(DOT);
			setState(915);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssIDContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(AngularParser.HASH, 0); }
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public CssIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssIDContext cssID() throws RecognitionException {
		CssIDContext _localctx = new CssIDContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_cssID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(HASH);
			setState(918);
			match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public CssPropertyContext cssProperty() {
			return getRuleContext(CssPropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			cssProperty();
			setState(921);
			match(COLON);
			setState(922);
			cssValue();
			setState(923);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyContext extends ParserRuleContext {
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
	 
		public CssPropertyContext() { }
		public void copyFrom(CssPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoxSizingPropertyContext extends CssPropertyContext {
		public TerminalNode BOXSIZING() { return getToken(AngularParser.BOXSIZING, 0); }
		public BoxSizingPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBoxSizingProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBoxSizingProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBoxSizingProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisplayPropertyContext extends CssPropertyContext {
		public TerminalNode DISPLAY() { return getToken(AngularParser.DISPLAY, 0); }
		public DisplayPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDisplayProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDisplayProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDisplayProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdDefinerPropertyContext extends CssPropertyContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public IdDefinerPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdDefinerProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdDefinerProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdDefinerProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionPropertyContext extends CssPropertyContext {
		public TerminalNode POSITION() { return getToken(AngularParser.POSITION, 0); }
		public PositionPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPositionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPositionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPositionProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundPropertyContext extends CssPropertyContext {
		public TerminalNode BACKGROUND() { return getToken(AngularParser.BACKGROUND, 0); }
		public BackgroundPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBackgroundProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBackgroundProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBackgroundProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MarginPropertyContext extends CssPropertyContext {
		public TerminalNode MARGIN() { return getToken(AngularParser.MARGIN, 0); }
		public MarginPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMarginProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMarginProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMarginProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontSizePropertyContext extends CssPropertyContext {
		public TerminalNode FONTSIZE() { return getToken(AngularParser.FONTSIZE, 0); }
		public FontSizePropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFontSizeProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFontSizeProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFontSizeProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderPropertyContext extends CssPropertyContext {
		public TerminalNode BORDER() { return getToken(AngularParser.BORDER, 0); }
		public BorderPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBorderProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBorderProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBorderProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PaddingPropertyContext extends CssPropertyContext {
		public TerminalNode PADDING() { return getToken(AngularParser.PADDING, 0); }
		public PaddingPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPaddingProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPaddingProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPaddingProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WidthPropertyContext extends CssPropertyContext {
		public TerminalNode WIDTH() { return getToken(AngularParser.WIDTH, 0); }
		public WidthPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWidthProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWidthProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWidthProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorPropertyContext extends CssPropertyContext {
		public TerminalNode COLOR() { return getToken(AngularParser.COLOR, 0); }
		public ColorPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterColorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitColorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitColorProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HeightPropertyContext extends CssPropertyContext {
		public TerminalNode HEIGHT() { return getToken(AngularParser.HEIGHT, 0); }
		public HeightPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHeightProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHeightProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHeightProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_cssProperty);
		try {
			setState(937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				_localctx = new ColorPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				match(COLOR);
				}
				break;
			case BACKGROUND:
				_localctx = new BackgroundPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(BACKGROUND);
				}
				break;
			case WIDTH:
				_localctx = new WidthPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				match(WIDTH);
				}
				break;
			case HEIGHT:
				_localctx = new HeightPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(928);
				match(HEIGHT);
				}
				break;
			case MARGIN:
				_localctx = new MarginPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(929);
				match(MARGIN);
				}
				break;
			case PADDING:
				_localctx = new PaddingPropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(930);
				match(PADDING);
				}
				break;
			case FONTSIZE:
				_localctx = new FontSizePropertyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(931);
				match(FONTSIZE);
				}
				break;
			case DISPLAY:
				_localctx = new DisplayPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(932);
				match(DISPLAY);
				}
				break;
			case POSITION:
				_localctx = new PositionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(933);
				match(POSITION);
				}
				break;
			case BORDER:
				_localctx = new BorderPropertyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(934);
				match(BORDER);
				}
				break;
			case BOXSIZING:
				_localctx = new BoxSizingPropertyContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(935);
				match(BOXSIZING);
				}
				break;
			case IDDEFINER:
				_localctx = new IdDefinerPropertyContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(936);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_cssValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			values();
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(940);
					match(COMMA);
					setState(941);
					values();
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(947);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	 
		public ValuesContext() { }
		public void copyFrom(ValuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdValueContext extends ValuesContext {
		public TerminalNode IDDEFINER() { return getToken(AngularParser.IDDEFINER, 0); }
		public IdValueContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorValueContext extends ValuesContext {
		public TerminalNode CSS_COLOR() { return getToken(AngularParser.CSS_COLOR, 0); }
		public ColorValueContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitColorValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitValueContext extends ValuesContext {
		public UnitOfMeasurementContext unitOfMeasurement() {
			return getRuleContext(UnitOfMeasurementContext.class,0);
		}
		public UnitValueContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnitValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnitValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends ValuesContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public StringValueContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_values);
		try {
			setState(954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new UnitValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				unitOfMeasurement();
				}
				break;
			case CSS_COLOR:
				_localctx = new ColorValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(CSS_COLOR);
				}
				break;
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				match(STRING);
				}
				break;
			case IDDEFINER:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(953);
				match(IDDEFINER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnitOfMeasurementContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(AngularParser.CSS_UNIT, 0); }
		public UnitOfMeasurementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitOfMeasurement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnitOfMeasurement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnitOfMeasurement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnitOfMeasurement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitOfMeasurementContext unitOfMeasurement() throws RecognitionException {
		UnitOfMeasurementContext _localctx = new UnitOfMeasurementContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_unitOfMeasurement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(NUMBER);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_UNIT) {
				{
				setState(957);
				match(CSS_UNIT);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0085\u03c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u00e6\b\u0000\u0001\u0001\u0004\u0001\u00e9\b\u0001"+
		"\u000b\u0001\f\u0001\u00ea\u0001\u0002\u0001\u0002\u0003\u0002\u00ef\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0005\u0003\u00f3\b\u0003\n\u0003\f\u0003"+
		"\u00f6\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u00fd\b\u0004\n\u0004\f\u0004\u0100\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u010b\b\u0006\n\u0006\f\u0006\u010e\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0126\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u012b\b\b\u0001\t\u0001\t\u0001\n\u0004"+
		"\n\u0130\b\n\u000b\n\f\n\u0131\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0137\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u013f\b\f\n\f\f\f\u0142\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u014d\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u015b\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u016c\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u017a\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0183\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u0188"+
		"\b\u0018\u000b\u0018\f\u0018\u0189\u0001\u0018\u0003\u0018\u018d\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0196\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01a0\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u01a4\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01ab"+
		"\b\u001d\n\u001d\f\u001d\u01ae\t\u001d\u0001\u001d\u0003\u001d\u01b1\b"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01b8\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0003 \u01c2\b \u0001 \u0001 \u0001!"+
		"\u0001!\u0001!\u0005!\u01c9\b!\n!\f!\u01cc\t!\u0001!\u0003!\u01cf\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d7\b\"\u0001#\u0001"+
		"#\u0003#\u01db\b#\u0001$\u0001$\u0001$\u0001$\u0001%\u0003%\u01e2\b%\u0001"+
		"%\u0001%\u0001%\u0003%\u01e7\b%\u0001%\u0001%\u0001%\u0003%\u01ec\b%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0004\'\u01f2\b\'\u000b\'\f\'\u01f3\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0005(\u01fc\b(\n(\f(\u01ff\t(\u0001(\u0003"+
		"(\u0202\b(\u0001(\u0001(\u0003(\u0206\b(\u0001)\u0001)\u0001*\u0001*\u0003"+
		"*\u020c\b*\u0001+\u0001+\u0001+\u0001+\u0001,\u0003,\u0213\b,\u0001,\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0005.\u021d\b.\n.\f.\u0220"+
		"\t.\u0001.\u0001.\u0001/\u0001/\u0003/\u0226\b/\u00010\u00010\u00011\u0001"+
		"1\u00011\u00031\u022d\b1\u00011\u00011\u00031\u0231\b1\u00011\u00011\u0001"+
		"2\u00012\u00013\u00033\u0238\b3\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00014\u00014\u00034\u0242\b4\u00054\u0244\b4\n4\f4\u0247\t4\u00015"+
		"\u00015\u00015\u00016\u00016\u00017\u00017\u00037\u0250\b7\u00018\u0001"+
		"8\u00019\u00019\u00019\u00019\u00039\u0258\b9\u00019\u00019\u00039\u025c"+
		"\b9\u00019\u00019\u0001:\u0001:\u0003:\u0262\b:\u0001:\u0001:\u0003:\u0266"+
		"\b:\u0001:\u0001:\u0001:\u0001;\u0001;\u0003;\u026d\b;\u0001<\u0001<\u0001"+
		"=\u0001=\u0001=\u0005=\u0274\b=\n=\f=\u0277\t=\u0001=\u0003=\u027a\b="+
		"\u0001>\u0001>\u0003>\u027e\b>\u0001>\u0003>\u0281\b>\u0001?\u0001?\u0001"+
		"?\u0001@\u0001@\u0005@\u0288\b@\n@\f@\u028b\t@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u0293\bA\u0001B\u0001B\u0001B\u0003B\u0298\bB\u0001"+
		"B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0003D\u02a3"+
		"\bD\u0001D\u0001D\u0001E\u0001E\u0001E\u0005E\u02aa\bE\nE\fE\u02ad\tE"+
		"\u0001E\u0003E\u02b0\bE\u0001F\u0001F\u0003F\u02b4\bF\u0001G\u0003G\u02b7"+
		"\bG\u0001G\u0003G\u02ba\bG\u0001G\u0001G\u0003G\u02be\bG\u0001G\u0001"+
		"G\u0003G\u02c2\bG\u0001G\u0003G\u02c5\bG\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0003H\u02cf\bH\u0001I\u0001I\u0001I\u0003I\u02d4"+
		"\bI\u0001J\u0001J\u0001K\u0001K\u0003K\u02da\bK\u0001L\u0001L\u0003L\u02de"+
		"\bL\u0001L\u0001L\u0001M\u0001M\u0001M\u0005M\u02e5\bM\nM\fM\u02e8\tM"+
		"\u0001M\u0003M\u02eb\bM\u0001N\u0001N\u0003N\u02ef\bN\u0001N\u0001N\u0001"+
		"O\u0001O\u0001O\u0005O\u02f6\bO\nO\fO\u02f9\tO\u0001O\u0003O\u02fc\bO"+
		"\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0005R\u0306"+
		"\bR\nR\fR\u0309\tR\u0001S\u0001S\u0001S\u0003S\u030e\bS\u0001T\u0001T"+
		"\u0001T\u0001T\u0001T\u0001T\u0001T\u0003T\u0317\bT\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0003U\u031e\bU\u0001V\u0001V\u0001W\u0001W\u0001W\u0001"+
		"W\u0001X\u0001X\u0003X\u0328\bX\u0001Y\u0001Y\u0001Y\u0003Y\u032d\bY\u0001"+
		"Y\u0001Y\u0001Z\u0001Z\u0001Z\u0003Z\u0334\bZ\u0001Z\u0001Z\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0003[\u033e\b[\u0001\\\u0001\\\u0001\\"+
		"\u0001]\u0001]\u0001]\u0003]\u0346\b]\u0001^\u0001^\u0001^\u0004^\u034b"+
		"\b^\u000b^\f^\u034c\u0001_\u0001_\u0001_\u0001_\u0001_\u0001`\u0001`\u0001"+
		"`\u0001`\u0001`\u0001`\u0001`\u0003`\u035b\b`\u0001a\u0004a\u035e\ba\u000b"+
		"a\fa\u035f\u0001b\u0001b\u0003b\u0364\bb\u0001c\u0001c\u0001c\u0003c\u0369"+
		"\bc\u0001d\u0001d\u0003d\u036d\bd\u0001e\u0001e\u0001f\u0001f\u0001f\u0001"+
		"f\u0001f\u0001g\u0001g\u0001g\u0005g\u0379\bg\ng\fg\u037c\tg\u0001g\u0001"+
		"g\u0001h\u0001h\u0001h\u0005h\u0383\bh\nh\fh\u0386\th\u0001h\u0003h\u0389"+
		"\bh\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u0391\bi\u0001j\u0001"+
		"j\u0001j\u0001k\u0001k\u0001k\u0001l\u0001l\u0001l\u0001l\u0001l\u0001"+
		"m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0003m\u03aa\bm\u0001n\u0001n\u0001n\u0005n\u03af\bn\nn\fn\u03b2"+
		"\tn\u0001n\u0003n\u03b5\bn\u0001o\u0001o\u0001o\u0001o\u0003o\u03bb\b"+
		"o\u0001p\u0001p\u0003p\u03bf\bp\u0001p\u0000\u0000q\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u0000\u0001\u0001"+
		"\u0000XY\u0410\u0000\u00e5\u0001\u0000\u0000\u0000\u0002\u00e8\u0001\u0000"+
		"\u0000\u0000\u0004\u00ee\u0001\u0000\u0000\u0000\u0006\u00f0\u0001\u0000"+
		"\u0000\u0000\b\u00f9\u0001\u0000\u0000\u0000\n\u0103\u0001\u0000\u0000"+
		"\u0000\f\u0107\u0001\u0000\u0000\u0000\u000e\u0125\u0001\u0000\u0000\u0000"+
		"\u0010\u012a\u0001\u0000\u0000\u0000\u0012\u012c\u0001\u0000\u0000\u0000"+
		"\u0014\u012f\u0001\u0000\u0000\u0000\u0016\u0133\u0001\u0000\u0000\u0000"+
		"\u0018\u013b\u0001\u0000\u0000\u0000\u001a\u0143\u0001\u0000\u0000\u0000"+
		"\u001c\u014c\u0001\u0000\u0000\u0000\u001e\u015a\u0001\u0000\u0000\u0000"+
		" \u015c\u0001\u0000\u0000\u0000\"\u0160\u0001\u0000\u0000\u0000$\u016b"+
		"\u0001\u0000\u0000\u0000&\u016d\u0001\u0000\u0000\u0000(\u0179\u0001\u0000"+
		"\u0000\u0000*\u017b\u0001\u0000\u0000\u0000,\u0182\u0001\u0000\u0000\u0000"+
		".\u0184\u0001\u0000\u0000\u00000\u018c\u0001\u0000\u0000\u00002\u0195"+
		"\u0001\u0000\u0000\u00004\u0197\u0001\u0000\u0000\u00006\u019f\u0001\u0000"+
		"\u0000\u00008\u01a1\u0001\u0000\u0000\u0000:\u01a7\u0001\u0000\u0000\u0000"+
		"<\u01b7\u0001\u0000\u0000\u0000>\u01b9\u0001\u0000\u0000\u0000@\u01bf"+
		"\u0001\u0000\u0000\u0000B\u01c5\u0001\u0000\u0000\u0000D\u01d6\u0001\u0000"+
		"\u0000\u0000F\u01da\u0001\u0000\u0000\u0000H\u01dc\u0001\u0000\u0000\u0000"+
		"J\u01e1\u0001\u0000\u0000\u0000L\u01ed\u0001\u0000\u0000\u0000N\u01ef"+
		"\u0001\u0000\u0000\u0000P\u01f7\u0001\u0000\u0000\u0000R\u0207\u0001\u0000"+
		"\u0000\u0000T\u020b\u0001\u0000\u0000\u0000V\u020d\u0001\u0000\u0000\u0000"+
		"X\u0212\u0001\u0000\u0000\u0000Z\u0218\u0001\u0000\u0000\u0000\\\u021a"+
		"\u0001\u0000\u0000\u0000^\u0225\u0001\u0000\u0000\u0000`\u0227\u0001\u0000"+
		"\u0000\u0000b\u0229\u0001\u0000\u0000\u0000d\u0234\u0001\u0000\u0000\u0000"+
		"f\u0237\u0001\u0000\u0000\u0000h\u0245\u0001\u0000\u0000\u0000j\u0248"+
		"\u0001\u0000\u0000\u0000l\u024b\u0001\u0000\u0000\u0000n\u024f\u0001\u0000"+
		"\u0000\u0000p\u0251\u0001\u0000\u0000\u0000r\u0253\u0001\u0000\u0000\u0000"+
		"t\u025f\u0001\u0000\u0000\u0000v\u026c\u0001\u0000\u0000\u0000x\u026e"+
		"\u0001\u0000\u0000\u0000z\u0270\u0001\u0000\u0000\u0000|\u027b\u0001\u0000"+
		"\u0000\u0000~\u0282\u0001\u0000\u0000\u0000\u0080\u0285\u0001\u0000\u0000"+
		"\u0000\u0082\u0292\u0001\u0000\u0000\u0000\u0084\u0294\u0001\u0000\u0000"+
		"\u0000\u0086\u029c\u0001\u0000\u0000\u0000\u0088\u02a0\u0001\u0000\u0000"+
		"\u0000\u008a\u02a6\u0001\u0000\u0000\u0000\u008c\u02b3\u0001\u0000\u0000"+
		"\u0000\u008e\u02b6\u0001\u0000\u0000\u0000\u0090\u02c6\u0001\u0000\u0000"+
		"\u0000\u0092\u02d3\u0001\u0000\u0000\u0000\u0094\u02d5\u0001\u0000\u0000"+
		"\u0000\u0096\u02d9\u0001\u0000\u0000\u0000\u0098\u02db\u0001\u0000\u0000"+
		"\u0000\u009a\u02e1\u0001\u0000\u0000\u0000\u009c\u02ec\u0001\u0000\u0000"+
		"\u0000\u009e\u02f2\u0001\u0000\u0000\u0000\u00a0\u02fd\u0001\u0000\u0000"+
		"\u0000\u00a2\u0301\u0001\u0000\u0000\u0000\u00a4\u0303\u0001\u0000\u0000"+
		"\u0000\u00a6\u030a\u0001\u0000\u0000\u0000\u00a8\u0316\u0001\u0000\u0000"+
		"\u0000\u00aa\u031d\u0001\u0000\u0000\u0000\u00ac\u031f\u0001\u0000\u0000"+
		"\u0000\u00ae\u0321\u0001\u0000\u0000\u0000\u00b0\u0327\u0001\u0000\u0000"+
		"\u0000\u00b2\u0329\u0001\u0000\u0000\u0000\u00b4\u0330\u0001\u0000\u0000"+
		"\u0000\u00b6\u033d\u0001\u0000\u0000\u0000\u00b8\u033f\u0001\u0000\u0000"+
		"\u0000\u00ba\u0345\u0001\u0000\u0000\u0000\u00bc\u0347\u0001\u0000\u0000"+
		"\u0000\u00be\u034e\u0001\u0000\u0000\u0000\u00c0\u035a\u0001\u0000\u0000"+
		"\u0000\u00c2\u035d\u0001\u0000\u0000\u0000\u00c4\u0363\u0001\u0000\u0000"+
		"\u0000\u00c6\u0365\u0001\u0000\u0000\u0000\u00c8\u036c\u0001\u0000\u0000"+
		"\u0000\u00ca\u036e\u0001\u0000\u0000\u0000\u00cc\u0370\u0001\u0000\u0000"+
		"\u0000\u00ce\u0375\u0001\u0000\u0000\u0000\u00d0\u037f\u0001\u0000\u0000"+
		"\u0000\u00d2\u0390\u0001\u0000\u0000\u0000\u00d4\u0392\u0001\u0000\u0000"+
		"\u0000\u00d6\u0395\u0001\u0000\u0000\u0000\u00d8\u0398\u0001\u0000\u0000"+
		"\u0000\u00da\u03a9\u0001\u0000\u0000\u0000\u00dc\u03ab\u0001\u0000\u0000"+
		"\u0000\u00de\u03ba\u0001\u0000\u0000\u0000\u00e0\u03bc\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e6\u00030\u0018\u0000\u00e3\u00e6\u0003\u0002\u0001\u0000"+
		"\u00e4\u00e6\u0003\u00c2a\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u0001\u0001\u0000\u0000\u0000\u00e7\u00e9\u0003\u0004\u0002\u0000\u00e8"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u0003\u0001\u0000\u0000\u0000\u00ec\u00ef\u0003\u0006\u0003\u0000\u00ed"+
		"\u00ef\u0003\f\u0006\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u0005\u0001\u0000\u0000\u0000\u00f0\u00f4"+
		"\u0003\b\u0004\u0000\u00f1\u00f3\u0003\u0010\b\u0000\u00f2\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003"+
		"\n\u0005\u0000\u00f8\u0007\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005a"+
		"\u0000\u0000\u00fa\u00fe\u0003\u000e\u0007\u0000\u00fb\u00fd\u0003\u001a"+
		"\r\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005b\u0000\u0000\u0102\t\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0005d\u0000\u0000\u0104\u0105\u0003\u000e\u0007\u0000\u0105"+
		"\u0106\u0005b\u0000\u0000\u0106\u000b\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0005a\u0000\u0000\u0108\u010c\u0003\u000e\u0007\u0000\u0109\u010b\u0003"+
		"\u001a\r\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0005c\u0000\u0000\u0110\r\u0001\u0000\u0000"+
		"\u0000\u0111\u0126\u0005\'\u0000\u0000\u0112\u0126\u0005)\u0000\u0000"+
		"\u0113\u0126\u0005(\u0000\u0000\u0114\u0126\u0005*\u0000\u0000\u0115\u0126"+
		"\u0005+\u0000\u0000\u0116\u0126\u0005,\u0000\u0000\u0117\u0126\u0005-"+
		"\u0000\u0000\u0118\u0126\u0005\\\u0000\u0000\u0119\u0126\u0005.\u0000"+
		"\u0000\u011a\u0126\u0005/\u0000\u0000\u011b\u0126\u00050\u0000\u0000\u011c"+
		"\u0126\u00051\u0000\u0000\u011d\u0126\u00052\u0000\u0000\u011e\u0126\u0005"+
		"3\u0000\u0000\u011f\u0126\u00054\u0000\u0000\u0120\u0126\u00055\u0000"+
		"\u0000\u0121\u0126\u00056\u0000\u0000\u0122\u0126\u00057\u0000\u0000\u0123"+
		"\u0126\u00058\u0000\u0000\u0124\u0126\u0005]\u0000\u0000\u0125\u0111\u0001"+
		"\u0000\u0000\u0000\u0125\u0112\u0001\u0000\u0000\u0000\u0125\u0113\u0001"+
		"\u0000\u0000\u0000\u0125\u0114\u0001\u0000\u0000\u0000\u0125\u0115\u0001"+
		"\u0000\u0000\u0000\u0125\u0116\u0001\u0000\u0000\u0000\u0125\u0117\u0001"+
		"\u0000\u0000\u0000\u0125\u0118\u0001\u0000\u0000\u0000\u0125\u0119\u0001"+
		"\u0000\u0000\u0000\u0125\u011a\u0001\u0000\u0000\u0000\u0125\u011b\u0001"+
		"\u0000\u0000\u0000\u0125\u011c\u0001\u0000\u0000\u0000\u0125\u011d\u0001"+
		"\u0000\u0000\u0000\u0125\u011e\u0001\u0000\u0000\u0000\u0125\u011f\u0001"+
		"\u0000\u0000\u0000\u0125\u0120\u0001\u0000\u0000\u0000\u0125\u0121\u0001"+
		"\u0000\u0000\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u000f\u0001"+
		"\u0000\u0000\u0000\u0127\u012b\u0003\u0016\u000b\u0000\u0128\u012b\u0003"+
		"\u0014\n\u0000\u0129\u012b\u0003\u0004\u0002\u0000\u012a\u0127\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000"+
		"\u0000\u0000\u012b\u0011\u0001\u0000\u0000\u0000\u012c\u012d\u0005]\u0000"+
		"\u0000\u012d\u0013\u0001\u0000\u0000\u0000\u012e\u0130\u0003\u0012\t\u0000"+
		"\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
		"\u0132\u0015\u0001\u0000\u0000\u0000\u0133\u0134\u0005l\u0000\u0000\u0134"+
		"\u0136\u0005l\u0000\u0000\u0135\u0137\u0003\u0018\f\u0000\u0136\u0135"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0005m\u0000\u0000\u0139\u013a\u0005"+
		"m\u0000\u0000\u013a\u0017\u0001\u0000\u0000\u0000\u013b\u0140\u0003\u00a4"+
		"R\u0000\u013c\u013d\u0005r\u0000\u0000\u013d\u013f\u0003\u00a4R\u0000"+
		"\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u0019\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0003\u001c\u000e\u0000\u0144\u0145\u0005n\u0000\u0000\u0145"+
		"\u0146\u0003.\u0017\u0000\u0146\u001b\u0001\u0000\u0000\u0000\u0147\u014d"+
		"\u0003\u001e\u000f\u0000\u0148\u014d\u0003 \u0010\u0000\u0149\u014d\u0003"+
		"&\u0013\u0000\u014a\u014d\u0003*\u0015\u0000\u014b\u014d\u0003\"\u0011"+
		"\u0000\u014c\u0147\u0001\u0000\u0000\u0000\u014c\u0148\u0001\u0000\u0000"+
		"\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000"+
		"\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u001d\u0001\u0000\u0000"+
		"\u0000\u014e\u015b\u0005\n\u0000\u0000\u014f\u015b\u0005_\u0000\u0000"+
		"\u0150\u015b\u0005`\u0000\u0000\u0151\u015b\u0005E\u0000\u0000\u0152\u015b"+
		"\u0005F\u0000\u0000\u0153\u015b\u0005G\u0000\u0000\u0154\u015b\u0005H"+
		"\u0000\u0000\u0155\u015b\u0005I\u0000\u0000\u0156\u015b\u0005J\u0000\u0000"+
		"\u0157\u015b\u0005K\u0000\u0000\u0158\u015b\u0005^\u0000\u0000\u0159\u015b"+
		"\u0005]\u0000\u0000\u015a\u014e\u0001\u0000\u0000\u0000\u015a\u014f\u0001"+
		"\u0000\u0000\u0000\u015a\u0150\u0001\u0000\u0000\u0000\u015a\u0151\u0001"+
		"\u0000\u0000\u0000\u015a\u0152\u0001\u0000\u0000\u0000\u015a\u0153\u0001"+
		"\u0000\u0000\u0000\u015a\u0154\u0001\u0000\u0000\u0000\u015a\u0155\u0001"+
		"\u0000\u0000\u0000\u015a\u0156\u0001\u0000\u0000\u0000\u015a\u0157\u0001"+
		"\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u0159\u0001"+
		"\u0000\u0000\u0000\u015b\u001f\u0001\u0000\u0000\u0000\u015c\u015d\u0005"+
		"o\u0000\u0000\u015d\u015e\u0003$\u0012\u0000\u015e\u015f\u0005p\u0000"+
		"\u0000\u015f!\u0001\u0000\u0000\u0000\u0160\u0161\u0005o\u0000\u0000\u0161"+
		"\u0162\u0005j\u0000\u0000\u0162\u0163\u0005W\u0000\u0000\u0163\u0164\u0005"+
		"k\u0000\u0000\u0164\u0165\u0005p\u0000\u0000\u0165#\u0001\u0000\u0000"+
		"\u0000\u0166\u016c\u0005L\u0000\u0000\u0167\u016c\u0005M\u0000\u0000\u0168"+
		"\u016c\u0005G\u0000\u0000\u0169\u016c\u0005F\u0000\u0000\u016a\u016c\u0005"+
		"]\u0000\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016b\u0167\u0001\u0000"+
		"\u0000\u0000\u016b\u0168\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c%\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0005j\u0000\u0000\u016e\u016f\u0003(\u0014\u0000\u016f"+
		"\u0170\u0005k\u0000\u0000\u0170\'\u0001\u0000\u0000\u0000\u0171\u017a"+
		"\u0005N\u0000\u0000\u0172\u017a\u0005O\u0000\u0000\u0173\u017a\u0005P"+
		"\u0000\u0000\u0174\u017a\u0005\\\u0000\u0000\u0175\u017a\u0005Q\u0000"+
		"\u0000\u0176\u017a\u0005R\u0000\u0000\u0177\u017a\u0005S\u0000\u0000\u0178"+
		"\u017a\u0005]\u0000\u0000\u0179\u0171\u0001\u0000\u0000\u0000\u0179\u0172"+
		"\u0001\u0000\u0000\u0000\u0179\u0173\u0001\u0000\u0000\u0000\u0179\u0174"+
		"\u0001\u0000\u0000\u0000\u0179\u0175\u0001\u0000\u0000\u0000\u0179\u0176"+
		"\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u0178"+
		"\u0001\u0000\u0000\u0000\u017a)\u0001\u0000\u0000\u0000\u017b\u017c\u0005"+
		"u\u0000\u0000\u017c\u017d\u0003,\u0016\u0000\u017d+\u0001\u0000\u0000"+
		"\u0000\u017e\u0183\u0005T\u0000\u0000\u017f\u0183\u0005U\u0000\u0000\u0180"+
		"\u0183\u0005V\u0000\u0000\u0181\u0183\u0005]\u0000\u0000\u0182\u017e\u0001"+
		"\u0000\u0000\u0000\u0182\u017f\u0001\u0000\u0000\u0000\u0182\u0180\u0001"+
		"\u0000\u0000\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183-\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0005\u0081\u0000\u0000\u0185/\u0001\u0000\u0000"+
		"\u0000\u0186\u0188\u00032\u0019\u0000\u0187\u0186\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000"+
		"\u018b\u018d\u0005\u0000\u0000\u0001\u018c\u0187\u0001\u0000\u0000\u0000"+
		"\u018c\u018b\u0001\u0000\u0000\u0000\u018d1\u0001\u0000\u0000\u0000\u018e"+
		"\u0196\u00034\u001a\u0000\u018f\u0196\u0003X,\u0000\u0190\u0196\u0003"+
		"n7\u0000\u0191\u0196\u0003f3\u0000\u0192\u0196\u0003>\u001f\u0000\u0193"+
		"\u0196\u0003\u008cF\u0000\u0194\u0196\u0003J%\u0000\u0195\u018e\u0001"+
		"\u0000\u0000\u0000\u0195\u018f\u0001\u0000\u0000\u0000\u0195\u0190\u0001"+
		"\u0000\u0000\u0000\u0195\u0191\u0001\u0000\u0000\u0000\u0195\u0192\u0001"+
		"\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0194\u0001"+
		"\u0000\u0000\u0000\u01963\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u0004"+
		"\u0000\u0000\u0198\u0199\u00036\u001b\u0000\u0199\u019a\u0005\u0005\u0000"+
		"\u0000\u019a\u019b\u0005\u0081\u0000\u0000\u019b\u019c\u0005f\u0000\u0000"+
		"\u019c5\u0001\u0000\u0000\u0000\u019d\u01a0\u0005]\u0000\u0000\u019e\u01a0"+
		"\u00038\u001c\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u019e\u0001"+
		"\u0000\u0000\u0000\u01a07\u0001\u0000\u0000\u0000\u01a1\u01a3\u0005l\u0000"+
		"\u0000\u01a2\u01a4\u0003:\u001d\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0005m\u0000\u0000\u01a69\u0001\u0000\u0000\u0000\u01a7\u01ac"+
		"\u0003<\u001e\u0000\u01a8\u01a9\u0005e\u0000\u0000\u01a9\u01ab\u0003<"+
		"\u001e\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000"+
		"\u0000\u0000\u01af\u01b1\u0005e\u0000\u0000\u01b0\u01af\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1;\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b8\u0005Z\u0000\u0000\u01b3\u01b8\u0005[\u0000\u0000\u01b4\u01b8"+
		"\u0005\\\u0000\u0000\u01b5\u01b8\u0005\u000b\u0000\u0000\u01b6\u01b8\u0005"+
		"]\u0000\u0000\u01b7\u01b2\u0001\u0000\u0000\u0000\u01b7\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8=\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0005\u0085\u0000\u0000\u01ba\u01bb\u0003<\u001e\u0000"+
		"\u01bb\u01bc\u0005j\u0000\u0000\u01bc\u01bd\u0003@ \u0000\u01bd\u01be"+
		"\u0005k\u0000\u0000\u01be?\u0001\u0000\u0000\u0000\u01bf\u01c1\u0005l"+
		"\u0000\u0000\u01c0\u01c2\u0003B!\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0005m\u0000\u0000\u01c4A\u0001\u0000\u0000\u0000\u01c5\u01ca"+
		"\u0003H$\u0000\u01c6\u01c7\u0005e\u0000\u0000\u01c7\u01c9\u0003H$\u0000"+
		"\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000"+
		"\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cf\u0005e\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cfC\u0001\u0000\u0000\u0000\u01d0\u01d7"+
		"\u0005\f\u0000\u0000\u01d1\u01d7\u0005\r\u0000\u0000\u01d2\u01d7\u0005"+
		"\u000e\u0000\u0000\u01d3\u01d7\u0005\u0010\u0000\u0000\u01d4\u01d7\u0005"+
		"\u000f\u0000\u0000\u01d5\u01d7\u0005\u0011\u0000\u0000\u01d6\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d1\u0001\u0000\u0000\u0000\u01d6\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7E\u0001\u0000"+
		"\u0000\u0000\u01d8\u01db\u0005\u0081\u0000\u0000\u01d9\u01db\u0003\u0098"+
		"L\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01dbG\u0001\u0000\u0000\u0000\u01dc\u01dd\u0003D\"\u0000\u01dd"+
		"\u01de\u0005g\u0000\u0000\u01de\u01df\u0003F#\u0000\u01dfI\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e2\u0005\u0006\u0000\u0000\u01e1\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0003\u0092I\u0000\u01e4\u01e6\u0003L&\u0000"+
		"\u01e5\u01e7\u0003\u00b8\\\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0005n\u0000\u0000\u01e9\u01eb\u0003N\'\u0000\u01ea\u01ec\u0005"+
		"f\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ecK\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005]\u0000\u0000"+
		"\u01eeM\u0001\u0000\u0000\u0000\u01ef\u01f1\u0005o\u0000\u0000\u01f0\u01f2"+
		"\u0003P(\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005p\u0000"+
		"\u0000\u01f6O\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005l\u0000\u0000\u01f8"+
		"\u01fd\u0003V+\u0000\u01f9\u01fa\u0005e\u0000\u0000\u01fa\u01fc\u0003"+
		"V+\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000"+
		"\u0000\u0200\u0202\u0005e\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000"+
		"\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000"+
		"\u0203\u0205\u0005m\u0000\u0000\u0204\u0206\u0005e\u0000\u0000\u0205\u0204"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206Q\u0001"+
		"\u0000\u0000\u0000\u0207\u0208\u0007\u0000\u0000\u0000\u0208S\u0001\u0000"+
		"\u0000\u0000\u0209\u020c\u0005\u0081\u0000\u0000\u020a\u020c\u0005]\u0000"+
		"\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020a\u0001\u0000\u0000"+
		"\u0000\u020cU\u0001\u0000\u0000\u0000\u020d\u020e\u0003R)\u0000\u020e"+
		"\u020f\u0005g\u0000\u0000\u020f\u0210\u0003T*\u0000\u0210W\u0001\u0000"+
		"\u0000\u0000\u0211\u0213\u0005\u0006\u0000\u0000\u0212\u0211\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0005\n\u0000\u0000\u0215\u0216\u0003Z-\u0000"+
		"\u0216\u0217\u0003\\.\u0000\u0217Y\u0001\u0000\u0000\u0000\u0218\u0219"+
		"\u0005]\u0000\u0000\u0219[\u0001\u0000\u0000\u0000\u021a\u021e\u0005l"+
		"\u0000\u0000\u021b\u021d\u0003^/\u0000\u021c\u021b\u0001\u0000\u0000\u0000"+
		"\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0001\u0000\u0000\u0000"+
		"\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0222\u0005m\u0000\u0000\u0222"+
		"]\u0001\u0000\u0000\u0000\u0223\u0226\u0003\u008cF\u0000\u0224\u0226\u0003"+
		"b1\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0224\u0001\u0000\u0000"+
		"\u0000\u0226_\u0001\u0000\u0000\u0000\u0227\u0228\u0005]\u0000\u0000\u0228"+
		"a\u0001\u0000\u0000\u0000\u0229\u022a\u0003`0\u0000\u022a\u022c\u0005"+
		"j\u0000\u0000\u022b\u022d\u0003z=\u0000\u022c\u022b\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000"+
		"\u0000\u022e\u0230\u0005k\u0000\u0000\u022f\u0231\u0003\u00b8\\\u0000"+
		"\u0230\u022f\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0003\u0080@\u0000\u0233"+
		"c\u0001\u0000\u0000\u0000\u0234\u0235\u0005]\u0000\u0000\u0235e\u0001"+
		"\u0000\u0000\u0000\u0236\u0238\u0005\u0006\u0000\u0000\u0237\u0236\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\u0005\b\u0000\u0000\u023a\u023b\u0003d"+
		"2\u0000\u023b\u023c\u0005l\u0000\u0000\u023c\u023d\u0003h4\u0000\u023d"+
		"\u023e\u0005m\u0000\u0000\u023eg\u0001\u0000\u0000\u0000\u023f\u0241\u0003"+
		"j5\u0000\u0240\u0242\u0005f\u0000\u0000\u0241\u0240\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0244\u0001\u0000\u0000"+
		"\u0000\u0243\u023f\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000\u0000"+
		"\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000"+
		"\u0000\u0246i\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000"+
		"\u0248\u0249\u0003l6\u0000\u0249\u024a\u0003\u00b8\\\u0000\u024ak\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0005]\u0000\u0000\u024cm\u0001\u0000\u0000"+
		"\u0000\u024d\u0250\u0003r9\u0000\u024e\u0250\u0003t:\u0000\u024f\u024d"+
		"\u0001\u0000\u0000\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u0250o\u0001"+
		"\u0000\u0000\u0000\u0251\u0252\u0005]\u0000\u0000\u0252q\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0005\t\u0000\u0000\u0254\u0255\u0003p8\u0000\u0255"+
		"\u0257\u0005j\u0000\u0000\u0256\u0258\u0003z=\u0000\u0257\u0256\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259\u0001"+
		"\u0000\u0000\u0000\u0259\u025b\u0005k\u0000\u0000\u025a\u025c\u0003\u00b8"+
		"\\\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0003\u0080@\u0000"+
		"\u025es\u0001\u0000\u0000\u0000\u025f\u0261\u0005j\u0000\u0000\u0260\u0262"+
		"\u0003z=\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000"+
		"\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0005k\u0000"+
		"\u0000\u0264\u0266\u0003\u00b8\\\u0000\u0265\u0264\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000"+
		"\u0267\u0268\u0005\u0007\u0000\u0000\u0268\u0269\u0003v;\u0000\u0269u"+
		"\u0001\u0000\u0000\u0000\u026a\u026d\u0003\u0088D\u0000\u026b\u026d\u0003"+
		"\u0080@\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026b\u0001\u0000"+
		"\u0000\u0000\u026dw\u0001\u0000\u0000\u0000\u026e\u026f\u0005]\u0000\u0000"+
		"\u026fy\u0001\u0000\u0000\u0000\u0270\u0275\u0003|>\u0000\u0271\u0272"+
		"\u0005e\u0000\u0000\u0272\u0274\u0003|>\u0000\u0273\u0271\u0001\u0000"+
		"\u0000\u0000\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000"+
		"\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0278\u027a\u0005e\u0000"+
		"\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000"+
		"\u0000\u027a{\u0001\u0000\u0000\u0000\u027b\u027d\u0003x<\u0000\u027c"+
		"\u027e\u0003\u00b8\\\u0000\u027d\u027c\u0001\u0000\u0000\u0000\u027d\u027e"+
		"\u0001\u0000\u0000\u0000\u027e\u0280\u0001\u0000\u0000\u0000\u027f\u0281"+
		"\u0003~?\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000"+
		"\u0000\u0000\u0281}\u0001\u0000\u0000\u0000\u0282\u0283\u0005n\u0000\u0000"+
		"\u0283\u0284\u0003\u00a4R\u0000\u0284\u007f\u0001\u0000\u0000\u0000\u0285"+
		"\u0289\u0005l\u0000\u0000\u0286\u0288\u0003\u0082A\u0000\u0287\u0286\u0001"+
		"\u0000\u0000\u0000\u0288\u028b\u0001\u0000\u0000\u0000\u0289\u0287\u0001"+
		"\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028c\u0001"+
		"\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028c\u028d\u0005"+
		"m\u0000\u0000\u028d\u0081\u0001\u0000\u0000\u0000\u028e\u0293\u0003\u008c"+
		"F\u0000\u028f\u0293\u0003\u00a4R\u0000\u0290\u0293\u0003\u0088D\u0000"+
		"\u0291\u0293\u0003\u0084B\u0000\u0292\u028e\u0001\u0000\u0000\u0000\u0292"+
		"\u028f\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292"+
		"\u0291\u0001\u0000\u0000\u0000\u0293\u0083\u0001\u0000\u0000\u0000\u0294"+
		"\u0295\u0003\u0086C\u0000\u0295\u0297\u0005j\u0000\u0000\u0296\u0298\u0003"+
		"\u008aE\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000"+
		"\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0005k\u0000"+
		"\u0000\u029a\u029b\u0005f\u0000\u0000\u029b\u0085\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0005!\u0000\u0000\u029d\u029e\u0005h\u0000\u0000\u029e\u029f"+
		"\u0005\"\u0000\u0000\u029f\u0087\u0001\u0000\u0000\u0000\u02a0\u02a2\u0005"+
		"\u001f\u0000\u0000\u02a1\u02a3\u0003\u00a4R\u0000\u02a2\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a5\u0005f\u0000\u0000\u02a5\u0089\u0001\u0000\u0000"+
		"\u0000\u02a6\u02ab\u0003\u00a4R\u0000\u02a7\u02a8\u0005e\u0000\u0000\u02a8"+
		"\u02aa\u0003\u00a4R\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa\u02ad"+
		"\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac"+
		"\u0001\u0000\u0000\u0000\u02ac\u02af\u0001\u0000\u0000\u0000\u02ad\u02ab"+
		"\u0001\u0000\u0000\u0000\u02ae\u02b0\u0005e\u0000\u0000\u02af\u02ae\u0001"+
		"\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u008b\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b4\u0003\u008eG\u0000\u02b2\u02b4\u0003\u0090"+
		"H\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b4\u008d\u0001\u0000\u0000\u0000\u02b5\u02b7\u0005\u0006\u0000"+
		"\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b9\u0001\u0000\u0000\u0000\u02b8\u02ba\u0003\u0092I\u0000"+
		"\u02b9\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bd\u0003\u0094J\u0000\u02bc"+
		"\u02be\u0003\u00b8\\\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000\u02bd\u02be"+
		"\u0001\u0000\u0000\u0000\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf\u02c0"+
		"\u0005n\u0000\u0000\u02c0\u02c2\u0003\u0096K\u0000\u02c1\u02bf\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c5\u0005f\u0000\u0000\u02c4\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u008f\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c7\u0005\u0085\u0000\u0000\u02c7\u02c8\u0005\\\u0000\u0000"+
		"\u02c8\u02c9\u0005j\u0000\u0000\u02c9\u02ca\u0005k\u0000\u0000\u02ca\u02cb"+
		"\u0003\u0094J\u0000\u02cb\u02cc\u0005|\u0000\u0000\u02cc\u02ce\u0003\u00b8"+
		"\\\u0000\u02cd\u02cf\u0005f\u0000\u0000\u02ce\u02cd\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u0091\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d4\u0005\u0012\u0000\u0000\u02d1\u02d4\u0005\u0013\u0000"+
		"\u0000\u02d2\u02d4\u0005\u0014\u0000\u0000\u02d3\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d4\u0093\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005]\u0000\u0000"+
		"\u02d6\u0095\u0001\u0000\u0000\u0000\u02d7\u02da\u0003\u00a4R\u0000\u02d8"+
		"\u02da\u0003t:\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02d8\u0001"+
		"\u0000\u0000\u0000\u02da\u0097\u0001\u0000\u0000\u0000\u02db\u02dd\u0005"+
		"o\u0000\u0000\u02dc\u02de\u0003\u009aM\u0000\u02dd\u02dc\u0001\u0000\u0000"+
		"\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000"+
		"\u0000\u02df\u02e0\u0005p\u0000\u0000\u02e0\u0099\u0001\u0000\u0000\u0000"+
		"\u02e1\u02e6\u0003\u00a4R\u0000\u02e2\u02e3\u0005e\u0000\u0000\u02e3\u02e5"+
		"\u0003\u00a4R\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e7\u02ea\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e9\u02eb\u0005e\u0000\u0000\u02ea\u02e9\u0001\u0000"+
		"\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u009b\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ee\u0005l\u0000\u0000\u02ed\u02ef\u0003\u009eO\u0000"+
		"\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005m\u0000\u0000\u02f1"+
		"\u009d\u0001\u0000\u0000\u0000\u02f2\u02f7\u0003\u00a0P\u0000\u02f3\u02f4"+
		"\u0005e\u0000\u0000\u02f4\u02f6\u0003\u00a0P\u0000\u02f5\u02f3\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fb\u0001\u0000"+
		"\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fc\u0005e\u0000"+
		"\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fc\u009f\u0001\u0000\u0000\u0000\u02fd\u02fe\u0003\u00a2Q\u0000"+
		"\u02fe\u02ff\u0005g\u0000\u0000\u02ff\u0300\u0003\u00a4R\u0000\u0300\u00a1"+
		"\u0001\u0000\u0000\u0000\u0301\u0302\u0005]\u0000\u0000\u0302\u00a3\u0001"+
		"\u0000\u0000\u0000\u0303\u0307\u0003\u00a8T\u0000\u0304\u0306\u0003\u00a6"+
		"S\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0306\u0309\u0001\u0000\u0000"+
		"\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000"+
		"\u0000\u0308\u00a5\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000"+
		"\u0000\u030a\u030b\u0003\u00b6[\u0000\u030b\u030d\u0003\u00a8T\u0000\u030c"+
		"\u030e\u0005f\u0000\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030d\u030e"+
		"\u0001\u0000\u0000\u0000\u030e\u00a7\u0001\u0000\u0000\u0000\u030f\u0317"+
		"\u0003\u00aaU\u0000\u0310\u0317\u0003\u0098L\u0000\u0311\u0317\u0003\u009c"+
		"N\u0000\u0312\u0317\u0003\u00acV\u0000\u0313\u0317\u0003\u00b4Z\u0000"+
		"\u0314\u0317\u0003\u00aeW\u0000\u0315\u0317\u0003\u00b2Y\u0000\u0316\u030f"+
		"\u0001\u0000\u0000\u0000\u0316\u0310\u0001\u0000\u0000\u0000\u0316\u0311"+
		"\u0001\u0000\u0000\u0000\u0316\u0312\u0001\u0000\u0000\u0000\u0316\u0313"+
		"\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0315"+
		"\u0001\u0000\u0000\u0000\u0317\u00a9\u0001\u0000\u0000\u0000\u0318\u031e"+
		"\u0005\u0081\u0000\u0000\u0319\u031e\u0005\u0082\u0000\u0000\u031a\u031e"+
		"\u0005\u0083\u0000\u0000\u031b\u031e\u0005\u0084\u0000\u0000\u031c\u031e"+
		"\u0005\u001e\u0000\u0000\u031d\u0318\u0001\u0000\u0000\u0000\u031d\u0319"+
		"\u0001\u0000\u0000\u0000\u031d\u031a\u0001\u0000\u0000\u0000\u031d\u031b"+
		"\u0001\u0000\u0000\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031e\u00ab"+
		"\u0001\u0000\u0000\u0000\u031f\u0320\u0005]\u0000\u0000\u0320\u00ad\u0001"+
		"\u0000\u0000\u0000\u0321\u0322\u0003\u00b0X\u0000\u0322\u0323\u0005h\u0000"+
		"\u0000\u0323\u0324\u0005]\u0000\u0000\u0324\u00af\u0001\u0000\u0000\u0000"+
		"\u0325\u0328\u0005]\u0000\u0000\u0326\u0328\u0005 \u0000\u0000\u0327\u0325"+
		"\u0001\u0000\u0000\u0000\u0327\u0326\u0001\u0000\u0000\u0000\u0328\u00b1"+
		"\u0001\u0000\u0000\u0000\u0329\u032a\u0005]\u0000\u0000\u032a\u032c\u0005"+
		"o\u0000\u0000\u032b\u032d\u0003\u00a4R\u0000\u032c\u032b\u0001\u0000\u0000"+
		"\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000"+
		"\u0000\u032e\u032f\u0005p\u0000\u0000\u032f\u00b3\u0001\u0000\u0000\u0000"+
		"\u0330\u0331\u0005]\u0000\u0000\u0331\u0333\u0005j\u0000\u0000\u0332\u0334"+
		"\u0003\u008aE\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333\u0334\u0001"+
		"\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0336\u0005"+
		"k\u0000\u0000\u0336\u00b5\u0001\u0000\u0000\u0000\u0337\u033e\u0005s\u0000"+
		"\u0000\u0338\u033e\u0005t\u0000\u0000\u0339\u033e\u0005u\u0000\u0000\u033a"+
		"\u033e\u0005v\u0000\u0000\u033b\u033e\u0005w\u0000\u0000\u033c\u033e\u0005"+
		"n\u0000\u0000\u033d\u0337\u0001\u0000\u0000\u0000\u033d\u0338\u0001\u0000"+
		"\u0000\u0000\u033d\u0339\u0001\u0000\u0000\u0000\u033d\u033a\u0001\u0000"+
		"\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033d\u033c\u0001\u0000"+
		"\u0000\u0000\u033e\u00b7\u0001\u0000\u0000\u0000\u033f\u0340\u0005g\u0000"+
		"\u0000\u0340\u0341\u0003\u00ba]\u0000\u0341\u00b9\u0001\u0000\u0000\u0000"+
		"\u0342\u0346\u0003\u00bc^\u0000\u0343\u0346\u0003\u00c0`\u0000\u0344\u0346"+
		"\u0003\u00be_\u0000\u0345\u0342\u0001\u0000\u0000\u0000\u0345\u0343\u0001"+
		"\u0000\u0000\u0000\u0345\u0344\u0001\u0000\u0000\u0000\u0346\u00bb\u0001"+
		"\u0000\u0000\u0000\u0347\u034a\u0003\u00c0`\u0000\u0348\u0349\u0005o\u0000"+
		"\u0000\u0349\u034b\u0005p\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000"+
		"\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000"+
		"\u034c\u034d\u0001\u0000\u0000\u0000\u034d\u00bd\u0001\u0000\u0000\u0000"+
		"\u034e\u034f\u0005\u001d\u0000\u0000\u034f\u0350\u0005a\u0000\u0000\u0350"+
		"\u0351\u0003\u00ba]\u0000\u0351\u0352\u0005b\u0000\u0000\u0352\u00bf\u0001"+
		"\u0000\u0000\u0000\u0353\u035b\u0005\u0019\u0000\u0000\u0354\u035b\u0005"+
		"\u001a\u0000\u0000\u0355\u035b\u0005\u001b\u0000\u0000\u0356\u035b\u0005"+
		"\u0018\u0000\u0000\u0357\u035b\u0005\u001c\u0000\u0000\u0358\u035b\u0005"+
		"\u000b\u0000\u0000\u0359\u035b\u0005]\u0000\u0000\u035a\u0353\u0001\u0000"+
		"\u0000\u0000\u035a\u0354\u0001\u0000\u0000\u0000\u035a\u0355\u0001\u0000"+
		"\u0000\u0000\u035a\u0356\u0001\u0000\u0000\u0000\u035a\u0357\u0001\u0000"+
		"\u0000\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035a\u0359\u0001\u0000"+
		"\u0000\u0000\u035b\u00c1\u0001\u0000\u0000\u0000\u035c\u035e\u0003\u00c4"+
		"b\u0000\u035d\u035c\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000"+
		"\u0000\u035f\u035d\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000"+
		"\u0000\u0360\u00c3\u0001\u0000\u0000\u0000\u0361\u0364\u0003\u00ceg\u0000"+
		"\u0362\u0364\u0003\u00c6c\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363"+
		"\u0362\u0001\u0000\u0000\u0000\u0364\u00c5\u0001\u0000\u0000\u0000\u0365"+
		"\u0366\u0005#\u0000\u0000\u0366\u0368\u0003\u00c8d\u0000\u0367\u0369\u0005"+
		"f\u0000\u0000\u0368\u0367\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000"+
		"\u0000\u0000\u0369\u00c7\u0001\u0000\u0000\u0000\u036a\u036d\u0003\u00ca"+
		"e\u0000\u036b\u036d\u0003\u00ccf\u0000\u036c\u036a\u0001\u0000\u0000\u0000"+
		"\u036c\u036b\u0001\u0000\u0000\u0000\u036d\u00c9\u0001\u0000\u0000\u0000"+
		"\u036e\u036f\u0005\u0081\u0000\u0000\u036f\u00cb\u0001\u0000\u0000\u0000"+
		"\u0370\u0371\u0005$\u0000\u0000\u0371\u0372\u0005j\u0000\u0000\u0372\u0373"+
		"\u0005\u0081\u0000\u0000\u0373\u0374\u0005k\u0000\u0000\u0374\u00cd\u0001"+
		"\u0000\u0000\u0000\u0375\u0376\u0003\u00d0h\u0000\u0376\u037a\u0005l\u0000"+
		"\u0000\u0377\u0379\u0003\u00d8l\u0000\u0378\u0377\u0001\u0000\u0000\u0000"+
		"\u0379\u037c\u0001\u0000\u0000\u0000\u037a\u0378\u0001\u0000\u0000\u0000"+
		"\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u037d\u0001\u0000\u0000\u0000"+
		"\u037c\u037a\u0001\u0000\u0000\u0000\u037d\u037e\u0005m\u0000\u0000\u037e"+
		"\u00cf\u0001\u0000\u0000\u0000\u037f\u0384\u0003\u00d2i\u0000\u0380\u0381"+
		"\u0005e\u0000\u0000\u0381\u0383\u0003\u00d2i\u0000\u0382\u0380\u0001\u0000"+
		"\u0000\u0000\u0383\u0386\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000"+
		"\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0388\u0001\u0000"+
		"\u0000\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0387\u0389\u0005e\u0000"+
		"\u0000\u0388\u0387\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000"+
		"\u0000\u0389\u00d1\u0001\u0000\u0000\u0000\u038a\u0391\u0003\u00d4j\u0000"+
		"\u038b\u0391\u0003\u00d6k\u0000\u038c\u0391\u0005u\u0000\u0000\u038d\u0391"+
		"\u0005D\u0000\u0000\u038e\u0391\u0005(\u0000\u0000\u038f\u0391\u0005]"+
		"\u0000\u0000\u0390\u038a\u0001\u0000\u0000\u0000\u0390\u038b\u0001\u0000"+
		"\u0000\u0000\u0390\u038c\u0001\u0000\u0000\u0000\u0390\u038d\u0001\u0000"+
		"\u0000\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u038f\u0001\u0000"+
		"\u0000\u0000\u0391\u00d3\u0001\u0000\u0000\u0000\u0392\u0393\u0005h\u0000"+
		"\u0000\u0393\u0394\u0005]\u0000\u0000\u0394\u00d5\u0001\u0000\u0000\u0000"+
		"\u0395\u0396\u0005i\u0000\u0000\u0396\u0397\u0005]\u0000\u0000\u0397\u00d7"+
		"\u0001\u0000\u0000\u0000\u0398\u0399\u0003\u00dam\u0000\u0399\u039a\u0005"+
		"g\u0000\u0000\u039a\u039b\u0003\u00dcn\u0000\u039b\u039c\u0005f\u0000"+
		"\u0000\u039c\u00d9\u0001\u0000\u0000\u0000\u039d\u03aa\u00059\u0000\u0000"+
		"\u039e\u03aa\u0005:\u0000\u0000\u039f\u03aa\u0005;\u0000\u0000\u03a0\u03aa"+
		"\u0005<\u0000\u0000\u03a1\u03aa\u0005=\u0000\u0000\u03a2\u03aa\u0005>"+
		"\u0000\u0000\u03a3\u03aa\u0005?\u0000\u0000\u03a4\u03aa\u0005@\u0000\u0000"+
		"\u03a5\u03aa\u0005A\u0000\u0000\u03a6\u03aa\u0005B\u0000\u0000\u03a7\u03aa"+
		"\u0005C\u0000\u0000\u03a8\u03aa\u0005]\u0000\u0000\u03a9\u039d\u0001\u0000"+
		"\u0000\u0000\u03a9\u039e\u0001\u0000\u0000\u0000\u03a9\u039f\u0001\u0000"+
		"\u0000\u0000\u03a9\u03a0\u0001\u0000\u0000\u0000\u03a9\u03a1\u0001\u0000"+
		"\u0000\u0000\u03a9\u03a2\u0001\u0000\u0000\u0000\u03a9\u03a3\u0001\u0000"+
		"\u0000\u0000\u03a9\u03a4\u0001\u0000\u0000\u0000\u03a9\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a9\u03a6\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000"+
		"\u0000\u0000\u03a9\u03a8\u0001\u0000\u0000\u0000\u03aa\u00db\u0001\u0000"+
		"\u0000\u0000\u03ab\u03b0\u0003\u00deo\u0000\u03ac\u03ad\u0005e\u0000\u0000"+
		"\u03ad\u03af\u0003\u00deo\u0000\u03ae\u03ac\u0001\u0000\u0000\u0000\u03af"+
		"\u03b2\u0001\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000\u03b0"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b4\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b3\u03b5\u0005e\u0000\u0000\u03b4\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u00dd"+
		"\u0001\u0000\u0000\u0000\u03b6\u03bb\u0003\u00e0p\u0000\u03b7\u03bb\u0005"+
		"%\u0000\u0000\u03b8\u03bb\u0005\u0081\u0000\u0000\u03b9\u03bb\u0005]\u0000"+
		"\u0000\u03ba\u03b6\u0001\u0000\u0000\u0000\u03ba\u03b7\u0001\u0000\u0000"+
		"\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03ba\u03b9\u0001\u0000\u0000"+
		"\u0000\u03bb\u00df\u0001\u0000\u0000\u0000\u03bc\u03be\u0005\u0082\u0000"+
		"\u0000\u03bd\u03bf\u0005&\u0000\u0000\u03be\u03bd\u0001\u0000\u0000\u0000"+
		"\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u00e1\u0001\u0000\u0000\u0000"+
		"d\u00e5\u00ea\u00ee\u00f4\u00fe\u010c\u0125\u012a\u0131\u0136\u0140\u014c"+
		"\u015a\u016b\u0179\u0182\u0189\u018c\u0195\u019f\u01a3\u01ac\u01b0\u01b7"+
		"\u01c1\u01ca\u01ce\u01d6\u01da\u01e1\u01e6\u01eb\u01f3\u01fd\u0201\u0205"+
		"\u020b\u0212\u021e\u0225\u022c\u0230\u0237\u0241\u0245\u024f\u0257\u025b"+
		"\u0261\u0265\u026c\u0275\u0279\u027d\u0280\u0289\u0292\u0297\u02a2\u02ab"+
		"\u02af\u02b3\u02b6\u02b9\u02bd\u02c1\u02c4\u02ce\u02d3\u02d9\u02dd\u02e6"+
		"\u02ea\u02ee\u02f7\u02fb\u0307\u030d\u0316\u031d\u0327\u032c\u0333\u033d"+
		"\u0345\u034c\u035a\u035f\u0363\u0368\u036c\u037a\u0384\u0388\u0390\u03a9"+
		"\u03b0\u03b4\u03ba\u03be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}