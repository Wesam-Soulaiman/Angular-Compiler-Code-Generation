package SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DecoratorBasedInputErrorLogger {

    private final String errorFilePath;

    public DecoratorBasedInputErrorLogger(String errorFilePath) {
        this.errorFilePath = errorFilePath;
    }

    public void logError(String variableName, int lineNumber) {
        String error = "Semantic Error: Variable '" + variableName + "' is already defined. (Line: " + lineNumber + ")";
        System.err.println(error);

        try (FileWriter fw = new FileWriter(errorFilePath, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(error);
        } catch (IOException e) {
            System.err.println("Error writing semantic error to file: " + e.getMessage());
        }
    }
}
