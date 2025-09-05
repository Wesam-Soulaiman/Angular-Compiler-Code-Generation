package AST.TS;

public class MethodName {
    private String idDefiner;

    public MethodName(String idDefiner) {
        this.idDefiner = idDefiner;
    }

    public String getIdDefiner() {
        return idDefiner;
    }

    public void setIdDefiner(String idDefiner) {
        this.idDefiner = idDefiner;
    }

    @Override
    public String toString() {
        return idDefiner;
    }
    public String generateJS() {
return toString();
    }
}
