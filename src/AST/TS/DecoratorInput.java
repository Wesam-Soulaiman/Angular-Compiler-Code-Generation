package AST.TS;

public class DecoratorInput extends VariableDeclarations {
    private DecoratorBasedInput decoratorBasedInput;

    public DecoratorInput(DecoratorBasedInput decoratorBasedInput) {
        this.decoratorBasedInput = decoratorBasedInput;
    }

    public DecoratorBasedInput getDecoratorBasedInput() {
        return decoratorBasedInput;
    }

    public void setDecoratorBasedInput(DecoratorBasedInput decoratorBasedInput) {
        this.decoratorBasedInput = decoratorBasedInput;
    }

    @Override
    public String toString() {
        return decoratorBasedInput.toString();
    }
}
