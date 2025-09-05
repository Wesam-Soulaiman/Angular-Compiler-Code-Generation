

import AST.CSS.*;
import AST.CssProgram;
import AST.HTML.*;
import AST.HtmlProgram;
import AST.Prog;
import AST.TS.*;
import AST.TS.Statement;
import AST.TsProgram;
import SymbolTable.*;
import gen.AngularParser;
import gen.AngularParserBaseVisitor;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Object;
import java.util.*;

public class BaseVisitor extends AngularParserBaseVisitor<Object> {

    @Override
    public Object visitUnitOfMeasurement(AngularParser.UnitOfMeasurementContext ctx) {
        if (ctx == null) {
            return null;
        }

        String number = ctx.NUMBER().getText();
        String unit = ctx.CSS_UNIT() != null ? ctx.CSS_UNIT().getText() : "";
        return new UnitOfMeasurement(number, unit);
    }

    @Override
    public Object visitIdValue(AngularParser.IdValueContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new IdValue(ctx.IDDEFINER().getText());
    }

    @Override
    public Object visitStringValue(AngularParser.StringValueContext ctx) {
        if (ctx == null) {
            return null;
        }
        String text = ctx.STRING().getText();
        String value = text.substring(1, text.length() - 1); // remove quotes
        return new StringValue(value);
    }

    @Override
    public Object visitColorValue(AngularParser.ColorValueContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new ColorValue(ctx.CSS_COLOR().getText());
    }

    @Override
    public Object visitUnitValue(AngularParser.UnitValueContext ctx) {
        if (ctx == null) {
            return null;
        }
        UnitOfMeasurement unit = (UnitOfMeasurement) visitUnitOfMeasurement(ctx.unitOfMeasurement());
        return new UnitValue(unit);
    }

    @Override
    public Object visitCssValue(AngularParser.CssValueContext ctx) {
        if (ctx == null) {
            return null;
        }
        List<Values> result = new ArrayList<>();
        result.add((Values) visit(ctx.values(0)));
        for (int i = 1; i < ctx.values().size(); i++) {
            result.add((Values) visit(ctx.values(i)));
        }
        return new CssValue(result);
    }

    @Override
    public CssProperty visitIdDefinerProperty(AngularParser.IdDefinerPropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new IdDefinerProperty(ctx.IDDEFINER().getText());
    }


    @Override
    public CssProperty visitColorProperty(AngularParser.ColorPropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new colorProperty();
    }

    @Override
    public CssProperty visitBackgroundProperty(AngularParser.BackgroundPropertyContext ctx) {
        return new backgroundProperty();
    }

    @Override
    public CssProperty visitWidthProperty(AngularParser.WidthPropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new WidthProperty();
    }

    @Override
    public CssProperty visitHeightProperty(AngularParser.HeightPropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new HeightProperty();
    }

    @Override
    public CssProperty visitMarginProperty(AngularParser.MarginPropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new MarginProperty();
    }

    @Override
    public CssProperty visitPaddingProperty(AngularParser.PaddingPropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new PaddingProperty();
    }

    @Override
    public CssProperty visitFontSizeProperty(AngularParser.FontSizePropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new FontSizeProperty();
    }

    @Override
    public CssProperty visitDisplayProperty(AngularParser.DisplayPropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new DisplayProperty();
    }

    @Override
    public CssProperty visitPositionProperty(AngularParser.PositionPropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new PositionProperty();
    }

    @Override
    public CssProperty visitBorderProperty(AngularParser.BorderPropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new BorderProperty();
    }

    @Override
    public CssProperty visitBoxSizingProperty(AngularParser.BoxSizingPropertyContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new BoxSizingProperty();
    }

    @Override
    public Object visitDeclaration(AngularParser.DeclarationContext ctx) {
        if (ctx == null) {
            return null;
        }

        CssProperty property = (CssProperty) visit(ctx.cssProperty());
        CssValue value = (CssValue) visit(ctx.cssValue());
        return new Declaration(property, value);
    }


    @Override
    public Object visitCssClass(AngularParser.CssClassContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new CssClass(ctx.IDDEFINER().getText());
    }

    @Override
    public Object visitCssID(AngularParser.CssIDContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new CssID(ctx.IDDEFINER().getText());
    }

    @Override
    public Selector visitCssClassSelector(AngularParser.CssClassSelectorContext ctx) {
        if (ctx == null) {
            return null;
        }

        CssClass cssClass = (CssClass) visit(ctx.cssClass());
        return new CssClassSelector(cssClass);
    }

    @Override
    public Selector visitCssIDSelector(AngularParser.CssIDSelectorContext ctx) {
        if (ctx == null) {
            return null;
        }

        CssID cssID = (CssID) visit(ctx.cssID());
        return new CssIDSelector(cssID);
    }

    @Override
    public Selector visitStarSelector(AngularParser.StarSelectorContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new StarSelector();
    }

    @Override
    public Selector visitHtmlSelector(AngularParser.HtmlSelectorContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new HtmlSelector();
    }

    @Override
    public Selector visitBodySelector(AngularParser.BodySelectorContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new BodySelector();
    }

    @Override
    public Selector visitIdDefinerSelector(AngularParser.IdDefinerSelectorContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new IdDefinerSelector(ctx.IDDEFINER().getText());
    }

    @Override
    public SelectorGroup visitSelectorGroup(AngularParser.SelectorGroupContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<Selector> selectors = ctx.selector().stream()
                .map(this::visit)
                .map(s -> (Selector) s)
                .toList();

        return new SelectorGroup(selectors);
    }

    @Override
    public RuleSet visitRuleSet(AngularParser.RuleSetContext ctx) {
        if (ctx == null) {
            return null;
        }

        SelectorGroup selectorGroup = (SelectorGroup) visit(ctx.selectorGroup());
        List<Declaration> declarations = ctx.declaration().stream()
                .map(this::visit)
                .map(s -> (Declaration) s)
                .toList();
        return new RuleSet(selectorGroup, declarations);
    }

    @Override
    public UrlStatement visitUrlStatement(AngularParser.UrlStatementContext ctx) {
        if (ctx == null) {
            return null;
        }

        String raw = ctx.STRING().getText();
        String url = raw.substring(1, raw.length() - 1);
        return new UrlStatement(url);

    }


    @Override
    public CssImportContent visitUrlContent(AngularParser.UrlContentContext ctx) {
        if (ctx == null) {
            return null;
        }

        Url url = (Url) visit(ctx.url());
        return new UrlContent(url);
    }

    @Override
    public CssImportContent visitUrlStatementContent(AngularParser.UrlStatementContentContext ctx) {
        if (ctx == null) {
            return null;
        }

        UrlStatement urlStatement = (UrlStatement) visit(ctx.urlStatement());
        return new UrlStatementContent(urlStatement);
    }

    @Override
    public Url visitUrl(AngularParser.UrlContext ctx) {
        if (ctx == null) {
            return null;
        }

        String raw = ctx.STRING().getText();
        String urlValue = raw.substring(1, raw.length() - 1);
        return new Url(urlValue);
    }

    @Override
    public CssImportStatement visitCssImportStatement(AngularParser.CssImportStatementContext ctx) {
        if (ctx == null) {
            return null;
        }

        CssImportContent content = (CssImportContent) visit(ctx.cssImportContent());
        return new CssImportStatement(content);
    }


    @Override
    public CssRoot visitCssRoot(AngularParser.CssRootContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<CssStatement> statements = ctx.cssStatement().stream()
                .map(this::visit)
                .map(s -> (CssStatement) s)
                .toList();

        return new CssRoot(statements);
    }

    @Override
    public CssStatement visitCssRuleSet(AngularParser.CssRuleSetContext ctx) {
        if (ctx == null) {
            return null;
        }

        RuleSet ruleSet = (RuleSet) visit(ctx.ruleSet());
        return new CssRuleSet(ruleSet);
    }

