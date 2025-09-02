package AST.HTML;

public class HtmlSelfClosing extends HtmlElement {
    private SelfClosingTag selfClosingTag;

    public HtmlSelfClosing(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    @Override
    public String toString() {
        return selfClosingTag.toString();
    }

    @Override
    public String generateHTML() {
        return selfClosingTag.generateHTML();
    }

}
