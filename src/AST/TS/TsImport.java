package AST.TS;

public class TsImport extends TsProgContent {
    private ImportStatement importStatement;

    public TsImport(ImportStatement importStatement) {
        this.importStatement = importStatement;
    }

    public ImportStatement getImportStatement() {
        return importStatement;
    }

    public void setImportStatement(ImportStatement importStatement) {
        this.importStatement = importStatement;
    }

    @Override
    public String toString() {
        return importStatement.toString();
    }

    @Override
    public String generateJS() {
        return "";
    }

    @Override
    public String generateHTML() {
        return "";
    }
}
