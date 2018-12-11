package behavioural.observer;

/**
 * Created by mtumilowicz on 2018-12-11.
 */
final class SpaceStationObserver extends FlyingObjectObserver {
    SpaceStationObserver() {
        super(FlyingObjectType.SPACE_STATION, flyingObject -> flyingObject.getType() + " spotted, cheers!");
    }
}
