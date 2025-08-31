package AST.HTML;

public class FormTag extends TagName {

    public FormTag() {
        super("form"); // تمرير اسم التاج للـ constructor الأساسي
    }

    @Override
    public String toString() {
        return super.toString(); // أو return "form";
    }
}
