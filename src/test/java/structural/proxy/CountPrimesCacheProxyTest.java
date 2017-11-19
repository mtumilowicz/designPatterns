package structural.proxy;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class CountPrimesCacheProxyTest {
    @Test
    public void cacheTest() {
        long firstRunStart = new Date().getTime();
        CountPrimesCacheProxy.count(2,1000000);
        long firstRunTime = new Date().getTime() - firstRunStart;

        long secondRunStart = new Date().getTime();
        CountPrimesCacheProxy.count(2,1000000);
        long secondRunTime = new Date().getTime() - secondRunStart;
        
        assertTrue(firstRunTime > secondRunTime);
    }
}
