package AST.CSS;


import java.util.List;

public class CssRoot {
    private List<CssStatement> statements;

    public CssRoot(List<CssStatement> statements) {
        if (statements == null || statements.isEmpty()) {
            throw new IllegalArgumentException("CssRoot must contain at least one CssStatement");
        }
        this.statements = statements;
    }

    public List<CssStatement> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (CssStatement stmt : statements) {
            sb.append(stmt.toString()).append("\n");
        }
        return sb.toString();
    }
}
