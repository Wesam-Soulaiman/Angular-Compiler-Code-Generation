package AST.TS;

public class ParameterName {
    private String idDefiner;

    public ParameterName(String idDefiner) {
        this.idDefiner = idDefiner;
    }

    @Override
    public String toString() {
        return idDefiner;
    }

    public String generateJS() {
        return idDefiner;
    }
}
