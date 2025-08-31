package AST.HTML;

public abstract class DirectiveName {
    public abstract String toString();
}


////////////////////////


//    @Override
//    public String visitNgIfDirective(AngularHTMLParser.NgIfDirectiveContext ctx) {
//        return "*ngIf";
//    }

//    @Override
//    public String visitNgForDirective(AngularHTMLParser.NgForDirectiveContext ctx) {
//        return "*ngFor";
//    }

//    @Override
//    public String visitNgSwitchDirective(AngularHTMLParser.NgSwitchDirectiveContext ctx) {
//        return "*ngSwitch";
//    }

//    @Override
//    public String visitIdDefinerDirective(AngularHTMLParser.IdDefinerDirectiveContext ctx) {
//        return "*" + ctx.IDDEFINER().getText();
//    }

