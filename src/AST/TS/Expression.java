package AST.TS;

import java.util.List;

public class Expression {
    private PrimaryExpr firstExpr;
    private List<ArithmaticExpr> arithmaticExprs;  // zero or more

    public Expression(PrimaryExpr firstExpr, List<ArithmaticExpr> arithmaticExprs) {
        this.firstExpr = firstExpr;
        this.arithmaticExprs = arithmaticExprs;
    }

    public PrimaryExpr getFirstExpr() {
        return firstExpr;
    }

    public void setFirstExpr(PrimaryExpr firstExpr) {
        this.firstExpr = firstExpr;
    }

    public List<ArithmaticExpr> getArithmaticExprs() {
        return arithmaticExprs;
    }

    public void setArithmaticExprs(List<ArithmaticExpr> arithmaticExprs) {
        this.arithmaticExprs = arithmaticExprs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstExpr.toString());
        for (ArithmaticExpr arithExpr : arithmaticExprs) {
            sb.append(" ").append(arithExpr.toString());
        }
        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstExpr.generateJS());
        for (ArithmaticExpr arithExpr : arithmaticExprs) {
            sb.append(" ").append(arithExpr.generateJS());
        }
        return sb.toString();
    }
}
