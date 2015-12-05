package PaymentTest;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import Payment.CreditCard;
import Payment.Payment;
import Payment.Paypal;

public class PayPalTest {

    private Payment payPal;

    @Before
    public void setUp() {
    	payPal = Paypal.getInstance();
    }

    @Test
    public void singletonTest()
    {
    	Payment payPalCopy = Paypal.getInstance();
        assertSame(payPal, payPalCopy);
    }

    @Test
    public void clearPayPalTest()
    {
        ((Paypal) payPal).clearCard();
        // Extract another instance that has to be different from the original
        Payment payPalClean = Paypal.getInstance();
        assertNotSame(payPal, payPalClean);
    }

}
