package AST.TS;

public class Decorator {
    private NamedImport namedImport;
    private DecoratorObject decoratorObject;

    public Decorator(NamedImport namedImport, DecoratorObject decoratorObject) {
        this.namedImport = namedImport;
        this.decoratorObject = decoratorObject;
    }

    public NamedImport getNamedImport() {
        return namedImport;
    }

    public void setNamedImport(NamedImport namedImport) {
        this.namedImport = namedImport;
    }

    public DecoratorObject getDecoratorObject() {
        return decoratorObject;
    }

    public void setDecoratorObject(DecoratorObject decoratorObject) {
        this.decoratorObject = decoratorObject;
    }

    @Override
    public String toString() {
        return "@" + namedImport.toString() + "(" + decoratorObject.toString() + ")";
    }

    public String generateJS() {
        return "@" + namedImport.toString() + "(" + decoratorObject.generateJS() + ")";
    }
}
