package AST.TS;

import java.util.List;

public class ObjectContent {
    private List<ObjectProperty> properties;

    public ObjectContent(List<ObjectProperty> properties) {
        this.properties = properties;
    }

    public List<ObjectProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ObjectProperty> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i).toString());
            if (i < properties.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i).generateJS());
            if (i < properties.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
