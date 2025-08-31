package AST.HTML;

public abstract class StandardAttribute {
    public abstract String toString();
}

//     @Override
//     public ASTNode visitClassAttr(YourGrammarParser.ClassAttrContext ctx) {
//         return new ClassAttr(ctx.CLASS());
//     }
//
//     @Override
//     public ASTNode visitIdAttr(YourGrammarParser.IdAttrContext ctx) {
//         return new IdAttr(ctx.ID());
//     }
//
//     @Override
//     public ASTNode visitTitleAttr(YourGrammarParser.TitleAttrContext ctx) {
//         return new TitleAttr(ctx.TITLE());
//     }
//
//     @Override
//     public ASTNode visitAltAttr(YourGrammarParser.AltAttrContext ctx) {
//         return new AltAttr(ctx.ALT());
//     }
//
//     @Override
//     public ASTNode visitHrefAttr(YourGrammarParser.HrefAttrContext ctx) {
//         return new HrefAttr(ctx.HREF());
//     }
//
//     @Override
//     public ASTNode visitSrcAttr(YourGrammarParser.SrcAttrContext ctx) {
//         return new SrcAttr(ctx.SRC());
//     }
//
//     @Override
//     public ASTNode visitDisabledAttr(YourGrammarParser.DisabledAttrContext ctx) {
//         return new DisabledAttr(ctx.DISABLED());
//     }
//
//     @Override
//     public ASTNode visitTypeAttr(YourGrammarParser.TypeAttrContext ctx) {
//         return new TypeAttr(ctx.TYPE());
//     }
//
//     @Override
//     public ASTNode visitNameAttr(YourGrammarParser.NameAttrContext ctx) {
//         return new NameAttr(ctx.NAME());
//     }
//
//     @Override
//     public ASTNode visitIdDefinerAttr(YourGrammarParser.IdDefinerAttrContext ctx) {
//         return new CustomAttr(ctx.IDDEFINER());
//     }
