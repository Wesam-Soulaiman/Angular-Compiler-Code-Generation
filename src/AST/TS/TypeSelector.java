package AST.TS;

public class TypeSelector{
        private Type type;

        public TypeSelector(Type type) {
            this.type = type;
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return ": " + type.toString();
        }}
