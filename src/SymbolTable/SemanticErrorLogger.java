package SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class SemanticErrorLogger {

    private static SemanticErrorLogger instance; // Singleton instance
    private final Set<String> definedSymbols;
    private final String errorFilePath;

    // Private constructor
    private SemanticErrorLogger(String errorFilePath) {
        this.definedSymbols = new HashSet<>();
        this.errorFilePath = errorFilePath;
    }

    // Singleton getter
    public static SemanticErrorLogger getInstance() {
        if (instance == null) {
            instance = new SemanticErrorLogger("semantic_errors.txt"); // يمكنك تغيير المسار حسب الحاجة
        }
        return instance;
    }

    // Check if a symbol exists
    public boolean contains(String name) {
        return definedSymbols.contains(name);
    }

    // Add a symbol with duplicate checking
    public void addSymbol(String name, int line, String type) {
        if (contains(name)) {
            String error = "Semantic Error: The " + type + " '" + name + "' is already defined. (Line: " + line + ")";
            System.err.println(error);
            writeSemanticError(error);
        } else {
            definedSymbols.add(name);
        }
    }

    // Write a semantic error to the file
    public void writeSemanticError(String message) {
        try (FileWriter fw = new FileWriter(errorFilePath, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(message);
        } catch (IOException e) {
            System.err.println("Error writing semantic error: " + e.getMessage());
        }
    }

    // Optional: print all defined symbols
    public void printSymbols() {
        System.out.println("=== Defined Symbols ===");
        for (String name : definedSymbols) {
            System.out.println(name);
        }
        System.out.println("======================");
    }
}
