package AST.TS;

public class VariableDeclaration {
    private DeclarationTypes declarationTypes;
    private VariableName variableName;
    private TypeSelector typeSelector;
    private VariableValue variableValue;

    public VariableDeclaration(DeclarationTypes declarationTypes,
                               VariableName variableName,
                               TypeSelector typeSelector,
                               VariableValue variableValue) {
        this.declarationTypes = declarationTypes;
        this.variableName = variableName;
        this.typeSelector = typeSelector;
        this.variableValue = variableValue;
    }

    public DeclarationTypes getDeclarationTypes() {
        return declarationTypes;
    }

    public void setDeclarationTypes(DeclarationTypes declarationTypes) {
        this.declarationTypes = declarationTypes;
    }

    public VariableName getVariableName() {
        return variableName;
    }

    public void setVariableName(VariableName variableName) {
        this.variableName = variableName;
    }

    public TypeSelector getTypeSelector() {
        return typeSelector;
    }

    public void setTypeSelector(TypeSelector typeSelector) {
        this.typeSelector = typeSelector;
    }

    public VariableValue getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(VariableValue variableValue) {
        this.variableValue = variableValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("export");
        if (declarationTypes != null) {
            sb.append(declarationTypes.toString()).append(" ");
        }

        sb.append(variableName.toString());

        if (typeSelector != null) {
            sb.append(" ").append(typeSelector.toString());
        }

        if (variableValue != null) {
            sb.append(" = ").append(variableValue.toString()).append(";");
        }

        return sb.toString();
    }
}
