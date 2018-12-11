package behavioural.templateMethod;

import behavioural.templateMethod.place.PlaceType;
import behavioural.templateMethod.transport.TransportType;
import behavioural.templateMethod.trip.TwoDayTrip;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class TemplateMethodTest {
    
    @Test
    public void twoDayTripFirstImpl() {
        TwoDayTrip twoDayTrip = new TwoDayTrip(
                () -> TransportType.TRAIN,
                () -> PlaceType.SEA,
                () -> PlaceType.SEA,
                () -> TransportType.PLANE
        );
        
        assertEquals("TRAIN, SEA, SEA, PLANE", twoDayTrip.performTrip());
    }

    @Test
    public void twoDayTripSecondImpl() {
        TwoDayTrip twoDayTrip = new TwoDayTrip(
                () -> TransportType.PLANE,
                () -> PlaceType.MOUNTAINS,
                () -> PlaceType.SEA,
                () -> TransportType.PLANE
        );
        
        assertEquals("PLANE, MOUNTAINS, SEA, PLANE", twoDayTrip.performTrip());
    }
}
