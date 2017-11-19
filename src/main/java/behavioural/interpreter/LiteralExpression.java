package behavioural.interpreter;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class LiteralExpression implements Expression {
    private String literal = null;

    public LiteralExpression(String str) {
        literal = StringUtils.defaultIfEmpty(str, StringUtils.EMPTY);
    }

    public boolean interpret(String str) {
        return StringUtils.contains(str, literal);
    }
}
