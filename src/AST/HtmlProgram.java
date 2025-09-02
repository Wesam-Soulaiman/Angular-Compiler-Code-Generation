package AST;

import AST.HTML.HtmlProg;

public class HtmlProgram extends Prog {
    private HtmlProg htmlProg;

    public HtmlProgram(HtmlProg htmlProg) {
        this.htmlProg = htmlProg;
    }

    public HtmlProg getHtmlProg() {
        return htmlProg;
    }

    public void setHtmlProg(HtmlProg htmlProg) {
        this.htmlProg = htmlProg;
    }

    @Override
    public String toString() {
        return htmlProg.toString();
    }

    @Override
    public String generateJS() {
        return "";
    }

    @Override
    public String generateHTML() {
        return htmlProg.generateHTML();
    }
}
