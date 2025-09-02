package AST.HTML;

public class AttributeValue {
    private String name;

    public AttributeValue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String generateHtml() {
        return name;
    }
}
