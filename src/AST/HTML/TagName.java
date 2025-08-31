package AST.HTML;

// كلاس مجرد يمثل اسم التاغ (tag)
public abstract class TagName {
    protected String name;

    public TagName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}


