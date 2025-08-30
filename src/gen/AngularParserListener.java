// Generated from C:/Users/LONOVO/Desktop/AngularCompiler/AngularCompiler/src/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code TsProgram}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterTsProgram(AngularParser.TsProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TsProgram}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitTsProgram(AngularParser.TsProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlProgram}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterHtmlProgram(AngularParser.HtmlProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlProgram}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitHtmlProgram(AngularParser.HtmlProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssProgram}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterCssProgram(AngularParser.CssProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssProgram}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitCssProgram(AngularParser.CssProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlRoot}
	 * labeled alternative in {@link AngularParser#htmlProg}.
	 * @param ctx the parse tree
	 */
	void enterHtmlRoot(AngularParser.HtmlRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlRoot}
	 * labeled alternative in {@link AngularParser#htmlProg}.
	 * @param ctx the parse tree
	 */
	void exitHtmlRoot(AngularParser.HtmlRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlOpenClose}
	 * labeled alternative in {@link AngularParser#htmlelement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlOpenClose(AngularParser.HtmlOpenCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlOpenClose}
	 * labeled alternative in {@link AngularParser#htmlelement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlOpenClose(AngularParser.HtmlOpenCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSelfClosing}
	 * labeled alternative in {@link AngularParser#htmlelement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfClosing(AngularParser.HtmlSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSelfClosing}
	 * labeled alternative in {@link AngularParser#htmlelement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfClosing(AngularParser.HtmlSelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#openCloseTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenCloseTag(AngularParser.OpenCloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#openCloseTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenCloseTag(AngularParser.OpenCloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#startTag}.
	 * @param ctx the parse tree
	 */
	void enterStartTag(AngularParser.StartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#startTag}.
	 * @param ctx the parse tree
	 */
	void exitStartTag(AngularParser.StartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterEndTag(AngularParser.EndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitEndTag(AngularParser.EndTagContext ctx);
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
	 * Enter a parse tree produced by the {@code DivTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterDivTag(AngularParser.DivTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitDivTag(AngularParser.DivTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NavTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterNavTag(AngularParser.NavTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NavTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitNavTag(AngularParser.NavTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpanTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterSpanTag(AngularParser.SpanTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpanTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitSpanTag(AngularParser.SpanTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterPTag(AngularParser.PTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitPTag(AngularParser.PTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterATag(AngularParser.ATagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitATag(AngularParser.ATagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ButtonTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterButtonTag(AngularParser.ButtonTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ButtonTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitButtonTag(AngularParser.ButtonTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterInputTag(AngularParser.InputTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitInputTag(AngularParser.InputTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterFormTag(AngularParser.FormTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitFormTag(AngularParser.FormTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImgTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterImgTag(AngularParser.ImgTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImgTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitImgTag(AngularParser.ImgTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UlTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterUlTag(AngularParser.UlTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UlTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitUlTag(AngularParser.UlTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterLiTag(AngularParser.LiTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitLiTag(AngularParser.LiTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H1Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterH1Tag(AngularParser.H1TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H1Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitH1Tag(AngularParser.H1TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H2Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterH2Tag(AngularParser.H2TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H2Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitH2Tag(AngularParser.H2TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H3Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterH3Tag(AngularParser.H3TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H3Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitH3Tag(AngularParser.H3TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H4Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterH4Tag(AngularParser.H4TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H4Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitH4Tag(AngularParser.H4TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H5Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterH5Tag(AngularParser.H5TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H5Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitH5Tag(AngularParser.H5TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H6Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterH6Tag(AngularParser.H6TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H6Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitH6Tag(AngularParser.H6TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterCustomTag(AngularParser.CustomTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitCustomTag(AngularParser.CustomTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlInterpolation}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlInterpolation(AngularParser.HtmlInterpolationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlInterpolation}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlInterpolation(AngularParser.HtmlInterpolationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlStatement}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStatement(AngularParser.HtmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlStatement}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStatement(AngularParser.HtmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlNestedElement}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNestedElement(AngularParser.HtmlNestedElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlNestedElement}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNestedElement(AngularParser.HtmlNestedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(AngularParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(AngularParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(AngularParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(AngularParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularInterpolation}.
	 * @param ctx the parse tree
	 */
	void enterAngularInterpolation(AngularParser.AngularInterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularInterpolation}.
	 * @param ctx the parse tree
	 */
	void exitAngularInterpolation(AngularParser.AngularInterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularInterpolationContent}.
	 * @param ctx the parse tree
	 */
	void enterAngularInterpolationContent(AngularParser.AngularInterpolationContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularInterpolationContent}.
	 * @param ctx the parse tree
	 */
	void exitAngularInterpolationContent(AngularParser.AngularInterpolationContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(AngularParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(AngularParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterClassAttr(AngularParser.ClassAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitClassAttr(AngularParser.ClassAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterIdAttr(AngularParser.IdAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitIdAttr(AngularParser.IdAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TitleAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTitleAttr(AngularParser.TitleAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TitleAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTitleAttr(AngularParser.TitleAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AltAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAltAttr(AngularParser.AltAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AltAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAltAttr(AngularParser.AltAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HrefAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHrefAttr(AngularParser.HrefAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HrefAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHrefAttr(AngularParser.HrefAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SrcAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSrcAttr(AngularParser.SrcAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SrcAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSrcAttr(AngularParser.SrcAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DisabledAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDisabledAttr(AngularParser.DisabledAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DisabledAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDisabledAttr(AngularParser.DisabledAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTypeAttr(AngularParser.TypeAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTypeAttr(AngularParser.TypeAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LinkAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterLinkAttr(AngularParser.LinkAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LinkAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitLinkAttr(AngularParser.LinkAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LinkActiveAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterLinkActiveAttr(AngularParser.LinkActiveAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LinkActiveAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitLinkActiveAttr(AngularParser.LinkActiveAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNameAttr(AngularParser.NameAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNameAttr(AngularParser.NameAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdDefinerAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterIdDefinerAttr(AngularParser.IdDefinerAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdDefinerAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitIdDefinerAttr(AngularParser.IdDefinerAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularBinding}.
	 * @param ctx the parse tree
	 */
	void enterAngularBinding(AngularParser.AngularBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularBinding}.
	 * @param ctx the parse tree
	 */
	void exitAngularBinding(AngularParser.AngularBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#twoWayDataBinding}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayDataBinding(AngularParser.TwoWayDataBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#twoWayDataBinding}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayDataBinding(AngularParser.TwoWayDataBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 */
	void enterValueBinding(AngularParser.ValueBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 */
	void exitValueBinding(AngularParser.ValueBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CheckedBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 */
	void enterCheckedBinding(AngularParser.CheckedBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CheckedBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 */
	void exitCheckedBinding(AngularParser.CheckedBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SrcBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 */
	void enterSrcBinding(AngularParser.SrcBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SrcBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 */
	void exitSrcBinding(AngularParser.SrcBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HrefBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 */
	void enterHrefBinding(AngularParser.HrefBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HrefBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 */
	void exitHrefBinding(AngularParser.HrefBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 */
	void enterCustomBinding(AngularParser.CustomBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 */
	void exitCustomBinding(AngularParser.CustomBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularEvent}.
	 * @param ctx the parse tree
	 */
	void enterAngularEvent(AngularParser.AngularEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularEvent}.
	 * @param ctx the parse tree
	 */
	void exitAngularEvent(AngularParser.AngularEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClickEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterClickEvent(AngularParser.ClickEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClickEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitClickEvent(AngularParser.ClickEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubmitEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterSubmitEvent(AngularParser.SubmitEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubmitEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitSubmitEvent(AngularParser.SubmitEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChangeEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterChangeEvent(AngularParser.ChangeEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChangeEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitChangeEvent(AngularParser.ChangeEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterInputEvent(AngularParser.InputEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitInputEvent(AngularParser.InputEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyDownEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterKeyDownEvent(AngularParser.KeyDownEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyDownEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitKeyDownEvent(AngularParser.KeyDownEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeyUpEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterKeyUpEvent(AngularParser.KeyUpEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeyUpEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitKeyUpEvent(AngularParser.KeyUpEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterCustomEvent(AngularParser.CustomEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitCustomEvent(AngularParser.CustomEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void enterAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void exitAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgIfDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 */
	void enterNgIfDirective(AngularParser.NgIfDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgIfDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 */
	void exitNgIfDirective(AngularParser.NgIfDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgForDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 */
	void enterNgForDirective(AngularParser.NgForDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgForDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 */
	void exitNgForDirective(AngularParser.NgForDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgSwitchDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 */
	void enterNgSwitchDirective(AngularParser.NgSwitchDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgSwitchDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 */
	void exitNgSwitchDirective(AngularParser.NgSwitchDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdDefinerDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 */
	void enterIdDefinerDirective(AngularParser.IdDefinerDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdDefinerDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 */
	void exitIdDefinerDirective(AngularParser.IdDefinerDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(AngularParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(AngularParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TsProgramBlock}
	 * labeled alternative in {@link AngularParser#tsProg}.
	 * @param ctx the parse tree
	 */
	void enterTsProgramBlock(AngularParser.TsProgramBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TsProgramBlock}
	 * labeled alternative in {@link AngularParser#tsProg}.
	 * @param ctx the parse tree
	 */
	void exitTsProgramBlock(AngularParser.TsProgramBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TsEmptyProgram}
	 * labeled alternative in {@link AngularParser#tsProg}.
	 * @param ctx the parse tree
	 */
	void enterTsEmptyProgram(AngularParser.TsEmptyProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TsEmptyProgram}
	 * labeled alternative in {@link AngularParser#tsProg}.
	 * @param ctx the parse tree
	 */
	void exitTsEmptyProgram(AngularParser.TsEmptyProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TsImport}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void enterTsImport(AngularParser.TsImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TsImport}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void exitTsImport(AngularParser.TsImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TsClass}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void enterTsClass(AngularParser.TsClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TsClass}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void exitTsClass(AngularParser.TsClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TsFunction}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void enterTsFunction(AngularParser.TsFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TsFunction}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void exitTsFunction(AngularParser.TsFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TsInterface}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void enterTsInterface(AngularParser.TsInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TsInterface}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void exitTsInterface(AngularParser.TsInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TsDecorator}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void enterTsDecorator(AngularParser.TsDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TsDecorator}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void exitTsDecorator(AngularParser.TsDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TsVariableDecl}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void enterTsVariableDecl(AngularParser.TsVariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TsVariableDecl}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 */
	void exitTsVariableDecl(AngularParser.TsVariableDeclContext ctx);
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
	 * Enter a parse tree produced by the {@code IdentifierImport}
	 * labeled alternative in {@link AngularParser#importContent}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierImport(AngularParser.IdentifierImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierImport}
	 * labeled alternative in {@link AngularParser#importContent}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierImport(AngularParser.IdentifierImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockImport}
	 * labeled alternative in {@link AngularParser#importContent}.
	 * @param ctx the parse tree
	 */
	void enterBlockImport(AngularParser.BlockImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockImport}
	 * labeled alternative in {@link AngularParser#importContent}.
	 * @param ctx the parse tree
	 */
	void exitBlockImport(AngularParser.BlockImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#namedImportBlock}.
	 * @param ctx the parse tree
	 */
	void enterNamedImportBlock(AngularParser.NamedImportBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#namedImportBlock}.
	 * @param ctx the parse tree
	 */
	void exitNamedImportBlock(AngularParser.NamedImportBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#namedImportContent}.
	 * @param ctx the parse tree
	 */
	void enterNamedImportContent(AngularParser.NamedImportContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#namedImportContent}.
	 * @param ctx the parse tree
	 */
	void exitNamedImportContent(AngularParser.NamedImportContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void enterComponentImport(AngularParser.ComponentImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void exitComponentImport(AngularParser.ComponentImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InjectableImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void enterInjectableImport(AngularParser.InjectableImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InjectableImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void exitInjectableImport(AngularParser.InjectableImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void enterInputImport(AngularParser.InputImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void exitInputImport(AngularParser.InputImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputRoutes}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void enterInputRoutes(AngularParser.InputRoutesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputRoutes}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void exitInputRoutes(AngularParser.InputRoutesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdDefinerImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void enterIdDefinerImport(AngularParser.IdDefinerImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdDefinerImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 */
	void exitIdDefinerImport(AngularParser.IdDefinerImportContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#decoratorObject}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorObject(AngularParser.DecoratorObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decoratorObject}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorObject(AngularParser.DecoratorObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decoratorObjectContent}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorObjectContent(AngularParser.DecoratorObjectContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decoratorObjectContent}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorObjectContent(AngularParser.DecoratorObjectContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProperty(AngularParser.SelectorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProperty(AngularParser.SelectorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateUrlProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateUrlProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportsProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void enterImportsProperty(AngularParser.ImportsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportsProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void exitImportsProperty(AngularParser.ImportsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrlProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlProperty(AngularParser.StyleUrlPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrlProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlProperty(AngularParser.StyleUrlPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrlsProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrlsProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProvidedInProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void enterProvidedInProperty(AngularParser.ProvidedInPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProvidedInProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 */
	void exitProvidedInProperty(AngularParser.ProvidedInPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValues}
	 * labeled alternative in {@link AngularParser#decoratorPropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValues(AngularParser.StringValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValues}
	 * labeled alternative in {@link AngularParser#decoratorPropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValues(AngularParser.StringValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AngularParser#decoratorPropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(AngularParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AngularParser#decoratorPropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(AngularParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decoratorProperty}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorProperty(AngularParser.DecoratorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decoratorProperty}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorProperty(AngularParser.DecoratorPropertyContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(AngularParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(AngularParser.ClassNameContext ctx);
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
	 * Enter a parse tree produced by the {@code VariableMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterVariableMember(AngularParser.VariableMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitVariableMember(AngularParser.VariableMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterMethodMember(AngularParser.MethodMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitMethodMember(AngularParser.MethodMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(AngularParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(AngularParser.MethodNameContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(AngularParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(AngularParser.InterfaceNameContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceProperty}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceProperty(AngularParser.InterfacePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceProperty}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceProperty(AngularParser.InterfacePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfacePropertyName}.
	 * @param ctx the parse tree
	 */
	void enterInterfacePropertyName(AngularParser.InterfacePropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfacePropertyName}.
	 * @param ctx the parse tree
	 */
	void exitInterfacePropertyName(AngularParser.InterfacePropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularFunction}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(AngularParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularFunction}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(AngularParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(AngularParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(AngularParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#regularFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionDeclaration(AngularParser.RegularFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#regularFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionDeclaration(AngularParser.RegularFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionDeclaration(AngularParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionDeclaration(AngularParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBody(AngularParser.ArrowFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBody(AngularParser.ArrowFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(AngularParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(AngularParser.ParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AngularParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AngularParser.ParametersContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(AngularParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(AngularParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationsStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationsStatement(AngularParser.VariableDeclarationsStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationsStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationsStatement(AngularParser.VariableDeclarationsStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement_}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement_(AngularParser.ReturnStatement_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement_}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement_(AngularParser.ReturnStatement_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsoleLogStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConsoleLogStatement(AngularParser.ConsoleLogStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsoleLogStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConsoleLogStatement(AngularParser.ConsoleLogStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#consoleLog}.
	 * @param ctx the parse tree
	 */
	void enterConsoleLog(AngularParser.ConsoleLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#consoleLog}.
	 * @param ctx the parse tree
	 */
	void exitConsoleLog(AngularParser.ConsoleLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#consoleLogSplit}.
	 * @param ctx the parse tree
	 */
	void enterConsoleLogSplit(AngularParser.ConsoleLogSplitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#consoleLogSplit}.
	 * @param ctx the parse tree
	 */
	void exitConsoleLogSplit(AngularParser.ConsoleLogSplitContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration_}
	 * labeled alternative in {@link AngularParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration_(AngularParser.VariableDeclaration_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration_}
	 * labeled alternative in {@link AngularParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration_(AngularParser.VariableDeclaration_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorInput}
	 * labeled alternative in {@link AngularParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorInput(AngularParser.DecoratorInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorInput}
	 * labeled alternative in {@link AngularParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorInput(AngularParser.DecoratorInputContext ctx);
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
	 * Enter a parse tree produced by {@link AngularParser#decoratorBasedInput}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorBasedInput(AngularParser.DecoratorBasedInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decoratorBasedInput}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorBasedInput(AngularParser.DecoratorBasedInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstDeclaration}
	 * labeled alternative in {@link AngularParser#declarationTypes}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(AngularParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstDeclaration}
	 * labeled alternative in {@link AngularParser#declarationTypes}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(AngularParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetDeclaration}
	 * labeled alternative in {@link AngularParser#declarationTypes}.
	 * @param ctx the parse tree
	 */
	void enterLetDeclaration(AngularParser.LetDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetDeclaration}
	 * labeled alternative in {@link AngularParser#declarationTypes}.
	 * @param ctx the parse tree
	 */
	void exitLetDeclaration(AngularParser.LetDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link AngularParser#declarationTypes}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(AngularParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link AngularParser#declarationTypes}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(AngularParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(AngularParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(AngularParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterExpressionValue(AngularParser.ExpressionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitExpressionValue(AngularParser.ExpressionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionValue}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionValue(AngularParser.ArrowFunctionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionValue}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionValue(AngularParser.ArrowFunctionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngularParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngularParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayContent}.
	 * @param ctx the parse tree
	 */
	void enterArrayContent(AngularParser.ArrayContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayContent}.
	 * @param ctx the parse tree
	 */
	void exitArrayContent(AngularParser.ArrayContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AngularParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AngularParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectContent}.
	 * @param ctx the parse tree
	 */
	void enterObjectContent(AngularParser.ObjectContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectContent}.
	 * @param ctx the parse tree
	 */
	void exitObjectContent(AngularParser.ObjectContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperty(AngularParser.ObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperty(AngularParser.ObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectPropertyName}.
	 * @param ctx the parse tree
	 */
	void enterObjectPropertyName(AngularParser.ObjectPropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectPropertyName}.
	 * @param ctx the parse tree
	 */
	void exitObjectPropertyName(AngularParser.ObjectPropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arithmaticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmaticExpr(AngularParser.ArithmaticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arithmaticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmaticExpr(AngularParser.ArithmaticExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralLabel(AngularParser.LiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralLabel(AngularParser.LiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayLabel(AngularParser.ArrayLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayLabel(AngularParser.ArrayLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterObjectLabel(AngularParser.ObjectLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitObjectLabel(AngularParser.ObjectLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableReferencesLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterVariableReferencesLabel(AngularParser.VariableReferencesLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableReferencesLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitVariableReferencesLabel(AngularParser.VariableReferencesLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallLabel(AngularParser.FunctionCallLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallLabel(AngularParser.FunctionCallLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessLabel(AngularParser.MemberAccessLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessLabel(AngularParser.MemberAccessLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessLabel(AngularParser.ArrayAccessLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessLabel(AngularParser.ArrayAccessLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralLabel(AngularParser.StringLiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralLabel(AngularParser.StringLiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteralLabel(AngularParser.NumberLiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteralLabel(AngularParser.NumberLiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteralLabel(AngularParser.BoolLiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteralLabel(AngularParser.BoolLiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteralLabel(AngularParser.NullLiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteralLabel(AngularParser.NullLiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UndefinedLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterUndefinedLiteralLabel(AngularParser.UndefinedLiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UndefinedLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitUndefinedLiteralLabel(AngularParser.UndefinedLiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableReferences}.
	 * @param ctx the parse tree
	 */
	void enterVariableReferences(AngularParser.VariableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableReferences}.
	 * @param ctx the parse tree
	 */
	void exitVariableReferences(AngularParser.VariableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(AngularParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(AngularParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdDefinerLabel}
	 * labeled alternative in {@link AngularParser#memberAccessElement}.
	 * @param ctx the parse tree
	 */
	void enterIdDefinerLabel(AngularParser.IdDefinerLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdDefinerLabel}
	 * labeled alternative in {@link AngularParser#memberAccessElement}.
	 * @param ctx the parse tree
	 */
	void exitIdDefinerLabel(AngularParser.IdDefinerLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisLabel}
	 * labeled alternative in {@link AngularParser#memberAccessElement}.
	 * @param ctx the parse tree
	 */
	void enterThisLabel(AngularParser.ThisLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisLabel}
	 * labeled alternative in {@link AngularParser#memberAccessElement}.
	 * @param ctx the parse tree
	 */
	void exitThisLabel(AngularParser.ThisLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPlusLabel(AngularParser.PlusLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPlusLabel(AngularParser.PlusLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinusLabel(AngularParser.MinusLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinusLabel(AngularParser.MinusLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterStarLabel(AngularParser.StarLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitStarLabel(AngularParser.StarLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivisionLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterDivisionLabel(AngularParser.DivisionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivisionLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitDivisionLabel(AngularParser.DivisionLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PercentLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPercentLabel(AngularParser.PercentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PercentLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPercentLabel(AngularParser.PercentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignLabel(AngularParser.AssignLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignLabel(AngularParser.AssignLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(AngularParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(AngularParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayBracketTypeLabel}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayBracketTypeLabel(AngularParser.ArrayBracketTypeLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayBracketTypeLabel}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayBracketTypeLabel(AngularParser.ArrayBracketTypeLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BaseTypeLabel}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeLabel(AngularParser.BaseTypeLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BaseTypeLabel}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeLabel(AngularParser.BaseTypeLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayTypeLabel}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeLabel(AngularParser.ArrayTypeLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayTypeLabel}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeLabel(AngularParser.ArrayTypeLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayBracketType}.
	 * @param ctx the parse tree
	 */
	void enterArrayBracketType(AngularParser.ArrayBracketTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayBracketType}.
	 * @param ctx the parse tree
	 */
	void exitArrayBracketType(AngularParser.ArrayBracketTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(AngularParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(AngularParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(AngularParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(AngularParser.AnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(AngularParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(AngularParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RoutesType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterRoutesType(AngularParser.RoutesTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RoutesType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitRoutesType(AngularParser.RoutesTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdDefinerType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterIdDefinerType(AngularParser.IdDefinerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdDefinerType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitIdDefinerType(AngularParser.IdDefinerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRoot}
	 * labeled alternative in {@link AngularParser#cssProg}.
	 * @param ctx the parse tree
	 */
	void enterCssRoot(AngularParser.CssRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRoot}
	 * labeled alternative in {@link AngularParser#cssProg}.
	 * @param ctx the parse tree
	 */
	void exitCssRoot(AngularParser.CssRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRuleSet}
	 * labeled alternative in {@link AngularParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void enterCssRuleSet(AngularParser.CssRuleSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRuleSet}
	 * labeled alternative in {@link AngularParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void exitCssRuleSet(AngularParser.CssRuleSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssImport}
	 * labeled alternative in {@link AngularParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void enterCssImport(AngularParser.CssImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssImport}
	 * labeled alternative in {@link AngularParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void exitCssImport(AngularParser.CssImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssImportStatement}.
	 * @param ctx the parse tree
	 */
	void enterCssImportStatement(AngularParser.CssImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssImportStatement}.
	 * @param ctx the parse tree
	 */
	void exitCssImportStatement(AngularParser.CssImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UrlContent}
	 * labeled alternative in {@link AngularParser#cssImportContent}.
	 * @param ctx the parse tree
	 */
	void enterUrlContent(AngularParser.UrlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UrlContent}
	 * labeled alternative in {@link AngularParser#cssImportContent}.
	 * @param ctx the parse tree
	 */
	void exitUrlContent(AngularParser.UrlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UrlStatementContent}
	 * labeled alternative in {@link AngularParser#cssImportContent}.
	 * @param ctx the parse tree
	 */
	void enterUrlStatementContent(AngularParser.UrlStatementContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UrlStatementContent}
	 * labeled alternative in {@link AngularParser#cssImportContent}.
	 * @param ctx the parse tree
	 */
	void exitUrlStatementContent(AngularParser.UrlStatementContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(AngularParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(AngularParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#urlStatement}.
	 * @param ctx the parse tree
	 */
	void enterUrlStatement(AngularParser.UrlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#urlStatement}.
	 * @param ctx the parse tree
	 */
	void exitUrlStatement(AngularParser.UrlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(AngularParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(AngularParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(AngularParser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(AngularParser.SelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCssClassSelector(AngularParser.CssClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCssClassSelector(AngularParser.CssClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssIDSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCssIDSelector(AngularParser.CssIDSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIDSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCssIDSelector(AngularParser.CssIDSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterStarSelector(AngularParser.StarSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitStarSelector(AngularParser.StarSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelector(AngularParser.HtmlSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelector(AngularParser.HtmlSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BodySelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterBodySelector(AngularParser.BodySelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BodySelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitBodySelector(AngularParser.BodySelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdDefinerSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterIdDefinerSelector(AngularParser.IdDefinerSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdDefinerSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitIdDefinerSelector(AngularParser.IdDefinerSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssClass}.
	 * @param ctx the parse tree
	 */
	void enterCssClass(AngularParser.CssClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssClass}.
	 * @param ctx the parse tree
	 */
	void exitCssClass(AngularParser.CssClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssID}.
	 * @param ctx the parse tree
	 */
	void enterCssID(AngularParser.CssIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssID}.
	 * @param ctx the parse tree
	 */
	void exitCssID(AngularParser.CssIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterColorProperty(AngularParser.ColorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitColorProperty(AngularParser.ColorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BackgroundProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterBackgroundProperty(AngularParser.BackgroundPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BackgroundProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitBackgroundProperty(AngularParser.BackgroundPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WidthProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterWidthProperty(AngularParser.WidthPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WidthProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitWidthProperty(AngularParser.WidthPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HeightProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterHeightProperty(AngularParser.HeightPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HeightProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitHeightProperty(AngularParser.HeightPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MarginProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterMarginProperty(AngularParser.MarginPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MarginProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitMarginProperty(AngularParser.MarginPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PaddingProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterPaddingProperty(AngularParser.PaddingPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PaddingProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitPaddingProperty(AngularParser.PaddingPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FontSizeProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterFontSizeProperty(AngularParser.FontSizePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FontSizeProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitFontSizeProperty(AngularParser.FontSizePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DisplayProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterDisplayProperty(AngularParser.DisplayPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DisplayProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitDisplayProperty(AngularParser.DisplayPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterPositionProperty(AngularParser.PositionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitPositionProperty(AngularParser.PositionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BorderProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterBorderProperty(AngularParser.BorderPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BorderProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitBorderProperty(AngularParser.BorderPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoxSizingProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterBoxSizingProperty(AngularParser.BoxSizingPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoxSizingProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitBoxSizingProperty(AngularParser.BoxSizingPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdDefinerProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterIdDefinerProperty(AngularParser.IdDefinerPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdDefinerProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitIdDefinerProperty(AngularParser.IdDefinerPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(AngularParser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(AngularParser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 */
	void enterUnitValue(AngularParser.UnitValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 */
	void exitUnitValue(AngularParser.UnitValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 */
	void enterColorValue(AngularParser.ColorValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 */
	void exitColorValue(AngularParser.ColorValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(AngularParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(AngularParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 */
	void enterIdValue(AngularParser.IdValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 */
	void exitIdValue(AngularParser.IdValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#unitOfMeasurement}.
	 * @param ctx the parse tree
	 */
	void enterUnitOfMeasurement(AngularParser.UnitOfMeasurementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#unitOfMeasurement}.
	 * @param ctx the parse tree
	 */
	void exitUnitOfMeasurement(AngularParser.UnitOfMeasurementContext ctx);
}