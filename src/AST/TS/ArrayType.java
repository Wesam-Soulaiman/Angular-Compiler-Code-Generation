package AST.TS;

public class ArrayType {

        private Type elementType;

        public ArrayType(Type elementType) {
            this.elementType = elementType;
        }

        public Type getElementType() {
            return elementType;
        }

    public void setElementType(Type elementType) {
        this.elementType = elementType;
    }

    @Override
        public String toString() {
            return "array<" + elementType.toString() + ">";
        }
    }


