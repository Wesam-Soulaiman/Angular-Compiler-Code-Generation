package AST.TS;

public abstract class TsProgContent extends TsNode {
    @Override
    public abstract String toString();

    public abstract String generateJS();
    public abstract String generateHTML();
}
