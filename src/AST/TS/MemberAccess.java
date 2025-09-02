package AST.TS;

public class MemberAccess {
    private MemberAccessElement left;
    private String memberName;

    public MemberAccess(MemberAccessElement left, String memberName) {
        this.left = left;
        this.memberName = memberName;
    }

    public MemberAccessElement getLeft() {
        return left;
    }

    public void setLeft(MemberAccessElement left) {
        this.left = left;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return left.toString() + "." + memberName;
    }

    public String generateJS() {
        return left.generateJS() + "." + memberName;
    }
}
