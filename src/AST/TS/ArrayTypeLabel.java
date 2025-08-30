package AST.TS;

public class ArrayTypeLabel extends Type {
    private ArrayType arrayType;

    public ArrayTypeLabel(ArrayType arrayType) {
        this.arrayType = arrayType;
    }

    public ArrayType getArrayType() {
        return arrayType;
    }

    public void setArrayType(ArrayType arrayType) {
        this.arrayType = arrayType;
    }

    @Override
    public String toString() {
        return arrayType.toString();
    }
}
