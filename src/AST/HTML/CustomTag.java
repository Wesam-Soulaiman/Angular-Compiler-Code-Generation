package AST.HTML;

// Custom tag like <my-component>
public class CustomTag extends TagName {

    public CustomTag(String name) {
        super(name); // تمرير الاسم للـ constructor في TagName
    }

    @Override
    public String toString() {
        return super.toString(); // سيعيد الاسم المخزن في TagName
    }
}
