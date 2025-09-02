package AST.TS;

public class ArrayAccess {
    private String arrayName;          // equivalent to IDDEFINER
    private Expression expression;     // can be null if no expression inside []

    public ArrayAccess(String arrayName, Expression expression) {
        this.arrayName = arrayName;
        this.expression = expression;
    }

    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return arrayName + "[" + (expression != null ? expression.toString() : "") + "]";
    }

    public String generateJS() {
        return arrayName + "[" + (expression != null ? expression.generateJS() : "") + "]";
    }
}
