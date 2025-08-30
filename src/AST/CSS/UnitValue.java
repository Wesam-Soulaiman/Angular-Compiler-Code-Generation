package AST.CSS;

public class UnitValue extends Values {
    private UnitOfMeasurement unit;

    public UnitValue(UnitOfMeasurement unit) {
        this.unit = unit;
    }

    public UnitOfMeasurement getUnit() {
        return unit;
    }

    public void setUnit(UnitOfMeasurement unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return unit.toString();
    }
}
