package AST.HTML;

public class ButtonTag extends TagName {

    public ButtonTag() {
        super("button"); // تمرير اسم التاج للـ constructor الأساسي
    }

    @Override
    public String toString() {
        return super.toString(); // أو ببساطة return "button";
    }
}
