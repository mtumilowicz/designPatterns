package behavioural.templateMethod;

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
