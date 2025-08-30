package AST.TS;

public class ArrayAccessExpr extends PrimaryExpr {

    private ArrayAccess arrayAccess;

    public ArrayAccessExpr(ArrayAccess arrayAccess) {
        this.arrayAccess = arrayAccess;
    }

    public ArrayAccess getArrayAccess() {
        return arrayAccess;
    }

    public void setArrayAccess(ArrayAccess arrayAccess) {
        this.arrayAccess = arrayAccess;
    }

    @Override
    public String toString() {
        return arrayAccess.toString();
    }
}
