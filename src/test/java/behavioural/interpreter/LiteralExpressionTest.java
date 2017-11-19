package behavioural.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class LiteralExpressionTest {
    
    private static final LiteralExpression le = new LiteralExpression("test");
    
    @Test
    public void positiveInterpretation() {
        assertTrue(le.interpret("Test test a"));
    }

    @Test
    public void negativeInterpretation() {
        assertFalse(le.interpret("Test 1 a"));
    }
}
