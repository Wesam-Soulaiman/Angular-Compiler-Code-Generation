package AST.TS;

public class DefaultValue {
    private Expression expression;

    public DefaultValue(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "= " + expression.toString();
    }

    public String generateJS() {
        return "= " + expression.generateJS();
    }
}
