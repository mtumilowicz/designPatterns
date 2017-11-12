package structural.bridge.util;

import structural.bridge.player.MusicPlayerType;

import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class MusicPlayerSubscriptionInfo {
    
    private static final MusicPlayerType SUBSCRIPTION = MusicPlayerType.SPOTIFY;
    
    public static MusicPlayerType getInfo() {
        return Objects.requireNonNull(SUBSCRIPTION);
    }
}
