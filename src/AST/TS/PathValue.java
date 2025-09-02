package AST.TS;

public class PathValue extends RouterPropertyValue {

    private String value; // يمثّل قيمة الـ STRING

    public PathValue(String value) {
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
        return "\"" + value + "\""; // نخليها نص بين ""
    }

    @Override
    public String generateJS() {
        return "\"" + value + "\"";
    }
}
