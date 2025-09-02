package AST.TS;

public class RouterPropertyName {

    public enum Kind {
        PATH,
        ROUTE_COMPONENT
    }

    private Kind kind;

    public RouterPropertyName(Kind kind) {
        this.kind = kind;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return kind == Kind.PATH ? "path" : "component";
    }

    public String generateJS() {
        return toString();
    }
}
