package behavioural.templateMethod.trip;

import behavioural.templateMethod.transport.TransportType;

/**
 * Created by mtumilowicz on 2017-11-21.
 */
public abstract class AbstractTrip {
    
    abstract TransportType comingTransport();
    abstract TransportType returningTransport();
    abstract String daysSchedule();
    
    public String performTrip() {
        return comingTransport() + ", " + daysSchedule() +  ", " + returningTransport();
    }
}
