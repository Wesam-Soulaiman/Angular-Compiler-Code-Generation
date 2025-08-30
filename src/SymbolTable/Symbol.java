package SymbolTable;

import AST.TS.DeclarationTypes;
import AST.TS.Type;

public class Symbol {
    private String type;
    private Object value;
    private DeclarationTypes declarationType;

    public Symbol(String type, Object value, DeclarationTypes declarationType) {
        this.type = type;
        this.value = value;
        this.declarationType = declarationType;
    }

    public Symbol(String type) {
        this.type = type;
    }

    public String getType() { return type; }
    public Object getValue() { return value; }
    public DeclarationTypes getDeclarationType() { return declarationType; }

}
