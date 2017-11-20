package behavioural.strategy.payment;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public abstract class AbstractPayment implements Payment {
    private final PaymentType type;

    AbstractPayment(PaymentType type) {
        this.type = type;
    }

    public PaymentType getType() {
        return type;
    }

    @Override
    public PaymentType pay(int amount) {
        return type;
    }
}
