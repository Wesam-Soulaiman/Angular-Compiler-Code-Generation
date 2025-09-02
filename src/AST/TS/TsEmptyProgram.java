package AST.TS;

import java.util.Collections;

public class TsEmptyProgram extends TsProg {
    public TsEmptyProgram() {
        super(Collections.emptyList()); // ✅ pass an empty list
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public String generateJS() {
        return "";
    }
}
