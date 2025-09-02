package AST.HTML;

public abstract class HtmlElement extends HtmlNode {
    @Override
    public abstract String toString();

    public abstract String generateHTML();
}
