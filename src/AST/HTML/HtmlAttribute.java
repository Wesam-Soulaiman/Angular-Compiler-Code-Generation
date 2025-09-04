package AST.HTML;

public class HtmlAttribute {
    private AttributeName attributeName;
    private AttributeValue attributeValue;

    public HtmlAttribute(AttributeName attributeName, AttributeValue attributeValue) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    public boolean isAngularDirective() {
        return attributeName.isAngularDirective();
    }

    @Override
    public String toString() {
        if (isAngularDirective()) return "";
        return attributeName.toString() + "=" + attributeValue.toString();
    }

    public String generateHTML() {
        if (isAngularDirective()) return "";

        // Handle Angular binding ([src])
        if (attributeName.angularBinding != null) {
            return attributeName.generateHTML() + "=\"${" + attributeValue.getName().replace("\"","") + "}\"";
        }

        if (attributeName.twoWayDataBinding != null) {
            return "";
        }

        // Handle Angular event (click)
        if (attributeName.angularEvent != null) {
            if ("click".equals(attributeName.angularEvent.getEvent().toString())) {
                // Replace (product) with ${product.id} dynamically
                String expr = attributeValue.getName(); // e.g., "selectProduct(product)"
                expr = expr.replaceAll("\\((\\w+)\\)", "(\\${$1.id})");
                return "onclick=" + expr ;
            }
            if ("ngSubmit".equals(attributeName.angularEvent.getEvent().toString())) {
                // Replace (product) with ${product.id} dynamically
                String expr = attributeValue.getName(); // e.g., "selectProduct(product)"
                expr = expr.replace("()", "");
                return "id=" + expr ;
            }
            return attributeName.angularEvent.generateHTML() + "=" + attributeValue.getName();
        }

        // Normal attribute
        return attributeName.generateHTML() + "=" + attributeValue.generateHTML();
    }

    // Delegate directive translation
    public String generateDirectivePrefix() {
        return attributeName.generateDirectivePrefix(attributeValue);
    }

    public String generateDirectiveSuffix() {
        return attributeName.generateDirectiveSuffix();
    }
}
