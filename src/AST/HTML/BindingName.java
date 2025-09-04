package AST.HTML;

public abstract class BindingName {
    public abstract String toString();

    public String generateHTML() {
        return toString();
    }
}
