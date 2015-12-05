package Payment;


public class DebitCard extends Payment{
    private static Payment uniqueInstance;
    private DebitCard(){

    }
    public static Payment getInstance(){
        if(uniqueInstance==null)
            uniqueInstance= new DebitCard();
        return uniqueInstance;
    }

    public static void clearCard(){
        uniqueInstance = null;
    }
}
