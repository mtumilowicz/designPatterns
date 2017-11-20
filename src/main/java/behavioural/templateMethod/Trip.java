package behavioural.templateMethod;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public interface Trip {
    String performTrip();
    TransportType comingTransport();
    TransportType returningTransport();
}
