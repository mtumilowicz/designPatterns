package structural.facade.flight;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-11-13.
 */
public class EmiratesFlightBooking implements FlightBooking {
    
    @Override
    public void book(FlightType type) {
        System.out.println("Booking in Emirates, type: " + type);
    }

}
