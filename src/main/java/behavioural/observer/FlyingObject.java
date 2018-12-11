package behavioural.observer;

/**
 * Created by mtumilowicz on 2018-12-11.
 */
final class FlyingObject {
    private final FlyingObjectType type;


    FlyingObject(FlyingObjectType type) {
        this.type = type;
    }

    FlyingObjectType getType() {
        return type;
    }
}
