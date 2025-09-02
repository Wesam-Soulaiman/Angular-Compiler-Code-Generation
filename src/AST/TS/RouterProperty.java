package AST.TS;

public class RouterProperty {

    private RouterPropertyName name;
    private RouterPropertyValue value;

    public RouterProperty(RouterPropertyName name, RouterPropertyValue value) {
        this.name = name;
        this.value = value;
    }

    public RouterPropertyName getName() {
        return name;
    }

    public void setName(RouterPropertyName name) {
        this.name = name;
    }

    public RouterPropertyValue getValue() {
        return value;
    }

    public void setValue(RouterPropertyValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name.toString() + ": " + value.toString();
    }

    public String generateJS() {
        return name.generateJS() + ": " + value.generateJS();
    }
}
