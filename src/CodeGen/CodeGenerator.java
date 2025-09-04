package CodeGen;

import AST.*;
import AST.TS.TsProg;

import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {

    public void generate(HtmlProgram htmlProg1,HtmlProgram htmlProg2, TsProgram routesProg, CssProgram cssProg, TsProgram tsProg) {

        String htmlOut = "<!DOCTYPE html>\n<html lang=\"en\">\n\t<head>\n\t\t<meta charset=\"UTF-8\">\n\t\t<title>Product App</title>\n\t</head>\n\t<body>\n\t\t<div id=\"app\">\n\t\t</div>\n\t</body>\n</html>";

//        String routesOut = transpileTs(routesProg);
//        String routesHtmlOut = transpileTSToHTML(routesProg);
//        String Page1 = transpileHTML(htmlProg1);
        String Page2 = transpileHTML(htmlProg2);
        String cssOut  = cssProg.toString();
//        String jsOut   = transpileTs(tsProg);

        // inject <script> jsOut </script> into HTML
//        htmlOut = injectInBody(htmlOut, routesHtmlOut);
//        htmlOut = injectRoutes(htmlOut, routesOut);
//        htmlOut = injectScript(htmlOut, jsOut);
        htmlOut = injectCss(htmlOut, cssOut);

//        htmlOut = injectHtmlPage(htmlOut,"ProductListComponent", Page1);
        htmlOut = injectHtmlPage(htmlOut,"AddProductComponent", Page2);


        FileUtil.writeFile("C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\output\\output.html", htmlOut);
//        FileUtil.writeFile("C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\output\\output.css", cssOut);
//        FileUtil.writeFile("C:\\Users\\LONOVO\\Desktop\\AngularCompiler\\AngularCompiler\\output\\output.js", jsOut);
    }

    private String transpileTs(TsProgram tsProg) {
        return tsProg.generateJS();
    }


    private String transpileTSToHTML(TsProgram tsProg) {
        return tsProg.generateHTML();
    }


    private String injectScript(String html, String js) {
        return html.replace("</script>",  js + "\n</script>");
    }

    private String injectCss(String html, String css) {
        return html.replace("</head>", "<style>\n" + css + "</style>" + "\n</head>");
    }

    private String injectInBody(String html, String htmlbody) {
        return html.replace("<body>", "<body>" + htmlbody);
    }

    private String injectRoutes(String html, String js) {
        return html.replace("</body>", "<script>\n" + js + "\n</script>\n</body>");
    }

    private String transpileHTML(HtmlProgram htmlProg) {
        return htmlProg.generateHTML();
    }


    private String injectHtmlPage(String html,String pageName, String page) {
        return html.replace("</script>", "function render" + pageName
                + "() {\napp.innerHTML = `" + page + "`;\n}" + "\n</script>");
    }
}

