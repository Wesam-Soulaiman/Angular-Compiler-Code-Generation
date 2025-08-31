package AST.TS;

import java.util.List;

public class DecoratorObjectContent {

    private List<DecoratorProperty> properties;

    public DecoratorObjectContent(List<DecoratorProperty> properties) {
        this.properties = properties;
    }

    public List<DecoratorProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<DecoratorProperty> properties) {
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
}