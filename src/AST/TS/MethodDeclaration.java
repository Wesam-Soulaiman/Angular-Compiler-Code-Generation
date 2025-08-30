package AST.TS;

public class MethodDeclaration {


        private MethodName methodName;
        private Parameters parameters;       // optional
        private TypeSelector returnType;     // optional
        private FunctionBody body;

        public MethodDeclaration(MethodName methodName, Parameters parameters, TypeSelector returnType, FunctionBody body) {
            this.methodName = methodName;
            this.parameters = parameters;
            this.returnType = returnType;
            this.body = body;
        }

        public MethodName getMethodName() {
            return methodName;
        }

        public void setMethodName(MethodName methodName) {
            this.methodName = methodName;
        }

        public Parameters getParameters() {
            return parameters;
        }

        public void setParameters(Parameters parameters) {
            this.parameters = parameters;
        }

        public TypeSelector getReturnType() {
            return returnType;
        }

        public void setReturnType(TypeSelector returnType) {
            this.returnType = returnType;
        }

        public FunctionBody getBody() {
            return body;
        }

        public void setBody(FunctionBody body) {
            this.body = body;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(methodName.toString()).append("(");
            if (parameters.toString() != null) {
                sb.append(parameters.toString());
            }
            sb.append(")");
            if (returnType.toString() != null) {
                sb.append(returnType.toString());
            }
            sb.append(" ").append(body.toString());
            return sb.toString();
        }
}
