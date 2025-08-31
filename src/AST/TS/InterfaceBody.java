package AST.TS;

import java.util.List;

public class InterfaceBody {

    private List<InterfaceProperty> properties;

    public InterfaceBody(List<InterfaceProperty> properties) {
        this.properties = properties;
    }

    public List<InterfaceProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<InterfaceProperty> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (InterfaceProperty prop : properties) {
            sb.append("  ").append(prop.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
