package AST.TS;

public class ArrowFunctionValue extends VariableValue {

    private ArrowFunctionDeclaration arrowFunction;

    public ArrowFunctionValue(ArrowFunctionDeclaration arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public ArrowFunctionDeclaration getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunctionDeclaration arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    @Override
    public String toString() {
        return arrowFunction.toString();
    }

    @Override
    public String generateJS() {
        // For JS, we drop the return type (TypeSelector) if present
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        if (arrowFunction.getParameters() != null) {
            sb.append(arrowFunction.getParameters().toString());
        }
        sb.append(") => ");
        if (arrowFunction.getBody() != null) {
            sb.append(arrowFunction.getBody().generateJS());
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
