package structural.bridge.player;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class TidalTest {
    private final static MusicPlayerType EXPECTED_TYPE = MusicPlayerType.TIDAL;

    @Test
    public void type() {
        assertEquals(EXPECTED_TYPE, new Tidal().getType());
    }
}
