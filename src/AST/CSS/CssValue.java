package AST.CSS;

import java.util.List;

public class CssValue {
    public List<Values> values;

    public CssValue(List<Values> values) {
        this.values = values;
    }

    public List<Values> getValues() {
        return values;
    }

    public void setValues(List<Values> values) {
        this.values = values;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            sb.append(values.get(i));
            if (i < values.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }



}
