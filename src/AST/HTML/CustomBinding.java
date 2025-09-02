package AST.HTML;

public class CustomBinding extends BindingName {
    private String name;

    public CustomBinding(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
