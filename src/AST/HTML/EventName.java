package AST.HTML;

public abstract class EventName {
    public abstract String toString();
}


//     @Override
//     public ASTNode visitClickEvent(YourGrammarParser.ClickEventContext ctx) {
//         return new ClickEvent(ctx.CLICK());
//     }
//
//     @Override
//     public ASTNode visitChangeEvent(YourGrammarParser.ChangeEventContext ctx) {
//         return new ChangeEvent(ctx.CHANGE());
//     }
//
//     @Override
//     public ASTNode visitInputEvent(YourGrammarParser.InputEventContext ctx) {
//         return new InputEvent(ctx.INPUT());
//     }
//
//     @Override
//     public ASTNode visitSubmitEvent(YourGrammarParser.SubmitEventContext ctx) {
//         return new SubmitEvent(ctx.SUBMIT());
//     }
//
//     @Override
//     public ASTNode visitKeyDownEvent(YourGrammarParser.KeyDownEventContext ctx) {
//         return new KeyDownEvent(ctx.KEYDOWN());
//     }
//
//     @Override
//     public ASTNode visitKeyUpEvent(YourGrammarParser.KeyUpEventContext ctx) {
//         return new KeyUpEvent(ctx.KEYUP());
//     }
//
//     @Override
//     public ASTNode visitCustomEvent(YourGrammarParser.CustomEventContext ctx) {
//         return new CustomEvent(ctx.IDDEFINER());
//     }
