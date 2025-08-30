package AST.CSS;



public class CssImportStatement {
    private CssImportContent importContent;

    public CssImportStatement(CssImportContent importContent) {
        this.importContent = importContent;

    }

    public CssImportContent getImportContent() {
        return importContent;
    }

    @Override
    public String toString() {
        return "@import " + importContent.toString() +  ";" ;
    }
}
