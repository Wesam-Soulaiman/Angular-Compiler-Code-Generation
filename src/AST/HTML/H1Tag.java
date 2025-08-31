package AST.HTML;

public class H1Tag extends TagName {

    public H1Tag() {
        super("h1"); // تمرير اسم التاج للـ constructor الأساسي
    }

    @Override
    public String toString() {
        return super.toString(); // أو ببساطة return "h1";
    }
}
