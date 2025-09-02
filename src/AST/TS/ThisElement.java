package AST.TS;

public class ThisElement extends MemberAccessElement {

    @Override
    public String toString() {
        return "this";
    }

    @Override
    public String generateJS() {
        return "this";
    }
}
