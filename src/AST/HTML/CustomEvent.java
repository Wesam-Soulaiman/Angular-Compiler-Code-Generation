package AST.HTML;

public class CustomEvent extends EventName {
    private String name;

    public CustomEvent(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "#" + name;
    }
}
