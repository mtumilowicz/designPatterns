package structural.bridge.provider;

import org.junit.Test;
import structural.bridge.player.MusicPlayerType;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class MusicPlayerProviderTest {
    
    private static final MusicPlayerType EXPECTED_TIDAL_TYPE = MusicPlayerType.TIDAL;
    private static final MusicPlayerType EXPECTED_SPOTIFY_TYPE = MusicPlayerType.SPOTIFY;
    
    @Test
    public void getTidal() {
        MusicPlayerProvider musicPlayerProvider = MusicPlayerProvider.Factory.get(EXPECTED_TIDAL_TYPE);
        assertEquals(EXPECTED_TIDAL_TYPE, musicPlayerProvider.getType());
    }

    @Test
    public void getSpotify() {
        MusicPlayerProvider musicPlayerProvider = MusicPlayerProvider.Factory.get(EXPECTED_SPOTIFY_TYPE);
        assertEquals(EXPECTED_SPOTIFY_TYPE, musicPlayerProvider.getType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullMusicPlayerType() {
        MusicPlayerProvider musicPlayerProvider = MusicPlayerProvider.Factory.get(null);
    }
}
