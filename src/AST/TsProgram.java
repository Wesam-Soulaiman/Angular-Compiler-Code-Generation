package AST;



import AST.TS.TsProg;

public class TsProgram extends Prog {
    private TsProg tsProg;

    public TsProgram(TsProg tsProg) {
        this.tsProg = tsProg;
    }

    public TsProg getTsProg() {
        return tsProg;
    }

    public void setTsProg(TsProg tsProg) {
        this.tsProg = tsProg;
    }

    @Override
    public String toString() {
        return tsProg.toString();
    }

    @Override
    public String generateJS() {
        return tsProg.generateJS();
    }

//    @Override
//    public String generateHTML() {
//        return "";
//    }
}
