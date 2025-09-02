package AST.HTML;

// الكلاس الأب abstract
public abstract class ElementContent {
    @Override
    public abstract String toString();

    public abstract String generateHTML();  // added method
}
