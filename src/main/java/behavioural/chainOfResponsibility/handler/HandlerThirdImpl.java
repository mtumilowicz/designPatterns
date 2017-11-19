package behavioural.chainOfResponsibility.handler;

import behavioural.chainOfResponsibility.request.Request;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class HandlerThirdImpl extends Handler {
    
    public HandlerThirdImpl() {
        super(null);
    }

    @Override
    public HandlerName handle(Request request) {
        if (request.getSize() == 0) {
            return getHandler();
        } else {
            throw new IllegalStateException("End-point handler, request should be handled earlier!");
        }
    }

    @Override
    public HandlerName getHandler() {
        return HandlerName.THIRD;
    }
}
