package behavioural.strategy.payment;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public abstract class Payment {
    private final PaymentType type;

    Payment(PaymentType type) {
        this.type = type;
    }

    public PaymentType getType() {
        return type;
    }
    
    public PaymentType pay(int amount) {
        return type;
    }
}
