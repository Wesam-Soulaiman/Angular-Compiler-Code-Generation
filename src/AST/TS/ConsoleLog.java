package AST.TS;

public class ConsoleLog {

    private Arguments arguments;
private ConsoleLogSplit consoleLogSplit;

    public ConsoleLog(Arguments arguments, ConsoleLogSplit consoleLogSplit) {
        this.arguments = arguments;
        this.consoleLogSplit = consoleLogSplit;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public ConsoleLogSplit getConsoleLogSplit() {
        return consoleLogSplit;
    }

    public void setConsoleLogSplit(ConsoleLogSplit consoleLogSplit) {
        this.consoleLogSplit = consoleLogSplit;
    }

    @Override
    public String toString() {
        if (arguments == null) {
            return consoleLogSplit.toString() + "();";
        } else {
            return consoleLogSplit.toString() + "(" + arguments.toString() + ");";
        }
    }
}
