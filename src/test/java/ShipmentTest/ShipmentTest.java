package ShipmentTest;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import Payment.CreditCard;
import Payment.Payment;
import Shipment.Shipment;
import Shipment.ShipmentFee;

public class ShipmentTest {
	   private ShipmentFee ship;

	    @Before
	    public void setUp() {
	    	ship = Shipment.getInstance();
	    }

	    @Test
	    public void singletonTest()
	    {
	    	ShipmentFee shipmentCopy = Shipment.getInstance();
	        assertSame(ship, shipmentCopy);
	    }

	    @Test
	    public void clearShipmentTest()
	    {
	         Shipment.clearShip();
	        // Extract another instance that has to be different from the original
	        ShipmentFee shipmentClean = Shipment.getInstance();
	        assertNotSame(ship, shipmentClean);
	    }
}
