package AST.TS;

public class TypeSelector {
    private Type type;

    public TypeSelector(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ": " + type.toString();
    }

    public String generateJS() {
        return "";
    }
}
