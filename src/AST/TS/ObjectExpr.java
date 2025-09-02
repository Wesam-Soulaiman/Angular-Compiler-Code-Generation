package AST.TS;

public class ObjectExpr extends PrimaryExpr {

    private Object object;

    public ObjectExpr(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }

    public String generateJS() {
        return object.generateJS();
    }
}
