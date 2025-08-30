package AST.CSS;

public class UnitOfMeasurement {
    private String number;
    private String cssUnit;

    public UnitOfMeasurement(String number, String cssUnit) {
        this.number = number;
        this.cssUnit = cssUnit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCssUnit() {
        return cssUnit;
    }

    public void setCssUnit(String cssUnit) {
        this.cssUnit = cssUnit;
    }

    @Override
    public String toString() {
        return number + (cssUnit != null ? cssUnit : "");
    }
}

