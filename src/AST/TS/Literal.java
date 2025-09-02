package AST.TS;

public abstract class Literal {

    @Override
    public abstract String toString();

    public abstract String generateJS();
}
