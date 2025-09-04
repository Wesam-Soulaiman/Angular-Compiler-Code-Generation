package AST.TS;

public class LocalLabel extends MemberAccessElement{
    @Override
    public String toString() {
        return "localStorage";
    }

    public String generateJS() {
        return toString();
    }
}
