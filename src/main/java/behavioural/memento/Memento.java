package behavioural.memento;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class Memento {
    private final String memo;

    public Memento(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }
}
