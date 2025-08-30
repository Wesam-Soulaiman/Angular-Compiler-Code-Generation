package AST.TS;

public class VariableDeclarationsStatement extends Statement {
    private VariableDeclarations variableDeclarations;

    public VariableDeclarationsStatement(VariableDeclarations variableDeclarations) {
        this.variableDeclarations = variableDeclarations;
    }

    public VariableDeclarations getVariableDeclarations() {
        return variableDeclarations;
    }

    public void setVariableDeclarations(VariableDeclarations variableDeclarations) {
        this.variableDeclarations = variableDeclarations;
    }

    @Override
    public String toString() {
        return variableDeclarations.toString();
    }
}
