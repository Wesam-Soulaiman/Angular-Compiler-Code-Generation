package AST.HTML;

public class AttributeName {
    public StandardAttribute standardAttribute;
    public AngularBinding angularBinding;
    public AngularEvent angularEvent;
    public AngularDirective angularDirective;
    public TwoWayDataBinding twoWayDataBinding;

    public AttributeName(StandardAttribute standardAttribute, AngularBinding angularBinding, AngularEvent angularEvent, AngularDirective angularDirective, TwoWayDataBinding twoWayDataBinding) {
        this.standardAttribute = standardAttribute;
        this.angularBinding = angularBinding;
        this.angularEvent = angularEvent;
        this.angularDirective = angularDirective;
        this.twoWayDataBinding = twoWayDataBinding;
    }

    @Override
    public String toString() {
        if (this.standardAttribute != null) return this.standardAttribute.toString();
        if (this.angularBinding != null) return this.angularBinding.toString();
        if (this.angularEvent != null) return this.angularEvent.toString();
        if (this.angularDirective != null) return this.angularDirective.toString();
        if (this.twoWayDataBinding != null) return this.twoWayDataBinding.toString();
        return super.toString();
    }

    public String generateHTML() {
        if (this.standardAttribute != null) return this.standardAttribute.generateHTML();
        if (this.angularBinding != null) return this.angularBinding.generateHTML();
        if (this.angularEvent != null) return this.angularEvent.generateHTML();
        if (this.angularDirective != null) return ""; // handled via prefix/suffix
        if (this.twoWayDataBinding != null) return this.twoWayDataBinding.generateHTML();
        return "";
    }

    public String generateDirectivePrefix(AttributeValue value) {
        if (this.angularDirective != null) return this.angularDirective.generateDirectivePrefix(value);
        return "";
    }

    public String generateDirectiveSuffix() {
        if (this.angularDirective != null) return this.angularDirective.generateDirectiveSuffix();
        return "";
    }

    public boolean isAngularDirective() {
        return this.angularDirective != null;
    }
}
