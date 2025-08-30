package AST.TS;

public class ReturnStatement {
    private Expression expression;

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        if (expression == null) {
            return "return;";
        } else {
            return "return " + expression.toString() + ";";
        }
    }
}
