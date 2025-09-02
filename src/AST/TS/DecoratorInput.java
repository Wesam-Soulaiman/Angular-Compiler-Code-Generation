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

    public String generateJS() {
        // For TS to JS, @Input() decorator is Angular-specific; can output property name and type as comment or JS equivalent
        return "// " + decoratorBasedInput.toString();
    }
}
