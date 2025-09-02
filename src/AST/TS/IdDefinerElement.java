package AST.TS;

public class IdDefinerElement extends MemberAccessElement {

    private String idDefiner;

    public IdDefinerElement(String idDefiner) {
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

    @Override
    public String generateJS() {
        return idDefiner;
    }
}
