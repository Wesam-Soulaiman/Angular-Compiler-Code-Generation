package AST.TS;

public class DecoratorObject {
    private DecoratorObjectContent content;  // optional

    public DecoratorObject(DecoratorObjectContent content) {
        this.content = content;
    }

    public DecoratorObjectContent getContent() {
        return content;
    }

    public void setContent(DecoratorObjectContent content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "{" + content.toString() + "}";
    }

    public String generateJS() {
        if (content != null) {
            return "{" + content.generateJS() + "}";
        }
        return "{}";
    }
}
