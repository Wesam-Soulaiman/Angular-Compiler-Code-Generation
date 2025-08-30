package CodeGen;

import AST.*;
import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {

    private final String baseName;

    public CodeGenerator(String baseName) {
        this.baseName = baseName;
    }

    public void generate(Prog prog) throws IOException {
        if (prog instanceof TsProgram) {
            writeFile(baseName + ".tsx", prog.toString());
        } else if (prog instanceof HtmlProgram) {
            writeFile(baseName + ".html", prog.toString());
        } else if (prog instanceof CssProgram) {
            writeFile(baseName + ".css", prog.toString());
        } else {
            throw new IllegalArgumentException("Unknown program type: " + prog.getClass());
        }
    }

    private void writeFile(String fileName, String content) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        }
    }
}
