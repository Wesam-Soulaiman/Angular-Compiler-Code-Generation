package AST.HTML;

public class AngularBinding {
    private BindingName bindingName;

    public AngularBinding(BindingName bindingName) {
        this.bindingName = bindingName;
    }

    @Override
    public String toString() {
        return "[" + bindingName.toString() + "]";
    }
}


    //    @Override
    //    public ASTNode visitAngularBinding(YourGrammarParser.AngularBindingContext ctx) {
    //        if (ctx == null) {
    //            return null;
    //        }
    //
    //        BindingName binding = (BindingName) visit(ctx.bindingName());
    //
    //        return new AngularBinding( binding);
    //    }
