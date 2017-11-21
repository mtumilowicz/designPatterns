package behavioural.interpreter;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class LiteralExpression implements Expression {
    private String literal = null;

    public LiteralExpression(String str) {
        literal = StringUtils.defaultIfEmpty(str, StringUtils.EMPTY);
    }

    public boolean interpret(String str) {
        return Arrays.stream(StringUtils.split(str, " "))
                .filter(u -> Objects.equals(u, literal))
                .count() > 0;
    }
}
