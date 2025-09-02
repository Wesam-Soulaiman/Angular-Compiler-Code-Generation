package AST.HTML;

public abstract class StandardAttribute {
    public abstract String toString();

    public String generateHtml() {
        return toString();
    }
}
