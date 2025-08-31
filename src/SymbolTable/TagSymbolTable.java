package SymbolTable;

import java.util.Stack;

public class TagSymbolTable {
    private static TagSymbolTable instance;
    private Stack<String> tagStack;

    private TagSymbolTable() {
        this.tagStack = new Stack<>();
    }

    // Singleton getter
    public static TagSymbolTable getInstance() {
        if (instance == null) {
            instance = new TagSymbolTable();
        }
        return instance;
    }

    public void pushTag(String tagName) {
        tagStack.push(tagName);
    }

    public void popTag(String endTagName, int line) {
        if (!tagStack.isEmpty()) {
            String startTagName = tagStack.pop();
            if (!startTagName.equals(endTagName)) {
                SemanticErrorLogger logger = SemanticErrorLogger.getInstance();
                String error = "Semantic Error: End tag </" + endTagName + "> does not match start tag <" + startTagName + "> (Line: " + line + ")";
                logger.writeSemanticError(error);
                System.err.println(error);
            }
        } else {
            SemanticErrorLogger logger = SemanticErrorLogger.getInstance();
            String error = "Semantic Error: End tag </" + endTagName + "> has no matching start tag. (Line: " + line + ")";
            logger.writeSemanticError(error);
            System.err.println(error);
        }
    }

    public boolean isEmpty() {
        return tagStack.isEmpty();
    }
}
