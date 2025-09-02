package AST.TS;

public class NumberLiteral extends Literal {

    private String value;

    public NumberLiteral(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public String generateJS() {
        return value;
    }
}
