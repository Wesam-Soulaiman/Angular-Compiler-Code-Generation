package AST.CSS;

import java.util.List;
import java.util.ArrayList;

public class SelectorGroup {
    private List<Selector> selectors;

    public SelectorGroup(List<Selector> selectors) {
        this.selectors = selectors;
    }

    public void addSelector(Selector selector) {
        selectors.add(selector);
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < selectors.size(); i++) {
            sb.append(selectors.get(i).toString());
            if (i < selectors.size() - 1) {
                sb.append(", ");
            }
        }


        return sb.toString();
    }

}
