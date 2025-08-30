package AST.HTML;

public class IdDefinerAttr extends StandardAttribute {
    private String string;

    public IdDefinerAttr(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
