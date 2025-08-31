package AST.HTML;

// HtmlStatement
public class HtmlStatement extends ElementContent {
    private Statment statment; // ← أصلحت كتابة النوع

    public HtmlStatement(Statment statment) { // ← أصلحت اسم الكلاس
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
}
