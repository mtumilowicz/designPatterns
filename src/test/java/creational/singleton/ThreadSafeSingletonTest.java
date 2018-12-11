package creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class ThreadSafeSingletonTest {
    
    @Test
    public void sameInstance() {
        assertSame(ThreadSafeSingleton.getInstance(), ThreadSafeSingleton.getInstance());
    }
    
}
