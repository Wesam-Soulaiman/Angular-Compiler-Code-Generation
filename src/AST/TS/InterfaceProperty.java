package AST.TS;

public class InterfaceProperty {
    private InterfacePropertyName propertyName;
    private TypeSelector type;

    public InterfaceProperty(InterfacePropertyName propertyName, TypeSelector type) {
        this.propertyName = propertyName;
        this.type = type;
    }

    @Override
    public String toString() {
        return propertyName.toString() + type.toString() + ";";
    }

    public String generateJS() {
        // Interface properties are erased in JS
        return "";
    }
}
