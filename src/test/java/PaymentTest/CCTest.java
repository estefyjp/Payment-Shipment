package PaymentTest;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import Payment.CreditCard;
import Payment.Payment;

public class CCTest {
	


	    private Payment creditCard;

	    @Before
	    public void setUp() {
	        creditCard = CreditCard.getInstance();
	    }

	    @Test
	    public void singletonTest()
	    {
	    	Payment creditCardCopy = CreditCard.getInstance();
	        assertSame(creditCard, creditCardCopy);
	    }

	    @Test
	    public void clearCreditCardTest()
	    {
	        ((CreditCard) creditCard).clearCard();
	        // Extract another instance that has to be different from the original
	        Payment creditCardClean = CreditCard.getInstance();
	        assertNotSame(creditCard, creditCardClean);
	    }
}

