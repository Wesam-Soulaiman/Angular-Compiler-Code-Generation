package AST.TS;

public class ArrowFunction extends FunctionDeclaration {

    private ArrowFunctionDeclaration arrowFunctionDeclaration;

    public ArrowFunction(ArrowFunctionDeclaration arrowFunctionDeclaration) {
        this.arrowFunctionDeclaration = arrowFunctionDeclaration;
    }

    @Override
    public String toString() {
        return arrowFunctionDeclaration.toString();
    }

    @Override
    public String generateJS() {
        // Delegate to ArrowFunctionDeclaration
        return arrowFunctionDeclaration.generateJS();
    }
}
