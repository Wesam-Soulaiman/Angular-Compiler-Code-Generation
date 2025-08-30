package AST.TS;

public class TsInterface extends TsProgContent {
    private InterfaceDeclaration interfaceDeclaration;

    public TsInterface(InterfaceDeclaration interfaceDeclaration) {
        this.interfaceDeclaration = interfaceDeclaration;
    }

    public InterfaceDeclaration getInterfaceDeclaration() {
        return interfaceDeclaration;
    }

    public void setInterfaceDeclaration(InterfaceDeclaration interfaceDeclaration) {
        this.interfaceDeclaration = interfaceDeclaration;
    }

    @Override
    public String toString() {
        return interfaceDeclaration.toString();
    }
}
