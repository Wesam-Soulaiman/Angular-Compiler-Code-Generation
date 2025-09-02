package AST.HTML;

import java.util.List;
import java.util.stream.Collectors;

public class HtmlProg {
    private List<HtmlNode> nodes;

    public HtmlProg(List<HtmlNode> nodes) {
        this.nodes = nodes;
    }

    public List<HtmlNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<HtmlNode> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return nodes.stream()
                .map(HtmlNode::toString)
                .collect(Collectors.joining("\n"));
    }

    public String generateHTML() {
        return nodes.stream()
                .map(HtmlNode::generateHTML) // call generateHTML on each HTML AST node
                .collect(Collectors.joining("\n"));
    }
}
