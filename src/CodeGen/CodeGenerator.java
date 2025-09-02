package CodeGen;

import AST.*;
import AST.TS.TsProg;

import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {

    public void generate(HtmlProgram htmlProg, TsProgram routesProg, CssProgram cssProg, TsProgram tsProg) {
        String htmlOut = htmlProg.toString();
        String routesOut = transpileTs(routesProg);
        String cssOut  = cssProg.toString();
        String jsOut   = transpileTs(tsProg);

        // inject <script> jsOut </script> into HTML
        htmlOut = injectRoutes(htmlOut, routesOut);
        htmlOut = injectScript(htmlOut, jsOut);

        FileUtil.writeFile("C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\output\\output.html", htmlOut);
        FileUtil.writeFile("C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\output\\output.css", cssOut);
        FileUtil.writeFile("C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\output\\output.js", jsOut);
    }

    private String transpileTs(TsProgram tsProg) {
        return tsProg.generateJS();
    }

//    private String transpileHTML(HtmlProgram htmlProg) {
//        return htmlProg.generateHTML();
//    }

    private String injectScript(String html, String js) {
        return html.replace("</script>",  js + "\n</script>");

    }

    private String injectRoutes(String html, String js) {
        return html.replace("</body>", "<script>\n" + js + "\n</script>\n</body>");

    }
}

