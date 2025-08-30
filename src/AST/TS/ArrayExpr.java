package AST.TS;

public class ArrayExpr extends PrimaryExpr {

    private Array array;

    public ArrayExpr(Array array) {
        this.array = array;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
