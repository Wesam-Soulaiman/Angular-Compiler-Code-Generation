package AST.TS;

public class ObjectProperty {
    private ObjectPropertyName propertyName;
    private Expression value;
    private ExtractData extractData;

    public ObjectProperty(ObjectPropertyName propertyName, Expression value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    public ObjectProperty(ExtractData extractData) {
        this.extractData = extractData;
    }

    public ObjectPropertyName getPropertyName() {
        return propertyName;
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

    public ExtractData getExtractData() {
        return extractData;
    }

    public void setExtractData(ExtractData extractData) {
        this.extractData = extractData;
    }

    @Override
    public String toString() {
        if (extractData != null) {
            return extractData.toString();
        }
        return propertyName.toString() + ": " + value.toString();
    }

    public String generateJS() {
        if (extractData != null) {
            return extractData.generateJS();
        }
        return propertyName.toString() + ": " + value.generateJS();
    }
}
