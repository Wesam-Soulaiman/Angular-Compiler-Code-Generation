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

    public Parameters getParameters() {
        return parameters;
    }

    public TypeSelector getTypeSelector() {
        return typeSelector;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("function ").append(regularFunctionName.toString()).append("(");
        if (parameters != null) {
            sb.append(parameters.toString());
        }
        sb.append(")");
        if (typeSelector != null) {
            sb.append(": ").append(typeSelector.toString());
        }
        sb.append(" ").append(functionBody.toString());
        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append("function ").append(regularFunctionName.toString()).append("(");
        if (parameters != null) {
            sb.append(parameters.generateJS());
        }
        sb.append(") ");
        if (functionBody != null) {
            sb.append(functionBody.generateJS());
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
