package AST.CSS;

public class UrlContent extends CssImportContent {
    private Url url;

    public UrlContent(Url url) {
        this.url = url;
    }

    public Url getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return url.toString();
    }
}
