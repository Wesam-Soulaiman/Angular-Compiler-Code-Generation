package AST.TS;

import java.util.List;
import java.util.stream.Collectors;

public class NamedImportContent {

    private List<NamedImport> namedImports;

    public NamedImportContent(List<NamedImport> namedImports) {
        this.namedImports = namedImports;
    }

    public List<NamedImport> getNamedImports() {
        return namedImports;
    }

    public void setNamedImports(List<NamedImport> namedImports) {
        this.namedImports = namedImports;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < namedImports.size(); i++) {
            sb.append(namedImports.get(i).toString());
            if (i < namedImports.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();

    }
}
