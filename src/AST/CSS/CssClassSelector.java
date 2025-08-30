package AST.CSS;

public class CssClassSelector extends Selector {
    private CssClass cssClass;

    public CssClassSelector(CssClass cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String toString() {
        return cssClass.toString();
    }
}
