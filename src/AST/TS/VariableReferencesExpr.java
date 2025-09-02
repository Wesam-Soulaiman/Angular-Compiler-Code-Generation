package AST.TS;

public class VariableReferencesExpr extends PrimaryExpr {

    private VariableReferences varRef;

    public VariableReferencesExpr(VariableReferences varRef) {
        this.varRef = varRef;
    }

    public VariableReferences getVarRef() {
        return varRef;
    }

    public void setVarRef(VariableReferences varRef) {
        this.varRef = varRef;
    }

    @Override
    public String toString() {
        return varRef.toString();
    }

    public String generateJS() {
        return varRef.generateJS();
    }
}
