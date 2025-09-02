package AST.TS;

public enum DeclarationTypes {
    CONST,
    LET,
    VAR;


    public String generateJS() {
        switch (this) {
            case CONST: return "const";
            case LET:   return "let";
            case VAR:   return "var";
            default:    return "";
        }
    }
}
