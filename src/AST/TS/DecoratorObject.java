package AST.TS;


public class DecoratorObject {

    private DecoratorObjectContent content;  // اختياري

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
       return "{" + content.toString() +"}";
    }
}

