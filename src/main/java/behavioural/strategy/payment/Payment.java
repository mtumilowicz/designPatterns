package behavioural.strategy.payment;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public interface Payment {
    PaymentType pay(int amount);
}
