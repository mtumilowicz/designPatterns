package behavioural.chainOfResponsibility.request;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class Request {
    private final int size;

    public Request(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
