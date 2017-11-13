package structural.facade.travel;

import org.junit.Test;
import structural.facade.flight.FlightType;
import structural.facade.hotel.HotelType;

/**
 * Created by mtumilowicz on 2017-11-13.
 */
public class TravelBookingImplTest {

    @Test(expected = IllegalArgumentException.class)
    public void bookNullFlight() {
        new TravelBookingImpl().bookAll(null, HotelType.FIVE_STAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bookNullHotel() {
        new TravelBookingImpl().bookAll(FlightType.BUSINESS, null);
    }
    
    @Test
    public void bookAllNotNull() {
        new TravelBookingImpl().bookAll(FlightType.BUSINESS, HotelType.FIVE_STAR);
    }
}
