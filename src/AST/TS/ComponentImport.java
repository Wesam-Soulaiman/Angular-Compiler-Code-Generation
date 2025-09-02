package AST.TS;

import AST.TS.NamedImport;

public class ComponentImport extends NamedImport {
    @Override
    public String toString() {
        return "Component";
    }

    @Override
    public String generateJS() {
        return "";
    }
}
