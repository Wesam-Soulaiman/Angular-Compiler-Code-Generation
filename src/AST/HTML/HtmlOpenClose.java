package AST.HTML;

public class HtmlOpenClose extends HtmlElement {
    private OpenCloseTag openCloseTag;

    public HtmlOpenClose(OpenCloseTag openCloseTag) {
        this.openCloseTag = openCloseTag;
    }

    @Override
    public String toString() {
        return openCloseTag.toString();
    }
}
