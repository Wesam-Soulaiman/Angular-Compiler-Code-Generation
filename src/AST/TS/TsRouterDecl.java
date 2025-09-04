package AST.TS;

import java.util.Collections;

// TS Router Declaration as a TsProgContent
public class TsRouterDecl extends TsProgContent {
    private RouterDeclaration contents;

    public TsRouterDecl(RouterDeclaration contents) {
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
        return contents.toString();
    }

    @Override
    public String generateJS() {
        return contents.generateJS();
    }
    public String generateHTML() {
        return contents.generateHTML();
    }

}
