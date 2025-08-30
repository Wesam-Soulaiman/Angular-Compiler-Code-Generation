package AST.TS;

public class ArrowFunction extends FunctionDeclaration {

    private ArrowFunctionDeclaration arrowFunctionDeclaration;

    public ArrowFunction(ArrowFunctionDeclaration arrowFunctionDeclaration) {
        this.arrowFunctionDeclaration = arrowFunctionDeclaration;
    }

    public ArrowFunctionDeclaration getArrowFunctionDeclaration() {
        return arrowFunctionDeclaration;
    }

    public void setArrowFunctionDeclaration(ArrowFunctionDeclaration arrowFunctionDeclaration) {
        this.arrowFunctionDeclaration = arrowFunctionDeclaration;
    }

    @Override
    public String toString() {
        return arrowFunctionDeclaration.toString();
    }
}
