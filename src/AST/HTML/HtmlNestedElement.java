package AST.HTML;

// HtmlNestedElement
public class HtmlNestedElement extends ElementContent { // ← أصلحت الاسم ليطابق الليبل
    private HtmlElement htmlelement; // ← أصلحت النوع

    public HtmlNestedElement(HtmlElement htmlelement) {
        this.htmlelement = htmlelement;
    }

    @Override
    public String toString() {
        return htmlelement.toString();
    }
}
