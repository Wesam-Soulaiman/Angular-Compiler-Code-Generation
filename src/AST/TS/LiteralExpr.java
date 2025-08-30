package AST.TS;

public class LiteralExpr extends PrimaryExpr {

    private Literal literal;

    public LiteralExpr(Literal literal) {
        this.literal = literal;
    }

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        return literal.toString();
    }
}
