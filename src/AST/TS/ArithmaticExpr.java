package AST.TS;

public class ArithmaticExpr {

    private BinaryOperator operator;
    private PrimaryExpr rightExpr;

    public ArithmaticExpr(BinaryOperator operator, PrimaryExpr rightExpr) {
        this.operator = operator;
        this.rightExpr = rightExpr;
    }

    public BinaryOperator getOperator() {
        return operator;
    }

    public void setOperator(BinaryOperator operator) {
        this.operator = operator;
    }

    public PrimaryExpr getRightExpr() {
        return rightExpr;
    }

    public void setRightExpr(PrimaryExpr rightExpr) {
        this.rightExpr = rightExpr;
    }

    @Override
    public String toString() {

        return operator.toString() + " " + rightExpr.toString() + ";";
    }
}
