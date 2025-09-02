package AST.HTML;

// HtmlNestedElement
public class HtmlNestedElement extends ElementContent {
    private HtmlElement htmlelement;

    public HtmlNestedElement(HtmlElement htmlelement) {
        this.htmlelement = htmlelement;
    }

    @Override
    public String toString() {
        return "\n" + "   " + htmlelement.toString();
    }
}