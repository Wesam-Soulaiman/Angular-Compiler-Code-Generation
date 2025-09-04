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

    public String generateHTML() {
        StringBuilder sb = new StringBuilder();

        // prepend directive opening (if ngFor or ngIf)
        sb.append(startTag.generateDirectivePrefix());

        // normal start tag
        sb.append(startTag.generateHTML());

        // inner content
        String contentStr = contents.stream()
                .map(ElementContent::generateHTML)
                .collect(Collectors.joining());
        sb.append(contentStr);

        // end tag
        sb.append(endTag.generateHTML());

        // append directive closing
        sb.append(startTag.generateDirectiveSuffix());

        return sb.toString();
    }
}
