package creational.singleton;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class ThreadSafeSingleton {
    private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();

    private ThreadSafeSingleton(){ }

    public static ThreadSafeSingleton getInstance(){
        return INSTANCE;
    }
}
