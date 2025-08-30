package AST.CSS;


public class Url {
    private String value;

    public Url(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value ;
    }
}
