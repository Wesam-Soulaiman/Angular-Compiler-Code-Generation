package AST.TS;

import java.util.List;
import java.util.Objects;

public class TsProgramBlock extends TsProg {
    private List<TsProgContent> contents;

    public TsProgramBlock(List<TsProgContent> contents) {
        super(contents != null ? (List<TsNode>) (List<?>) contents : List.of()); // safe cast
        this.contents = contents != null ? contents : List.of();
    }

    public List<TsProgContent> getContents() {
        return contents;
    }

    public void setContents(List<TsProgContent> contents) {
        this.contents = contents != null ? contents : List.of();
        super.setStatements((List<TsNode>) (List<?>) this.contents);
    }

    @Override
    public String toString() {
        return contents.stream()
                .filter(Objects::nonNull)
                .map(TsProgContent::toString)
                .reduce("", (a, b) -> a + "\n" + b)
                .trim();
    }

    @Override
    public String generateJS() {
        return contents.stream()
                .filter(Objects::nonNull)
                .map(TsProgContent::generateJS)
                .reduce("", (a, b) -> a + "\n" + b)
                .trim();
    }
}
