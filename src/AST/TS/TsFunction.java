package AST.TS;

public class TsFunction extends TsProgContent {
    private FunctionDeclaration functionDeclaration;

    public TsFunction(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    @Override
    public String toString() {
        return functionDeclaration.toString();
    }

    @Override
    public String generateJS() {
        // Delegate JS generation to the FunctionDeclaration
        return functionDeclaration.generateJS();
    }

    @Override
    public String generateHTML() {
        return "";
    }
}
