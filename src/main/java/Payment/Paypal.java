package Payment;


public class Paypal extends Payment{
    private static Payment uniqueInstance;
    private Paypal(){

    }
    public static Payment getInstance(){
        if(uniqueInstance==null)
            uniqueInstance= new Paypal();
        return uniqueInstance;
    }

    public static void clearCard(){
        uniqueInstance = null;
    }
}
