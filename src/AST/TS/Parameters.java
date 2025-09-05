package AST.TS;

import java.util.List;

public class Parameters {

    private List<Parameter> parameterList;

    public Parameters(List<Parameter> parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public String toString() {
        if (parameterList == null || parameterList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameterList.size(); i++) {
            sb.append(parameterList.get(i).toString());
            if (i < parameterList.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

    public String generateJS() {
        if (parameterList == null || parameterList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameterList.size(); i++) {
            sb.append(parameterList.get(i).generateJS());
            if (i < parameterList.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
