package AST.TS;

public class IdDefinerType extends BaseType {
    private String id;

    public IdDefinerType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id;
    }
}
