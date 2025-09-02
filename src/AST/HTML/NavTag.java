package AST.HTML;

public class NavTag extends TagName {
    public NavTag() {
        super("nav"); // تمرير اسم التاج للـ constructor الأساسي
    }

    @Override
    public String toString() {
        return super.toString(); // أو ببساطة return "a";
    }
}
