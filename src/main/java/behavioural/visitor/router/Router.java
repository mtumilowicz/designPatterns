package behavioural.visitor.router;

import behavioural.visitor.RouterVisitor;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public interface Router {
    void sendData(char[] data);
    void acceptData(char[] data);

    String accept(RouterVisitor v);
}
