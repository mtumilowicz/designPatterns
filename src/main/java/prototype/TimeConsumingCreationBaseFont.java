package prototype;

import java.util.concurrent.TimeUnit;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class TimeConsumingCreationBaseFont implements Cloneable {
    
    // mock of time-consuming creation
    TimeConsumingCreationBaseFont() {
        try {
            TimeUnit.SECONDS.sleep(2);
            
        } catch (InterruptedException e) {
            // only for mocking time-consuming creation
        }
    }

    public TimeConsumingCreationBaseFont clone() {
        try {
            return (TimeConsumingCreationBaseFont) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
