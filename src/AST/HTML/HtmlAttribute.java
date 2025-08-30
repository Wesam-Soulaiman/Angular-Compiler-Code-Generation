package AST.HTML;

import AST.HTML.AttributeName;

public class HtmlAttribute {

    private AttributeName attributeName;
    private AttributeValue attributeValue;

    public HtmlAttribute(AttributeName attributeName, AttributeValue attributeValue) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    public AttributeName getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(AttributeName attributeName) {
        this.attributeName = attributeName;
    }

    public AttributeValue getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return attributeName.toString() + "=" + attributeValue.toString() ;
    }
}

