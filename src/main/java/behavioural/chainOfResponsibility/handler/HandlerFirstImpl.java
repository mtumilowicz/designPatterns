package behavioural.chainOfResponsibility.handler;

import behavioural.chainOfResponsibility.request.Request;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class HandlerFirstImpl extends Handler {
    
    public HandlerFirstImpl() {
        super(new HandlerSecondImpl());
    }

    @Override
    public HandlerName handle(Request request) {
        if (request.getSize() > 0) {
            return getHandler();
        }
        else {
            return successor.handle(request);
        }
    }

    @Override
    public HandlerName getHandler() {
        return HandlerName.FIRST;
    }
}
