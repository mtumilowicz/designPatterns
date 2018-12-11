package structural.bridge.driver;

import structural.bridge.player.MusicPlayer;
import structural.bridge.player.MusicPlayerType;
import structural.bridge.provider.MusicPlayerProvider;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public final class MusicPlayerFrameworkDriver implements MusicPlayer {

    private final MusicPlayerProvider provider;

    private MusicPlayerFrameworkDriver(MusicPlayerType type) {
        provider = MusicPlayerProvider.Factory.get(type);
    }

    static MusicPlayerFrameworkDriver tidal() {
        return new MusicPlayerFrameworkDriver(MusicPlayerType.TIDAL);
    }

    static MusicPlayerFrameworkDriver spotify() {
        return new MusicPlayerFrameworkDriver(MusicPlayerType.SPOTIFY);
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
