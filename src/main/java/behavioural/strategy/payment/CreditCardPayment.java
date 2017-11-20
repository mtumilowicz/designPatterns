package behavioural.strategy.payment;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class CreditCardPayment extends AbstractPayment {

    private final String name;
    private final String cardNumber;
    private final String cvv;
    private final String dateOfExpiry;

    public CreditCardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
        super(PaymentType.CREDIT_CARD);
        
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
}
