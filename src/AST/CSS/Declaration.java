package AST.CSS;

public class Declaration {
    private CssProperty cssProperty;
    private CssValue cssValue;

    public Declaration(CssProperty cssProperty, CssValue cssValue) {
        this.cssProperty = cssProperty;
        this.cssValue = cssValue;
    }

    @Override
    public String toString() {
        return cssProperty.toString() + " : " + cssValue.toString() + ";";
    }
}

