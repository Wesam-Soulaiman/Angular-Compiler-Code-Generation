package AST.TS;

public abstract class BinaryOperator {
    @Override
    public abstract String toString();

    public abstract String generateJS();
}
