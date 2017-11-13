package structural.facade.hotel;

/**
 * Created by mtumilowicz on 2017-11-13.
 */
public class HiltonHotelBooking implements HotelBooking {
    
    @Override
    public void book(HotelType type) {
        System.out.println("Booking at Hilton's, type: " + type);
    }
    
}
