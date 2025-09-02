package AST.TS;

public class UndefinedLiteral extends Literal {

    @Override
    public String toString() {
        return "undefined";
    }

    @Override
    public String generateJS() {
        return "undefined";
    }
}