    @Override
    public CssStatement visitCssImport(AngularParser.CssImportContext ctx) {
        if (ctx == null) {
            return null;
        }

        CssImportStatement importStatement = (CssImportStatement) visit(ctx.cssImportStatement());
        return new CssImport(importStatement);
    }


    //////////////////////////


    @Override
    public BaseType visitStringType(AngularParser.StringTypeContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new StringType();
    }

    @Override
    public BaseType visitNumberType(AngularParser.NumberTypeContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new NumberType();
    }

    @Override
    public BaseType visitBooleanType(AngularParser.BooleanTypeContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new BooleanType();
    }

    @Override
    public BaseType visitAnyType(AngularParser.AnyTypeContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new AnyType();
    }

    @Override
    public BaseType visitVoidType(AngularParser.VoidTypeContext ctx) {
        if (ctx == null) {
            return null;
        }

        return new VoidType();
    }

    @Override
    public BaseType visitIdDefinerType(AngularParser.IdDefinerTypeContext ctx) {
        if (ctx == null) {
            return null;
        }

        String name = ctx.IDDEFINER().getText();
        return new IdDefinerType(name);
    }

    @Override
    public Object visitArrayType(AngularParser.ArrayTypeContext ctx) {
        if (ctx == null) {
            return null;
        }

        Type elementType = (Type) visit(ctx.type());
        return new ArrayType(elementType);
    }

    ////////////////////////////11
    @Override
    public Object visitArrayBracketType(AngularParser.ArrayBracketTypeContext ctx) {
        if (ctx == null) {
            return null;
        }

        BaseType baseType = (BaseType) visit(ctx.baseType());
        for (int i = 0; i < ctx.LBRACK().size(); i++) {
            baseType = new ArrayBracketType(baseType);

        }

        return baseType;
    }


    @Override
    public Type visitArrayBracketTypeLabel(AngularParser.ArrayBracketTypeLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        ArrayBracketType arrayBracketType=(ArrayBracketType) visit(ctx.arrayBracketType());
        return new ArrayBracketTypeLabel(arrayBracketType);
    }

    @Override
    public Type visitBaseTypeLabel(AngularParser.BaseTypeLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        BaseType baseType=(BaseType) visit(ctx.baseType());
        return new BaseTypeLabel(baseType);
    }

    @Override
    public Type visitArrayTypeLabel(AngularParser.ArrayTypeLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        ArrayType arrayType=(ArrayType) visit(ctx.arrayType());
        return new ArrayTypeLabel(arrayType);
    }

    @Override
    public BinaryOperator visitPlusLabel(AngularParser.PlusLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new PlusOperator();
    }

    @Override
    public BinaryOperator visitMinusLabel(AngularParser.MinusLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new MinusOperator();
    }

    @Override
    public BinaryOperator visitStarLabel(AngularParser.StarLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new StarOperator();
    }

    @Override
    public BinaryOperator visitDivisionLabel(AngularParser.DivisionLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new DivisionOperator();
    }

    @Override
    public BinaryOperator visitPercentLabel(AngularParser.PercentLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new PercentOperator();
    }

    @Override
    public BinaryOperator visitAssignLabel(AngularParser.AssignLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new AssignOperator();
    }

    @Override
    public TypeSelector visitTypeSelector(AngularParser.TypeSelectorContext ctx) {
        if (ctx == null) {
            return null;
        }
        Type type = (Type) visit(ctx.type());
        return new TypeSelector(type);
    }

    @Override
    public ArrayAccess visitArrayAccess(AngularParser.ArrayAccessContext ctx) {
        String arrayName = ctx.IDDEFINER().getText();
        Expression indexExpr = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        return new ArrayAccess(arrayName, indexExpr);
    }

