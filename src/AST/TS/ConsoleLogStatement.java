package AST.TS;

public class ConsoleLogStatement extends Statement {
    private ConsoleLog logValue;

    public ConsoleLogStatement(ConsoleLog logValue) {
        this.logValue = logValue;
    }

    public ConsoleLog getLogValue() {
        return logValue;
    }

    public void setLogValue(ConsoleLog logValue) {
        this.logValue = logValue;
    }

    @Override
    public String toString() {
        return logValue.toString();
    }
}
