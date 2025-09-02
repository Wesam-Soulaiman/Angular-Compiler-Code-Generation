package AST.TS;

public class ArrayBracketType extends BaseType {
    private BaseType baseType;

    public ArrayBracketType(BaseType baseType) {
        this.baseType = baseType;
    }

    @Override
    public String toString() {

        return baseType.toString() + "[]";
    }
}