    @Override
    public FunctionCall visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        if (ctx == null) {
            return null;
        }
        String functionName = ctx.IDDEFINER().getText();
        List<Arguments> args = new ArrayList<>();
        if (ctx.arguments() != null) {
            args = (List<Arguments>) visit(ctx.arguments());
        }
        return new FunctionCall(functionName, args);
    }


    @Override
    public MemberAccessElement visitIdDefinerLabel(AngularParser.IdDefinerLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        String name = ctx.IDDEFINER().getText();
        return new IdDefinerElement(name);
    }

    @Override
    public MemberAccessElement visitThisLabel(AngularParser.ThisLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new ThisElement();
    }


    @Override
    public Object visitVariableReferences(AngularParser.VariableReferencesContext ctx) {
        if (ctx == null) {
            return null;
        }
        String name = ctx.IDDEFINER().getText();
        return new VariableReferences(name);
    }

    @Override
    public Object visitMemberAccess(AngularParser.MemberAccessContext ctx) {
        if (ctx == null) {
            return null;
        }

        MemberAccessElement target = (MemberAccessElement) visit(ctx.memberAccessElement());

        if (ctx.IDDEFINER() != null) {
            String property = ctx.IDDEFINER().getText();
            return new MemberAccess(target, property);
        }

        if (ctx.functionCall() != null) {
            FunctionCall functionCall = (FunctionCall) visit(ctx.functionCall());
            return new MemberAccess(target, functionCall);
        }

        return null;
    }



    @Override
    public Literal visitStringLiteralLabel(AngularParser.StringLiteralLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        String rawText = ctx.STRING().getText();
        return new StringLiteral(rawText);
    }

    @Override
    public Literal visitNumberLiteralLabel(AngularParser.NumberLiteralLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        String numText = ctx.NUMBER().getText();
        return new NumberLiteral(numText);
    }

    @Override
    public Literal visitBoolLiteralLabel(AngularParser.BoolLiteralLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        String boolText = ctx.BOOL().getText();
        return new BoolLiteral(boolText);
    }

    @Override
    public Literal visitNullLiteralLabel(AngularParser.NullLiteralLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new NullLiteral();
    }

    @Override
    public Literal visitUndefinedLiteralLabel(AngularParser.UndefinedLiteralLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new UndefinedLiteral();
    }


    @Override
    public PrimaryExpr visitLiteralLabel(AngularParser.LiteralLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        Literal literal = (Literal) visit(ctx.literal());
        return new LiteralExpr(literal);
    }

    @Override
    public PrimaryExpr visitArrayLabel(AngularParser.ArrayLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        Array array = (Array) visit(ctx.array());
        return new ArrayExpr(array);
    }

    @Override
    public PrimaryExpr visitObjectLabel(AngularParser.ObjectLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        AST.TS.Object obj = (AST.TS.Object) visit(ctx.object());
        return new ObjectExpr(obj);
    }

    @Override
    public PrimaryExpr visitVariableReferencesLabel(AngularParser.VariableReferencesLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        VariableReferences ref = (VariableReferences) visit(ctx.variableReferences());
        return new VariableReferencesExpr(ref);
    }

    @Override
    public PrimaryExpr visitFunctionCallLabel(AngularParser.FunctionCallLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        FunctionCall call = (FunctionCall) visit(ctx.functionCall());
        return new FunctionCallExpr(call);
    }

    @Override
    public PrimaryExpr visitMemberAccessLabel(AngularParser.MemberAccessLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        MemberAccess access = (MemberAccess) visit(ctx.memberAccess());
        return new MemberAccessExpr(access);
    }

    @Override
    public PrimaryExpr visitArrayAccessLabel(AngularParser.ArrayAccessLabelContext ctx) {
        if (ctx == null) {
            return null;
        }
        ArrayAccess access = (ArrayAccess) visit(ctx.arrayAccess());
        return new ArrayAccessExpr(access);
    }

    @Override
    public ObjectPropertyName visitObjectPropertyName(AngularParser.ObjectPropertyNameContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new ObjectPropertyName(ctx.IDDEFINER().getText());
    }

    @Override
    public Expression visitExpression(AngularParser.ExpressionContext ctx) {
        if (ctx == null) {
            return null;
        }
        PrimaryExpr primaryExpr1 = (PrimaryExpr) visit(ctx.primaryExpr());
       List<ArithmaticExpr> arithmaticExpr = ctx.arithmaticExpr().stream()
                .map(this::visit)
                .map(s -> (ArithmaticExpr) s)
                .toList();
        return new Expression(primaryExpr1,arithmaticExpr);
    }

    @Override
    public ArithmaticExpr visitArithmaticExpr(AngularParser.ArithmaticExprContext ctx) {

        if (ctx == null) {
            return null;
        }
        BinaryOperator binaryOperator = (BinaryOperator) visit(ctx.binaryOperator());
        PrimaryExpr primaryExpr1 = (PrimaryExpr) visit(ctx.primaryExpr());
        return new ArithmaticExpr(binaryOperator, primaryExpr1);
    }

    ///////1////new  nnnnnn
    @Override
    public ObjectProperty visitObjectProperty(AngularParser.ObjectPropertyContext ctx) {
        if (ctx == null) return null;

        if (ctx.objectPropertyName() != null && ctx.expression() != null) {
            ObjectPropertyName objectPropertyName = (ObjectPropertyName) visit(ctx.objectPropertyName());
            Expression expression = (Expression) visit(ctx.expression());

            String variableName = objectPropertyName.toString();
            ObjectPropertySymbolTable propTable = new ObjectPropertySymbolTable("semantic_errors.txt");

            propTable.checkPropertyExists(variableName, ctx.getStart().getLine());
            propTable.put(variableName, expression);

            return new ObjectProperty(objectPropertyName, expression);
        }

        if (ctx.extractData() != null) {
            ExtractData extractData = (ExtractData) visit(ctx.extractData());
            return new ObjectProperty(extractData);
        }

        return null;
    }



    @Override
        public ObjectContent visitObjectContent(AngularParser.ObjectContentContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<ObjectProperty> properties = ctx.objectProperty().stream()
                .map(this::visit)
                .map(s -> (ObjectProperty) s)
                .toList();
        return new ObjectContent(properties);
    }

    @Override
    public Array visitArray(AngularParser.ArrayContext ctx) {
        if (ctx == null) {
            return null;
        }
        ArrayContent arrayContent = null;
        if (ctx.arrayContent() != null) {
            arrayContent = (ArrayContent) visit(ctx.arrayContent());
        }
        return new Array(arrayContent);

    }

    @Override
    public ArrayContent visitArrayContent(AngularParser.ArrayContentContext ctx) {
        if (ctx == null) {
            return null;
        }


        List<Expression> expression = ctx.expression().stream()
                .map(this::visit)
                .map(s -> (Expression) s)
                .toList();

        return new ArrayContent(expression);
    }

    @Override
    public Object visitObject(AngularParser.ObjectContext ctx) {
        if (ctx == null) {
            return null;
        }

        ObjectContent content = null;
        if (ctx.objectContent() != null) {
            content = (ObjectContent) visit(ctx.objectContent());
        }

        return new AST.TS.Object(content);
    }

    @Override
    public Object visitExpressionValue(AngularParser.ExpressionValueContext ctx) {
        if (ctx == null) {
            return null;
        }
        Expression expression = (Expression) visit(ctx.expression());
        return new ExpressionValue(expression);
    }

    @Override
    public Object visitArrowFunctionValue(AngularParser.ArrowFunctionValueContext ctx) {
        if (ctx == null) {
            return null;
        }
        ArrowFunctionDeclaration arrowFunctionDeclaration = (ArrowFunctionDeclaration) visit(ctx.arrowFunctionDeclaration());
        return new ArrowFunctionValue(arrowFunctionDeclaration);
    }

    @Override
    public Object visitVariableName(AngularParser.VariableNameContext ctx) {
        if (ctx == null) {
            return null;
        }
        String name = ctx.IDDEFINER().getText();
        return new VariableName(name);
    }


    @Override
    public Object visitLetDeclaration(AngularParser.LetDeclarationContext ctx) {
        if (ctx == null) {
            return null;
        }
        return DeclarationTypes.LET;
    }

    @Override
    public Object visitVarDeclaration(AngularParser.VarDeclarationContext ctx) {
        if (ctx == null) {
            return null;
        }
        return DeclarationTypes.VAR;
    }


    @Override
    public Object visitConstDeclaration(AngularParser.ConstDeclarationContext ctx) {
        if (ctx == null) {
            return null;
        }
        return DeclarationTypes.CONST;
    }
////////new nnnnn
    @Override
    public Object visitDecoratorBasedInput(AngularParser.DecoratorBasedInputContext ctx) {
        VariableName name = (VariableName) visit(ctx.variableName());
        TypeSelector type = (TypeSelector) visit(ctx.typeSelector());

        String variableName = name.toString();
        String variableType = type.toString();

        SymbolTable symbolTable = SymbolTable.getInstance();
        DecoratorBasedInputErrorLogger errorLogger = new DecoratorBasedInputErrorLogger("semantic_errors.txt");

        Symbol existingSymbol = symbolTable.get(variableName);

        if (existingSymbol != null) {
            if (existingSymbol.getType().equals(variableType)) {
                errorLogger.logError(variableName, ctx.getStart().getLine());
                symbolTable.semanticError("Variable '" + variableName + "' already defined with same type", ctx.getStart().getLine());
            } else {
                System.out.println("Warning: Variable '" + variableName + "' already exists with a different type ("
                        + existingSymbol.getType() + "). Current type: " + variableType + " at line " + ctx.getStart().getLine());
            }
        } else {
            Symbol symbol = new Symbol(variableType);
            symbolTable.put(variableName, symbol);
        }

        return new DecoratorBasedInput(name, type);
    }


