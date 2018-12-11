package behavioural.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2018-12-11.
 */
final class Earth {
    private final List<FlyingObjectObserver> flyingObjectObservers = new LinkedList<>();

    void fly(FlyingObject flyingObject) {
        flyingObjectObservers.forEach(x -> x.observe(flyingObject));
    }

    Earth startObserving(FlyingObjectObserver observer) {
        flyingObjectObservers.add(observer);
        
        return this;
    }
}
