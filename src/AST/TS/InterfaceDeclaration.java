package AST.TS;

public class InterfaceDeclaration {
    private InterfaceName interfaceName;
    private InterfaceBody body;

    public InterfaceDeclaration( InterfaceName interfaceName, InterfaceBody body) {

        this.interfaceName = interfaceName;
        this.body = body;
    }



    public InterfaceName getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(InterfaceName interfaceName) {
        this.interfaceName = interfaceName;
    }

    public InterfaceBody getBody() {
        return body;
    }

    public void setBody(InterfaceBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "export " + "interface " + interfaceName.toString() + " { " + body.toString() + " }";
    }
}
