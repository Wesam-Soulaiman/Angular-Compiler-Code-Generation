package AST.TS;

public class ArrowFunctionBody {

    private ReturnStatement returnStatement;
    private FunctionBody functionBody;

    public ArrowFunctionBody(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public ArrowFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        if (functionBody != null) return functionBody.toString();
        if (returnStatement != null) return returnStatement.toString();
        return "";
    }

    public String generateJS() {
        if (functionBody != null) return functionBody.generateJS();
        if (returnStatement != null) return returnStatement.generateJS();
        return "";
    }
}
