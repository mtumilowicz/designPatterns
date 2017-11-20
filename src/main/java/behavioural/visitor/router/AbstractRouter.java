package behavioural.visitor.router;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public abstract class AbstractRouter implements Router {
    
    private final RouterType type;

    AbstractRouter(RouterType type) {
        this.type = type;
    }

    public RouterType getType() {
        return type;
    }
}
