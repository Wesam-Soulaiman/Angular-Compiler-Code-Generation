package AST.TS;

import java.util.List;

public class Routers {


        private List<RouterArrayContent> contents;

        public Routers(List<RouterArrayContent> contents) {
            this.contents = contents;
        }

        public List<RouterArrayContent> getContents() {
            return contents;
        }

        public void setContents(List<RouterArrayContent> contents) {
            this.contents = contents;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < contents.size(); i++) {
                sb.append(contents.get(i).toString());
                if (i < contents.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }

        public String generateJS() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < contents.size(); i++) {
                sb.append(contents.get(i).generateJS());
                if (i < contents.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }


