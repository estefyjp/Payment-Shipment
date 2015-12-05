package Payment;


public class PaymentM {
    public static void main(String[] args){
        Payment card= CreditCard.getInstance();
        card.setCardName("American Express");
        card.setNumeroTarjeta("488890098765");
        card.setNombreTarjetaHabiente("Juan Perez Chavez");
        card.setFechaVen("12/12/2018");
        card.setCorreo("JP@gmail.com");
        card.setCodigoSeg(1234);
        card.print();


        card= DebitCard.getInstance();
        card.setCardName("Mastercard");
        card.setNumeroTarjeta("876590674523");
        card.setNombreTarjetaHabiente("Maria Hernandez Juarez");
        card.setFechaVen("12/12/2015");
        card.setCorreo("M_H@gmail.com");
        card.setCodigoSeg(5678);
        card.print();

        card= Paypal.getInstance();
        card.setNombreTarjetaHabiente("Carolina Fernandez Monroy");
        card.setCardName("Paypal Card");
        card.setCorreo("CFM@gmail.com");
        card.print();



    }
}
