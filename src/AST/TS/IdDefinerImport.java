package AST.TS;

import AST.TS.NamedImport;

public class IdDefinerImport extends NamedImport {
    private String string;

    public IdDefinerImport(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }

    @Override
    public String generateJS() {
        return "";
    }
}
