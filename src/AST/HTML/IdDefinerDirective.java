package AST.HTML;

public class IdDefinerDirective extends DirectiveName {
    private String id;

  public   IdDefinerDirective(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Directive: #" + id;
    }
}
