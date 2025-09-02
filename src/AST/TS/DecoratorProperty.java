package AST.TS;

public class DecoratorProperty {
    private DecoratorPropertyName propertyName;
    private DecoratorPropertyValue propertyValue;

    public DecoratorProperty(DecoratorPropertyName propertyName, DecoratorPropertyValue propertyValue) {
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    public DecoratorPropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(DecoratorPropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public DecoratorPropertyValue getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(DecoratorPropertyValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public String toString() {
        return propertyName.toString() + ": " + propertyValue.toString();
    }

    public String generateJS() {
        return propertyName.toString() + ": " + propertyValue.generateJS();
    }
}
