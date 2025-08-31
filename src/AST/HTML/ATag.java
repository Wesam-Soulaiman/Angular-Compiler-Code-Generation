package AST.HTML;

public class ATag extends TagName {

    public ATag() {
        super("a"); // تمرير اسم التاج للـ constructor الأساسي
    }

    @Override
    public String toString() {
        return super.toString(); // أو ببساطة return "a";
    }
}
