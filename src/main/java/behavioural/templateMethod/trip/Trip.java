package behavioural.templateMethod.trip;

import behavioural.templateMethod.transport.TransportType;

import java.util.function.Supplier;

/**
 * Created by mtumilowicz on 2017-11-21.
 */
public abstract class Trip {

    private final Supplier<TransportType> comingTransport;
    private final Supplier<TransportType> returningTransport;

    protected Trip(Supplier<TransportType> comingTransport,
                   Supplier<TransportType> returningTransport) {
        this.comingTransport = comingTransport;
        this.returningTransport = returningTransport;
    }

    abstract String daysSchedule();

    public String performTrip() {
        return comingTransport.get() + ", " + daysSchedule() + ", " + returningTransport.get();
    }
}
