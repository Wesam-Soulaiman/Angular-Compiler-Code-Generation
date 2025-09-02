package AST.TS;

public class ReturnStatement {

    private Expression expression;

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        if (expression == null) return "return;";
        return "return " + expression.toString() + ";";
    }

    public String generateJS() {
        if (expression == null) return "return;";
        return "return " + expression.generateJS() + ";";
    }
}
