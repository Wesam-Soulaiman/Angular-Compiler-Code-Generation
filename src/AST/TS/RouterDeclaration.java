package AST.TS;

public class RouterDeclaration {

    private DeclarationTypes declarationTypes;
    private RouterName routerName;
    private TypeSelector typeSelector;   // ممكن null
    private Routers routers;
    private boolean export;              // جديد: export اختياري

    public RouterDeclaration(boolean export, DeclarationTypes declarationTypes,
                             RouterName routerName, TypeSelector typeSelector,
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
        if (export) sb.append("export ").append(" ");
        sb.append(declarationTypes.toString()).append(" ")
                .append(routerName.toString()).append(" ");
        if (typeSelector != null) {
            sb.append(typeSelector.toString()).append(" ");
        }
        sb.append("= ").append(routers.toString());
        return sb.toString();
    }
    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        if (export) sb.append("export ");
        sb.append(declarationTypes != null ? declarationTypes.generateJS() : "").append(" ");
        sb.append(routerName != null ? routerName.generateJS() : "").append(" ");
        if (typeSelector != null) {
            sb.append(typeSelector.generateJS()).append(" ");
        }
        sb.append("= ");
        sb.append(routers != null ? routers.generateJS() : "null");

        return sb.toString();
    }
}
