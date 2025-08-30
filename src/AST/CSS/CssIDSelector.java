package AST.CSS;

public class CssIDSelector extends Selector {
    private CssID cssID;

    public CssIDSelector(CssID cssID) {
        this.cssID = cssID;
    }

    public CssID getCssID() {
        return cssID;
    }

    public void setCssID(CssID cssID) {
        this.cssID = cssID;
    }

    @Override
    public String toString() {
        return cssID.toString();
    }
}
