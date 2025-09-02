package AST.TS;

import java.util.List;

public class RouterArrayContent {

    private List<RouterProperty> properties;

    public RouterArrayContent(List<RouterProperty> properties) {
        this.properties = properties;
    }

    public List<RouterProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<RouterProperty> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i).toString());
            if (i < properties.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i).generateJS());
            if (i < properties.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
