package AST.HTML;

public class AttributeName {
    public StandardAttribute standardAttribute;
    public AngularBinding angularBinding;
    public AngularEvent angularEvent;
    public AngularDirective angularDirective;
    public TwoWayDataBinding twoWayDataBinding ;


    public AttributeName(StandardAttribute standardAttribute, AngularBinding angularBinding, AngularEvent angularEvent, AngularDirective angularDirective, TwoWayDataBinding twoWayDataBinding) {
        this.standardAttribute = standardAttribute;
        this.angularBinding = angularBinding;
        this.angularEvent = angularEvent;
        this.angularDirective = angularDirective;
        this.twoWayDataBinding = twoWayDataBinding;
    }

    public StandardAttribute getStandardAttribute() {
        return standardAttribute;
    }

    public void setStandardAttribute(StandardAttribute standardAttribute) {
        this.standardAttribute = standardAttribute;
    }

    public TwoWayDataBinding getTwoWayDataBinding() {
        return twoWayDataBinding;
    }

    public void setTwoWayDataBinding(TwoWayDataBinding twoWayDataBinding) {
        this.twoWayDataBinding = twoWayDataBinding;
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
        } else if (this.twoWayDataBinding!= null) {
            return this.twoWayDataBinding.toString();
        }
        else {
            return super.toString();
        }
    }

    }

