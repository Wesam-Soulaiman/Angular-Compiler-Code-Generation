package AST.HTML;

public class Text {
    private String idDefiner;

    public Text(String idDefiner) {
        this.idDefiner = idDefiner;
    }

    public String getIdDefiner() {
        return idDefiner;
    }

    public void setIdDefiner(String idDefiner) {
        this.idDefiner = idDefiner;
    }

    @Override
    public String toString() {
        return idDefiner;
    }

    // Transpile to HTML
    public String generateHTML() {
        return idDefiner; // raw text is just output as-is
    }
}
