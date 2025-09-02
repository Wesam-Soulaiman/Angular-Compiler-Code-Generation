package AST.TS;

public abstract class PrimaryExpr {
    @Override
    public abstract String toString();

    public abstract String generateJS();
}
