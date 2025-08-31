package AST.HTML;

public class ImgTag extends TagName {

    public ImgTag() {
        super("img"); // تمرير اسم التاج للـ constructor الأساسي
    }

    @Override
    public String toString() {
        return super.toString(); // أو return "img";
    }
}
