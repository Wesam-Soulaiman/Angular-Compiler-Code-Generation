package AST.TS;


public class RouterPathValue extends RouterPropertyValue {
    private String path;

    public RouterPathValue(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "\"" + path + "\"";
    }

    @Override
    public String generateJS() {
        // prepend #/ for hash routing
        if (path.equals("")) return "#/";
        return "#/" + path;
    }
}

