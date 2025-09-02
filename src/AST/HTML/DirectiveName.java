package AST.HTML;

public abstract class DirectiveName {
    public abstract String toString();

    public String generateHtml() {
        return toString();
    }
}
