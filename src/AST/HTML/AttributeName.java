package AST.HTML;

public class AttributeName {
    public StandardAttribute standardAttribute;
    public AngularBinding angularBinding;
    public AngularEvent angularEvent;
    public AngularDirective angularDirective;

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

    public StandardAttribute getStandardAttribute() {
        return standardAttribute;
    }

    public void setStandardAttribute(StandardAttribute standardAttribute) {
        this.standardAttribute = standardAttribute;
    }

    public AngularBinding getAngularBinding() {
        return angularBinding;
    }

    public void setAngularBinding(AngularBinding angularBinding) {
        this.angularBinding = angularBinding;
    }

    public AngularEvent getAngularEvent() {
        return angularEvent;
    }

    public void setAngularEvent(AngularEvent angularEvent) {
        this.angularEvent = angularEvent;
    }

    public AngularDirective getAngularDirective() {
        return angularDirective;
    }

    public void setAngularDirective(AngularDirective angularDirective) {
        this.angularDirective = angularDirective;
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
        } else {
            return super.toString();
        }
    }

    }

