package AST.TS;

public class ExtractData {
    private MemberAccess memberAccess;

    public ExtractData(MemberAccess memberAccess) {
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
        return "... " + memberAccess.toString();
    }

    public String generateJS() {
        return "... " + memberAccess.generateJS();
    }
}
