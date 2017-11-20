package behavioural.templateMethod;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public abstract class TwoDayTrip implements Trip {
    abstract PlaceType dayOne();
    abstract PlaceType dayTwo();

    @Override
    public String performTrip() {
        return comingTransport() + ", " + dayOne() + ", " + dayTwo() +  ", " + returningTransport();
    }
}
