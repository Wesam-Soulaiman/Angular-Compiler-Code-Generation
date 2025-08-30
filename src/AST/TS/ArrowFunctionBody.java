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

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
     if(functionBody==null){
         return returnStatement.toString();
     }
     else if(returnStatement ==null) {
         return functionBody.toString();
     }
     return null;
    }
}
