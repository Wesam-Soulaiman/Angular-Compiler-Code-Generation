package AST.HTML;

public class AngularDirective {
    private DirectiveName directive;

    public AngularDirective(DirectiveName directive) {
        this.directive = directive;
    }

    public boolean isNgFor() {
        return directive.toString().startsWith("ngFor");
    }

    public boolean isNgIf() {
        return directive.toString().startsWith("ngIf");
    }

    @Override
    public String toString() {
        return "*" + directive.toString();
    }

    // 🔑 prefix translation
    public String generateDirectivePrefix(AttributeValue value) {
        if (isNgFor()) {
            String expr = value.getName().replace("\"", "").trim();
            String[] parts = expr.split(" of ");
            if (parts.length == 2) {
                String item = parts[0].replace("let", "").trim();
                String list = parts[1].trim();
                return "${" + list.replace("\"", "") + ".map(" + item + " => `";
            }
        } else if (isNgIf()) {
            String cond = value.getName().replace("\"", "").trim();
            return "${" + cond + " ? `";
        }
        return "";
    }

    // 🔑 suffix translation
    public String generateDirectiveSuffix() {
        if (isNgFor()) {
            return "`).join(\"\")}";
        } else if (isNgIf()) {
            return "` : \"\"}";
        }
        return "";
    }

    public String generateHTML() {
        return ""; // never inline
    }
}
