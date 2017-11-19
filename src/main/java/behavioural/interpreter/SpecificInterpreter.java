package behavioural.interpreter;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class SpecificInterpreter implements Expression {
    private final Expression expression;
    
    public SpecificInterpreter() {
        // Literal
        Expression terminal1 = new LiteralExpression("a");
        Expression terminal2 = new LiteralExpression("b");
        Expression terminal3 = new LiteralExpression("c");
        Expression terminal4 = new LiteralExpression("d");

        // a or b
        Expression alternation1 = new OrExpression(terminal2, terminal3);

        // c or (a or b)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        // d and (c or (a or b))
        expression = new AndExpression(terminal4, alternation2);
    }

    @Override
    public boolean interpret(String str) {
        return expression.interpret(str);
    }
}
