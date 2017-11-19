package behavioural.chainOfResponsibility.handler;

import behavioural.chainOfResponsibility.request.Request;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class HandlerFirstImplTest {
    
    private static final Request POSITIVE_SIZE_REQUEST = new Request(10);
    private static final Request ZERO_SIZE_REQUEST = new Request(0);
    private static final Request NEGATIVE_SIZE_REQUEST = new Request(-10);
    
    private static final HandlerName EXPECTED_FIRST = HandlerName.FIRST;
    private static final HandlerName EXPECTED_SECOND = HandlerName.SECOND;
    private static final HandlerName EXPECTED_THIRD = HandlerName.THIRD;
    
    @Test
    public void requestHandledByFirst() {
        assertEquals(EXPECTED_FIRST, new HandlerFirstImpl().handle(POSITIVE_SIZE_REQUEST));
    }

    @Test
    public void requestHandledBySecond() {
        assertEquals(EXPECTED_SECOND, new HandlerFirstImpl().handle(NEGATIVE_SIZE_REQUEST));
    }

    @Test
    public void requestHandledByThird() {
        assertEquals(EXPECTED_THIRD, new HandlerFirstImpl().handle(ZERO_SIZE_REQUEST));
    }
}
