package AST.TS;

public class ComponentValue extends RouterPropertyValue {

    private String identifier;

    public ComponentValue(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public String generateJS() {
        return identifier;
    }
}
