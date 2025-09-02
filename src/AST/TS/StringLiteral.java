package AST.TS;

public class StringLiteral extends Literal {

    private String value;

    public StringLiteral(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public String generateJS() {
        return "\"" + value + "\""; // wrap in quotes for JS strings
    }
}
