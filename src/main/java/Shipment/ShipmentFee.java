package Shipment;

public class ShipmentFee {
	public int addFee(int fee, boolean discount, int amount){
		if(discount==true){
			return amount;
		}
		return amount+fee;
	}
}
