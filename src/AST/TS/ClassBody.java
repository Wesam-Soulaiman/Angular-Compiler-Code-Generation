package AST.TS;

import java.util.List;

public class ClassBody {

    private List<ClassMember> members;

    public ClassBody(List<ClassMember> members) {
        this.members = members;
    }

    public List<ClassMember> getMembers() {
        return members;
    }

    public void setMembers(List<ClassMember> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (ClassMember member : members) {
            sb.append("  ").append(member.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (ClassMember member : members) {
            // If member is a TsProgContent (like methods or decorators), call generateJS()
            if (member instanceof TsProgContent) {
                sb.append("  ").append(((TsProgContent) member).generateJS()).append("\n");
            } else {
                sb.append("  ").append(member.toString()).append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
