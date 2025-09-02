package AST.TS;

import java.util.List;

public class ArrayValue extends DecoratorPropertyValue {
    private Array elements;

    public ArrayValue(Array elements) {
        this.elements = elements;
    }

    public Array getElements() {
        return elements;
    }

    public void setElements(Array elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    @Override
    public String generateJS() {
        return elements.generateJS();
    }
}
