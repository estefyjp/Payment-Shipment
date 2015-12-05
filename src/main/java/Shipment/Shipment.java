package Shipment;


public class Shipment {
	
	private static ShipmentFee shUnique;
	
	 public static ShipmentFee getInstance(){
	        if(shUnique== null){
	        	shUnique = new ShipmentFee();
	        }
	        return shUnique;
	    }

	    public static void clearShip(){
	    	shUnique = null;
	    }

}
