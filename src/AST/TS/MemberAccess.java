package AST.TS;

public class MemberAccess {
    private MemberAccessElement left;
    private String memberName;          // للحالة الأولى: IDDEFINER
    private FunctionCall functionCall;  // للحالة الثانية: functionCall

    // constructor للحالة الأولى
    public MemberAccess(MemberAccessElement left, String memberName) {
        this.left = left;
        this.memberName = memberName;
    }

    // constructor للحالة الثانية
    public MemberAccess(MemberAccessElement left, FunctionCall functionCall) {
        this.left = left;
        this.functionCall = functionCall;
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

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        if (memberName != null) {
            return left.toString() + "." + memberName;
        } else if (functionCall != null) {
            return left.toString() + "." + functionCall.toString();
        }
        return left.toString(); // fallback
    }

    public String generateJS() {
        if (memberName != null) {
            return left.generateJS() + "." + memberName;
        } else if (functionCall != null) {
            return left.generateJS() + "." + functionCall.generateJS();
        }
        return left.generateJS(); // fallback
    }
}
