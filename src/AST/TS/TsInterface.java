package AST.TS;

public class TsInterface extends TsProgContent {
    private InterfaceDeclaration interfaceDeclaration;

    public TsInterface(InterfaceDeclaration interfaceDeclaration) {
        this.interfaceDeclaration = interfaceDeclaration;
    }

    @Override
    public String toString() {
        return interfaceDeclaration.toString();
    }

    @Override
    public String generateJS() {
        // Interfaces are erased in JS, so return empty string
        return "";
    }
}
