package structural.facade.travel;

import structural.facade.flight.FlightType;
import structural.facade.hotel.HotelType;

/**
 * Created by mtumilowicz on 2017-11-13.
 */
interface TravelBooking {
    void bookAll(FlightType flightType, HotelType hotelType);
}
