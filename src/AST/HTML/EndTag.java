package AST.HTML;

public class EndTag {
    private TagName tagName;

    public EndTag(TagName tagName) {
        this.tagName = tagName;
    }

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "\n" + "   " + "</" + tagName.toString() + ">";
    }
}
