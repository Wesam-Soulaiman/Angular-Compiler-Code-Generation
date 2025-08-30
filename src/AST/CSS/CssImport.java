package AST.CSS;

public class CssImport extends CssStatement {
    private CssImportStatement importStatement;

    public CssImport(CssImportStatement importStatement) {
        this.importStatement = importStatement;
    }

    public CssImportStatement getImportStatement() {
        return importStatement;
    }

    @Override
    public String toString() {
        return importStatement.toString();
    }
}
