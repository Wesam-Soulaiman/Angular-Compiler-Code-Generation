package AST.HTML;

public class AttributeValue {
    private String name;

    public AttributeValue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AttributeValue{" +
                "name='" + name + '\'' +
                '}';
    }
}


//    @Override
//    public String visitAttributeValue(AngularHTMLParser.AttributeValueContext ctx) {
//        // ترجع قيمة السلسلة النصية التي تمثل القيمة
//        return ctx.STRING().getText();  // مثال: "main-class"
//    }