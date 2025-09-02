package AST.TS;

public class VariableDeclaration_ extends VariableDeclarations {
    private VariableDeclaration variableDeclaration;

    public VariableDeclaration_(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString() {
        return variableDeclaration.toString(); // TypeScript representation
    }

    public String generateJS() {
        // JS doesn't have type annotations, so we can omit typeSelector
        return variableDeclaration.generateJS();
    }
}
