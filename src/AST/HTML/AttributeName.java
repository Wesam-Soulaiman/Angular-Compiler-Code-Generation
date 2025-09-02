package AST.HTML;

public class AttributeName {
    public StandardAttribute standardAttribute;
    public AngularBinding angularBinding;
    public AngularEvent angularEvent;
    public AngularDirective angularDirective;
    public TwoWayDataBinding twoWayDataBinding;

    public AttributeName(TwoWayDataBinding twoWayDataBinding) {
        this.twoWayDataBinding = twoWayDataBinding;
    }

    public AttributeName(StandardAttribute standardAttribute) {
        this.standardAttribute = standardAttribute;
    }

    public AttributeName(AngularBinding angularBinding) {
        this.angularBinding = angularBinding;
    }

    public AttributeName(AngularDirective angularDirective) {
        this.angularDirective = angularDirective;
    }

    public AttributeName(AngularEvent angularEvent) {
        this.angularEvent = angularEvent;
    }

    @Override
    public String toString() {
        if (this.standardAttribute != null) {
            return this.standardAttribute.toString();
        } else if (this.angularBinding != null) {
            return this.angularBinding.toString();
        } else if (this.angularEvent != null) {
            return this.angularEvent.toString();
        } else if (this.angularDirective != null) {
            return this.angularDirective.toString();
        } else if (this.twoWayDataBinding != null) {
            return this.twoWayDataBinding.toString();
        } else {
            return super.toString();
        }
    }

    public String generateHtml() {
        if (this.standardAttribute != null) {
            return this.standardAttribute.generateHtml();
        } else if (this.angularBinding != null) {
            return this.angularBinding.generateHtml();
        } else if (this.angularEvent != null) {
            return this.angularEvent.generateHtml();
        } else if (this.angularDirective != null) {
            return this.angularDirective.generateHtml();
        } else if (this.twoWayDataBinding != null) {
            return this.twoWayDataBinding.generateHtml();
        } else {
            return "";
        }
    }
}
