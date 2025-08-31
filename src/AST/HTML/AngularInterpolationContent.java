package AST.HTML;
import AST.TS.Expression;

import java.util.List;

public class AngularInterpolationContent {


    private List<Expression> pipeExpressions;

    public AngularInterpolationContent( List<Expression> pipeExpressions) {

        this.pipeExpressions = pipeExpressions;
    }


    public List<Expression> getPipeExpressions() {
        return pipeExpressions;
    }

    public void setPipeExpressions(List<Expression> pipeExpressions) {
        this.pipeExpressions = pipeExpressions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pipeExpressions.toString());
        for (Expression expr : pipeExpressions) {
            sb.append(" | ").append(expr.toString());
        }
        return sb.toString();
    }
}


//  @Override
//public ASTNode visitAngularInterpolationContent(YourGrammarParser.AngularInterpolationContentContext ctx) {
//    if (ctx == null) {
//        return null;
//    }
//
//    List<Expression> expressions = ctx.expression() == null ?
//        new ArrayList<>() :
//        ctx.expression().stream()
//            .map(exprCtx -> (Expression) visitExpression(exprCtx))
//            .collect(Collectors.toList());
//
//    return new AngularInterpolationContent(expressions);
//}