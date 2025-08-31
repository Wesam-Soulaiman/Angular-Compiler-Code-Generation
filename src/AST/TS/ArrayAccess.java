package AST.TS;

public class ArrayAccess {
    private String arrayName;          // يعادل IDDEFINER
    private Expression expression;     // ممكن تكون null إذا لم يكن هناك تعبير داخل []

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
}
