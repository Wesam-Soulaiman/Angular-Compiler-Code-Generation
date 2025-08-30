package AST.TS;

public class ArrayBracketTypeLabel extends Type {
    private ArrayBracketType arrayBracketType;

    public ArrayBracketTypeLabel(ArrayBracketType arrayBracketType) {

        this.arrayBracketType = arrayBracketType;
    }

    public ArrayBracketType getArrayBracketType() {
        return arrayBracketType;
    }

    public void setArrayBracketType(ArrayBracketType arrayBracketType) {
        this.arrayBracketType = arrayBracketType;
    }

    @Override
    public String toString() {
        return arrayBracketType.toString();
    }
}
