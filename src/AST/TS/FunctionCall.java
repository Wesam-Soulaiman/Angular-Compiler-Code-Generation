package AST.TS;
import java.util.List;
public class FunctionCall {
    private String functionName;
    private List<Arguments> arguments;

    public FunctionCall(String functionName, List<Arguments> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<Arguments> getArguments() {
        return arguments;
    }

    public void setArguments(List<Arguments> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName);
        sb.append("(");
        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                sb.append(arguments.get(i).toString());
                if (i < arguments.size() -1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
