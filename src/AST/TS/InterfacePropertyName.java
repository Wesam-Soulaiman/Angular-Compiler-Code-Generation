package AST.TS;

public class InterfacePropertyName {
    private String idDefiner;

    public InterfacePropertyName(String idDefiner) {
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
