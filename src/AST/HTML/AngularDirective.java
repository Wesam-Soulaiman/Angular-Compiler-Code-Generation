package AST.HTML;

public class AngularDirective {
    private DirectiveName directive;

    public AngularDirective(DirectiveName directive) {
        this.directive = directive;
    }

    public DirectiveName getDirective() {
        return directive;
    }

    public void setDirective(DirectiveName directive) {
        this.directive = directive;
    }

    @Override
    public String toString() {
        return "*" + directive.toString();
    }
}


