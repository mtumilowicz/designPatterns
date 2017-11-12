package structural.bridge.util;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class MusicPlayerSubscriptionInfoTest {
    
    @Test
    public void notNullInfo() {
        assertNotNull(MusicPlayerSubscriptionInfo.getInfo());
    }
}
