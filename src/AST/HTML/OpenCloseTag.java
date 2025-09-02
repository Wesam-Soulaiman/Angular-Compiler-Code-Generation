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

    @Override
    public String toString() {
        String contentStr = contents.stream()
                .map(ElementContent::toString)
                .collect(Collectors.joining());
        return startTag.toString() + contentStr + endTag.toString();
    }

    public String generateHtml() {
        String contentStr = contents.stream()
                .map(ElementContent::generateHtml)
                .collect(Collectors.joining());
        return startTag.generateHtml() + contentStr + endTag.generateHtml();
    }
}
