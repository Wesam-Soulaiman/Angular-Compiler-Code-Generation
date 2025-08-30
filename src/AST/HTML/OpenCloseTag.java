package AST.HTML;

import java.util.List;
import java.util.stream.Collectors;

public class OpenCloseTag {
    private StartTag startTag;
    private List<ElementContent> contents;
    private EndTag endTag;

    public OpenCloseTag(StartTag startTag, List<ElementContent> contents, EndTag endTag) {
        this.startTag = startTag;
        this.contents = contents;
        this.endTag = endTag;
    }

    public StartTag getStartTag() {
        return startTag;
    }

    public void setStartTag(StartTag startTag) {
        this.startTag = startTag;
    }

    public List<ElementContent> getContents() {
        return contents;
    }

    public void setContents(List<ElementContent> contents) {
        this.contents = contents;
    }

    public EndTag getEndTag() {
        return endTag;
    }

    public void setEndTag(EndTag endTag) {
        this.endTag = endTag;
    }

    @Override
    public String toString() {
        String contentStr = contents.stream()
                .map(ElementContent::toString)
                .collect(Collectors.joining());
        return startTag.toString() + contentStr + endTag.toString();
    }
}
