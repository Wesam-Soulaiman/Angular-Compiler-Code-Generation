package AST.TS;

public class AssignOperator extends BinaryOperator {

    @Override
    public String toString() {
        return "=";
    }

    public String generateJS() {
        return "=";
    }
}
