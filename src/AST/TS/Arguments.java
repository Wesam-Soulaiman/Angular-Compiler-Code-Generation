package AST.TS;

import java.util.List;

public class Arguments {

    private List<Expression> expressions;

    public Arguments(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expressions.size(); i++) {
            sb.append(expressions.get(i).toString());
            if (i < expressions.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expressions.size(); i++) {
            sb.append(expressions.get(i).generateJS());
            if (i < expressions.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
