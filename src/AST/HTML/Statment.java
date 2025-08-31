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
}


//    @Override
//    public ASTNode visitStatment(YourGrammarParser.StatmentContext ctx) {
//        if (ctx == null) {
//            return null;
//        }
//        List<Text> texts = ctx.text() == null ?
//                new ArrayList<>() :
//                ctx.test().stream()
//                        .map(attr -> (Text) visitText(attr))
//                        .collect(Collectors.toList());
//        return new Statment(texts);}