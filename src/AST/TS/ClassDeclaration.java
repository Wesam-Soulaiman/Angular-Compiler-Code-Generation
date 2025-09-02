package AST.TS;

public class ClassDeclaration {

    private ClassName className;
    private ClassBody classBody;

    public ClassDeclaration(ClassName className, ClassBody classBody) {
        this.className = className;
        this.classBody = classBody;
    }

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }

    public ClassBody getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
    }

    @Override
    public String toString() {
        return "export class " + className.toString() + classBody.toString();
    }

    public String generateJS() {
        return "class " + className.toString() + classBody.generateJS();
    }
}
