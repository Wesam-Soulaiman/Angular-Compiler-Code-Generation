package AST.TS;

public abstract class ClassMember extends TsProgContent{
    @Override
    public abstract String toString();

    // Optional: subclasses can override this if they want to generate JS
    public String generateJS() {
        return toString();
    }
}
