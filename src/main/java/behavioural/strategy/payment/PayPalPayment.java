package behavioural.strategy.payment;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class PayPalPayment extends AbstractPayment {

    public PayPalPayment() {
        super(PaymentType.PAY_PAL);
    }
}
