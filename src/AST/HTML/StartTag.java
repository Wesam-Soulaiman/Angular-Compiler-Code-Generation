package AST.HTML;

import java.util.List;
import java.util.stream.Collectors;

public class StartTag {
    private TagName tagName;
    private List<HtmlAttribute> attributes;

    public StartTag(TagName tagName, List<HtmlAttribute> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public TagName getTagName() {
        return tagName;
    }

    public List<HtmlAttribute> getAttributes() {
        return attributes;
    }

    // ---------------- NORMAL HTML ----------------
    public String toString() {
        String attrs = attributes.stream()
                .filter(attr -> !attr.isAngularDirective())
                .map(HtmlAttribute::toString)
                .collect(Collectors.joining(" "));

        return attrs.isEmpty()
                ? "<" + tagName.toString() + ">\n"
                : "<" + tagName.toString() + " " + attrs + ">\n";
    }

    public String generateHTML() {
        String attrs = attributes.stream()
                .filter(attr -> !attr.isAngularDirective())
                .map(HtmlAttribute::generateHTML)
                .collect(Collectors.joining(" "));

        return attrs.isEmpty()
                ? "<" + tagName.generateHTML() + ">\n"
                : "<" + tagName.generateHTML() + " " + attrs + ">\n";
    }

    // ---------------- ANGULAR DIRECTIVES ----------------
    public String generateDirectivePrefix() {
        for (HtmlAttribute attr : attributes) {
            if (attr.isAngularDirective()) {
                return attr.generateDirectivePrefix();
            }
        }
        return "";
    }

    public String generateDirectiveSuffix() {
        for (HtmlAttribute attr : attributes) {
            if (attr.isAngularDirective()) {
                return attr.generateDirectiveSuffix();
            }
        }
        return "";
    }
}
