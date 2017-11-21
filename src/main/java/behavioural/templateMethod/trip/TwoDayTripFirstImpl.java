package behavioural.templateMethod.trip;

import behavioural.templateMethod.place.PlaceType;
import behavioural.templateMethod.transport.TransportType;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class TwoDayTripFirstImpl extends TwoDayTrip {
    @Override
    PlaceType dayOne() {
        return PlaceType.SEA;
    }

    @Override
    PlaceType dayTwo() {
        return PlaceType.SEA;
    }

    @Override
    public TransportType comingTransport() {
        return TransportType.TRAIN;
    }

    @Override
    public TransportType returningTransport() {
        return TransportType.PLANE;
    }
}
