package AST.TS;

import AST.TS.NamedImport;

public class InjectableImport extends NamedImport {
    @Override
    public String toString() {
        return "Injectable";
    }

    @Override
    public String generateJS() {
        return "";
    }
}
