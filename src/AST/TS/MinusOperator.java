package AST.TS;

import AST.TS.BinaryOperator;

public class MinusOperator extends BinaryOperator {

    @Override
    public String toString() {
        return "-";
    }

    public String generateJS() {
        return "-";
    }
}
