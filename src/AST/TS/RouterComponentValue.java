package AST.TS;

public class RouterComponentValue extends RouterPropertyValue {
    private String renderFunctionName;

    public RouterComponentValue(String renderFunctionName) {
        this.renderFunctionName = renderFunctionName;
    }

    @Override
    public String toString() {
        return renderFunctionName;
    }

    @Override
    public String generateJS() {
        return renderFunctionName + "()";
    }
}