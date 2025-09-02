package AST.TS;

public class Array {
    private ArrayContent content;

    public Array(ArrayContent content) {
        this.content = content;
    }

    public ArrayContent getContent() {
        return content;
    }

    public void setContent(ArrayContent content) {
        this.content = content;
    }

    @Override
    public String toString() {
        if (content == null) return "[]";
        return "[" + content.toString() + "]";
    }

    public String generateJS() {
        if (content == null) return "[]";
        return "[" + content.generateJS() + "]";
    }
}
