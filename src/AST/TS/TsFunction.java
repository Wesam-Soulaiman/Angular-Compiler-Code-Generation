package AST.TS;

public class TsFunction extends TsProgContent {
    private FunctionDeclaration functionDeclaration;

    public TsFunction(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    @Override
    public String toString() {
        return functionDeclaration.toString();
    }
}
