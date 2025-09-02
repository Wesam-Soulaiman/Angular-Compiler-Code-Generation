package AST.TS;

public class DecoratorBasedInput {
    private VariableName variableName;
    private TypeSelector typeSelector;

    public DecoratorBasedInput(VariableName variableName, TypeSelector typeSelector) {
        this.variableName = variableName;
        this.typeSelector = typeSelector;
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

    @Override
    public String toString() {
        return "@Input() " + variableName.toString() + "! : " + typeSelector.toString() + ";";
    }

    public String generateJS() {
        // JS doesn't have decorators; you can just output property name and type as comment
        return "// " + variableName.toString() + ": " + typeSelector.toString();
    }
}
