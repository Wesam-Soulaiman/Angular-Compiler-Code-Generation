package AST.TS;

public class MethodMember extends ClassMember {
    private MethodDeclaration methodDeclaration;

    public MethodMember(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    @Override
    public String toString() {
        return methodDeclaration.toString();
    }
}
