package AST.TS;

public class ObjectProperty {
    private ObjectPropertyName propertyName;
    private Expression value;

    public ObjectProperty(ObjectPropertyName propertyName, Expression value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    public void setPropertyName(ObjectPropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return propertyName.toString() + ": " + value.toString();
    }

    public String generateJS() {
        return propertyName.toString() + ": " + value.generateJS();
    }
}
