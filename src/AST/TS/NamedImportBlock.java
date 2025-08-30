package AST.TS;

import java.util.List;

public class NamedImportBlock {
    private List<NamedImportContent> namedImports;

    public NamedImportBlock(List<NamedImportContent> namedImports) {
        this.namedImports = namedImports;
    }

    public List<NamedImportContent> getNamedImports() {
        return namedImports;
    }

    public void setNamedImports(List<NamedImportContent> namedImports) {
        this.namedImports = namedImports;
    }

    @Override
    public String toString() {
        System.out.println("rawan");
        if (namedImports == null || namedImports.isEmpty()) {
            return "{}";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int i = 0; i < namedImports.size(); i++) {
            sb.append(namedImports.get(i).toString());
            if (i < namedImports.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(" }");
        return sb.toString();
    }
}