///new nnnnnn
    @Override
    public Object visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        SymbolTable symbolTable = SymbolTable.getInstance();
        VariableDeclarationErrorLogger errorLogger = new VariableDeclarationErrorLogger("semantic_errors.txt");

        DeclarationTypes declarationType = null;
        if (ctx.declarationTypes() != null) {
            declarationType = (DeclarationTypes) visit(ctx.declarationTypes());
        }

        VariableName variableName = (VariableName) visit(ctx.variableName());
        String varName = variableName.toString();

        TypeSelector typeSelector = null;
        String varType = "any";
        if (ctx.typeSelector() != null) {
            typeSelector = (TypeSelector) visit(ctx.typeSelector());
            if (typeSelector != null) {
                varType = typeSelector.toString();
            }
        }

        VariableValue variableValue = null;
        Object varValue = null;
        if (ctx.variableValue() != null) {
            variableValue = (VariableValue) visit(ctx.variableValue());
            varValue = variableValue;
        }

        Symbol existingSymbol = symbolTable.get(varName);

        if (existingSymbol != null) {
            if (existingSymbol.getDeclarationType() == DeclarationTypes.CONST) {
                errorLogger.logError("Variable '" + varName + "' is already defined as const", ctx.getStart().getLine());

                if (!existingSymbol.getType().equals(varType)) {
                    errorLogger.logError("Cannot change type of const variable '" + varName + "'", ctx.getStart().getLine());
                }

                if (existingSymbol.getValue() != null && !existingSymbol.getValue().equals(varValue)) {
                    errorLogger.logError("Cannot assign a new value to const variable '" + varName + "'", ctx.getStart().getLine());
                }
            } else if (symbolTable.isVarExistInCurrentScope(varName)) {
                errorLogger.logError("Variable '" + varName + "' is already defined in the current scope", ctx.getStart().getLine());
            }
        } else {
            Symbol symbol = new Symbol(varType, varValue, declarationType);
            symbolTable.put(varName, symbol);
        }

        return new VariableDeclaration(declarationType, variableName, typeSelector, variableValue);
    }




    @Override
    public Object visitVariableDeclaration_(AngularParser.VariableDeclaration_Context ctx) {

        VariableDeclaration variableDeclarations = (VariableDeclaration) visit(ctx.variableDeclaration());
        return new VariableDeclaration_(variableDeclarations);
    }

    @Override
    public Object visitDecoratorInput(AngularParser.DecoratorInputContext ctx) {
        DecoratorBasedInput decoratorBasedInput = (DecoratorBasedInput) visit(ctx.decoratorBasedInput());
        return new DecoratorInput(decoratorBasedInput);
    }

    @Override
    public Object visitConsoleLog(AngularParser.ConsoleLogContext ctx) {
        ConsoleLogSplit consoleLogSplit = (ConsoleLogSplit) visit(ctx.consoleLogSplit());
        Arguments arguments = null;
        if (ctx.arguments() != null) {
            arguments = (Arguments) visit(ctx.arguments());
        }
        return new ConsoleLog(arguments, consoleLogSplit)
                ;
    }

    @Override
    public Object visitConsoleLogSplit(AngularParser.ConsoleLogSplitContext ctx) {
        return new ConsoleLogSplit();
    }

    @Override
    public Object visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        Expression expression = null;
        if (ctx.expression() != null) {
            expression = (Expression) visit(ctx.expression());
        }
        return new ReturnStatement(expression);
    }

    @Override
    public Object visitArguments(AngularParser.ArgumentsContext ctx) {
        List<Expression> expression = ctx.expression().stream()
                .map(this::visit)
                .map(s -> (Expression) s)
                .toList();
        return new Arguments(expression);
    }

    @Override
    public Statement visitVariableDeclarationsStatement(AngularParser.VariableDeclarationsStatementContext ctx) {
        VariableDeclarations variableDeclarations = (VariableDeclarations) visit(ctx.variableDeclarations());
        return new VariableDeclarationsStatement(variableDeclarations);
    }

    @Override
    public Statement visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        Expression expression = (Expression) visit(ctx.expression());
        return new ExpressionStatement(expression);
    }

    @Override
    public Statement visitReturnStatement_(AngularParser.ReturnStatement_Context ctx) {
        ReturnStatement returnStatement = (ReturnStatement) visit(ctx.returnStatement());
        return new ReturnStatement_(returnStatement);
    }

    @Override
    public Statement visitConsoleLogStatement(AngularParser.ConsoleLogStatementContext ctx) {
        ConsoleLog consoleLog = (ConsoleLog) visit(ctx.consoleLog());
        return new ConsoleLogStatement(consoleLog);
    }

    @Override
    public Object visitParameterName(AngularParser.ParameterNameContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new ParameterName(name);
    }

    @Override
    public Object visitParameters(AngularParser.ParametersContext ctx) {
        List<Parameter> properties = ctx.parameter().stream()
                .map(this::visit)
                .map(s -> (Parameter) s)
                .toList();
        return new Parameters(properties);
    }

    @Override
    public Object visitParameter(AngularParser.ParameterContext ctx) {
        ParameterName parameterName = (ParameterName) visit(ctx.parameterName());
        String name = parameterName.toString();

        TypeSelector typeSelector = null;
        if (ctx.typeSelector() != null) {
            typeSelector = (TypeSelector) visit(ctx.typeSelector());
        }

        DefaultValue defaultValue = null;
        if (ctx.defaultValue() != null) {
            defaultValue = (DefaultValue) visit(ctx.defaultValue());
        }

        if (typeSelector != null) {
            SymbolTable symbolTable = SymbolTable.getInstance();
            String type = typeSelector.toString();

            if (symbolTable.isVarExistInCurrentScope(name)) {
                String error = "Semantic Error: The parameter '" + name + "' is already defined in this scope.";
                symbolTable.semanticError(error, ctx.start.getLine());
            } else {
                Symbol symbol = new Symbol( type);
                symbolTable.put(name, symbol);
            }
        }

        return new Parameter(parameterName, typeSelector, defaultValue);
    }


    @Override
    public Object visitDefaultValue(AngularParser.DefaultValueContext ctx) {
        Expression expression = (Expression) visit(ctx.expression());
        return new DefaultValue(expression);
    }

    @Override
    public Object visitFunctionBody(AngularParser.FunctionBodyContext ctx) {
        SymbolTable symbolTable = SymbolTable.getInstance();
        symbolTable.enterScope();
        List<Statement> statements = ctx.statement().stream()
                .map(this::visit)
                .map(s -> (Statement) s)
                .toList();
        symbolTable.exitScope();
        return new FunctionBody(statements);
    }

    @Override
    public Object visitArrowFunctionBody(AngularParser.ArrowFunctionBodyContext ctx) {
        if (ctx.returnStatement() != null) {
            ReturnStatement returnStatement = (ReturnStatement) visit(ctx.returnStatement());
            return new ArrowFunctionBody(returnStatement);
        } else {
            FunctionBody functionBody = (FunctionBody) visit(ctx.functionBody());
            return new ArrowFunctionBody(functionBody);
        }
    }


    @Override
    public Object visitArrowFunctionDeclaration(AngularParser.ArrowFunctionDeclarationContext ctx) {
        Parameters parameters = null;
        if (ctx.parameters() != null) {
            parameters = (Parameters) visit(ctx.parameters());
        }

        TypeSelector typeSelector = null;
        if (ctx.typeSelector() != null) {
            typeSelector = (TypeSelector) visit(ctx.typeSelector());
        }

        ArrowFunctionBody body = (ArrowFunctionBody) visit(ctx.arrowFunctionBody());

        return new ArrowFunctionDeclaration(parameters, typeSelector, body);
    }

    @Override
    public Object visitRegularFunctionDeclaration(AngularParser.RegularFunctionDeclarationContext ctx) {
        RegularFunctionName functionName = (RegularFunctionName) visit(ctx.regularFunctionName());
        FunctionBody body = (FunctionBody) visit(ctx.functionBody());
        String name = functionName.toString();
        SymbolTable symbolTable = SymbolTable.getInstance();
        if (symbolTable.isVarExistInCurrentScope(name)) {
            String error = "Semantic Error: The function '" + name + "' is already defined in this scope.";
            symbolTable.semanticError(error, ctx.start.getLine());
        } else {
            Symbol symbol = new Symbol("function");
            symbolTable.put(name, symbol);
        }
        Parameters parameters = null;
        if (ctx.parameters() != null) {
            parameters = (Parameters) visit(ctx.parameters());
        }
        TypeSelector typeSelector = null;
        if (ctx.typeSelector() != null) {
            typeSelector = (TypeSelector) visit(ctx.typeSelector());
        }

        return new RegularFunctionDeclaration(functionName, parameters, typeSelector, body);
    }

    @Override
    public Object visitRegularFunctionName(AngularParser.RegularFunctionNameContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new RegularFunctionName(name);
    }

    @Override
    public FunctionDeclaration visitRegularFunction(AngularParser.RegularFunctionContext ctx) {
        RegularFunctionDeclaration regular = (RegularFunctionDeclaration) visit(ctx.regularFunctionDeclaration());
        return new RegularFunction(regular);
    }

    @Override
    public FunctionDeclaration visitArrowFunction(AngularParser.ArrowFunctionContext ctx) {
        ArrowFunctionDeclaration arrow = (ArrowFunctionDeclaration) visit(ctx.arrowFunctionDeclaration());
        return new ArrowFunction(arrow);
    }

    @Override
    public InterfaceBody visitInterfaceBody(AngularParser.InterfaceBodyContext ctx) {

        SymbolTable symbolTable = SymbolTable.getInstance();
        symbolTable.enterScope();
        List<InterfaceProperty> properties = ctx.interfaceProperty().stream()
                .map(this::visit)
                .map(s -> (InterfaceProperty) s)
                .toList();
        symbolTable.exitScope();
        return new InterfaceBody(properties);
    }

    @Override
    public InterfacePropertyName visitInterfacePropertyName(AngularParser.InterfacePropertyNameContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new InterfacePropertyName(name);
    }
