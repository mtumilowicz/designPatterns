package prototype;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class HelveticaFontTest {
    
    @Test
    public void creationCopyTest() {
        long creationStart = new Date().getTime();
        HelveticaFont byConstructor = new HelveticaFont();
        long creationTime = new Date().getTime() - creationStart;


        long copyStart = new Date().getTime();
        TimeConsumingCreationBaseFont byCopying = byConstructor.clone();
        long copyTime = new Date().getTime() - copyStart;
        
        assertEquals(byConstructor.getClass(), byCopying.getClass());
        assertNotEquals(byConstructor, byCopying);
        assertTrue(copyTime < creationTime);
    }
}
