package AST.TS;

public class StringValues extends DecoratorPropertyValue {
    private String value;

    public StringValues(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public String generateJS() {
        // Wrap string values in quotes for JS output
        return "\"" + value + "\"";
    }
}
