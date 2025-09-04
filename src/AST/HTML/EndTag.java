package AST.HTML;

public class EndTag {
    private TagName tagName;

    public EndTag(TagName tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "</" + tagName.toString() + ">";
    }

    public String generateHTML() {
        return "\n</" + tagName.generateHTML() + ">\n";
    }
}
