package AST.TS;



    public class RouterName {

        private String name;

        public RouterName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        public String generateJS() {
            return name;
        }
    }


