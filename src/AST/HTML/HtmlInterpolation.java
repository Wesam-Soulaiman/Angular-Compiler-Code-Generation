package AST.HTML;

// HtmlInterpolation
public class HtmlInterpolation extends ElementContent {
    private AngularInterpolation angularInterpolation;

    public HtmlInterpolation(AngularInterpolation angularInterpolation) {
        this.angularInterpolation = angularInterpolation;
    }

    @Override
    public String toString() {
        return angularInterpolation.toString();
    }
}
