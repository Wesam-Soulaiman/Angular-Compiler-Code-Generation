package AST.TS;

public class ClassName {
        private String idDefiner;

        public ClassName(String idDefiner) {
            this.idDefiner = idDefiner;
        }

        public String getIdDefiner() {
            return idDefiner;
        }

        public void setIdDefiner(String idDefiner) {
            this.idDefiner = idDefiner;
        }

        @Override
        public String toString() {
            return idDefiner;
        }
}
