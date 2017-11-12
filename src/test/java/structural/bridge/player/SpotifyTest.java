package structural.bridge.player;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class SpotifyTest {
    
    private final static MusicPlayerType EXPECTED_TYPE = MusicPlayerType.SPOTIFY;
    
    @Test
    public void type() {
        assertEquals(EXPECTED_TYPE, new Spotify().getType());
    }
}
