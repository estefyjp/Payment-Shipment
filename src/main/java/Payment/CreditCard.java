package Payment;


public class CreditCard extends Payment{

    private static Payment uniqueInstance;

    private CreditCard(){

    }
    public static Payment getInstance(){
        if(uniqueInstance==null)
            uniqueInstance= new CreditCard();
        return uniqueInstance;
    }

    public static void clearCard(){
        uniqueInstance = null;
    }
}
