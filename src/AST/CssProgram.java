package AST;

import AST.CSS.CssRoot;

public class CssProgram extends Prog {
    private CssRoot cssRoot;

    public CssProgram(CssRoot cssRoot) {
        this.cssRoot = cssRoot;
    }

    public CssRoot getCssRoot() {
        return cssRoot;
    }

    public void setCssRoot(CssRoot cssRoot) {
        this.cssRoot = cssRoot;
    }

    @Override
    public String toString() {
        return cssRoot.toString();
    }

    @Override
    public String generateJS() {
        return "";
    }

//    @Override
//    public String generateHTML() {
//        return "";
//    }
}
