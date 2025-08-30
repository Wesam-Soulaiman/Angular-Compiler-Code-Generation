package AST.CSS;


public class UrlStatement {
    private String url;

    public UrlStatement(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "url(\"" + url + "\")";
    }
}

