package behavioural.observer;

/**
 * Created by mtumilowicz on 2018-12-11.
 */
class AsteroidObserver extends FlyingObjectObserver {
    AsteroidObserver() {
        super(FlyingObjectType.ASTEROID, flyingObject -> flyingObject.getType() + " ALARM!!!");
    }
}
