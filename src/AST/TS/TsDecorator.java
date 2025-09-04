package AST.TS;

public class TsDecorator extends TsProgContent {
    private Decorator decorator;

    public TsDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public Decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String toString() {
        return decorator.toString();
    }

    @Override
    public String generateJS() {
        return decorator.generateJS();
    }

    @Override
    public String generateHTML() {
        return "";
    }
}
