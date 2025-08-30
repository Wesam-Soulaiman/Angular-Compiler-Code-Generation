package AST.TS;

public class ReturnStatement_ extends Statement {
    private ReturnStatement returnValue;

    public ReturnStatement_(ReturnStatement returnValue) {
        this.returnValue = returnValue;
    }


    public ReturnStatement getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(ReturnStatement returnValue) {
        this.returnValue = returnValue;
    }

    @Override
    public String toString() {
        return returnValue.toString();
    }
}
