package SymbolTable;

import java.util.*;

public class SymbolTable {
    private final Stack<HashMap<String, Symbol>> scopes;
    private static SymbolTable instance;
    private List<Rows> rows;
    public boolean hasSyntaxError = false;
    public boolean hasSemanticError = false;
    public static boolean REPORT_SYNTAX_ERRORS = true;
    private Set<String> componentNames = new HashSet<>();
    public ArrayList<String> errors = new ArrayList<String>();

    private SymbolTable() {
        scopes = new Stack<>();
        scopes.push(new HashMap<>());
        rows = new ArrayList<>();
    }
    public HashMap<String, Symbol> getSymbols() {
        HashMap<String, Symbol> symbols = new HashMap<>();
        for (HashMap<String, Symbol> scope : scopes) {
            symbols.putAll(scope);
        }
        return symbols;
    }
    public void enterScope() {
        scopes.push(new HashMap<>());
    }
    private List<HashMap<String, Symbol>> deletedScopes = new ArrayList<>();

    public void exitScope() {
        if (!scopes.isEmpty()) {
            deletedScopes.add(new HashMap<>(scopes.get(scopes.size() - 1)));
            scopes.remove(scopes.size() - 1);
        }
    }

    public void put(String name, Symbol sym) {
        if (scopes.isEmpty()) {
            System.out.println("Error: No active scopes.");
            return;
        }
        scopes.peek().put(name, sym);
        System.out.println("Added symbol: " + name + " to scope " + (scopes.size() - 1));
    }


    public Symbol get(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Symbol sym = scopes.get(i).get(name);
            if (sym != null) {
                return sym;
            }
        }
        return null;
    }

    public boolean contains(String name) {
        return get(name) != null;
    }

    public boolean containsKey(String name) {
        for (HashMap<String, Symbol> scope : scopes) {
            if (scope.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    public static SymbolTable getInstance() {
        if (instance == null) {
            instance = new SymbolTable();
        }
        return instance;
    }

    public List<Rows> getRows() {
        return rows;
    }

    public void setRows(List<Rows> rows) {
        this.rows = rows;
    }


    public void print() {
        System.out.println("\nSymbol Table:");
        System.out.println("===============================================================");
        System.out.printf("| %-5s | %-19s | %-15s |\n", "Scope", "Key", "Type");
        System.out.println("===============================================================");

        int index = 0;
        for (HashMap<String, Symbol> scope : scopes) {
            if (!scope.isEmpty()) {
                printScope(index++, scope);
            }
        }

        for (HashMap<String, Symbol> scope : deletedScopes) {
            if (!scope.isEmpty()) {
                printScope(index++, scope);
            }
        }
    }

    private void printScope(int index, HashMap<String, Symbol> scope) {
        if (scope.isEmpty()) return;

        System.out.println("Scope(" + index + "):");

        int j = 0;
        for (Map.Entry<String, Symbol> entry : scope.entrySet()) {
            String key = entry.getKey();
            Symbol symbol = entry.getValue();

            if (key != null) {
                System.out.printf("| %-5s | %-19s | %-15s |\n", j, key, symbol.getType());
                j++;
            }
        }

        System.out.println("---------------------------------------------------------------");
    }



    public boolean containsDuplicateComponentName(String componentName) {
        return componentNames.contains(componentName);
    }

    public boolean containsSymbol(String name) {
        for (HashMap<String, Symbol> scope : scopes) {
            if (scope.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    public void putComponentName(String componentName, int lineNumber) {
        if (containsDuplicateComponentName(componentName)) {
            String error = "Semantic Error: Duplicate class name '" + componentName + "'";
            errors.add("Semantic Error: Duplicate class name '" + componentName + "' at line: " + lineNumber);
            semanticError(error, lineNumber);
        } else {
            componentNames.add(componentName);
        }
    }

    public void semanticError(String errorMessage, int lineNumber) {
        String err = errorMessage + " at line: " + lineNumber;
        errors.add(err);
        hasSemanticError = true;
    }

    public boolean isVarExist(String varName) {
        for (int i = 0; i < scopes.size(); i++) {
            HashMap<String, Symbol> scope = scopes.get(i);
            if (scope != null && scope.containsKey(varName)) {
                return true;
            }
        }
        return false;
    }
    public boolean isVarExistInCurrentScope(String varName) {
        if (!scopes.isEmpty()) {
            HashMap<String, Symbol> currentScope = scopes.get(scopes.size() - 1);
            return currentScope.containsKey(varName);
        }
        return false;
    }

}
