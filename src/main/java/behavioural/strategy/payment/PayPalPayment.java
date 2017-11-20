package behavioural.strategy.payment;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class PayPalPayment extends AbstractPayment {

    private final String email;
    private final String password;

    public PayPalPayment(String email, String password) {
        super(PaymentType.PAY_PAL);
        this.email = email;
        this.password = password;
    }
}
