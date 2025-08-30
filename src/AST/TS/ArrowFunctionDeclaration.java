package AST.TS;

public class ArrowFunctionDeclaration {
private Parameters parameters;
private TypeSelector returnType;
private ArrowFunctionBody body;

public ArrowFunctionDeclaration(Parameters parameters, TypeSelector returnType, ArrowFunctionBody body) {
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
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

public ArrowFunctionBody getBody() {
        return body;
        }

public void setBody(ArrowFunctionBody body) {
        this.body = body;
        }

@Override
public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("(");
        if (parameters != null) {
        sb.append(parameters.toString());
        }
        sb.append(")");

        if (returnType != null) {
        sb.append(": ").append(returnType.toString());
        }

        sb.append(" => ");
        sb.append(body.toString());

        return sb.toString();
        }
}
