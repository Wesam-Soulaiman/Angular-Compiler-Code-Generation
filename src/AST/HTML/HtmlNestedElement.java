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

    @Override
    public String generateHTML() {
        // delegate to the nested element
        return htmlelement.generateHTML();
    }
}
