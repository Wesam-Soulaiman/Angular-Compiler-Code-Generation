package AST.TS;

import AST.TS.BinaryOperator;

public class PercentOperator extends BinaryOperator {

    @Override
    public String toString() {
        return "%";
    }

    public String generateJS() {
        return "%";
    }
}
