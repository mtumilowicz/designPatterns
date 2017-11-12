package structural.bridge.provider;

import com.google.common.base.Preconditions;
import structural.bridge.player.*;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class MusicPlayerProvider implements MusicPlayer {

    private final MusicPlayer player;

    private MusicPlayerProvider(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public MusicPlayerType getType() {
        return player.getType();
    }

    @Override
    public String play() {
        return player.play();
    }

    public static final class Factory {
        public static MusicPlayerProvider get(MusicPlayerType type) {
            Preconditions.checkArgument(type != null);
            AbstractMusicPlayer player;
            
            switch (type) {
                case TIDAL:
                    player = new Tidal();
                    break;
                case SPOTIFY:
                    player = new Spotify();
                    break;
                default:
                    throw new IllegalArgumentException("Value not supported: " + type);
            }
            
            return new MusicPlayerProvider(player);
        }
    }
}
