package AST.HTML;

public class AngularBinding {
    private BindingName bindingName;

    public AngularBinding(BindingName bindingName) {
        this.bindingName = bindingName;
    }

    @Override
    public String toString() {
        return "[" + bindingName.toString() + "]";
    }

    // Generate src="${value}" style
    public String generateHTML() {
        return bindingName.generateHTML();
    }
}
