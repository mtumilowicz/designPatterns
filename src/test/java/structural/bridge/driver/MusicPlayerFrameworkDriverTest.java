package structural.bridge.driver;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import structural.bridge.player.MusicPlayerType;
import structural.bridge.util.MusicPlayerSubscriptionInfo;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(MusicPlayerSubscriptionInfo.class)
public class MusicPlayerFrameworkDriverTest {

    private static final MusicPlayerType EXPECTED_TIDAL_TYPE = MusicPlayerType.TIDAL;
    private static final MusicPlayerType EXPECTED_SPOTIFY_TYPE = MusicPlayerType.SPOTIFY;

    @Before
    public void setUp() {
        PowerMockito.mockStatic(MusicPlayerSubscriptionInfo.class);
    }
    
    @Test
    public void tidalPrepared() {
        PowerMockito.when(MusicPlayerSubscriptionInfo.getInfo()).thenReturn(MusicPlayerType.TIDAL);
        assertEquals(EXPECTED_TIDAL_TYPE, new MusicPlayerFrameworkDriver().getType());
    }

    @Test
    public void spotifyPrepared() {
        PowerMockito.when(MusicPlayerSubscriptionInfo.getInfo()).thenReturn(EXPECTED_SPOTIFY_TYPE);
        assertEquals(EXPECTED_SPOTIFY_TYPE, new MusicPlayerFrameworkDriver().getType());
    }
}
