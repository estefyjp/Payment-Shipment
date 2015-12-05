package PaymentTest;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import Payment.CreditCard;
import Payment.DebitCard;
import Payment.Payment;

public class DebitCardTest {

    private Payment debitCard;

    @Before
    public void setUp() {
    	debitCard = DebitCard.getInstance();
    }

    @Test
    public void singletonTest()
    {
    	Payment debitCardCopy = DebitCard.getInstance();
        assertSame(debitCard, debitCardCopy);
    }

    @Test
    public void clearDebitCardTest()
    {
        ((DebitCard) debitCard).clearCard();
        // Extract another instance that has to be different from the original
        Payment debitCardClean = DebitCard.getInstance();
        assertNotSame(debitCard, debitCardClean);
    }
}
