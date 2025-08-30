package AST.TS;

public class VariableDeclaration_ extends VariableDeclarations {
    VariableDeclaration variableDeclaration;

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
        return variableDeclaration.toString(); // يُعيد النص من داخل متغير عادي
    }
}
