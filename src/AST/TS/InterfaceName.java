package AST.TS;

public class InterfaceName {
    private String idDefiner;

    public InterfaceName(String idDefiner) {
        this.idDefiner = idDefiner;
    }

    @Override
    public String toString() {
        return idDefiner;
    }

    public String generateJS() {
        return "";
    }
}
