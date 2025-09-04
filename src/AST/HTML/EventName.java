package AST.HTML;

public abstract class EventName {
    public abstract String toString();

    public String generateHTML() {
        return toString();
    }
}
