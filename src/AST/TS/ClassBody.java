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
}
