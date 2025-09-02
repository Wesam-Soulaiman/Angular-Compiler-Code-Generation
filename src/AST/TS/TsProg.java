package AST.TS;

import java.util.List;
import java.util.stream.Collectors;

public class TsProg {
    private List<TsNode> statements;

    public TsProg(List<TsNode> statements) {
        this.statements = statements;
    }

    public List<TsNode> getStatements() {
        return statements;
    }

    public void setStatements(List<TsNode> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return statements.stream()
                .map(TsNode::toString)
                .collect(Collectors.joining("\n"));
    }

    public String generateJS() {
        return statements.stream()
                .map(TsNode::generateJS)
                .collect(Collectors.joining("\n"));
    }
}
