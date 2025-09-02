package AST;

public abstract class Prog {
    @Override
    public abstract String toString();

    public abstract String generateJS();
    public abstract String generateHTML();
}
