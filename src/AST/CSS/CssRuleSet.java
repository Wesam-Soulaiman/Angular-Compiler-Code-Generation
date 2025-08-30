package AST.CSS;

public class CssRuleSet extends CssStatement {
    private RuleSet ruleSet;

    public CssRuleSet(RuleSet ruleSet) {
        this.ruleSet = ruleSet;
    }

    public RuleSet getRuleSet() {
        return ruleSet;
    }

    @Override
    public String toString() {
        return ruleSet.toString();
    }
}
