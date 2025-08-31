package AST.HTML;

// Fixed HTML tag: <div>
public class DivTag extends TagName {

    public DivTag() {
        super("div"); // تمرير اسم التاج للـ constructor الأساسي
    }

    @Override
    public String toString() {
        return super.toString(); // أو ببساطة return "div";
    }
}
