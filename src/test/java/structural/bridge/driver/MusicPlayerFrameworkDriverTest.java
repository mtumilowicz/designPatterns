package structural.bridge.driver;

import org.junit.Test;
import structural.bridge.player.MusicPlayerType;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class MusicPlayerFrameworkDriverTest {
    
    @Test
    public void tidalPrepared() {
        assertEquals(MusicPlayerType.TIDAL, MusicPlayerFrameworkDriver.tidal().getType());
    }

    @Test
    public void spotifyPrepared() {
        assertEquals(MusicPlayerType.SPOTIFY, MusicPlayerFrameworkDriver.spotify().getType());
    }
}
