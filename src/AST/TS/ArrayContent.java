package AST.TS;
import java.util.List;
public class ArrayContent {
    private List<Expression> elements;

    public ArrayContent(List<Expression> elements) {
        this.elements = elements;
    }

    public List<Expression> getElements() {
        return elements;
    }

    public void setElements(List<Expression> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elements.size(); i++) {
            sb.append("\n\t");
            sb.append(elements.get(i).toString());
            if (i < elements.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
