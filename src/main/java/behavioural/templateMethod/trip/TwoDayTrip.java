package behavioural.templateMethod.trip;

import behavioural.templateMethod.place.PlaceType;
import behavioural.templateMethod.transport.TransportType;

import java.util.function.Supplier;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class TwoDayTrip extends Trip {

    private final Supplier<PlaceType> dayOne;
    private final Supplier<PlaceType> dayTwo;

    public TwoDayTrip(
            Supplier<TransportType> comingTransport,
            Supplier<PlaceType> dayOne,
            Supplier<PlaceType> dayTwo,
            Supplier<TransportType> returningTransport
    ) {
        super(comingTransport, returningTransport);
        this.dayOne = dayOne;
        this.dayTwo = dayTwo;
    }

    @Override
    public String daysSchedule() {
        return dayOne.get() + ", " + dayTwo.get();
    }
}
