package AST.TS;

public class InterfaceProperty {

    private  InterfacePropertyName propertyName;
    private TypeSelector type;

    public InterfaceProperty(InterfacePropertyName propertyName, TypeSelector type) {
        this.propertyName = propertyName;
        this.type = type;
    }

    public InterfacePropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(InterfacePropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public TypeSelector getType() {
        return type;
    }

    public void setType(TypeSelector type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return propertyName.toString()  + type.toString() + ";";
    }
}