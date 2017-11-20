package behavioural.templateMethod;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class TwoDayTripSecondImpl extends TwoDayTrip {
    @Override
    PlaceType dayOne() {
        return PlaceType.MOUNTAINS;
    }

    @Override
    PlaceType dayTwo() {
        return PlaceType.SEA;
    }

    @Override
    public TransportType comingTransport() {
        return TransportType.PLANE;
    }

    @Override
    public TransportType returningTransport() {
        return TransportType.PLANE;
    }
}
