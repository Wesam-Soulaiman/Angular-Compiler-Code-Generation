package AST.TS;

public class Parameter {

    private ParameterName name;
    private TypeSelector type;
    private DefaultValue defaultValue;

    public Parameter(ParameterName name, TypeSelector type, DefaultValue defaultValue) {
        this.name = name;
        this.type = type;
        this.defaultValue = defaultValue;
    }


    public ParameterName getName() {
        return name;
    }

    public void setName(ParameterName name) {
        this.name = name;
    }

    public TypeSelector getType() {
        return type;
    }

    public void setType(TypeSelector type) {
        this.type = type;
    }

    public DefaultValue getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(DefaultValue defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name.toString());
        if (type != null) {
            sb.append(type.toString());
        }
        if (defaultValue != null) {
            sb.append(" ").append(defaultValue.toString());
        }
        return sb.toString();
    }
}