package AST.TS;

public class TsVariableDecl extends TsProgContent {
    private VariableDeclarations variableDeclarations;

    public TsVariableDecl(VariableDeclarations variableDeclarations) {
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

    // New method for JS generation
    @Override
    public String generateJS() {
        return variableDeclarations.generateJS();
    }
}
