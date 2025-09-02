package AST.TS;

import AST.TS.NamedImport;

public class InputImport extends NamedImport {
    @Override
    public String toString() {
        return "Input";
    }

    @Override
    public String generateJS() {
        return "";
    }
}
