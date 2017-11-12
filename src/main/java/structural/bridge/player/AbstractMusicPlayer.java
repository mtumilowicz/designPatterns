package structural.bridge.player;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class AbstractMusicPlayer implements MusicPlayer {
    
    private final MusicPlayerType type;

    AbstractMusicPlayer(MusicPlayerType type) {
        this.type = type;
    }


    @Override
    public MusicPlayerType getType() {
        return type;
    }

    @Override
    public String play() {
        return this.getClass().getSimpleName() + "is playing";
    }
}
