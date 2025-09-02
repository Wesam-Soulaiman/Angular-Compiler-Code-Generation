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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name.toString());
        if (type != null) sb.append(": ").append(type.toString());
        if (defaultValue != null) sb.append(" ").append(defaultValue.toString());
        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append(name.toString());
        if (defaultValue != null) sb.append(" ").append(defaultValue.generateJS());
        return sb.toString();
    }
}
