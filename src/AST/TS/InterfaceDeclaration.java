package AST.TS;

public class InterfaceDeclaration {
    private InterfaceName interfaceName;
    private InterfaceBody body;

    public InterfaceDeclaration(InterfaceName interfaceName, InterfaceBody body) {
        this.interfaceName = interfaceName;
        this.body = body;
    }

    @Override
    public String toString() {
        return "export interface " + interfaceName.toString() + " " + body.toString();
    }

    public String generateJS() {
        // Interfaces do not emit JS
        return "";
    }
}
