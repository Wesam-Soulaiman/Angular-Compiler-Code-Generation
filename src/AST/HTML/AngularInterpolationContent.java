package AST.HTML;

import AST.TS.Expression;
import java.util.List;

public class AngularInterpolationContent {
    private List<Expression> pipeExpressions;

    public AngularInterpolationContent(List<Expression> pipeExpressions) {
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
        for (int i = 0; i < pipeExpressions.size(); i++) {
            if (i > 0) {
                sb.append(" | ");
            }
            sb.append(pipeExpressions.get(i));
        }
        return sb.toString();
    }

    public String generateHTML() {
        // just delegate to toString, same as AngularInterpolation
        return toString();
    }
}
