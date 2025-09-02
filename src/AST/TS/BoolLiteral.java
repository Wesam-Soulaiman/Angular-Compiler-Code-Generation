package AST.TS;

public class BoolLiteral extends Literal {

    private String value;

    public BoolLiteral(String value) {
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
