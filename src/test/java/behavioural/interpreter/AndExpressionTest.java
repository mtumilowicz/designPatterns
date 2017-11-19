package behavioural.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class AndExpressionTest {

    private static final Expression le = new AndExpression(
            new LiteralExpression("a"),
            new LiteralExpression("b"));

    @Test
    public void positiveInterpretation() {
        assertTrue(le.interpret("a b c d e"));
    }

    @Test
    public void negativeInterpretationOnlyFirst() {
        assertFalse(le.interpret("a c d e"));
    }

    @Test
    public void negativeInterpretationOnlySecond() {
        assertFalse(le.interpret("c d b"));
    }

    @Test
    public void negativeInterpretation() {
        assertFalse(le.interpret("c d"));
    }
}
