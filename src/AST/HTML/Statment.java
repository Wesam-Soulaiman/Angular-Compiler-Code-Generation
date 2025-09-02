package AST.HTML;

import java.util.List;

public class Statment {
    private List<Text> texts;

    public Statment(List<Text> texts) {
        this.texts = texts;
    }

    public List<Text> getTexts() {
        return texts;
    }

    public void setTexts(List<Text> texts) {
        this.texts = texts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Text text : texts) {
            sb.append(text);
        }
        return sb.toString();
    }

    // Transpile to HTML
    public String generateHTML() {
        StringBuilder sb = new StringBuilder();
        for (Text text : texts) {
            sb.append(text.generateHTML());
        }
        return sb.toString();
    }
}
