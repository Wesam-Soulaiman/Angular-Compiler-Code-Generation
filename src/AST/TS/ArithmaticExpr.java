package AST.TS;

public class ArithmaticExpr {

    private BinaryOperator operator;
    private PrimaryExpr rightExpr;

    public ArithmaticExpr(BinaryOperator binaryOperator, PrimaryExpr primaryExpr1) {
        this.operator = binaryOperator;
        this.rightExpr= primaryExpr1;
    }


    @Override
    public String toString() {
        return operator.toString() + " " + rightExpr.toString();
    }

    public String generateJS() {
        return operator.generateJS() + " " + rightExpr.generateJS();
    }
}
