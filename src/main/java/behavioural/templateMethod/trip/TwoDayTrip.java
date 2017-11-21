package behavioural.templateMethod.trip;

import behavioural.templateMethod.place.PlaceType;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public abstract class TwoDayTrip extends AbstractTrip {
    
    abstract PlaceType dayOne();
    abstract PlaceType dayTwo();

    @Override
    public String daysSchedule() {
        return dayOne() + ", " + dayTwo();
    }
}
