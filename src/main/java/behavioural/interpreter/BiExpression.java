package behavioural.interpreter;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public abstract class BiExpression implements Expression {
    
    protected final Expression first;
    protected final Expression second;

    BiExpression(Expression first, Expression second) {
        Preconditions.checkArgument(first != null);
        Preconditions.checkArgument(second != null);
        
        this.first = first;
        this.second = second;
    }


    @Override
    public abstract boolean interpret(String str);
}