//تم/
    @Override
    public Object visitInterfaceProperty(AngularParser.InterfacePropertyContext ctx) {
        InterfacePropertyName interfacePropertyName = (InterfacePropertyName) visit(ctx.interfacePropertyName());
        TypeSelector type = (TypeSelector) visit(ctx.typeSelector());

        String name = interfacePropertyName.toString();
        String typeStr = (type != null) ? type.toString() : "any";

        SymbolTable symbolTable = SymbolTable.getInstance();

        if (symbolTable.isVarExistInCurrentScope(name)) {
            String errorMsg = "Semantic Error: The property '" + name + "' is already defined in the same interface. (Line: " + ctx.start.getLine() + ")";

            writeErrorToFile(errorMsg);

            System.err.println(errorMsg);

        } else {
            Symbol symbol = new Symbol(typeStr);
            symbolTable.put(name, symbol);
        }

        return new InterfaceProperty(interfacePropertyName, type);
    }

    @Override
    public Object visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx) {
        InterfaceName interfaceName = (InterfaceName) visit(ctx.interfaceName());
        InterfaceBody body = (InterfaceBody) visit(ctx.interfaceBody());

        SymbolTable symbolTable = SymbolTable.getInstance();
        String name = interfaceName.toString();

        if (symbolTable.isVarExistInCurrentScope(name)) {
            String error = "Semantic Error: The interface '" + name + "' is already defined in this scope. (Line: " + ctx.start.getLine() + ")";


            writeErrorToFile(error);

            System.err.println(error);

        } else {
            Symbol symbol = new Symbol("interface");
            symbolTable.put(name, symbol);
        }

        return new InterfaceDeclaration(interfaceName, body);
    }
    @Override
    public Object visitMethodName(AngularParser.MethodNameContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new MethodName(name);
    }
///تم
@Override
public Object visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
    MethodName name = (MethodName) visit(ctx.methodName());
    String methodName = name.toString();

    Parameters parameters = null;
    if (ctx.parameters() != null) {
        parameters = (Parameters) visit(ctx.parameters());
    }

    TypeSelector returnType = null;
    if (ctx.typeSelector() != null) {
        returnType = (TypeSelector) visit(ctx.typeSelector());
    }

    FunctionBody body = (FunctionBody) visit(ctx.functionBody());

    SymbolTable symbolTable = SymbolTable.getInstance();

    System.out.println("Visiting method: " + methodName + " at line " + ctx.start.getLine());

    if (symbolTable.isVarExistInCurrentScope(methodName)) {
        String error = "Semantic Error: The function '" + methodName + "' is already defined in this scope. (Line: " + ctx.start.getLine() + ")";


        writeErrorToFile(error);


        System.err.println(error);
    } else {
        Symbol methodSymbol = new Symbol("method");
        symbolTable.put(methodName, methodSymbol);
    }

    return new MethodDeclaration(name, parameters, returnType, body);
}


    @Override
    public Object visitInterfaceName(AngularParser.InterfaceNameContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new InterfaceName(name);
    }

    @Override
    public Object visitMethodMember(AngularParser.MethodMemberContext ctx) {
        MethodDeclaration methodDeclaration = (MethodDeclaration) visit(ctx.methodDeclaration());
        return new MethodMember(methodDeclaration);
    }

    @Override
    public Object visitVariableMember(AngularParser.VariableMemberContext ctx) {
        VariableDeclarations variableDeclarations = (VariableDeclarations) visit(ctx.variableDeclarations());
        return new VariableMember(variableDeclarations);
    }


    @Override
    public Object visitClassName(AngularParser.ClassNameContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new ClassName(name);
    }

    @Override
    public Object visitClassBody(AngularParser.ClassBodyContext ctx) {
        SymbolTable symbolTable = SymbolTable.getInstance();
        symbolTable.enterScope();
        List<ClassMember> members = ctx.classMember().stream()
                .map(this::visit)
                .map(s -> (ClassMember) s)
                .toList();
        symbolTable.exitScope();
        return new ClassBody(members);
    }
//// new nnnn

    @Override
    public Object visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassName Name = (ClassName) visit(ctx.className(0));
        String name = Name.toString();

        SymbolTable symbolTable = SymbolTable.getInstance();

        if (symbolTable.isVarExistInCurrentScope(name)) {
            String error = "Semantic Error: The class '" + name + "' is already defined in this scope. (Line: " + ctx.start.getLine() + ")";
            writeErrorToFile(error);
            System.err.println(error);
        } else {
            Symbol classSymbol = new Symbol("class");
            symbolTable.put(name, classSymbol);
        }

        ClassBody body = (ClassBody) visit(ctx.classBody());
        return new ClassDeclaration(Name, body);
    }


    @Override
    public Object visitDecoratorProperty(AngularParser.DecoratorPropertyContext ctx) {
        DecoratorPropertyName decoratorPropertyName = (DecoratorPropertyName) visit(ctx.decoratorPropertyName());
        DecoratorPropertyValue propValue = (DecoratorPropertyValue) visit(ctx.decoratorPropertyValue());

        return new DecoratorProperty(decoratorPropertyName, propValue);
    }


    @Override
    public DecoratorPropertyValue visitStringValues(AngularParser.StringValuesContext ctx) {
        String textWithQuotes = ctx.STRING().getText();
        return new StringValues(textWithQuotes);
    }

    @Override
    public DecoratorPropertyValue visitArrayValue(AngularParser.ArrayValueContext ctx) {
        Array array = (Array) visit(ctx.array());
        return new ArrayValue(array);
    }


    @Override
    public Object visitSelectorProperty(AngularParser.SelectorPropertyContext ctx) {
            return new SelectorProperty();
    }

    @Override
    public Object visitTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx) {
        return new TemplateUrlProperty();
    }

    @Override
    public Object visitImportsProperty(AngularParser.ImportsPropertyContext ctx) {
        return new ImportsProperty();
    }

    @Override
    public Object visitStyleUrlProperty(AngularParser.StyleUrlPropertyContext ctx) {
        return new StyleUrlProperty();
    }

    @Override
    public Object visitStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx) {
        return new StyleUrlsProperty();
    }

    @Override
    public Object visitProvidedInProperty(AngularParser.ProvidedInPropertyContext ctx) {
        return new ProvidedInProperty();
    }

    @Override
    public Object visitDecoratorObject(AngularParser.DecoratorObjectContext ctx) {
        DecoratorObjectContent content = null;

        if (ctx.decoratorObjectContent() != null) {
            content = (DecoratorObjectContent) visit(ctx.decoratorObjectContent());
        }

        return new DecoratorObject(content);

    }

    @Override
    public Object visitDecoratorObjectContent(AngularParser.DecoratorObjectContentContext ctx) {

        List<DecoratorProperty> properties = ctx.decoratorProperty().stream()
                .map(this::visit)
                .map(s -> (DecoratorProperty) s)
                .toList();

        return new DecoratorObjectContent(properties);
    }

    @Override
    public Object visitDecorator(AngularParser.DecoratorContext ctx) {
        NamedImport namedImport = (NamedImport) visit(ctx.namedImport());
        DecoratorObject decoratorObj = (DecoratorObject) visit(ctx.decoratorObject());

        return new Decorator(namedImport, decoratorObj);
    }


    @Override
    public Object visitComponentImport(AngularParser.ComponentImportContext ctx) {
        return new ComponentImport();
    }

    @Override
    public Object visitInjectableImport(AngularParser.InjectableImportContext ctx) {
        return new InjectableImport();
    }

    @Override
    public Object visitInputImport(AngularParser.InputImportContext ctx) {
        return new InputImport();
    }

    @Override
    public Object visitIdDefinerImport(AngularParser.IdDefinerImportContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new IdDefinerImport(name);
    }

    @Override
    public NamedImportBlock visitNamedImportBlock(AngularParser.NamedImportBlockContext ctx) {
        NamedImportContent content = null;

        if (ctx.namedImportContent() != null) {
            content = (NamedImportContent) visit(ctx.namedImportContent());
        }
        List<NamedImportContent> contents = new ArrayList<>();
        if (content != null) {
            contents.add(content);
        }
        return new NamedImportBlock(contents);
    }
