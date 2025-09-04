package AST.TS;

// RouterDeclaration represents a router variable declaration
public class RouterDeclaration {

    private boolean export; // optional export
    private DeclarationTypes declarationTypes;
    private RouterName routerName;
    private TypeSelector typeSelector; // may be null
    private Routers routers;

    public RouterDeclaration(boolean export,
                             DeclarationTypes declarationTypes,
                             RouterName routerName,
                             TypeSelector typeSelector,
                             Routers routers) {
        this.export = export;
        this.declarationTypes = declarationTypes;
        this.routerName = routerName;
        this.typeSelector = typeSelector;
        this.routers = routers;
    }

    public boolean isExport() {
        return export;
    }

    public void setExport(boolean export) {
        this.export = export;
    }

    public DeclarationTypes getDeclarationTypes() {
        return declarationTypes;
    }

    public void setDeclarationTypes(DeclarationTypes declarationTypes) {
        this.declarationTypes = declarationTypes;
    }

    public RouterName getRouterName() {
        return routerName;
    }

    public void setRouterName(RouterName routerName) {
        this.routerName = routerName;
    }

    public TypeSelector getTypeSelector() {
        return typeSelector;
    }

    public void setTypeSelector(TypeSelector typeSelector) {
        this.typeSelector = typeSelector;
    }

    public Routers getRouters() {
        return routers;
    }

    public void setRouters(Routers routers) {
        this.routers = routers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (export) sb.append("export ");
        sb.append(declarationTypes != null ? declarationTypes.toString() : "").append(" ");
        sb.append(routerName != null ? routerName.toString() : "").append(" ");
        if (typeSelector != null) sb.append(typeSelector.toString()).append(" ");
        sb.append("= ").append(routers != null ? routers.toString() : "null");
        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();

        sb.append("\tfunction ");
        sb.append(routerName != null ? routerName.generateJS() : "").append("() { \n");
        sb.append("\t  const route = window.location.hash || \"#/\";\n");
        sb.append("\t  document.querySelectorAll(\"nav a\").forEach(a => a.classList.remove(\"active\"));\n");

        for (RouterArrayContent content : routers.getContents()) {
            String path = "";
            String componentCall = "";

            // get path and component from properties
            for (RouterProperty prop : content.getProperties()) {
                if (prop.getName().getKind() == RouterPropertyName.Kind.PATH) {
                    path = prop.getValue().generateJS();
                } else if (prop.getName().getKind() == RouterPropertyName.Kind.ROUTE_COMPONENT) {
                    componentCall = prop.getValue().generateJS();
                }
            }

            if (path.equals("\"\"")) path = "/";
            else path = "/" + path.replace("'", "").replace("\"", "");

            sb.append("\t  if (route === \"").append(path).append("\") {\n");
            sb.append("\t    document.getElementById(\"link-").append(componentCall.toLowerCase()).append("\").classList.add(\"active\");\n");
            sb.append("\t    render").append(componentCall).append("();\n");
            sb.append("\t  } else");
        }
        sb.setLength(sb.length() - 6);
        sb.append("\n\t}\n");

        // add event listeners
        sb.append("\twindow.addEventListener(\"hashchange\", ");
        sb.append(routerName != null ? routerName.generateJS() : "").append(");\n");
        sb.append("\twindow.addEventListener(\"load\", ");
        sb.append(routerName != null ? routerName.generateJS() : "").append(");\n");


        return sb.toString();
    }

    public String generateHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t<nav>\n");
        for (RouterArrayContent content : routers.getContents()) {
            String path = "";
            String componentCall = "";

            // get path and component from properties
            for (RouterProperty prop : content.getProperties()) {
                if (prop.getName().getKind() == RouterPropertyName.Kind.PATH) {
                    path = prop.getValue().generateJS();
                } else if (prop.getName().getKind() == RouterPropertyName.Kind.ROUTE_COMPONENT) {
                    componentCall = prop.getValue().generateJS();
                }
            }
            if (path.equals("\"\"")) path = "/";
            else path = "/" + path.replace("'", "").replace("\"", "");
            sb.append("\t\t<a href=\"").append(path).append("\" id=\"").append(componentCall.toLowerCase()).append("\">").append(componentCall.replace("Component", "")).append("</a>\n");
        }
        sb.append("\t</nav>\n");


        return sb.toString();
    }
}