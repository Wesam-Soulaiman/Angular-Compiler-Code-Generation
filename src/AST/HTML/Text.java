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
}
//
//@Override
//public ASTNode visitText(YourGrammarParser.TextContext ctx) {
//    if (ctx == null) return null;
//    String idDefiner = ctx.IDDEFINER().getText();
//    return new Text(idDefiner);
//}
