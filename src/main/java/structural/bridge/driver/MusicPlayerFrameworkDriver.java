package structural.bridge.driver;

import structural.bridge.player.MusicPlayer;
import structural.bridge.player.MusicPlayerType;
import structural.bridge.provider.MusicPlayerProvider;
import structural.bridge.util.MusicPlayerSubscriptionInfo;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public final class MusicPlayerFrameworkDriver implements MusicPlayer {
    
    private final MusicPlayerProvider provider;

    public MusicPlayerFrameworkDriver() {
        provider = MusicPlayerProvider.Factory.get(MusicPlayerSubscriptionInfo.getInfo());
    }

    @Override
    public MusicPlayerType getType() {
        return provider.getType();
    }

    @Override
    public String play() {
        return provider.play();
    }
}
