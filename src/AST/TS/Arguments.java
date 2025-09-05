package AST.TS;

import java.util.List;
import java.util.stream.Collectors;

public class Arguments {
    private List<Expression> args;

    public Arguments(List<Expression> args) {
        this.args = args;
    }

    public List<Expression> getArgs() {
        return args;
    }

    public void setArgs(List<Expression> args) {
        this.args = args;
    }

    public String generateJS() {
        return args.stream()
                .map(Expression::generateJS)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String toString() {
        return args.stream()
                .map(expr -> expr.toString()) // أو expr.generateJS()
                .collect(Collectors.joining(", "));
    }

}
