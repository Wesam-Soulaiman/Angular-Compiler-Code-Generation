package AST.HTML;

public class LiTag extends TagName {

    public LiTag() {
        super("li"); // تمرير اسم التاج للـ constructor الأساسي
    }

    @Override
    public String toString() {
        return super.toString(); // أو يمكنك ببساطة return "li";
    }
}
