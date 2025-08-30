package AST.TS;

public class ImportStatement {

    private ImportContent importContent;
    private String fromModule;  // قيمة STRING

    public ImportStatement(ImportContent importContent, String fromModule) {
        this.importContent = importContent;
        this.fromModule = fromModule;
    }

    public ImportContent getImportContent() {
        return importContent;
    }

    public void setImportContent(ImportContent importContent) {
        this.importContent = importContent;
    }

    public String getFromModule() {
        return fromModule;
    }

    public void setFromModule(String fromModule) {
        this.fromModule = fromModule;
    }

    @Override
    public String toString() {
        return "import " + importContent.toString() + " from " + fromModule + ";";
    }
}
