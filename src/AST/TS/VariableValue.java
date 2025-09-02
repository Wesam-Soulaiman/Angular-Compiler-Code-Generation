package AST.TS;

public abstract class VariableValue {
    @Override
    public abstract String toString();

    public abstract String generateJS(); // Add for JS output
}
