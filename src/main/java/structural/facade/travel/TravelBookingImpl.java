package structural.facade.travel;

import com.google.common.base.Preconditions;
import structural.facade.flight.EmiratesFlightBooking;
import structural.facade.flight.FlightBooking;
import structural.facade.flight.FlightType;
import structural.facade.hotel.HiltonHotelBooking;
import structural.facade.hotel.HotelBooking;
import structural.facade.hotel.HotelType;

/**
 * Created by mtumilowicz on 2017-11-13.
 */
public class TravelBookingImpl implements TravelBooking {
    
    private final FlightBooking flightBooking = new EmiratesFlightBooking();
    private final HotelBooking hotelBooking = new HiltonHotelBooking();

    @Override
    public void bookAll(FlightType flightType, HotelType hotelType) {
        Preconditions.checkArgument(flightType != null);
        Preconditions.checkArgument(hotelType != null);
        
        flightBooking.book(flightType);
        hotelBooking.book(hotelType);
    }
}
