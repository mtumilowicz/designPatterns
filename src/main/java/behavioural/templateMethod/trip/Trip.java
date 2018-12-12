package behavioural.templateMethod.trip;

import behavioural.templateMethod.transport.TransportType;

import java.util.function.Supplier;

/**
 * Created by mtumilowicz on 2017-11-21.
 */
public abstract class Trip {

    private final Supplier<TransportType> destinationTransport;
    private final Supplier<TransportType> homeTransport;

    protected Trip(Supplier<TransportType> destinationTransport,
                   Supplier<TransportType> homeTransport) {
        this.destinationTransport = destinationTransport;
        this.homeTransport = homeTransport;
    }

    abstract String daysSchedule();

    public String performTrip() {
        return destinationTransport.get() + ", " + daysSchedule() + ", " + homeTransport.get();
    }
}
