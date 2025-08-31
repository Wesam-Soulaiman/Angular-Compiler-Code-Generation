
import AST.Prog;

import SymbolTable.SymbolTable;
import CodeGen.CodeGenerator;
import gen.AngularLexer;
import gen.AngularParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromPath;

public class Main {
public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\src\\Test\\TS-1.txt";
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

        // code gen
        CodeGenerator codeGen = new CodeGenerator("C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\output\\MyComponent");
        codeGen.generate(prog);

        System.out.println("✅ Code generated successfully!");
    }
}
