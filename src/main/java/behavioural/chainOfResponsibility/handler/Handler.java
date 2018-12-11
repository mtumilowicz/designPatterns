package behavioural.chainOfResponsibility.handler;

import behavioural.chainOfResponsibility.request.Request;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
abstract class Handler {
    final Handler successor;

    Handler(Handler successor) {
        this.successor = successor;
    }
    
    protected abstract HandlerName handle(Request request);
    
    public abstract HandlerName getHandler();
}
