package AST.HTML;

public abstract class TagName {
    protected String name;

    public TagName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String generateHTML() {
        return name;
    }
}
