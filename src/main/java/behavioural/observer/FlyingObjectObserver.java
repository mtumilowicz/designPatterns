package behavioural.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by mtumilowicz on 2018-12-11.
 */
abstract class FlyingObjectObserver {
    private final List<String> reports = new LinkedList<>();
    private final FlyingObjectType type;
    private final Function<FlyingObject, String> message;

    FlyingObjectObserver(FlyingObjectType type, Function<FlyingObject, String> message) {
        this.type = type;
        this.message = message;
    }

    void observe(FlyingObject flyingObject) {
        if (type.equals(flyingObject.getType())) {
            addReport(message.apply(flyingObject));
        }
    }

    private void addReport(String report) {
        this.reports.add(report);
    }

    List<String> getReports() {
        return new LinkedList<>(reports);
    }
}
