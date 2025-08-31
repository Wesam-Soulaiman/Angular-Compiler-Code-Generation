package AST.HTML;

public class PTag extends TagName {

    public PTag() {
        super("p"); // تمرير اسم التاج للـ constructor الأساسي
    }

    @Override
    public String toString() {
        return super.toString(); // يمكن استخدام super.toString() أو مباشرة "p"
    }
}
