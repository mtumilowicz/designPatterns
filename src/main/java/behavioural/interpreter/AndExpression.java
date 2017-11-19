package behavioural.interpreter;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class AndExpression extends BiExpression {
    
    public AndExpression(Expression first, Expression second) {
        super(first, second);
    }

    @Override
    public boolean interpret(String str) {
        return first.interpret(str) && second.interpret(str);
    }
}
