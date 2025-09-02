package AST.TS;

public class FunctionCallExpr extends PrimaryExpr {

    private FunctionCall functionCall;

    public FunctionCallExpr(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        return functionCall.toString();
    }

    public String generateJS() {
        return functionCall.generateJS();
    }
}
