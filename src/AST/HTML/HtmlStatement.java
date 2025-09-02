package AST.HTML;

// HtmlStatement
public class HtmlStatement extends ElementContent {
    private Statment statment; // ← fixed class name

    public HtmlStatement(Statment statment) { // ← fixed constructor
        this.statment = statment;
    }

    public Statment getStatment() {
        return statment;
    }

    public void setStatment(Statment statment) {
        this.statment = statment;
    }

    @Override
    public String toString() {
        return statment.toString();
    }

    @Override
    public String generateHTML() {
        // For a statement, just output its text content
        return statment.toString();
    }
}
