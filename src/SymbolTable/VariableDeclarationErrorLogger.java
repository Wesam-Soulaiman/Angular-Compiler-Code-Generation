package SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class VariableDeclarationErrorLogger {

    private final String errorFilePath;

    public VariableDeclarationErrorLogger(String errorFilePath) {
        this.errorFilePath = errorFilePath;
    }

    public void logError(String message, int lineNumber) {
        String error = "Semantic Error: " + message + " (Line: " + lineNumber + ")";
        System.err.println(error);

        try (FileWriter fw = new FileWriter(errorFilePath, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(error);
        } catch (IOException e) {
            System.err.println("Error writing semantic error to file: " + e.getMessage());
        }
    }
}
