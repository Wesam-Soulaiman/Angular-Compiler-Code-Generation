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
}
