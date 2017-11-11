package singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class ThreadSafeSingletonTest {
    
    @Test
    public void sameInstance() {
        assertTrue(ThreadSafeSingleton.getInstance() == ThreadSafeSingleton.getInstance());
    }
    
}
