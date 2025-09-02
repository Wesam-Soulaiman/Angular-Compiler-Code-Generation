package AST.TS;

public abstract class TsNode {
    @Override
    public abstract String toString();

    public abstract String generateJS();
}
