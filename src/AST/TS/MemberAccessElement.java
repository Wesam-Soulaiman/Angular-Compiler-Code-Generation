package AST.TS;

public abstract class MemberAccessElement {

    @Override
    public abstract String toString();

    public abstract String generateJS();  // Each subclass must implement
}
