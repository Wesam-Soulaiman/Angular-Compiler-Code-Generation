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
