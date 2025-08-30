package AST.HTML;

public class CustomTag extends TagName {
    private String name;

    public CustomTag(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
