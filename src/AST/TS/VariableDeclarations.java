package AST.TS;

public abstract class VariableDeclarations {
    @Override
    public abstract String toString();

    // New abstract method for JS generation
    public abstract String generateJS();
}
