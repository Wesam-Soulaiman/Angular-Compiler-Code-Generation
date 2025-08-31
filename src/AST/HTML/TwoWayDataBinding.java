package AST.HTML;

public class TwoWayDataBinding {
    private String modelName;


    public TwoWayDataBinding(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "[(" + modelName + ")]";
    }
}
