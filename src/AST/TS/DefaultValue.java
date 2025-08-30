package AST.TS;

public class DefaultValue   {
    private Expression expression;

    public DefaultValue(Expression expression) {
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
        return "= " + expression.toString();
    }
}