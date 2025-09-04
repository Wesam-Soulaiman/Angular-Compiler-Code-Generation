
import AST.CSS.CssRoot;
import AST.CssProgram;
import AST.HTML.HtmlProg;
import AST.HtmlProgram;
import AST.Prog;

import AST.TS.TsProg;
import AST.TsProgram;
import SymbolTable.SymbolTable;
import CodeGen.CodeGenerator;
import gen.AngularLexer;
import gen.AngularParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromPath;

public class Main {
public static void main(String[] args) throws IOException {
        String routesSource = "C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\src\\Test\\ROUTES-1.txt";

        String htmlSource1 = "C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\src\\Test\\HTML-1.txt";
        String htmlSource2 = "C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\src\\Test\\HTML-2.txt";

        String cssSource  = "C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\src\\Test\\CSS-1.txt";
        String tsxSource  = "C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\src\\Test\\TS-2.txt";

        TsProgram routesProg = parseTsx(routesSource);
        HtmlProgram htmlProg1 = parseHtml(htmlSource1);
        HtmlProgram htmlProg2 = parseHtml(htmlSource2);

        CssProgram cssProg   = parseCss(cssSource);
        TsProgram tsProg     = parseTsx(tsxSource);

        CodeGenerator generator = new CodeGenerator();


        generator.generate(htmlProg1, htmlProg2,routesProg, cssProg, tsProg);

        String source = "C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\src\\Test\\HTML-1.txt";

        CharStream cs = fromFileName(source);



        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        ParseTree tree = parser.prog();
        parser.setBuildParseTree(false);

        // /// PRINT AST
        ASTPrinter listener = new ASTPrinter();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk((ParseTreeListener) listener, tree);
        System.out.println("***********************************************************");
        ParseTree tree1 = parser.prog();

        // // Print the AST
        System.out.println(tree.toStringTree(parser));
        System.out.println("***********************************************************");

        SymbolTable symbolTable = SymbolTable.getInstance();
        BaseVisitor visitor = new BaseVisitor();
        Prog prog = (Prog) visitor.visit(tree);
        System.out.println("***********************************************************");
        symbolTable.print();
        System.out.println("***********************************************************");

        // now generate code

    }
        public static HtmlProgram parseHtml(String path) throws IOException {
                CharStream cs = CharStreams.fromFileName(path);
                AngularLexer lexer = new AngularLexer(cs);
                AngularParser parser = new AngularParser(new CommonTokenStream(lexer));
                ParseTree tree = parser.htmlProg();
                BaseVisitor visitor = new BaseVisitor();
                return new HtmlProgram((HtmlProg) visitor.visit(tree));
        }
        public static CssProgram parseCss(String path) throws IOException {
                CharStream cs = CharStreams.fromFileName(path);
                AngularLexer lexer = new AngularLexer(cs);
                AngularParser parser = new AngularParser(new CommonTokenStream(lexer));
                ParseTree tree = parser.cssProg();
                BaseVisitor visitor = new BaseVisitor();
                return new CssProgram((CssRoot) visitor.visit(tree));
        }

        public static TsProgram parseTsx(String path) throws IOException {
                CharStream cs = CharStreams.fromFileName(path);
                AngularLexer lexer = new AngularLexer(cs);
                AngularParser parser = new AngularParser(new CommonTokenStream(lexer));
                ParseTree tree = parser.tsProg();
                BaseVisitor visitor = new BaseVisitor();
                return new TsProgram((TsProg) visitor.visit(tree));
        }
}


