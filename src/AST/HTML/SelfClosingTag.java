package AST.HTML;

import java.util.List;
import java.util.stream.Collectors;

public class SelfClosingTag {
    private TagName tagName;
    private List<HtmlAttribute> attributes;

    public SelfClosingTag(TagName tagName, List<HtmlAttribute> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    public List<HtmlAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<HtmlAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        String attrs = attributes.stream()
                .map(HtmlAttribute::toString)
                .collect(Collectors.joining(" "));

        if (!attrs.isEmpty()) {
            return "<" + tagName.toString() + " " + attrs + " />";
        } else {
            return "<" + tagName.toString() + " />";
        }
    }
}