///تم
    @Override
    public NamedImportContent visitNamedImportContent(AngularParser.NamedImportContentContext ctx) {
        SymbolTable symbolTable = SymbolTable.getInstance();
        List<NamedImport> namedImports = new ArrayList<>();
        Set<String> seenNames = new HashSet<>();

        for (AngularParser.NamedImportContext importCtx : ctx.namedImport()) {
            NamedImport namedImport = (NamedImport) visit(importCtx);
            String name = namedImport.toString();

            if (seenNames.contains(name)) {
                String error = "Semantic Error: The parameter '" + name + "' is duplicated in the import. (Line: " + importCtx.start.getLine() + ")";

                writeErrorToFile(error);
                System.err.println(error);
            } else {
                seenNames.add(name);
            }

            namedImports.add(namedImport);
        }

        return new NamedImportContent(namedImports);
    }



    @Override
    public ImportContent visitIdentifierImport(AngularParser.IdentifierImportContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new IdentifierImport(name);
    }

    @Override
    public ImportContent visitBlockImport(AngularParser.BlockImportContext ctx) {
        NamedImportBlock namedImportBlock = (NamedImportBlock) visit(ctx.namedImportBlock());
        return new BlockImport(namedImportBlock);
    }

    @Override
    public Object visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportContent importContent = (ImportContent) visit(ctx.importContent());
        String fromPath = ctx.STRING().getText();
        return new ImportStatement(importContent, fromPath);

    }

    @Override
    public Object visitTsImport(AngularParser.TsImportContext ctx) {
        ImportStatement importStatement = (ImportStatement) visit(ctx.importStatement());
        return new TsImport(importStatement);
    }

    @Override
    public Object visitTsClass(AngularParser.TsClassContext ctx) {
        ClassDeclaration classDeclaration = (ClassDeclaration) visit(ctx.classDeclaration());
        return new TsClass(classDeclaration);
    }

    @Override
    public Object visitTsFunction(AngularParser.TsFunctionContext ctx) {
        FunctionDeclaration functionDeclaration = (AST.TS.FunctionDeclaration) visit(ctx.functionDeclaration());
        return new TsFunction(functionDeclaration);
    }

    @Override
    public Object visitTsInterface(AngularParser.TsInterfaceContext ctx) {
        InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration) visit(ctx.interfaceDeclaration());
        return new TsInterface(interfaceDeclaration);
    }

    @Override
    public Object visitTsDecorator(AngularParser.TsDecoratorContext ctx) {
        Decorator decorator = (Decorator) visit(ctx.decorator());
        return new TsDecorator(decorator);
    }

    @Override
    public Object visitTsVariableDecl(AngularParser.TsVariableDeclContext ctx) {
        VariableDeclarations variableDeclarations = (VariableDeclarations) visit(ctx.variableDeclarations());
        return new TsVariableDecl(variableDeclarations);
    }
    @Override
    public TsProg visitTsProgramBlock(AngularParser.TsProgramBlockContext ctx) {
        List<TsProgContent> contents = new ArrayList<>();

        for (AngularParser.TsProgContentContext contentCtx : ctx.tsProgContent()) {
            TsProgContent content = (TsProgContent) visit(contentCtx);
            contents.add(content);
        }

        return new TsProgramBlock(contents);
    }


    @Override
    public TsProg visitTsEmptyProgram(AngularParser.TsEmptyProgramContext ctx) {
        return new TsEmptyProgram();
    }

    @Override
    public Object visitAttributeValue(AngularParser.AttributeValueContext ctx) {
        String quoted = ctx.STRING().getText();
        return new AttributeValue(quoted);
    }

    @Override
    public Object visitNgIfDirective(AngularParser.NgIfDirectiveContext ctx) {
        return new NgIfDirective();
    }

    @Override
    public Object visitNgForDirective(AngularParser.NgForDirectiveContext ctx) {
    return new NgForDirective();
    }

    @Override
    public Object visitNgSwitchDirective(AngularParser.NgSwitchDirectiveContext ctx) {
    return new NgSwitchDirective();
    }

    @Override
    public Object visitIdDefinerDirective(AngularParser.IdDefinerDirectiveContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new IdDefinerDirective(name);
    }

    @Override
    public Object visitAngularDirective(AngularParser.AngularDirectiveContext ctx) {
        DirectiveName directiveName=(DirectiveName) visit(ctx.directiveName());
        return new AngularDirective(directiveName);
    }

    @Override
    public AngularEvent visitAngularEvent(AngularParser.AngularEventContext ctx) {
        EventName eventName=(EventName) visit(ctx.eventName());
       return new AngularEvent(eventName);
    }

    @Override
    public EventName visitClickEvent(AngularParser.ClickEventContext ctx) {
       return new ClickEvent();
    }

    @Override
    public EventName visitChangeEvent(AngularParser.ChangeEventContext ctx) {
     return new ChangeEvent();
    }

    @Override
    public EventName visitInputEvent(AngularParser.InputEventContext ctx) {
    return  new InputEvent();    }

    @Override
    public EventName visitSubmitEvent(AngularParser.SubmitEventContext ctx) {
    return new SubmitEvent();    }

    @Override
    public EventName visitKeyDownEvent(AngularParser.KeyDownEventContext ctx) {
      return new KeyDownEvent();
    }

    @Override
    public EventName visitKeyUpEvent(AngularParser.KeyUpEventContext ctx) {
       return new KeyUpEvent();
    }

    @Override
    public EventName visitCustomEvent(AngularParser.CustomEventContext ctx) {
        String name = ctx.IDDEFINER().getText();
       return new CustomEvent(name);
    }

    @Override
    public AngularBinding visitAngularBinding(AngularParser.AngularBindingContext ctx) {
        BindingName bindingName=(BindingName) visit(ctx.bindingName());
        return new AngularBinding(bindingName);
    }

    @Override
    public BindingName visitValueBinding(AngularParser.ValueBindingContext ctx) {
       return new ValueBinding();
    }

    @Override
    public BindingName visitCheckedBinding(AngularParser.CheckedBindingContext ctx) {
       return new CheckedBinding();
    }

    @Override
    public BindingName visitSrcBinding(AngularParser.SrcBindingContext ctx) {
      return new SrcBinding();
    }

    @Override
    public BindingName visitHrefBinding(AngularParser.HrefBindingContext ctx) {
        return new HrefBinding();
    }

    @Override
    public BindingName visitCustomBinding(AngularParser.CustomBindingContext ctx) {
        String name = ctx.IDDEFINER().getText();
    return new CustomBinding(name);
    }


    @Override
    public StandardAttribute visitDisabledAttr(AngularParser.DisabledAttrContext ctx) {
        return new DisabledAttr();
    }

    @Override
    public StandardAttribute visitTypeAttr(AngularParser.TypeAttrContext ctx) {
        return new TypeAttr();
    }

    @Override
    public StandardAttribute visitNameAttr(AngularParser.NameAttrContext ctx) {
        return new NameAttr();
    }

    @Override
    public StandardAttribute visitIdDefinerAttr(AngularParser.IdDefinerAttrContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new IdDefinerAttr(name);
    }

    @Override
    public StandardAttribute visitSrcAttr(AngularParser.SrcAttrContext ctx) {
        return new SrcAttr();
    }


    @Override
    public StandardAttribute visitIdAttr(AngularParser.IdAttrContext ctx) {
    return  new IdAttr();
    }

    @Override
    public StandardAttribute visitTitleAttr(AngularParser.TitleAttrContext ctx) {
        return new TitleAttr();
    }

    @Override
    public StandardAttribute visitAltAttr(AngularParser.AltAttrContext ctx) {
        return new AltAttr();
    }

    @Override
    public StandardAttribute visitClassAttr(AngularParser.ClassAttrContext ctx) {
   return new ClassAttr();
    }

    @Override
    public StandardAttribute visitHrefAttr(AngularParser.HrefAttrContext ctx) {
        return new HrefAttr();
    }

    @Override
    public AttributeName visitAttributeName(AngularParser.AttributeNameContext ctx) {
        if (ctx.standardAttribute() != null) {
            StandardAttribute standardAttribute = (StandardAttribute) visit(ctx.standardAttribute());
            return new AttributeName(standardAttribute,null,null,null,null);
        } else if (ctx.angularBinding() != null) {
            AngularBinding angularBinding = (AngularBinding) visit(ctx.angularBinding());
            return new AttributeName(null,angularBinding,null,null,null);
        } else if (ctx.angularEvent() != null) {
            AngularEvent angularEvent = (AngularEvent) visit(ctx.angularEvent());
            return new AttributeName(null,null,angularEvent,null,null);
        } else if (ctx.angularDirective() != null) {
            AngularDirective angularDirective = (AngularDirective) visit(ctx.angularDirective());
            return new AttributeName(null,null,null,angularDirective,null);
        }
        else if (ctx.twoWayDataBinding() != null) {       // الجديد
            TwoWayDataBinding twoWay = (TwoWayDataBinding) visit(ctx.twoWayDataBinding());
            return new AttributeName(null,null,null,null,twoWay);
        }
        else {
            return null;
        }
    }
