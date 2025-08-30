package AST.TS;

public class MemberAccessExpr extends PrimaryExpr {

    private MemberAccess memberAccess;

    public MemberAccessExpr(MemberAccess memberAccess) {
        this.memberAccess = memberAccess;
    }

    public MemberAccess getMemberAccess() {
        return memberAccess;
    }

    public void setMemberAccess(MemberAccess memberAccess) {
        this.memberAccess = memberAccess;
    }

    @Override
    public String toString() {
        return memberAccess.toString();
    }
}
