package AST.HTML;

public class AngularInterpolation {
    private AngularInterpolationContent content; // ممكن يكون null (اختياري)

    public AngularInterpolation(AngularInterpolationContent content) {
        this.content = content;
    }

    public AngularInterpolationContent getContent() {
        return content;
    }

    public void setContent(AngularInterpolationContent content) {
        this.content = content;
    }

    @Override
    public String toString() {
        if (content != null) {
            return "{{" + content.toString() + "}}";
        } else {
            return "{{}}";
        }
    }
}

//    @Override
//    public ASTNode visitAngularInterpolation(YourGrammarParser.AngularInterpolationContext ctx) {
//        if (ctx == null) {
//            return null;
//        }
//
//
//        AngularInterpolationContent content = null;
//        if (ctx.angularInterpolationContent() != null) {
//            content = (AngularInterpolationContent) visit(ctx.angularInterpolationContent());
//        }
//
//
//        return new AngularInterpolation( content);
//    }
