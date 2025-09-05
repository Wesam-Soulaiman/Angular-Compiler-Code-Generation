package AST.TS;

public class FunctionCall {
    private String functionName;
    private Arguments arguments; // بدل List<Arguments>

    public FunctionCall(String functionName, Arguments arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        if (arguments != null && !arguments.getArgs().isEmpty()) {
            for (int i = 0; i < arguments.getArgs().size(); i++) {
                sb.append(arguments.getArgs().get(i).toString());
                if (i < arguments.getArgs().size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        if (arguments != null && !arguments.getArgs().isEmpty()) {
            for (int i = 0; i < arguments.getArgs().size(); i++) {
                sb.append(arguments.getArgs().get(i).generateJS());
                if (i < arguments.getArgs().size() - 1) sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
