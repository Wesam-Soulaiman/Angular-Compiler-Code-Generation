package AST.TS;

public class RegularFunctionDeclaration {
    private RegularFunctionName regularFunctionName;
    private Parameters parameters;             // nullable
    private TypeSelector typeSelector;         // nullable
    private FunctionBody functionBody;

    public RegularFunctionDeclaration(RegularFunctionName regularFunctionName, Parameters parameters, TypeSelector typeSelector, FunctionBody functionBody) {
        this.regularFunctionName = regularFunctionName;
        this.parameters = parameters;
        this.typeSelector = typeSelector;
        this.functionBody = functionBody;
    }

    public RegularFunctionName getRegularFunctionName() {
        return regularFunctionName;
    }

    public void setRegularFunctionName(RegularFunctionName regularFunctionName) {
        this.regularFunctionName = regularFunctionName;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public TypeSelector getTypeSelector() {
        return typeSelector;
    }

    public void setTypeSelector(TypeSelector typeSelector) {
        this.typeSelector = typeSelector;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("function ").append(regularFunctionName.toString()).append("(");

        if (parameters.toString() != null) {
            sb.append(parameters.toString());
        }

        sb.append(")");

        if (typeSelector.toString() != null) {
            sb.append(" ").append(typeSelector.toString());
        }

        sb.append(" ").append(functionBody.toString());

        return sb.toString();
    }
}
