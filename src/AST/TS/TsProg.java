package AST.TS;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Objects;

public class TsProg {
    private List<TsNode> statements;

    public TsProg(List<TsNode> statements) {
        this.statements = statements != null ? statements : List.of(); // avoid null
    }

    public List<TsNode> getStatements() {
        return statements;
    }

    public void setStatements(List<TsNode> statements) {
        this.statements = statements != null ? statements : List.of();
    }

    @Override
    public String toString() {
        return statements.stream()
                .filter(Objects::nonNull) // skip nulls
                .map(TsNode::toString)
                .collect(Collectors.joining("\n"));
    }

    public String generateJS() {
        return statements.stream()
                .filter(Objects::nonNull) // skip nulls
                .map(TsNode::generateJS)
                .collect(Collectors.joining("\n"));
    }
}
