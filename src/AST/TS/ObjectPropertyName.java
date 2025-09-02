package AST.TS;

public class ObjectPropertyName {
    private String idDefiner;

    public ObjectPropertyName(String idDefiner) {
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
        return idDefiner;
    }
}
