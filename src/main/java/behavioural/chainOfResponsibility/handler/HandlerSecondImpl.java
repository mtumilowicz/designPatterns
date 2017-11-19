package behavioural.chainOfResponsibility.handler;

import behavioural.chainOfResponsibility.request.Request;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class HandlerSecondImpl extends Handler {
    
    public HandlerSecondImpl() {
        super(new HandlerThirdImpl());
    }

    @Override
    public HandlerName handle(Request request) {
        if (request.getSize() < 0) {
            return getHandler();
        }
        else {
            return successor.handle(request);
        }
    }

    @Override
    public HandlerName getHandler() {
        return HandlerName.SECOND;
    }
}
