package behavioural.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class SpecificInterpreterTest {
    private final SpecificInterpreter interpreter = new SpecificInterpreter();
    
    @Test
    public void noD() {
        assertFalse(interpreter.interpret("a b c"));
    }

    @Test
    public void onlyD() {
        assertFalse(interpreter.interpret("d"));
    }

    @Test
    public void dAndA() {
        assertTrue(interpreter.interpret("d a"));
    }

    @Test
    public void AAndD() {
        assertTrue(interpreter.interpret("a d"));
    }

    @Test
    public void DOrA() {
        assertTrue(interpreter.interpret("d a"));
    }
}
