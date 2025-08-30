package AST.TS;

public class IdentifierImport extends ImportContent {
    private String id;

    public IdentifierImport(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
