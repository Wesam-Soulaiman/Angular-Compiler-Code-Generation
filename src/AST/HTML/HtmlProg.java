package AST.HTML;

import AST.HTML.HtmlElement;

import java.util.List;
import java.util.stream.Collectors;

public class HtmlProg {
    private List<HtmlElement> elements;

    public HtmlProg(List<HtmlElement> elements) {
        this.elements = elements;
    }


    public List<HtmlElement> getElements() {
        return elements;
    }

    public void setElements(List<HtmlElement> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return elements.stream()
                .map(HtmlElement::toString)
                .collect(Collectors.joining("\n"));
    }


}