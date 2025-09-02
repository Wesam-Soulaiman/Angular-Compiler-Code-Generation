// Generated from C:/Users/LONOVO/Desktop/AngularCompiler/AngularCompiler/src/AngularParser.g4 by ANTLR 4.13.2
package gen;
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
	 * Visit a parse tree produced by the {@code TsProgram}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsProgram(AngularParser.TsProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlProgram}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlProgram(AngularParser.HtmlProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssProgram}
	 * labeled alternative in {@link AngularParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProgram(AngularParser.CssProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlRoot}
	 * labeled alternative in {@link AngularParser#htmlProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlRoot(AngularParser.HtmlRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOpenClose}
	 * labeled alternative in {@link AngularParser#htmlelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpenClose(AngularParser.HtmlOpenCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfClosing}
	 * labeled alternative in {@link AngularParser#htmlelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosing(AngularParser.HtmlSelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#openCloseTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenCloseTag(AngularParser.OpenCloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#startTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTag(AngularParser.StartTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#endTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndTag(AngularParser.EndTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivTag(AngularParser.DivTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NavTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavTag(AngularParser.NavTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BodyTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyTag(AngularParser.BodyTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpanTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanTag(AngularParser.SpanTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPTag(AngularParser.PTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ATag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitATag(AngularParser.ATagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ButtonTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonTag(AngularParser.ButtonTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputTag(AngularParser.InputTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormTag(AngularParser.FormTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImgTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgTag(AngularParser.ImgTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UlTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUlTag(AngularParser.UlTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiTag(AngularParser.LiTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H1Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1Tag(AngularParser.H1TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H2Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2Tag(AngularParser.H2TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H3Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3Tag(AngularParser.H3TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H4Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH4Tag(AngularParser.H4TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H5Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5Tag(AngularParser.H5TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H6Tag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH6Tag(AngularParser.H6TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomTag}
	 * labeled alternative in {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomTag(AngularParser.CustomTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlInterpolation}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlInterpolation(AngularParser.HtmlInterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlStatement}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStatement(AngularParser.HtmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlNestedElement}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNestedElement(AngularParser.HtmlNestedElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(AngularParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(AngularParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularInterpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularInterpolation(AngularParser.AngularInterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularInterpolationContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularInterpolationContent(AngularParser.AngularInterpolationContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttribute}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(AngularParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAttr(AngularParser.ClassAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAttr(AngularParser.IdAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TitleAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleAttr(AngularParser.TitleAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AltAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAttr(AngularParser.AltAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HrefAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHrefAttr(AngularParser.HrefAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SrcAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrcAttr(AngularParser.SrcAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisabledAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisabledAttr(AngularParser.DisabledAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAttr(AngularParser.TypeAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LinkAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkAttr(AngularParser.LinkAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LinkActiveAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkActiveAttr(AngularParser.LinkActiveAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAttr(AngularParser.NameAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdDefinerAttr}
	 * labeled alternative in {@link AngularParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDefinerAttr(AngularParser.IdDefinerAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularBinding(AngularParser.AngularBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#twoWayDataBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWayDataBinding(AngularParser.TwoWayDataBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBinding(AngularParser.ValueBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CheckedBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckedBinding(AngularParser.CheckedBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SrcBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrcBinding(AngularParser.SrcBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HrefBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHrefBinding(AngularParser.HrefBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomBinding}
	 * labeled alternative in {@link AngularParser#bindingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomBinding(AngularParser.CustomBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularEvent(AngularParser.AngularEventContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClickEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClickEvent(AngularParser.ClickEventContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgSubmitEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgSubmitEvent(AngularParser.NgSubmitEventContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChangeEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeEvent(AngularParser.ChangeEventContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputEvent(AngularParser.InputEventContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubmitEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmitEvent(AngularParser.SubmitEventContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyDownEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyDownEvent(AngularParser.KeyDownEventContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeyUpEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyUpEvent(AngularParser.KeyUpEventContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomEvent}
	 * labeled alternative in {@link AngularParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomEvent(AngularParser.CustomEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgIfDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfDirective(AngularParser.NgIfDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgForDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForDirective(AngularParser.NgForDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgSwitchDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgSwitchDirective(AngularParser.NgSwitchDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdDefinerDirective}
	 * labeled alternative in {@link AngularParser#directiveName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDefinerDirective(AngularParser.IdDefinerDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(AngularParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TsProgramBlock}
	 * labeled alternative in {@link AngularParser#tsProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsProgramBlock(AngularParser.TsProgramBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TsEmptyProgram}
	 * labeled alternative in {@link AngularParser#tsProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsEmptyProgram(AngularParser.TsEmptyProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TsImport}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsImport(AngularParser.TsImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TsClass}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsClass(AngularParser.TsClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TsFunction}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsFunction(AngularParser.TsFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TsInterface}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsInterface(AngularParser.TsInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TsDecorator}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsDecorator(AngularParser.TsDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TsVariableDecl}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsVariableDecl(AngularParser.TsVariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TsRouterDecl}
	 * labeled alternative in {@link AngularParser#tsProgContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsRouterDecl(AngularParser.TsRouterDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierImport}
	 * labeled alternative in {@link AngularParser#importContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierImport(AngularParser.IdentifierImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockImport}
	 * labeled alternative in {@link AngularParser#importContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockImport(AngularParser.BlockImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#namedImportBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedImportBlock(AngularParser.NamedImportBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#namedImportContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedImportContent(AngularParser.NamedImportContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentImport(AngularParser.ComponentImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InjectableImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableImport(AngularParser.InjectableImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputImport(AngularParser.InputImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputRoutes}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputRoutes(AngularParser.InputRoutesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdDefinerImport}
	 * labeled alternative in {@link AngularParser#namedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDefinerImport(AngularParser.IdDefinerImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decoratorObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorObject(AngularParser.DecoratorObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decoratorObjectContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorObjectContent(AngularParser.DecoratorObjectContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProperty(AngularParser.SelectorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateUrlProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportsProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProperty(AngularParser.ImportsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleUrlProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlProperty(AngularParser.StyleUrlPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleUrlsProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProvidedInProperty}
	 * labeled alternative in {@link AngularParser#decoratorPropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvidedInProperty(AngularParser.ProvidedInPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValues}
	 * labeled alternative in {@link AngularParser#decoratorPropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValues(AngularParser.StringValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AngularParser#decoratorPropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(AngularParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decoratorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorProperty(AngularParser.DecoratorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouterDeclaration(AngularParser.RouterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouterName(AngularParser.RouterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouters(AngularParser.RoutersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routerArrayContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouterArrayContent(AngularParser.RouterArrayContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routerPropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouterPropertyName(AngularParser.RouterPropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathValue}
	 * labeled alternative in {@link AngularParser#routerPropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathValue(AngularParser.PathValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentValue}
	 * labeled alternative in {@link AngularParser#routerPropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentValue(AngularParser.ComponentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routerProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouterProperty(AngularParser.RouterPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(AngularParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableMember(AngularParser.VariableMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodMember(AngularParser.MethodMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(AngularParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceName(AngularParser.InterfaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceProperty(AngularParser.InterfacePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfacePropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacePropertyName(AngularParser.InterfacePropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularFunction}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(AngularParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#regularFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName(AngularParser.RegularFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#regularFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionDeclaration(AngularParser.RegularFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionDeclaration(AngularParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionBody(AngularParser.ArrowFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterName(AngularParser.ParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(AngularParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationsStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationsStatement(AngularParser.VariableDeclarationsStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement_}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement_(AngularParser.ReturnStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsoleLogStatement}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLogStatement(AngularParser.ConsoleLogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#consoleLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLog(AngularParser.ConsoleLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#consoleLogSplit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLogSplit(AngularParser.ConsoleLogSplitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration_}
	 * labeled alternative in {@link AngularParser#variableDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration_(AngularParser.VariableDeclaration_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorInput}
	 * labeled alternative in {@link AngularParser#variableDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorInput(AngularParser.DecoratorInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decoratorBasedInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorBasedInput(AngularParser.DecoratorBasedInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstDeclaration}
	 * labeled alternative in {@link AngularParser#declarationTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(AngularParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetDeclaration}
	 * labeled alternative in {@link AngularParser#declarationTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDeclaration(AngularParser.LetDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link AngularParser#declarationTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(AngularParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(AngularParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionValue(AngularParser.ExpressionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionValue}
	 * labeled alternative in {@link AngularParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionValue(AngularParser.ArrowFunctionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngularParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayContent(AngularParser.ArrayContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AngularParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectContent(AngularParser.ObjectContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(AngularParser.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectPropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropertyName(AngularParser.ObjectPropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arithmaticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmaticExpr(AngularParser.ArithmaticExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralLabel(AngularParser.LiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLabel(AngularParser.ArrayLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLabel(AngularParser.ObjectLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableReferencesLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReferencesLabel(AngularParser.VariableReferencesLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallLabel(AngularParser.FunctionCallLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessLabel(AngularParser.MemberAccessLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessLabel}
	 * labeled alternative in {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessLabel(AngularParser.ArrayAccessLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralLabel(AngularParser.StringLiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteralLabel(AngularParser.NumberLiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteralLabel(AngularParser.BoolLiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteralLabel(AngularParser.NullLiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UndefinedLiteralLabel}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndefinedLiteralLabel(AngularParser.UndefinedLiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReferences(AngularParser.VariableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(AngularParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdDefinerLabel}
	 * labeled alternative in {@link AngularParser#memberAccessElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDefinerLabel(AngularParser.IdDefinerLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisLabel}
	 * labeled alternative in {@link AngularParser#memberAccessElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisLabel(AngularParser.ThisLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusLabel(AngularParser.PlusLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusLabel(AngularParser.MinusLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarLabel(AngularParser.StarLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivisionLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionLabel(AngularParser.DivisionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PercentLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentLabel(AngularParser.PercentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignLabel}
	 * labeled alternative in {@link AngularParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignLabel(AngularParser.AssignLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(AngularParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayBracketTypeLabel}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBracketTypeLabel(AngularParser.ArrayBracketTypeLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseTypeLabel}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeLabel(AngularParser.BaseTypeLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayTypeLabel}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeLabel(AngularParser.ArrayTypeLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayBracketType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBracketType(AngularParser.ArrayBracketTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(AngularParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyType(AngularParser.AnyTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(AngularParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoutesType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutesType(AngularParser.RoutesTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdDefinerType}
	 * labeled alternative in {@link AngularParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDefinerType(AngularParser.IdDefinerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRoot}
	 * labeled alternative in {@link AngularParser#cssProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRoot(AngularParser.CssRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRuleSet}
	 * labeled alternative in {@link AngularParser#cssStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRuleSet(AngularParser.CssRuleSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssImport}
	 * labeled alternative in {@link AngularParser#cssStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImport(AngularParser.CssImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssImportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImportStatement(AngularParser.CssImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UrlContent}
	 * labeled alternative in {@link AngularParser#cssImportContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlContent(AngularParser.UrlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UrlStatementContent}
	 * labeled alternative in {@link AngularParser#cssImportContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlStatementContent(AngularParser.UrlStatementContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(AngularParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#urlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlStatement(AngularParser.UrlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSet(AngularParser.RuleSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(AngularParser.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClassSelector(AngularParser.CssClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIDSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIDSelector(AngularParser.CssIDSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarSelector(AngularParser.StarSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelector(AngularParser.HtmlSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BodySelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodySelector(AngularParser.BodySelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdDefinerSelector}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDefinerSelector(AngularParser.IdDefinerSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClass(AngularParser.CssClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssID(AngularParser.CssIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColorProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorProperty(AngularParser.ColorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BackgroundProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundProperty(AngularParser.BackgroundPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WidthProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthProperty(AngularParser.WidthPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HeightProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeightProperty(AngularParser.HeightPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MarginProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarginProperty(AngularParser.MarginPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PaddingProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingProperty(AngularParser.PaddingPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FontSizeProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontSizeProperty(AngularParser.FontSizePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisplayProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayProperty(AngularParser.DisplayPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionProperty(AngularParser.PositionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BorderProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderProperty(AngularParser.BorderPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoxSizingProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxSizingProperty(AngularParser.BoxSizingPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdDefinerProperty}
	 * labeled alternative in {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDefinerProperty(AngularParser.IdDefinerPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(AngularParser.CssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitValue(AngularParser.UnitValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColorValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorValue(AngularParser.ColorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(AngularParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdValue}
	 * labeled alternative in {@link AngularParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdValue(AngularParser.IdValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#unitOfMeasurement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitOfMeasurement(AngularParser.UnitOfMeasurementContext ctx);
}