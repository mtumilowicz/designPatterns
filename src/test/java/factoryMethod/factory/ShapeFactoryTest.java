package factoryMethod.factory;

import factoryMethod.shape.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class ShapeFactoryTest {
    
    private static final Shape EXPECTED_CIRCLE = new Circle();
    private static final Shape EXPECTED_SQUARE = new Square();
    private static final Shape EXPECTED_TRIANGLE = new Triangle();
    
    @Test(expected = IllegalArgumentException.class)
    public void nullShape() {
        ShapeFactory.get(null);
    }
    
    @Test
    public void circle() {
        assertEquals(EXPECTED_CIRCLE, ShapeFactory.get(ShapeType.CIRCLE));
    }

    @Test
    public void square() {
        assertEquals(EXPECTED_SQUARE, ShapeFactory.get(ShapeType.SQUARE));
    }

    @Test
    public void triangle() {
        assertEquals(EXPECTED_TRIANGLE, ShapeFactory.get(ShapeType.TRIANGLE));
    }
}
