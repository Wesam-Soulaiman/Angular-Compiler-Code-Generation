package AST.TS;

import java.util.List;

public class FunctionBody {

    private List<Statement> statements;

    public FunctionBody(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (Statement stmt : statements) {
            sb.append("  ").append(stmt.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (Statement stmt : statements) {
            sb.append("  ").append(stmt.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
//        StringBuilder sb = new StringBuilder();
//        sb.append("{\n");
//        for (Statement stmt : statements) {
//            if (stmt instanceof TsProgContent) {
//                sb.append("  ").append(((TsProgContent) stmt).generateJS()).append("\n");
//            } else {
//                sb.append("  ").append(stmt.toString()).append("\n");
//            }
//        }
//        sb.append("}");
//        return sb.toString();
    }
}
