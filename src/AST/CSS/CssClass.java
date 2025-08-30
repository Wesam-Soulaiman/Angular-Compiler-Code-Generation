package AST.CSS;

public class CssClass {
    private String idDefiner;

    public CssClass( String idDefiner) {
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
        return "." + idDefiner;
    }}
