package AST.TS;

public class TsClass extends TsProgContent {
    private ClassDeclaration classDeclaration;

    public TsClass(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        return classDeclaration.toString();
    }

    @Override
    public String generateJS() {
        return classDeclaration.generateJS();
    }
}
