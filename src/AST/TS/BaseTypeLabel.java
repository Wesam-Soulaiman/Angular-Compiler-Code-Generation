package AST.TS;

public class BaseTypeLabel extends Type {
    private BaseType baseType;

    public BaseTypeLabel(BaseType baseType) {
        this.baseType = baseType;
    }

    public BaseType getBaseType() {
        return baseType;
    }

    public void setBaseType(BaseType baseType) {
        this.baseType = baseType;
    }

    @Override
    public String toString() {
        return baseType.toString();
    }
}
