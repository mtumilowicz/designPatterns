package behavioural.strategy.payment;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class CreditCardPayment extends Payment {

    public CreditCardPayment() {
        super(PaymentType.CREDIT_CARD);
    }
}
