package AST.TS;

public class VariableMember extends ClassMember {
    private VariableDeclarations variableDeclarations;

    public VariableMember(VariableDeclarations variableDeclarations) {
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
