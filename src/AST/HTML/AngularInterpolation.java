package AST.HTML;

public class AngularInterpolation {
    private AngularInterpolationContent content;

    public AngularInterpolation(AngularInterpolationContent content) {
        this.content = content;
    }

    public AngularInterpolationContent getContent() {
        return content;
    }

    public void setContent(AngularInterpolationContent content) {
        this.content = content;
    }

    @Override
    public String toString() {
        if (content != null) {
            return "{{" + content.toString() + "}}";
        } else {
            return "{{}}";
        }
    }
}