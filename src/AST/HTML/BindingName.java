package AST.HTML;

public abstract class BindingName {
    public abstract String toString();
}


//     @Override
//     public ASTNode visitValueBinding(YourGrammarParser.ValueBindingContext ctx) {
//         return new ValueBinding(ctx.VALUE());
//     }
//
//     @Override
//     public ASTNode visitCheckedBinding(YourGrammarParser.CheckedBindingContext ctx) {
//         return new CheckedBinding(ctx.CHECKED());
//     }
//
//     @Override
//     public ASTNode visitSrcBinding(YourGrammarParser.SrcBindingContext ctx) {
//         return new SrcBinding(ctx.SRC());
//     }
//
//     @Override
//     public ASTNode visitHrefBinding(YourGrammarParser.HrefBindingContext ctx) {
//         return new HrefBinding(ctx.HREF());
//     }
//
//     @Override
//     public ASTNode visitCustomBinding(YourGrammarParser.CustomBindingContext ctx) {
//         return new CustomBinding(ctx.IDDEFINER());
//     }
