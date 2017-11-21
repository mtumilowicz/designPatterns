package behavioural.visitor.router;

import behavioural.visitor.RouterVisitor;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public abstract class Router {
    
    private final RouterType type;

    Router(RouterType type) {
        this.type = type;
    }

    public RouterType getType() {
        return type;
    }

    abstract void sendData(char[] data);
    abstract void acceptData(char[] data);

    public abstract String accept(RouterVisitor v);
}
