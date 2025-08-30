package AST.CSS;

public class IdValue extends Values {
    private String idDefiner;

    public IdValue(String idDefiner) {
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
}
