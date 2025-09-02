package AST.TS;

public class Object {

    private ObjectContent content;

    public Object(ObjectContent content) {
        this.content = content;
    }

    public ObjectContent getContent() {
        return content;
    }

    public void setContent(ObjectContent content) {
        this.content = content;
    }

    @Override
    public String toString() {
        if (content == null) {
            return "{}";
        } else {
            return "{" + content.toString() + "}";
        }
    }

    public String generateJS() {
        if (content == null) {
            return "{}";
        }
        return "{" + content.generateJS() + "}";
    }
}
