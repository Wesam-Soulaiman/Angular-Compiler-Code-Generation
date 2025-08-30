package AST.CSS;

public class ColorValue extends Values {
    private String color;

    public ColorValue(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
