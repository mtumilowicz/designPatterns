package behavioural.strategy.shopping;

import behavioural.strategy.item.Item;
import behavioural.strategy.payment.CreditCardPayment;
import behavioural.strategy.payment.PayPalPayment;
import behavioural.strategy.payment.Payment;
import behavioural.strategy.payment.PaymentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class ShoppingCartTest {
    
    private final static ShoppingCart SHOPPING_CART = new ShoppingCart();
    private final static Payment CREDIT_CARD_PAYMENT = new CreditCardPayment(
            "1","1","1","1");
    
    
    @Before
    public void setUp() {
        SHOPPING_CART.addItem(new Item("1", 10));
        SHOPPING_CART.addItem(new Item("2", 15));
    }
    
    @Test
    public void creditCardPayment() {
        assertEquals(PaymentType.CREDIT_CARD, SHOPPING_CART.pay(new CreditCardPayment("1","1","1","1")));
    }

    @Test
    public void payPalPayment() {
        assertEquals(PaymentType.PAY_PAL, SHOPPING_CART.pay(new PayPalPayment("1","1")));
    }
    
}
