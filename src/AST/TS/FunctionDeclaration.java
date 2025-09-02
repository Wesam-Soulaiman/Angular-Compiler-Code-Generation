package AST.TS;

public abstract class FunctionDeclaration {
    @Override
    public abstract String toString();

    // Add abstract generateJS
    public abstract String generateJS();
}
