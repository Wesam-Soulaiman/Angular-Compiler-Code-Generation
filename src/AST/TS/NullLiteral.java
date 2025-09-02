package AST.TS;

public class NullLiteral extends Literal {

    @Override
    public String toString() {
        return "null";
    }

    @Override
    public String generateJS() {
        return "null";
    }
}
