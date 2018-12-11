package behavioural.observer;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2018-12-11.
 */
public class EarthTest {

    @Test
    public void startObserving_manyObjects() {
//        given
        AsteroidObserver asteroidObserver = new AsteroidObserver();
        SpaceStationObserver spaceStationObserver = new SpaceStationObserver();
        Earth earth = new Earth();

//        when
        earth.startObserving(asteroidObserver);
        earth.startObserving(spaceStationObserver);
        
//        and
        earth.fly(new FlyingObject(FlyingObjectType.SPACE_STATION));
        earth.fly(new FlyingObject(FlyingObjectType.SPACE_STATION));
        earth.fly(new FlyingObject(FlyingObjectType.ASTEROID));
        earth.fly(new FlyingObject(FlyingObjectType.SPACE_STATION));
        earth.fly(new FlyingObject(FlyingObjectType.ASTEROID));
        
//        then
        assertEquals(Arrays.asList(
                "ASTEROID ALARM!!!", 
                "ASTEROID ALARM!!!"), 
                asteroidObserver.getReports());
        // and
        assertEquals(Arrays.asList(
                "SPACE_STATION spotted, cheers!", 
                "SPACE_STATION spotted, cheers!", 
                "SPACE_STATION spotted, cheers!"), 
                spaceStationObserver.getReports());
    }
}