//    @Override
//    public Object visitTwoWayDataBinding(AngularParser.TwoWayDataBindingContext ctx) {
//        if (ctx == null) {
//            return null;
//        }
//        String model = ctx.IDDEFINER.getText();
//        return new TwoWayDataBinding(model);
//    }


    @Override
    public Object visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) {
        AttributeName attributeName=(AttributeName) visit(ctx.attributeName());
        AttributeValue attributeValue= (AttributeValue) visit(ctx.attributeValue());
    return new HtmlAttribute(attributeName,attributeValue);
    }

    @Override
    public AngularInterpolationContent visitAngularInterpolationContent(AngularParser.AngularInterpolationContentContext ctx) {
        if (ctx == null) {
            return null;
        }
        List<Expression> elements = new ArrayList<>();
        elements.add((Expression) visit(ctx.expression(0)));
        for (int i = 1; i < ctx.expression().size(); i++) {
            elements.add((Expression) visit(ctx.expression(i)));
        }
         return new AngularInterpolationContent(elements);
    }

    @Override
    public Object visitAngularInterpolation(AngularParser.AngularInterpolationContext ctx) {
        if (ctx == null) {
            return null;
        }
        AngularInterpolationContent content = null;
        if (ctx.angularInterpolationContent() != null) {
            content = (AngularInterpolationContent) visit(ctx.angularInterpolationContent());
        }
        return new AngularInterpolation( content);
    }

    @Override
    public Object visitStatment(AngularParser.StatmentContext ctx) {
        if (ctx == null) {
            return null;
        }
        List<Text> text = new ArrayList<>();
        text.add((Text) visit(ctx.text(0)));
        for (int i = 1; i < ctx.text().size(); i++) {
            text.add((Text) visit(ctx.text(i)));
        }
        return new Statment(text);
    }

    @Override
    public Object visitText(AngularParser.TextContext ctx) {
        if (ctx == null) {
            return null;
        }
        String name = ctx.IDDEFINER().getText();
        return new Text(name);
    }

    @Override
    public Object visitHtmlInterpolation(AngularParser.HtmlInterpolationContext ctx) {
        if (ctx == null) {
            return null;
        }
        AngularInterpolation angularInterpolation= (AngularInterpolation) visit(ctx.angularInterpolation());
        return new HtmlInterpolation(angularInterpolation);
    }

    @Override
    public Object visitHtmlStatement(AngularParser.HtmlStatementContext ctx) {
        if (ctx == null) {
            return null;
        }
        Statment statment=(Statment) visit(ctx.statment());
        return new HtmlStatement(statment);
    }

    @Override
    public Object visitHtmlNestedElement(AngularParser.HtmlNestedElementContext ctx) {
        if (ctx == null) {
            return null;
        }
        HtmlElement htmlelement= (HtmlElement) visit(ctx.htmlelement());
        return new HtmlNestedElement(htmlelement);
    }

    @Override
    public Object visitDivTag(AngularParser.DivTagContext ctx) {
        return new DivTag();
    }

    @Override
    public Object visitSpanTag(AngularParser.SpanTagContext ctx) {
     return new SpanTag();
    }

    @Override
    public Object visitPTag(AngularParser.PTagContext ctx) {
    return new PTag();
    }

    @Override
    public Object visitATag(AngularParser.ATagContext ctx) {
       return new ATag();
    }

    @Override
    public Object visitButtonTag(AngularParser.ButtonTagContext ctx) {
     return new ButtonTag();
    }

    @Override
    public Object visitInputTag(AngularParser.InputTagContext ctx) {
      return new InputTag();
    }

    @Override
    public Object visitFormTag(AngularParser.FormTagContext ctx) {
        return new FormTag();
    }

    @Override
    public Object visitImgTag(AngularParser.ImgTagContext ctx) {
    return new ImgTag();
    }

    @Override
    public Object visitUlTag(AngularParser.UlTagContext ctx) {
     return new UlTag();
    }

    @Override
    public Object visitLiTag(AngularParser.LiTagContext ctx) {
    return new LiTag();
    }

    @Override
    public Object visitH1Tag(AngularParser.H1TagContext ctx) {
      return new H1Tag();
    }

    @Override
    public Object visitH2Tag(AngularParser.H2TagContext ctx) {
    return new H2Tag();
    }

    @Override
    public Object visitH3Tag(AngularParser.H3TagContext ctx) {
     return new H3Tag();
    }

    @Override
    public Object visitH4Tag(AngularParser.H4TagContext ctx) {
        return new H4Tag();
    }

    @Override
    public Object visitH5Tag(AngularParser.H5TagContext ctx) {
        return new H5Tag();
    }

    @Override
    public Object visitH6Tag(AngularParser.H6TagContext ctx) {
        return new H6Tag();
    }

    @Override
    public Object visitCustomTag(AngularParser.CustomTagContext ctx) {
        String name = ctx.IDDEFINER().getText();
        return new CustomTag(name);
    }

    @Override
    public Object visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx) {
        TagName tagName=(TagName) visit(ctx.tagName());
        List<HtmlAttribute> attributes = new ArrayList<>();
        for (AngularParser.AttributeContext attrCtx : ctx.attribute()) {
            attributes.add((HtmlAttribute) visit(attrCtx));
        }
        return new SelfClosingTag(tagName, attributes);
    }

    @Override
    public Object visitStartTag(AngularParser.StartTagContext ctx) {
        TagName tagName = (TagName) visit(ctx.tagName());
        List<HtmlAttribute> attributes = new ArrayList<>();
        for (AngularParser.AttributeContext attrCtx : ctx.attribute()) {
            attributes.add((HtmlAttribute) visit(attrCtx));
        }

        // Push the start tag onto the stack
        TagSymbolTable tagTable = TagSymbolTable.getInstance(); // افترضنا Singleton
        tagTable.pushTag(tagName.getName());

        return new StartTag(tagName, attributes);
    }

    @Override
    public Object visitEndTag(AngularParser.EndTagContext ctx) {
        if (ctx == null || ctx.tagName() == null) {
            System.err.println("EndTag context is null!");
            return null;
        }
        TagName tagName = (TagName) visit(ctx.tagName());
        int line = ctx.start.getLine();
        TagSymbolTable tagTable = TagSymbolTable.getInstance();

        tagTable.popTag(tagName.getName(), line);

        return new EndTag(tagName);
    }

    @Override
    public Object visitOpenCloseTag(AngularParser.OpenCloseTagContext ctx) {
        StartTag startTag=(StartTag) visit(ctx.startTag());
        EndTag endTag=(EndTag) visit(ctx.endTag());
        List<ElementContent> content = new ArrayList<>();
        for (AngularParser.ElementContentContext ec : ctx.elementContent()) {
            content.add((ElementContent) visit(ec));
        }
        return new OpenCloseTag(startTag, content, endTag);
    }


    @Override
    public Object visitHtmlOpenClose(AngularParser.HtmlOpenCloseContext ctx) {
        OpenCloseTag openCloseTag =(OpenCloseTag) visit(ctx.openCloseTag());
        return new HtmlOpenClose(openCloseTag);
    }

    @Override
    public Object visitHtmlSelfClosing(AngularParser.HtmlSelfClosingContext ctx) {
        SelfClosingTag selfClosingTag =(SelfClosingTag) visit(ctx.selfClosingTag());
        return new HtmlSelfClosing(selfClosingTag);
    }

    @Override
    public Object visitHtmlRoot(AngularParser.HtmlRootContext ctx) {
        List<HtmlNode> elements = new ArrayList<>();
        for (AngularParser.HtmlelementContext elCtx : ctx.htmlelement()) {
            elements.add((HtmlElement) visit(elCtx));
        }
        return new HtmlProg(elements);
    }



    @Override
    public Prog visitHtmlProgram(AngularParser.HtmlProgramContext ctx) {
        HtmlProg htmlProg=(HtmlProg) visit(ctx.htmlProg());
        return new HtmlProgram(htmlProg);
    }

    @Override
    public Prog visitCssProgram(AngularParser.CssProgramContext ctx) {
        CssRoot cssProg =(CssRoot) visit(ctx.cssProg());
        return new CssProgram(cssProg);
    }
    @Override
    public Prog visitTsProgram(AngularParser.TsProgramContext ctx) {
        TsProg tsProg=(TsProg) visit(ctx.tsProg());
        return new TsProgram(tsProg);
    }
    private void writeErrorToFile(String errorMsg) {
        try {
            FileWriter fw = new FileWriter("semantic_errors.txt", true); // true = append mode
            PrintWriter pw = new PrintWriter(fw);
            pw.println(errorMsg);
            pw.close();
        } catch (IOException e) {
            System.err.println("فشل في كتابة الخطأ داخل الملف: " + e.getMessage());
        }
    }
    @Override
    public Object visitNavTag(AngularParser.NavTagContext ctx) {
        return new NavTag();
    }

    @Override
    public Object visitBodyTag(AngularParser.BodyTagContext ctx) {
        return new BodyTag();
    }

    @Override
    public StandardAttribute visitLinkAttr(AngularParser.LinkAttrContext ctx) {
        return new LinkAttr();
    }

    @Override
    public Object visitLinkActiveAttr(AngularParser.LinkActiveAttrContext ctx) {
        return new LinkActiveAttr();
    }

    @Override
    public Object visitInputRoutes(AngularParser.InputRoutesContext ctx) {
        return new InputRoutes();
    }

    @Override
    public Object visitRoutesType(AngularParser.RoutesTypeContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new RoutesType();
    }

    @Override
    public Object visitTwoWayDataBinding(AngularParser.TwoWayDataBindingContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new TwoWayDataBinding();
    }

    @Override
    public EventName visitNgSubmitEvent(AngularParser.NgSubmitEventContext ctx) {
        if (ctx == null) {
            return null;
        }
        return new SubmitEvent1();
    }


    @Override
    public Object visitTsRouterDecl(AngularParser.TsRouterDeclContext ctx) {
        RouterDeclaration routerDeclaration = (RouterDeclaration) visit(ctx.routerDeclaration());
        return new TsRouterDecl(routerDeclaration);
    }


    @Override
    public Object visitRouterDeclaration(AngularParser.RouterDeclarationContext ctx) {
        if (ctx == null) {
            return null;
        }

        boolean isExport = ctx.EXPORT() != null;

        DeclarationTypes declarationTypes = (DeclarationTypes) visit(ctx.declarationTypes());
        RouterName routerName = ctx.routerName() != null
                ? new RouterName(ctx.routerName().getText())
                : null;

        TypeSelector typeSelector = ctx.typeSelector() != null
                ? (TypeSelector) visit(ctx.typeSelector())
                : null;

        Routers routers = ctx.routers() != null
                ? (Routers) visit(ctx.routers())
                : null;

        return new RouterDeclaration(isExport, declarationTypes, routerName, typeSelector, routers);
    }

    @Override
    public Object visitRouterName(AngularParser.RouterNameContext ctx) {
        if (ctx == null) {
            return null;
        }
        String name = ctx.IDDEFINER().getText();
        return new RouterName(name);
    }

    @Override
    public Object visitRouters(AngularParser.RoutersContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<RouterArrayContent> routerArrayContent = new ArrayList<>();
        for (AngularParser.RouterArrayContentContext ec : ctx.routerArrayContent()) {
            routerArrayContent.add((RouterArrayContent) visit(ec));
        }

        return new Routers(routerArrayContent);
    }

    @Override
    public Object visitRouterArrayContent(AngularParser.RouterArrayContentContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<RouterProperty> properties = new ArrayList<>();

        for (AngularParser.RouterPropertyContext propCtx : ctx.routerProperty()) {
            RouterProperty prop = (RouterProperty) visit(propCtx);
            properties.add(prop);
        }

        return new RouterArrayContent(properties);
    }

    @Override
    public Object visitRouterPropertyName(AngularParser.RouterPropertyNameContext ctx) {
        if (ctx == null) {
            return null;
        }

        RouterPropertyName.Kind kind = null;

        if (ctx.PATH() != null) {
            kind = RouterPropertyName.Kind.PATH;
        } else if (ctx.ROUTE_COMPONENT() != null) {
            kind = RouterPropertyName.Kind.ROUTE_COMPONENT;
        }

        return new RouterPropertyName(kind);
    }

    @Override
    public RouterPropertyValue visitPathValue(AngularParser.PathValueContext ctx) {
        if (ctx == null) {
            return null;
        }
        String name = ctx.STRING().getText();
        return new PathValue(name);
    }

    @Override
    public Object visitComponentValue(AngularParser.ComponentValueContext ctx) {
        if (ctx == null || ctx.IDDEFINER() == null) {
            return null;
        }

        String name = ctx.IDDEFINER().getText();

        return new ComponentValue(name);
    }

    @Override
    public Object visitRouterProperty(AngularParser.RouterPropertyContext ctx) {

            if (ctx == null) {
                return null;
            }

            RouterPropertyName name = ctx.routerPropertyName() != null
                    ? (RouterPropertyName) visit(ctx.routerPropertyName())
                    : null;

        RouterPropertyValue  value = ctx.routerPropertyValue() != null
                    ?(RouterPropertyValue) visit(ctx.routerPropertyValue())
                    : null;

            return new RouterProperty(name, value);
        }

    @Override
    public Object visitExtractData(AngularParser.ExtractDataContext ctx) {
        if (ctx == null) {
            return null;
        }
        MemberAccess memberAccess = (MemberAccess) visit(ctx.memberAccess());

        return new ExtractData(memberAccess);
    }
    //////w
    @Override
    public MemberAccessElement visitLocalLabel(AngularParser.LocalLabelContext ctx) {
        return new LocalLabel();
    }

}



