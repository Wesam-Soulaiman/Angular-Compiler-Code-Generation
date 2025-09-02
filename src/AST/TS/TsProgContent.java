package AST.TS;

public abstract class TsProgContent extends TsNode {
    @Override
    public abstract String toString();

    @Override
    public abstract String generateJS();
}
