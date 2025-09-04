package AST.HTML;

import java.util.List;
import java.util.stream.Collectors;

public class SelfClosingTag extends HtmlElement {
    private TagName tagName;
    private List<HtmlAttribute> attributes;

    public SelfClosingTag(TagName tagName, List<HtmlAttribute> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        String attrs = attributes.stream()
                .map(HtmlAttribute::toString)
                .collect(Collectors.joining(" "));
        return "<" + tagName.toString() +
                (attrs.isEmpty() ? "" : " " + attrs) + " />";
    }

    @Override
    public String generateHTML() {
        String attrs = attributes.stream()
                .map(HtmlAttribute::generateHTML)
                .collect(Collectors.joining(" "));
        return "<" + tagName.generateHTML() +
                (attrs.isEmpty() ? "" : " " + attrs) + " />";
    }
}
