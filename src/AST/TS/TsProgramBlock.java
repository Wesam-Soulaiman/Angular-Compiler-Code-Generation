package AST.TS;

import java.util.List;

public class TsProgramBlock extends TsProg {
    private List<TsProgContent> contents;

    public TsProgramBlock(List<TsProgContent> contents) {
        this.contents = contents;
    }

    public List<TsProgContent> getContents() {
        return contents;
    }

    public void setContents(List<TsProgContent> contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (TsProgContent content : contents) {
            sb.append(content.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
