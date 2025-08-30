package AST.TS;

public class RegularFunction extends FunctionDeclaration {
    private RegularFunctionDeclaration regularFunctionDeclaration;

    public RegularFunction(RegularFunctionDeclaration regularFunctionDeclaration) {
        this.regularFunctionDeclaration = regularFunctionDeclaration;
    }

    public RegularFunctionDeclaration getRegularFunctionDeclaration() {
        return regularFunctionDeclaration;
    }

    public void setRegularFunctionDeclaration(RegularFunctionDeclaration regularFunctionDeclaration) {
        this.regularFunctionDeclaration = regularFunctionDeclaration;
    }

    @Override
    public String toString() {
        return regularFunctionDeclaration.toString();
    }
}
