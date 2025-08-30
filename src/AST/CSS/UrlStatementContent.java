package AST.CSS;

public class UrlStatementContent extends CssImportContent {
    private UrlStatement urlStatement;

    public UrlStatementContent(UrlStatement urlStatement) {
        this.urlStatement = urlStatement;
    }

    public UrlStatement getUrlStatement() {
        return urlStatement;
    }

    @Override
    public String toString() {
        return urlStatement.toString();
    }
}
