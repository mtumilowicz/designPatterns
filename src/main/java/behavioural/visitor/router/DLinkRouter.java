package behavioural.visitor.router;

import behavioural.visitor.RouterVisitor;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class DLinkRouter extends Router {

    public DLinkRouter() {
        super(RouterType.D_LINK);
    }

    @Override
    public void sendData(char[] data) {
    }

    @Override
    public void acceptData(char[] data) {
    }

    @Override
    public String accept(RouterVisitor v) {
        return v.visit(this);
    }
}
