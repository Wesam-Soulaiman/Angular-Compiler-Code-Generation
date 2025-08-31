package AST.HTML;

public class InputTag extends TagName {

    public InputTag() {
        super("input"); // تمرير اسم التاج للـ constructor الأساسي
    }

    @Override
    public String toString() {
        return super.toString(); // أو ببساطة return "input";
    }
}
