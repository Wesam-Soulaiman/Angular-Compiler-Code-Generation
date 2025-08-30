package AST.CSS;


import java.util.List;

public class RuleSet {
    private SelectorGroup selectorGroup;
    private List<Declaration> declarations;

    public RuleSet(SelectorGroup selectorGroup, List<Declaration> declarations) {
        this.selectorGroup = selectorGroup;
        this.declarations = declarations;
    }

    public SelectorGroup getSelectorGroup() {
        return selectorGroup;
    }

    public void setSelectorGroup(SelectorGroup selectorGroup) {
        this.selectorGroup = selectorGroup;
    }

    public List<Declaration> getDeclarations() {
        return declarations;
    }

    public void setDeclarations(List<Declaration> declarations) {
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(selectorGroup.toString()).append(" {\n");
        for (Declaration declaration : declarations) {
            sb.append("  ").append(declaration.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
