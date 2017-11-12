package structural.composite;

import org.junit.Test;
import structural.composite.shape.ComplexShape;
import structural.composite.shape.basic.BasicShape;
import structural.composite.shape.basic.Circle;
import structural.composite.shape.basic.Square;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class ComplexShapeTest {

    private static final BasicShape SQUARE = new Square();
    private static final BasicShape CIRCLE = new Circle();
    private static final List<BasicShape> EXPECTED_BASIC_SHAPES = Arrays.asList(
            SQUARE, 
            CIRCLE, 
            SQUARE, 
            SQUARE,
            CIRCLE);

    @Test
    public void complexShape() {
        ComplexShape doubleSquare = new ComplexShape();
        doubleSquare.addConstituent(SQUARE);
        doubleSquare.addConstituent(SQUARE);

        ComplexShape test = new ComplexShape();
        test.addConstituent(SQUARE);
        test.addConstituent(CIRCLE);
        test.addConstituent(doubleSquare);
        test.addConstituent(CIRCLE);
        
        assertEquals(EXPECTED_BASIC_SHAPES, test.decompose());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void addNullShape() {
        new ComplexShape().addConstituent(null);
    }
}
