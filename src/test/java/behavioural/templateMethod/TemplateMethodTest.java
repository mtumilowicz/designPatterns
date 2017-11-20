package behavioural.templateMethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class TemplateMethodTest {
    
    @Test
    public void twoDayTripFirstImpl() {
        TwoDayTrip twoDayTrip = new TwoDayTripFirstImpl();
        assertEquals("TRAIN, SEA, SEA, PLANE", twoDayTrip.performTrip());
    }

    @Test
    public void twoDayTripSecondImpl() {
        TwoDayTrip twoDayTrip = new TwoDayTripSecondImpl();
        assertEquals("PLANE, MOUNTAINS, SEA, PLANE", twoDayTrip.performTrip());
    }
}
