package AST.TS;

import java.util.Collections;
public class TsRouterDecl extends TsProg{
    private RouterDeclaration contents;

    public TsRouterDecl(RouterDeclaration contents) {
        super(Collections.emptyList());
        this.contents = contents;
    }
    public RouterDeclaration getContents() {
        return contents;
    }

    public void setContents(RouterDeclaration contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return  contents.toString();
    }
    @Override
    public String generateJS() {
        return contents.generateJS();
    }
}
