package SymbolTable;

import java.util.HashMap;
import java.util.Map;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ObjectPropertySymbolTable {
    private final Map<String, Object> properties;
    private final String errorFilePath;

    public ObjectPropertySymbolTable(String errorFilePath) {
        this.properties = new HashMap<>();
        this.errorFilePath = errorFilePath;
    }

    public boolean contains(String name) {
        return properties.containsKey(name);
    }

    public void put(String name, Object value) {
        properties.put(name, value);
    }

    public Object get(String name) {
        return properties.get(name);
    }

    public void writeSemanticError(String message) {
        try (FileWriter fw = new FileWriter(errorFilePath, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(message);
        } catch (IOException e) {
            System.err.println("Error writing semantic error: " + e.getMessage());
        }
    }

    public void checkPropertyExists(String name, int line) {
        if (!contains(name)) {
            String error = "Semantic Error: The property '" + name + "' is not defined. (Line: " + line + ")";

            System.err.println(error);
            writeSemanticError(error);
        }
    }

    public void print() {
        System.out.println("=== Object Properties ===");
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("========================");
    }
}
