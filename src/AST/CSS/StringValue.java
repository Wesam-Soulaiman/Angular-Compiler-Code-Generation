package AST.CSS;

public class StringValue extends Values {
    private String value;

    public StringValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    class IdValue extends Values {
        private String id;

        public IdValue(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return id;
        }
    }
}
