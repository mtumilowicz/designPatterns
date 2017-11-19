package behavioural.chainOfResponsibility.handler;

import behavioural.chainOfResponsibility.request.Request;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public abstract class Handler {
    final Handler successor;

    Handler(Handler successor) {
        this.successor = successor;
    }
    
    public abstract HandlerName handle(Request request);
    
    public abstract HandlerName getHandler();
}
